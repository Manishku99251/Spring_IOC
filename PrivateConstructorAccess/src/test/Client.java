package test;

import java.lang.reflect.Constructor;

public class Client {

	public static void main(String[] args) {
		
	try {
		//using reflection class we are accessing creating object of class having private constructor
		Class c = Class.forName("beans.Test");
		Constructor con[] = c.getDeclaredConstructors();
		con[0].setAccessible(true);
		con[0].newInstance();
	}
		
	catch(Exception ex) {
		
	}

	

}
}
