package day2;

public class SaleItem {
        private String productName;
        private double price;
        private int quantity;
        public SaleItem(String productName,double price,int quantity) {
        	this.productName=productName;
        	this.price=price;
        	this.quantity=quantity;
        }
        public double getTotalPrice() {
        	return price*quantity;
        }
        public void displayItem() {
        	System.out.println(productName+"\n"+price+"\n"+quantity+"/n"+getTotalPrice());
        }
}
