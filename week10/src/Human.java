/**
 * 
 * @author yanil_jjrab3j
 *
 **/
public class Human {
	private String name;
	private int age;
	private String eyeColor;
	
	public Human (){
		this("", 0, "Green");
	}
	public Human( String name, int age , String eyeColor){
		setName(name);
		setAge(age);
		setEyeColor(eyeColor);
	}
	//setters
	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setEyeColor( String eyeColor){
		this.eyeColor = eyeColor;
	}
	
	//getters
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getEyeColor() {
		return eyeColor;
	}
	
	@Override
	public boolean equals(Object obj) {
		if ( this == obj ) {
			return true;
		}
		if(obj instanceof Human) {
			Human otherHuman = (Human) obj;
			if(name.equals(otherHuman.name)
					&& age == otherHuman.age
					&& eyeColor.equals(otherHuman.eyeColor)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		String representation = String.format("Human:%nName: %s%nAge: %d%nEye color: %s", name, age, eyeColor);
		return representation; 
	}
	public void grow() {
		System.out.println("Today is my birthday");
		age++;
	}
	
}
