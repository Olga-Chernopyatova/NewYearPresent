package mix;

public class Candy extends mix {

	private String flavour;
	
	public Candy() {}
	
	public Candy(String brand, int i, int j, String flavour) {
		super(brand, i, j);
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
