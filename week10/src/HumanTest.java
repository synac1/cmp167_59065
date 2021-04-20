
public class HumanTest {
	public static void main(String[] args) {
		Human h1 = new Human("Linda", 21, "Hazel");
		Human h2 = new Human("Charles", 19, "Brown");
		System.out.println(h1+"\n\n"+h2);
		System.out.println();
		h2.grow();
		System.out.println(h2);
	}
}
