package dial;

public class Task2 {
	
	int[] count = new int[5000];
	
	
	public int countingOne(String s) {
		
		int result = 0;
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			
			
			if(s.charAt(i) == '1') {
				count = count + 1; 
			}else if(s.charAt(i) != '1') {
				this.count[i] = count;
				count = 0;
				
			}

			
		}
		
		result = count;
		return result;
	}
	
	

}
