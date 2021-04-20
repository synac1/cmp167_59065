/**
 * @author Yanilda	 
 **/
public class Mammal {
	private int legNums;
	private boolean fur;
	private int age;
	
	public Mammal(int legNums, boolean fur, int age) {
		this.legNums = legNums;
		this.fur = fur;
		this.age = age;
	}
	public int getLegNums() {
		return legNums;
	}
	public void setLegNums(int legNums) {
		this.legNums = legNums;
	}
	public boolean hasFur() {
		return fur;
	}
	public void setFur(boolean fur) {
		this.fur = fur;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
		if( this == obj)
			return true;
		if (obj instanceof Mammal) {
			Mammal otherMammal = (Mammal) obj;
			return (getLegNums() == otherMammal.getLegNums() 
					&& hasFur() == otherMammal.hasFur() 
					&& getAge() == otherMammal.getAge());
		}
		return false;
	}
	@Override
	public String toString() {
		return "Mammal [legNums=" + legNums + ", fur=" + fur + ", age=" + age + "]";
	}

	public void toSpeak() {
		System.out.println("Mooooooooo");
	}
	public void toGrow() {
		age++;
	}
}
