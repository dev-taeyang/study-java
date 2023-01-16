package bank;

public class Bank { // �⺻ Ŭ���� Bank ����
	private String name; // �̸�
	private String account; // ���¹�ȣ
	private String phoneNumber; // ����ȣ
	private String password; // ��й�ȣ
	private int money; // �ڻ�
	
	public Bank() {;} // �⺻������ ����

//	 ��� ��ü���� ���� ���� ����
	public String getName() { // ���� �ޱ�
		return name;
	}

	public void setName(String name) { // ����
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
	
//	�Ա�
	public void deposit(int money) { // �Ա� �޼ҵ�
		this.money += money; // �Է¹��� �Ӵϸ� �Ӵ� ��ü�� ����. this.money = this.money + money;
		
	}
	
//	���
	public void withdraw(int money) { // ��� �޼ҵ�
		this.money -= money; // �Ӵ� ��ü���� �Է¹��� �Ӵϸ� ��.
	}
	
//	�ܾ� ��ȸ
	public int showBalance() { // �ܾ� ��ȸ �޼ҵ�
		return money; // ���� �Ӵ� ��ü���� �ҷ���.
	}
	
//	���¹�ȣ �ߺ��˻�
	public static Bank checkAccount(Bank[][] arrBank, int[] arCount, String account) {
		Bank bank = null;
		for (int i = 0; i < arrBank.length; i++) { //arrbank�� �ప�� ���� ��ŭ ����
			int j = 0; /// -> j���� �Ʒ����� �ٽ� üũ���ֱ� ���ؼ� for���ȿ��� ���������� �ʰ� ���� int j�� ����
			for ( j = 0; j < arCount[i]; j++) { // arCount[i] = �� ���ະ ���� ������ŭ����
//				arrBank �迭�ȿ� �ִ� account�� �Է¹��� account�� ���ؼ� �´´ٸ�
				if(arrBank[i][j].getAccount().equals(account)) { 
					bank = arrBank[i][j];// bank�� ���� ����.
					break;
				}
			}
			if(j != arCount[i]) {break;}	// j == arCount[i]�� �ƴ϶�� for�� Ż��
		}
		return bank;	// �� ���ະ account ���� bank�� �־� ����
	}
	
//	�ڵ��� ��ȣ �ߺ� �˻�
	public static Bank checkPhoneNumber(Bank[][] arrBank, int[] arCount, String phoneNumber) {
		Bank bank = null;
		for (int i = 0; i < arrBank.length; i++) { // ���� ���ѹ��� ���� ����� ���ѹ��� �������� ������ Ȯ��
			int j = 0;
			for (j = 0; j < arCount[i]; j++) {
				if(arrBank[i][j].getPhoneNumber().equals(phoneNumber)) { // �Է¹��� ���ڿ���, ����� ���ڿ� ��
					bank = arrBank[i][j]; // if���� true�϶� arrbank 2���迭�� ����.
					break;
				}
			}
			if(j != arCount[i]) {break;}
		}
		return bank;
	}
	
//	�α���
	public static Bank login(Bank[][] arrBank, int[] arCount, String account, String password) {
		Bank user = checkAccount(arrBank, arCount, account);
		if(user != null) {	//������ ���� �ִٸ�? ���¹�ȣ�� �����Ѵٸ�
			if(user.getPassword().equals(password)) { // �佺���带 �ҷ��ͼ� �Է¹��� �佺�����  ���ڿ� ��
				return user; // ������ ����
			}
		}
		return null; // �α��� ���н� null ���� ����
	}
	
	
	
	
}












