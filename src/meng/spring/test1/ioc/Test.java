package meng.spring.test1.ioc;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = null;
		try {
			context = new ClassPathXmlApplicationContext("classpath:spring-ioc.xml");
		} catch (BeansException e) {
			e.printStackTrace();
		}

		OneInterface o = context.getBean("oneInterface", OneInterface.class);
		//OneInterface o2 = (OneInterface)context.getBean("oneInterface");
		o.say("ֻConfigure using spring-ioc.xml.");

	}

}
