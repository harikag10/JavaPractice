package oops;

public class Main {
	
	public static void main(String[] args) {
		// Creating product object
		Product p = new Product();
		p.setProduct(1, "Mobile", 1000);
		p.viewProduct();
		
		TV t = new TV();// Both Product and TV objects get instantiated
		t.setProduct(2, "Samsung TV", 2000,"LED",50);
		t.viewProduct();
		
	}
}
