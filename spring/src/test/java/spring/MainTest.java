package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {
	private static ApplicationContext context;

	public static void main(String[] args) {

		context = new ClassPathXmlApplicationContext("others.xml");

		Person person = (Person) context.getBean("person");

		Car car = (Car)context.getBean("car");

		System.out.println(car);
		System.out.println(person);
	}
}
