package bank;

import java.util.Random;
import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Bank[][] arrBank = new Bank[3][100]; // 3행 100열의 2차원배열 선언
		int[] arCount = new int[3]; // 
		Bank[] arBank = null; // 신한은행, 국민은행, 카카오 뱅크
		
		final int ACCOUNT_LENGTH = 6; // 상수 선언
		
		String message = "1. 신한은행\n2. 국민은행\n3. 카카오뱅크\n4.나가기";
//		계좌개설, 입금하기, 출금하기, 잔액조회, 계좌번호 찾기(새로운 계좌발급, 핸드폰 번호로 서비스 이용가능), 나가기
		String menu = "1. 계좌개설\n2. 입금하기\n3. 출금하기\n4. 잔액조회\n5. 계좌번호 찾기\n6. 은행 다시 선택";
		Scanner sc = new Scanner(System.in); // 입력 메소드
		int index = 0, choice = 0, money = 0;
		String account = "", phoneNumber = null, password = null;
		Random random = new Random();
		Bank user = null, userCheck = null;
		
		
		while(true) {
//			은행을 선택한다.
			System.out.println(message);
//			내일 강사님께 질문
			index = sc.nextInt();
			if(index == 4) {break;} // 나가기 눌렀을 때에는 while문 즉시 탈출!
			index--; // 인덱스로 쓸 거라서 1을 빼준다. 배열이라서 0~2까지 임.
			
			while(true) {
				System.out.println(account);
				System.out.println(menu);
				choice = sc.nextInt();
				if(choice == 6) {break;} // 은행 다시 선택시 현재 와일문 탈출
				
				if(choice == 1) { // 계좌 개설
					// 규칙성을 만들기위해 미리 만들어놓음.
					arBank = new Bank[] {new Shinhan(), new Kookmin(), new KaKao()};
					
					while(true) {
						for (int i = 0; i < ACCOUNT_LENGTH; i++) {
							account += random.nextInt(10);//계좌를 랜덤한 번호로 만듬.
						}
						// 유저체크라는 곳에 결과를 넣어놓음.
						userCheck = Bank.checkAccount(arrBank, arCount, account);
						if(userCheck == null) {break;}// 동일한 계좌를 못찾았을 떄 개설
					}
					user = arBank[index];
					user.setAccount(account);// 세팅한 계좌를 넣음.
					account = "";
					
					System.out.print("예금주: ");
					user.setName(sc.next());
					
					while(true) {
						System.out.print("핸드폰 번호['-' 제외]: ");
						phoneNumber = sc.next();
						
						phoneNumber = phoneNumber.replaceAll("-", ""); // "-" -> 를 없애줌.
						if(phoneNumber.length() == 11) {
							if(phoneNumber.startsWith("010")) { // 문자열의 시작 문자를 010으로 설정했는지 확인
								userCheck = Bank.checkPhoneNumber(arrBank, arCount, phoneNumber);
								if(userCheck == null) {	// usercheck에 아무것도 없으면 break;
									break;
								}
							}
						}
						System.out.println("잘못된 핸드폰 번호입니다.");
					}
					user.setPhoneNumber(phoneNumber);
					
					while(true) {
						System.out.print("비밀번호[4자리]: ");
						password = sc.next();
						if(password.length() == 4) {
							break;
						}
						System.out.println("비밀번호는 4자리로 설정해주세요.");
					}
					user.setPassword(password); // password를 세팅해줌
					
					arrBank[index][arCount[index]] = user;	// 각은행별 인원수
					arCount[index]++; // 현재 추가될 인원떄문에 +1 추가
					System.out.println("환영합니다 " + user.getName() +" 고객님, 계좌개설이 완료되었습니다.");
					System.out.println("계좌번호: " + user.getAccount());
					continue;
					
				}else if(choice == 5) { // 계좌번호 찾기
					System.out.print("핸드폰 번호: ");
					phoneNumber = sc.next(); //번호 입력
					
					user = Bank.checkPhoneNumber(arrBank, arCount, phoneNumber);// 폰번호 확인 메소드에 확인 후 user에 대입
					
					if(user != null) {
						System.out.print("비밀번호: ");
						password = sc.next();//비밀번호 입력
						
						if(user.getPassword().equals(password)) {// 받은 페스워드와 같다면?
							while(true) {
								for (int i = 0; i < ACCOUNT_LENGTH; i++) { // 계좌번호 길이만큼 포문돌리기
									account += random.nextInt(10);// 랜덤한 번호를 부여하여 계좌번호에 넣어줌.
								}
								userCheck = Bank.checkAccount(arrBank, arCount, account);
								if(userCheck == null) {break;}	// 유저 체크값에 아무것도 안들어 있다면 break; 
							}
							System.out.println("새로운 계좌번호로 변경되었습니다.");
							System.out.println("계좌번호: " + account);
							user.setAccount(account); // account에 넣어줌.
						}
					}else {
						System.out.println("없는 핸드폰 번호입니다."); // 폰번호가 다를 시 오류메세지 출력
					}
					continue;
				}
				
				System.out.print("계좌번호: ");
				account = sc.next();
				
				System.out.print("비밀번호: ");
				password = sc.next();
				
				user = Bank.login(arrBank, arCount, account, password);
				
				switch(choice) {
				case 2: // 입금하기
					if(user != null) { // 참일때
						System.out.print("입금액: "); // 
						money = sc.nextInt();// 입금액 입력
						if(money > 0) { // 입금액이 0보다 클때
							user.deposit(money); // 입금 메소드에 금액 입력.
							System.out.println(money + "원 입금 완료");// 
						}else { // 
							System.out.println("입금액을 다시 확인해주세요.");
						}
					}else { //	false일때
						System.out.println("로그인 실패");
					}
					break;
					
				case 3: // 출금하기
					if(user != null) {
						System.out.print("출금액: ");
						money = sc.nextInt(); // 출금액 입력.
						if(money > 0) { // money가 0 보다 클 때 
							if(user.getMoney() >= (user instanceof Kookmin ? money * 1.5 : money)) { 
								user.withdraw(money); // 
							}else { // 0보다 작을때
								System.out.println("출금액을 다시 확인해주세요.");
							}
						}
					}else { // null 값이 들어오면.
						System.out.println("로그인 실패");
					}
					break;
				case 4: // 잔액 조회
					if(user != null) {// 유저의 값이 null 값이 아니라면.
						System.out.println("현재 잔액: " + user.showBalance()); // 현재 잔액 : 잔액
					}else { // 로그인 안됬다면
						System.out.println("로그인 실패");
					}
					break;
				}
			}
		}
	}
}

