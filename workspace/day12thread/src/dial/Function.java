package dial;

public class Function {
	
	private String passWord;
	private int count;
	
	public Function() {;}
	
	

	public Function(String passWord, int count) {
		super();
		this.passWord = passWord;
		this.count = count;
	}



	public String getPassWord() {
		return passWord;
	}


	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	@Override
	public String toString() {
		return "Fucntion [passWord=" + passWord + ", count=" + count + "]";
	}
	
	public int checkPassWord(String passWord) {
		
		int count = 0;
		Function function = new Function();
		for (int i = 0; i < passWord.length(); i++) {
			
			if(function.getPassWord().charAt(i) != passWord.charAt(i)) {
				count += function.getPassWord().charAt(i) - passWord.charAt(i);
				return count;
			}else if(function.getPassWord().charAt(i) == passWord.charAt(i))
			{
				
				
				
			}
			
		}return count;
		
		
		
		
	}
	
	

}
