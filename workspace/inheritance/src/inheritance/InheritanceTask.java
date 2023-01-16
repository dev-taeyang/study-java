package inheritance;

class Car{
//   �귣��
//   ����
//   ����
   String brand;
   String color;
   int price;
   
   public Car() { // �⺻������
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

//   �õ��ѱ�(�귣�� �õ� �ѱ�)
   void engineStart() {
      System.out.println(this.brand + " �õ� �ѱ�");
   }
   
//   �õ�����(�귣�� �õ� ����)
   void engineStop() {
      System.out.println(this.brand + " �õ� ����");
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
		System.out.println(this.brand + "�������� �õ� �ѱ�");
		
		
	}
	
	@Override
	void engineStop() {
		// TODO Auto-generated method stub
		System.out.println(this.brand + "�������� �õ� ����");
		
		
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















