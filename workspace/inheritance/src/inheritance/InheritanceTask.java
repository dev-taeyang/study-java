package inheritance;

class Car{
//   브랜드
//   색상
//   가격
   String brand;
   String color;
   int price;
   
   public Car() { // 기본생성자
	// TODO Auto-generated constructor stub
}
   
   
   
   public Car(String brand, String color, int price){
      this.brand = brand;
      this.color = color;
      this.price = price;
   }
   
   public Car(String color, int price) {
      this.color = color;
      this.price = price;
   }

//   시동켜기(브랜드 시동 켜기)
   void engineStart() {
      System.out.println(this.brand + " 시동 켜기");
   }
   
//   시동끄기(브랜드 시동 끄기)
   void engineStop() {
      System.out.println(this.brand + " 시동 끄기");
   }
}

class SuperCar extends Car{
	
	String brand;
	String color;
	int price;
	
	public SuperCar() {
		// TODO Auto-generated constructor stub
	}
	

	public SuperCar(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}


	@Override
	void engineStart() {
		// TODO Auto-generated method stub
		System.out.println(this.brand + "음성으로 시동 켜기");
		
		
	}
	
	@Override
	void engineStop() {
		// TODO Auto-generated method stub
		System.out.println(this.brand + "음성으로 시동 끄기");
		
		
	}
}

public class InheritanceTask {
   public static void main(String[] args) {
      Car myCar = new Car("KIA", "Black", 3000);
      Car momCar = new Car("BENZ", "White", 10000);
      Car dadyCar = new Car("Red", 6000);
      SuperCar yoojin = new SuperCar("BENTLY:", "Pink", 10000);
//      myCar.brand = "KIA";
//      myCar.color = "Black";
//      myCar.price = 3000;
      
      myCar.engineStart();
      myCar.engineStop();
      
      momCar.engineStart();
      momCar.engineStop();
      yoojin.engineStart();
      yoojin.engineStop();
 
      
   }
}















