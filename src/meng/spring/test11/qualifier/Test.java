package meng.spring.test11.qualifier;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext(
					"classpath:spring-autowired_qualifier.xml");
		} catch (BeansException e) {
			e.printStackTrace();
		}

		BeanInvoker invoker = context.getBean("beanInvoker", BeanInvoker.class);
		invoker.say();
	}

}
