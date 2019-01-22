package test;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import beans.Test;

public class Client {

	public static void main(String[] args) {
		
		/*
		org.springframework.core.io.Resource r = new ClassPathResource("resources/spring.xml");
		BeanFactory factory = new XmlBeanFactory((org.springframework.core.io.Resource) r);
		
	Object o =  factory.getBean("t");  // return type is Object
	Object o1 =  factory.getBean("t");
	Object o2 =  factory.getBean("t");
	Test t = (Test)o;
	
		t.hello();
		//it is creating only one single object as all the object references are equal
		//Object scope is singelton 
		System.out.println(o==o1);
		System.out.println(o1==o2);*/
		
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/spring.xml");
		//Test t = (Test)ap.getBean("t");
		
		/*
		 * if the Scope is Prototype
		 * 
		 * from this xml IOC container by using reflection classes in lang package
		 * by using class.forname("Test").newInstance() then new instance for test class will be created
		 * This Test class should be public and constructor should also be public but Spring can create object for  Private constructor class
		 */
	}

}
