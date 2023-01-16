package bank;

public class KbBank extends Bank{
	
	
	
	Bank[] kbCustomer = new Bank[100];
	public KbBank() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public KbBank(Bank[] kbCustomer) {
		super();
		this.kbCustomer = kbCustomer;
	}



	public int withDraw(Bank bank, int withDraw) {
		
		int result = 0;
		
		result =  bankBalance - withDraw / 2;
		
		return result;
		
		
	}
	

}
