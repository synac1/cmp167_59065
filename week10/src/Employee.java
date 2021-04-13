/**
 * 
 * @author Yanilda
 * desc: Employee class
 * created: 4.13.21
 **/
public class Employee {
	private String name;
	private int empID;
	private double Salary;
	private String role;
	private static int EmployeeCount;
	
	public Employee(String name,  double salary, String role) {
		this.name = name;
		this.empID = ++EmployeeCount;
		Salary = salary;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if(obj instanceof Employee) {
			Employee otherEmployee = (Employee) obj;
			if ( getEmpID() == otherEmployee.getEmpID() 
					&& getName().equals(otherEmployee.getName())
					&& getRole().equals(otherEmployee.getRole())
					&& Math.abs(getSalary()-otherEmployee.getSalary())<.000001) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empID=" + empID + ", Salary=" + Salary + ", role=" + role + "]";
	}
	
}
