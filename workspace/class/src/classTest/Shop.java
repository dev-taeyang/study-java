package classTest;

public class Shop {
   String name;	//이름
   int price;  // 가격
   int stock; //재고
   
   public Shop() {;}

   public Shop(String name, int price, int stock) {
      this.name = name;
      this.price = price;
      this.stock = stock;
   }
   
   int sell(Customer customer) { // sell 메소드
      stock--;
      int result = (int)(price * (1.0 - customer.discount / 100.0));
      customer.money -= result;
      return result;
   }
}