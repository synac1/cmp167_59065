

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp1 = new Employee("Katie", 56777, "manager");
		Employee emp2 = new Employee("Katie", 56777, "manager");
		
		System.out.println(emp1 +"\n"+emp2);
		System.out.println(emp1.equals(emp2));
	}
}
