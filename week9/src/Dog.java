/**
 * 
 * @author Yanilda		
 *
 */
public class Dog {
	//declaring instance variables
	private String name;
	private String species;
	private int age;
	
	//Constructors
	public Dog() {
		this("Charlie");
	}
	//Overloaded 
	public Dog(String name) {
		this.name = name;
		this.species = "GermandSherpard";
		this.age = 10;
	}
	// setter
	public void setName(String name) {
		if (name.length()<4) {
			this.name = name;	
		}
		else {
			System.out.println("The name should be less than 4 characters");
		}
	}
	public void setSpecies(String spec) {
	    species = spec;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//getter 
	public String getName() {
		return name;
	}
	public String getSpecies() {
		return species;
	}
	public int getAge() {
		return age;
	}
	
	
	@Override
	public String toString() {
		return "Dog : name : "+this.getName()+" , species : "+ getSpecies() +" , age : "+getAge();
	}
	//Modify the dog class, so it has a setter and getter for the species and the age
	//Modify the toString method so it uses the getters instead of the instance variables
}
