package oops;

 class Product {
	
	// State of an object - attributes
	 int id;
	 String name;
	 int price;
	
	//Constructor
	Product() {
		System.out.println("Product object instantiated");
	}
	
	
	// Behaviour - methods
	
	void setProduct(int id, String name, int price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
	
	// Setters and Getters

	void viewProduct() {
		System.out.println("-----------Product Details----------------");
		System.out.println(" id :"+ id);
		System.out.println(" name :"+ name);
		System.out.println(" price :"+ price);
		System.out.println("---------------------------");
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
}

 // CHILD CLASS 
 // TV extends Product
 
class TV extends Product{
	
	// Additional properties of TV 
	String type;
	int size;
	
	TV(){
		System.out.println("TV object instantiated");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	// Method overloading - as arguments differ in method signature
	void setProduct(int id, String name, int price, String type, int size ) {
		this.id=id;
		this.name=name;
		this.price=price;
		this.type=type;
		this.size=size;
	}
	
	// Method overriding - same method name and same inputs but different body
	void viewProduct() {
		System.out.println("-----------Product Details----------------");
		System.out.println(" id :"+ id);
		System.out.println(" name :"+ name);
		System.out.println(" price :"+ price);
		System.out.println(" type :"+ type);
		System.out.println(" size :"+ size);
		System.out.println("---------------------------");
		
	}
 }



	

	
	
	

