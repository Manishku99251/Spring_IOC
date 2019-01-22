package test;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import beans.Car;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	String files[] = new String[]{"resources/spring.xml"};
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		Car c = (Car)ap.getBean("c");
		
	//	As this is Eager Container while loading the xml files it will create the objects of both the classes you
	//	can check it in the console as we have written debug statements in constructors of each car and engine.
		c.printCarData();
	}

}
