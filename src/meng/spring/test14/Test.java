package meng.spring.test14;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext(
					"classpath:spring-bean2.xml");
		} catch (BeansException e) {
			e.printStackTrace();
		}

		context.getBean("stringStore", Store.class);
	}

}
