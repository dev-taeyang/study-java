package bank;

public class SinhanBank extends Bank{ // Bank�� �ڽ� Ŭ���� SinhanBank
	
	
	
	Bank[] sinhanCustomer = new Bank[100];
	
	public SinhanBank() {
		// TODO Auto-generated constructor stub
	}
	
	
	public SinhanBank(Bank[] sinhanCustomer) {
		super();
		this.sinhanCustomer = sinhanCustomer;
	}

	


	public void deposit(Bank bank, int deposit) {
		
		int result = 0;
		
		result = bankBalance + deposit/2;
		
	}

}
