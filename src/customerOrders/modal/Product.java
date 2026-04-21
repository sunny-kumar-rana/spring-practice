package customerOrders.modal;

public class Product {
	long id;
	String name;
	double price;
	
	public Product(long id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public Long getId() {
		return this.id;
	}
	public double getPrice() {
		return this.price;
	}
	
	public String toString() {
		return "Product : " + this.name + "\n id : " + this.id + "\n price : " + this.price + " rs ";
	}
}
