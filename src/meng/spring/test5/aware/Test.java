package meng.spring.test5.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext(
					"classpath:spring-aware.xml");
		} catch (BeansException e) {
			e.printStackTrace();
		}

		AwareTest awareTest = context.getBean("awareTest", AwareTest.class);
		System.out.println(awareTest.hashCode());

	}

}
