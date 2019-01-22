package beans;

public class Test {

	private String name;
	private int age;
	private String Email;
	
	
	
	private Test(String name, int age, String Email ) {
		
		System.out.println("Name "+name);
		System.out.println("Age "+age);
		System.out.println("Email "+Email);
	}
}