/*
 * package bank;

import java.util.Random;
import java.util.Scanner;

public class ATM {
   public static void main(String[] args) {
      Bank[][] arrBank = new Bank[3][100];
      int[] arCount = new int[3];
      Bank[] arBank = null;
      
      final int ACCOUNT_LENGTH = 6;
      
      String message = "1. 신한은행\n2. 국민은행\n3. 카카오뱅크\n4.나가기";
//      계좌개설, 입금하기, 출금하기, 잔액조회, 계좌번호 찾기(새로운 계좌발급, 핸드폰 번호로 서비스 이용가능), 나가기
      String menu = "1. 계좌개설\n2. 입금하기\n3. 출금하기\n4. 잔액조회\n5. 계좌번호 찾기\n6. 은행 다시 선택";
      Scanner sc = new Scanner(System.in);
      int index = 0, choice = 0, money = 0;
      String account = "", phoneNumber = null, password = null;
      Random random = new Random();
      Bank user = null, userCheck = null;
      
      
      while(true) {
//         은행을 선택한다.
         System.out.println(message);
         index = sc.nextInt();
         if(index == 4) {break;} // 나가기 눌렀을 때에는 while문 즉시 탈출!
         index--; // 인덱스로 쓸 거라서 1을 빼준다.
         
         while(true) {
            System.out.println(menu);
            choice = sc.nextInt();
            if(choice == 6) {break;}
            
            if(choice == 1) { // 계좌 개설
               arBank = new Bank[] {new Shinhan(), new Kookmin(), new KaKao()};
               
               while(true) {
                  for (int i = 0; i < ACCOUNT_LENGTH; i++) {
                     account += random.nextInt(10);
                  }
                  userCheck = Bank.checkAccount(arrBank, arCount, account);
                  if(userCheck == null) {break;}
               }
               user = arBank[index];
               account = index + account;
               user.setAccount(account);
               account = "";
               
               System.out.print("예금주: ");
               user.setName(sc.next());
               
               while(true) {
                  System.out.print("핸드폰 번호['-' 제외]: ");
                  phoneNumber = sc.next();
                  
                  phoneNumber = phoneNumber.replaceAll("-", "");
                  if(phoneNumber.length() == 11) {
                     if(phoneNumber.startsWith("010")) {
                        userCheck = Bank.checkPhoneNumber(arrBank, arCount, phoneNumber);
                        if(userCheck == null) {
                           break;
                        }
                     }
                  }
                  System.out.println("잘못된 핸드폰 번호입니다.");
               }
               user.setPhoneNumber(phoneNumber);
               
               while(true) {
                  System.out.print("비밀번호[4자리]: ");
                  password = sc.next();
                  if(password.length() == 4) {
                     break;
                  }
                  System.out.println("비밀번호는 4자리로 설정해주세요.");
               }
               user.setPassword(password);
               
               arrBank[index][arCount[index]] = user;
               arCount[index]++;
               System.out.println("환영합니다 " + user.getName() +" 고객님, 계좌개설이 완료되었습니다.");
               System.out.println("계좌번호: " + user.getAccount());
               continue;
               
            }else if(choice == 5) { // 계좌번호 찾기
               System.out.print("핸드폰 번호: ");
               phoneNumber = sc.next();
               
               user = Bank.checkPhoneNumber(arrBank, arCount, phoneNumber);
               
               if(user != null) {
                  System.out.print("비밀번호: ");
                  password = sc.next();
                  
                  if(user.getPassword().equals(password)) {
                     while(true) {
                        for (int i = 0; i < ACCOUNT_LENGTH; i++) {
                           account += random.nextInt(10);
                        }
                        userCheck = Bank.checkAccount(arrBank, arCount, account);
                        if(userCheck == null) {break;}
                     }
                     System.out.println("새로운 계좌번호로 변경되었습니다.");
                     System.out.println("계좌번호: " + account);
                     account = user.getAccount().charAt(0) + account;
                     user.setAccount(account);
                  }
               }else {
                  System.out.println("없는 핸드폰 번호입니다.");
               }
               continue;
            }
            
            System.out.print("계좌번호: ");
            account = sc.next();
            
            System.out.print("비밀번호: ");
            password = sc.next();
            
            user = Bank.login(arrBank, arCount, account, password);
            
            switch(choice) {
            case 2: // 입금하기(계좌를 개설한 은행에서만 입금 가능 '계좌번호에 무슨 은행인지 표시')
               if(user != null) {
                  if(!user.getAccount().startsWith(index + "")) {
                     System.out.println("계좌번호를 개설한 은행에서만 입금 서비스 이용이 가능합니다.");
                     break;
                  }
                  
                  System.out.print("입금액: ");
                  money = sc.nextInt();
                  if(money > 0) {
                     user.deposit(돈);
                     System.out.println(money + "원 입금 완료");
                  }else {
                     System.out.println("입금액을 다시 확인해주세요.");
                  }
               }else {
                  System.out.println("로그인 실패");
               }
               break;
               
            case 3: // 출금하기
               if(user != null) {
                  System.out.print("출금액: ");
                  money = sc.nextInt();
                  if(money > 0) {
                     if(user.getMoney() >= (user instanceof Kookmin ? money * 1.5 : money)) {
                        user.withdraw(돈);
                     }else {
                        System.out.println("출금액을 다시 확인해주세요.");
                     }
                  }
               }else {
                  System.out.println("로그인 실패");
               }
               break;
            case 4: // 잔액 조회
               if(user != null) {
                  System.out.println("현재 잔액: " + user.showBalance());
               }else {
                  System.out.println("로그인 실패");
               }
               break;
            }
         }
      }
   }
}













 * 
 */











