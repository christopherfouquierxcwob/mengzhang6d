package meng.spring.test10.multibean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2)//it is priority
@Component
public class BeanOne implements BeanInterface{

	@Override
	public void hello() {
		System.out.println("hello this is one.");
		
	}

}
