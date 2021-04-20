package meng.spring.test6.autowiring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {

	public static void main(String[] args) {
		ApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext(
					"classpath:spring-autowiring3.xml");
		} catch (BeansException e) {
			e.printStackTrace();
		}

		AutoWiringService3 autoWiringService = context.getBean(
				"autoWiringService", AutoWiringService3.class);
		System.out.println(autoWiringService.hashCode());
	}

}
