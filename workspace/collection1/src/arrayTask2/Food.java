package arrayTask2;

public class Food {
	
	private String food;
	private int price;
	private String kindFood;
	
	public Food() {;}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getKindFood() {
		return kindFood;
	}

	public void setKindFood(String kindFood) {
		this.kindFood = kindFood;
	}

	@Override
	public String toString() {
		return "Food [food=" + food + ", price=" + price + ", kindFood=" + kindFood + "]";
	}
	
	
	

	
	
	
}
