package my.learning.test;

public class Employee {
	
	
	private String firstName;
	private String lastName;
	private OfficeAddress officeAddress;
	private int salary;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public OfficeAddress getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(OfficeAddress ofa) {
		this.officeAddress = ofa;
	}
	
	
	

}
