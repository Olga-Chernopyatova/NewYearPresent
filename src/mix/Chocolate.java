package mix;

public class Chocolate extends mix {

	 private String type;
	 
	 public Chocolate() {}

	public Chocolate(String brand, Double weight, Double price, String type) {
		super(brand, weight, price);
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	} 
	 
	public String toString() {
		return "Chocolate = [" + super.toString() + ", type = " + type + "]";
	}
	 
}
