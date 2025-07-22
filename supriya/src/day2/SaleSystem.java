package day2;

public class SaleSystem {
             public static void main(String[] args) {
				SaleItem[] items= {
						new SaleItem("Laptop",60000,1),
						new SaleItem("Mouse",1000,3),
						new SaleItem("keyboard",1500,1)
				};
				double grandTotal=0;
				System.out.println("product\nprice\nquantity\ntotal");
				System.out.println("-----------");
				for(SaleItem item:items) {
					item.displayItem();
					grandTotal +=item.getTotalPrice();
				}
				System.out.println("-------------------");
				System.out.println("Grand Total:" +grandTotal);
			}
}
