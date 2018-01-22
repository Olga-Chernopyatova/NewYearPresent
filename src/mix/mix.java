package mix;

public abstract class mix {
	
	private String brand;
	private Double weight;
	private Double price;
	
	public mix() {}
	
	public mix(String brand, Double weight, Double price) {
		super();
		this.brand = brand;
		this.weight = weight;
		this.price = price;
		
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String toString() {
		return "brand = " + brand + ", weight = " + weight + ", price = " + price;
	}

}
