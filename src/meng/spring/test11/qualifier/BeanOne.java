package meng.spring.test11.qualifier;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)//priority
@Component
public class BeanOne implements BeanInterface{

	@Override
	public void hello() {
		System.out.println("hello this is one.");
		
	}

}
