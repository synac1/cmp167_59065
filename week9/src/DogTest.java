
public class DogTest {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		
		Dog d2 = new Dog("Lila");
		
		d1.setSpecies("Chihuahua");
			
		System.out.println(d1);
		System.out.println(d2);
	}
}
