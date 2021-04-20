
public class Bear extends Mammal {
	private String species;
	public Bear(int numLegs, boolean fur, int age, String species) {
		super(numLegs, fur, age);
		this.species = species;
	}
	
	@Override
	public void toSpeak() {
		System.out.println("Grrr");
	}
	
	
	public String toString() {
		return "Bear "+ super.toString()+" Species "+this.species;
	}
}
