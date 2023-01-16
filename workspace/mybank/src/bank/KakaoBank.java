package bank;

public class KakaoBank extends Bank{
	
	
	Bank[] kakaoCoustmer = new Bank[100];
	
	public KakaoBank() {
		// TODO Auto-generated constructor stub
	}
	
	
	public KakaoBank(Bank[] kakaoCoustmer) {
		super();
		this.kakaoCoustmer = kakaoCoustmer;
	}



	public void checkBankBalance(Bank bank, boolean checkBankBalance) {
		
		checkBankBalance = false;
		
		if(checkBankBalance) {
			
			bankBalance = bankBalance / 2 ;
			
		}
		

	   }
	
	

}
