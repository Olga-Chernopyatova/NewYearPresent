
package mix;

public class base {

	public static void main(String[] args) {
		
		Candy candy1 = new Candy("ChupaChups", 5, 12, "Cherry");
		Chocolate chocolate1 = new Chocolate("Linde", 180, 250, "Dark");
		Chocolate chocolate2 = new Chocolate("Kinder", 70, 90, "Surprise");
		chocolate2.setBrand("Bounty");
		chocolate2.setWeight("70");
		chocolate2.setPrice("50");
		chocolate2.setType("Limited");
		mix [] box = new {candy1, chocolate1, chocolate2};
		for(mix someMix: box) {
			System.out.println(someMix.toString())
		}

	}

}
