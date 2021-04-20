package meng.spring.test7.resources;

import java.io.IOException;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) throws IOException {
		ApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext(
					"classpath:spring-resource.xml");
		} catch (BeansException e) {
			e.printStackTrace();
		}

		ResourcesTest resourcesTest = context.getBean("resourcesTest",
				ResourcesTest.class);
		resourcesTest.resources();
	}

}
