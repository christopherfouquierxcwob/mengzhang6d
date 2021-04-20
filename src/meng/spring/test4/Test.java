package meng.spring.test4;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext("classpath:spring-lifecycle.xml");
			context.start();
		} catch (BeansException e) {
			e.printStackTrace();
		}

		BeanLifeCycle o = context.getBean("beanLifeCycle", BeanLifeCycle.class);
		System.out.println(o);
		context.destroy();
	}

}
