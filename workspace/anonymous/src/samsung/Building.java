package samsung;

public class Building {
	
	public static void main(String[] args) {
		
		Samsung onLine = new Samsung();
		Samsung offLine = new Samsung();
		
	
		onLine.register(new Form() {
			
			@Override
			public void sell(String menu) {
				
				
				
			}
			
			@Override
			public String[] getMenu() {
				
				
				return new String[] {"휴대폰", "컴퓨터", "모니터", ""};
			}
		});
		
		offLine.register(new FormAdapter() {
			
			@Override
			public String[] getMenu() {
				// TODO Auto-generated method stub
				return new String[] {"휴대폰", "컴퓨터", "모니터", ""};
			}
		});
	
		
	}

}
