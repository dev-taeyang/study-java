package wrapperTest;

public class WrapperTask {
	
	public static void main(String[] args) {
		
		//1, 12.5, 86.6F, 'Z', "Hi", false
		//위 6개의 값을 6칸 배열에 담기

//		Object[] arValue = new Object[6];
//		
//	
//		arValue[0] = 1;
//		arValue[1] = 12.5;
//		arValue[2] = 86.6F;
//		arValue[3] = 'Z';
//		arValue[4] = "Hi";
//		arValue[5] = false;
//		
//		for (int i = 0; i < arValue.length; i++) {
//			
//			System.out.println(arValue[i]);
//			
//		}
		
		Object[] arValue = {1, 12.5, 86.6F, 'Z', "Hi", false};
		
		for (int i = 0; i < arValue.length; i++) {
			
			System.out.println(arValue[i]);
			
		}
		
	
		
		
		
	}

}
