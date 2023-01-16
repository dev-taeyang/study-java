package arrayListTask;

public class Fruit {
	
	private String fruit;
	private int price;
	
	public Fruit() {;}

	
	

	public String getFruit() {
		return fruit;
	}




	public void setFruit(String fruit) {
		this.fruit = fruit;
	}




	public int getPrice() {
		return price;
	}




	public void setPrice(int price) {
		this.price = price;
	}




	@Override
	public String toString() {
		return "Fruit [fruit=" + fruit + ", price=" + price + "]";
	}
	


}
