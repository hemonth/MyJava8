package java8;

public class Person {

	protected String name;
	
	protected int age;
	
	protected String school;
	
	protected Address address;


	Person(String name, int age, String school,Address address){
		this.name = name;
		this.age = age;
		this.school = school;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
