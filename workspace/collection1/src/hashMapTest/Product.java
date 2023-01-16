package hashMapTest;	// CRUD의 기능이 아니라 데이터 보관용도 (모델 객체)

public class Product {
	
	private int productNumber;
	private String productName;
	private int productPrice;
	private int productAmount;
	
	public Product() {;}

	public Product(int productNumber, String productName, int productPrice, int productAmount) {
		super();
		this.productNumber = productNumber;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productAmount = productAmount;
	}
	
	

	public int getProductNumber() {
		return productNumber;
	}

	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductAmount() {
		return productAmount;
	}

	public void setProductAmount(int productAmount) {
		this.productAmount = productAmount;
	}

	@Override
	public String toString() {
		return "Product [productNumber=" + productNumber + ", productName=" + productName + ", productPrice="
				+ productPrice + ", productAmount=" + productAmount + "]";
	}
	
	
	


}
