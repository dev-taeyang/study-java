package controllStatement;

import java.util.Scanner;

public class SwithTask {
	
	public static void main(String[] args) {
		
		String title = "색상을 골라주세요!";
	      String menu = "1.빨간색\n2.검은색\n3.노란색\n4.흰색\n입력: ";
	      int result = 0;
	      int choice = 0;
	      Scanner sc = new Scanner(System.in);
	      
	      System.out.println(title);
	      System.out.println(menu);
	      choice = sc.nextInt();
	      

	      
		      switch(choice) {
		      
		      case 1 :
		    	  
		    	  System.out.print("1. RED");
		    	  break;
		    	  
		      case 2 :
		    	  
		    	  System.out.print("2. Black");
		    	  break;
		    	  
		      case 3 :
		    	  
		    	  System.out.print("3. Yellow");
		    	  break;
		    	  
		      case 4 :
		    	  
		    	  System.out.print("4. White");
		    	  break;
		    	  
		      default :
		    		  
		    	  System.out.print("잘못 선택하셨습니다.");
		    	  break;
		    		  
	      
		      }
		  
	      }
	      
	      
//	      if(choice == 1) {
//	         result = "Red";
//	         
//	      }else if(choice == 2) {
//	         result = "Black";
//	         
//	      }else if(choice == 3) {
//	         result = "Yellow";
//	         
//	      }else if(choice == 4) {
//	         result = "White";
//	         
//	      }else {
//	         result = "잘못 입력하셨습니다.";
//	      }
//	      
//	      System.out.println(result);

			
		
	}


