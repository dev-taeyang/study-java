package controllStatement;

import java.util.Scanner;

public class SwithTask {
	
	public static void main(String[] args) {
		
		String title = "������ ����ּ���!";
	      String menu = "1.������\n2.������\n3.�����\n4.���\n�Է�: ";
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
		    		  
		    	  System.out.print("�߸� �����ϼ̽��ϴ�.");
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
//	         result = "�߸� �Է��ϼ̽��ϴ�.";
//	      }
//	      
//	      System.out.println(result);

			
		
	}


