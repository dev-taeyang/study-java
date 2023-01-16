package castingTest;




	class Car{
		
		private String name;
		private String color;
		private int price;
		
		public Car() {
			// TODO Auto-generated constructor stub
		}

		public Car(String name, String color, int price) {
			super();
			this.name = name;
			this.color = color;
			this.price = price;
		}
		
		
		
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		void engineStart () {
			
			System.out.println("¿­¼è·Î ½Ãµ¿ ÄÑÁü");
			
		}
		void engineStop () {
			
			System.out.println("¿­¼è·Î ½Ãµ¿ ²¨Áü");
			
		}
		
		
		
		
	}
	
	
	class SuperCar extends Car {
		
		
		
		public SuperCar() {
			// TODO Auto-generated constructor stub
		}
		
		
		
		@Override
		void engineStart() {
			
			 System.out.println("À½¼ºÀ¸·Î ½Ãµ¿ ÄÑÁü");

		}
		
		@Override
		void engineStop() {
			
			 System.out.println("À½¼ºÀ¸·Î ½Ãµ¿ ²¨Áü");

		}
		
		
		
		
	}
//
//class Car {
//   void engineStart() {
//      System.out.println("¿­¼è·Î ½Ãµ¿ Å´");
//   }
//}
//
//class SuperCar extends Car {
//	
//	@Override
//	void engineStart() {
//		// TODO Auto-generated method stub
//		super.engineStart();
//		System.out.println("À½¼ºÀ¸·Î ½Ãµ¿ Å´");
//		
//	}
//
//}
//
public class CastingTest {
	
	public static void main(String[] args) {
		
		String color= "";
		
		Car matiz = new Car("Matiz", "White", 10000);
		
		SuperCar Ferrari = new SuperCar();
		
		color = matiz.getColor();
		Ferrari.engineStart();
		
		System.out.println(color);
		
		
		matiz.setColor("blak");
		color = matiz.getName();
		
		System.out.println(color);
		
		System.out.println(matiz.getColor());
		matiz.engineStart();
		matiz.engineStop();
		
		Ferrari.engineStart();
		Ferrari.engineStop();
		
		
		
		
	}
	
}


//   public static void main(String[] args) {
//      Car matiz = new Car();
//      SuperCar ferrari = new SuperCar();
////      up casting
//      Car noOptionFerrari = new SuperCar();
////      SuperCar brokenFerrari = (SuperCar)new Car();
////      down casting
//      SuperCar fullOptionFerrari = (SuperCar)noOptionFerrari;
//      
////      matiz instanceof Car : true
//      System.out.println(matiz instanceof Car);
//      
////      matiz instanceof SuperCar : false
//      System.out.println(matiz instanceof SuperCar);
//      
////      ferrari instanceof Car : true
//      System.out.println(ferrari instanceof Car);
//      
////      ferrari instanceof SuperCar : true
//      System.out.println(ferrari instanceof SuperCar);
//      
////      noOptionFerrari instanceof Car : true
//      System.out.println(noOptionFerrari instanceof Car);
//      
////      noOptionFerrari instanceof SuperCar : true
//      System.out.println(noOptionFerrari instanceof SuperCar);
//      
////      fullOptionFerrari instanceof Car : true
//      System.out.println(fullOptionFerrari instanceof Car);
//      
////      fullOptionFerrari instanceof SuperCar : true
//      System.out.println(fullOptionFerrari instanceof SuperCar);
//      ferrari.engineStart();
//      matiz.engineStart();
//   }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
