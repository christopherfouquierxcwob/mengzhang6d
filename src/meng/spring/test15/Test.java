package meng.spring.test15;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext(
					"classpath:spring-jsr.xml");
			context.start();
		} catch (BeansException e) {
			e.printStackTrace();
		}

		JsrService jsrService = context.getBean("jsrService", JsrService.class);
		jsrService.save("meng");
		context.destroy();
	}

}
