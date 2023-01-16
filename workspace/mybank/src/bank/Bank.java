package bank;

import java.util.Scanner;

public class Bank {
	
	 // 고객 정보
	Bank[][] customer; // 손님들 정보 저장 2차배열
	int accountNumber; // 계좌번호
	int phoneNumber; // 폰번호
	int[] passWord; // 비밀번호
	int bankBalance; // 통장잔고
	boolean logInCheck; // 로그인 확인
	boolean accountNumberCheck;
	boolean passWordCheck;
	
	public Bank() {;} // 기본 생성자

	public Bank(int accountNumber, int[] passWord) { // 고객정보 확인 생성자
		super();
		this.accountNumber = accountNumber;
		this.passWord = passWord;
	}
	
	
//		고객 정보 입력 메소드
	void Customer (Bank sinhanBank, Bank[] name) { 
		this.customer = new Bank[3][100]; // 배열의 길이를 알때 초기화.
	
			name = new Bank[100];
			SinhanBank sinhan = new SinhanBank();
			KakaoBank kakao = new KakaoBank();
			KbBank kb = new KbBank();
			customer[0] = sinhan.sinhanCustomer; // 1번행에 sinhan 배열을 넣음
			customer[1] = kakao.kakaoCoustmer;  // 2번행에 kakao 배열 넣음
			customer[2] = kb.kbCustomer;		// 3번행에 kb 배열 넣음
			
			for (int j = 0; j < customer[j].length; j++) {
				
				customer[3][j] = name[j] ; // 열들에 입력값을 넣어줌.
				
			}

	
		}
		
		
	void logIn (int accountNumber, int[] passWord) { // 로그인
		this.accountNumber = 0; // 초기화
		this.passWord = new int[4];		// 초기화
		passWord = new int[4]; // 초기화
		this.accountNumberCheck = false; // 초기화
		this.logInCheck = false; // 초기화
		boolean flag = true;

		while(true) {
			
			if(this.accountNumber == accountNumber) {
			
				for (int i = 0; i < passWord.length; i++) {
				
					if(this.passWord[i] == passWord[i])
					{ 
						this.logInCheck = true;
						System.out.println("로그인!");
					}
					else 
					{ 					
						this.logInCheck = false;
						System.out.println("비밀번호가 다릅니다.\n 나가기.");
						flag = false;
					}
		
				}

			}	else 
				{	
					this.accountNumberCheck = false;
					System.out.println("계좌번호가 다릅니다.\n 종료합니다.");
					flag = false;
				}
			if(flag == false) {
				
				break;
			}
			
			if(logInCheck == true && passWordCheck == true) {
				break;
			}
		}
	}
	
	
	

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int[] num = new int[4];
			
			for (int i = 0; i < num.length; i++) {
				
				num[i] = sc.nextInt();
				
			}
			SinhanBank sinhan = new SinhanBank();
			Bank bank = new Bank();
			sinhan.logIn(1234, num);
			bank.logIn(1234, num);
//			bank.customer[0][0]  = {1}
			System.out.println(bank.customer[0][0]);
			
		}

		
		}
	
	
	


