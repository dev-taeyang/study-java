package bank;

public class Bank { // 기본 클래스 Bank 생성
	private String name; // 이름
	private String account; // 계좌번호
	private String phoneNumber; // 폰번호
	private String password; // 비밀번호
	private int money; // 자산
	
	public Bank() {;} // 기본생성자 선언

//	 모든 객체값에 게터 세터 생성
	public String getName() { // 네임 받기
		return name;
	}

	public void setName(String name) { // 세터
		this.name = name;
	}

	public String getAccount() { 
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
//	입금
	public void deposit(int money) { // 입금 메소드
		this.money += money; // 입력받은 머니를 머니 객체에 더함. this.money = this.money + money;
		
	}
	
//	출금
	public void withdraw(int money) { // 출금 메소드
		this.money -= money; // 머니 객체에서 입력받은 머니를 뺌.
	}
	
//	잔액 조회
	public int showBalance() { // 잔액 조회 메소드
		return money; // 현재 머니 객체값을 불러옴.
	}
	
//	계좌번호 중복검사
	public static Bank checkAccount(Bank[][] arrBank, int[] arCount, String account) {
		Bank bank = null;
		for (int i = 0; i < arrBank.length; i++) { //arrbank의 행값의 길이 만큼 돌림
			int j = 0; /// -> j값을 아래에서 다시 체크해주기 위해서 for문안에서 선언해주지 않고 따로 int j를 선언
			for ( j = 0; j < arCount[i]; j++) { // arCount[i] = 각 은행별 계좌 개수만큼돌림
//				arrBank 배열안에 있는 account와 입력받은 account와 비교해서 맞는다면
				if(arrBank[i][j].getAccount().equals(account)) { 
					bank = arrBank[i][j];// bank에 값을 넣음.
					break;
				}
			}
			if(j != arCount[i]) {break;}	// j == arCount[i]이 아니라면 for문 탈출
		}
		return bank;	// 각 은행별 account 값을 bank에 넣어 리턴
	}
	
//	핸드폰 번호 중복 검사
	public static Bank checkPhoneNumber(Bank[][] arrBank, int[] arCount, String phoneNumber) {
		Bank bank = null;
		for (int i = 0; i < arrBank.length; i++) { // 받은 폰넘버와 원래 저장된 폰넘버와 비교했을때 같은지 확인
			int j = 0;
			for (j = 0; j < arCount[i]; j++) {
				if(arrBank[i][j].getPhoneNumber().equals(phoneNumber)) { // 입력받은 문자열과, 저장된 문자열 비교
					bank = arrBank[i][j]; // if문이 true일때 arrbank 2차배열에 저장.
					break;
				}
			}
			if(j != arCount[i]) {break;}
		}
		return bank;
	}
	
//	로그인
	public static Bank login(Bank[][] arrBank, int[] arCount, String account, String password) {
		Bank user = checkAccount(arrBank, arCount, account);
		if(user != null) {	//유저에 값이 있다면? 계좌번호가 존재한다면
			if(user.getPassword().equals(password)) { // 페스워드를 불러와서 입력받은 페스워드와  문자열 비교
				return user; // 유저에 리턴
			}
		}
		return null; // 로그인 실패시 null 값을 리턴
	}
	
	
	
	
}












