package meng.spring.test6.autowiring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext(
					"classpath:spring-autowiring.xml");
		} catch (BeansException e) {
			e.printStackTrace();
		}

		AutoWiringService autoWiringService = context.getBean(
				"autoWiringService", AutoWiringService.class);
		System.out.println(autoWiringService.hashCode());

	}

}
