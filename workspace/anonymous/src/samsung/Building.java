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
				
				
				return new String[] {"�޴���", "��ǻ��", "�����", ""};
			}
		});
		
		offLine.register(new FormAdapter() {
			
			@Override
			public String[] getMenu() {
				// TODO Auto-generated method stub
				return new String[] {"�޴���", "��ǻ��", "�����", ""};
			}
		});
	
		
	}

}
