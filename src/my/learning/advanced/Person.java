package my.learning.advanced;

import java.util.Objects;

public class Person {
	
	private String firstName;
	private String lastName;
	private int age;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
       	if (o == null || !(o instanceof Person)){
             return false;
        }
		Person person = (Person) o;
		return age == person.age &&
				firstName.equals(person.firstName) &&
				lastName.equals(person.lastName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, age);
	}
}
