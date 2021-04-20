package meng.spring.test3;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext(
					"classpath:spring-beanscope.xml");
		} catch (BeansException e) {
			e.printStackTrace();
		}

		BeanScope bean = context.getBean("beanScope", BeanScope.class);
		bean.say();

		BeanScope bean2 = context.getBean("beanScope", BeanScope.class);
		bean2.say();

	}

}
