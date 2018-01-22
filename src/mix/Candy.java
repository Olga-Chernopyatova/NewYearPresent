package mix;

public class Candy extends mix {

	private String flavour;
	
	public Candy() {}
	
	public Candy(String brand, double weight, double price, String flavour) {
		super(brand, weight, price);
	    this.flavour = flavour;
	}
	
	public String getFlavour() {
		return flavour;
	}



	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public String toString() {
		return "Candy [" + super.toString() + ", flavour = " + flavour + "]";
	}
}
