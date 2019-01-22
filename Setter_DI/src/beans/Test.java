package beans;

public class Test {

	private String name;
	private int age;
	private String Email;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	public void printData() {
		System.out.println("Name "+name);
		System.out.println("Age "+age);
		System.out.println("Email "+Email);
	}
	
}
