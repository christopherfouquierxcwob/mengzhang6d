package meng.spring.test9.autowired;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext(
					"classpath:spring-autowired.xml");
		} catch (BeansException e) {
			e.printStackTrace();
		}

		InjectionService service = context.getBean("injectionServiceImpl",
				InjectionService.class);
		service.save("Autowired");

	}

}
