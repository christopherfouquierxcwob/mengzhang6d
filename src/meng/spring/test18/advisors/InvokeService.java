package meng.spring.test18.advisors;

import org.springframework.dao.PessimisticLockingFailureException;
import org.springframework.stereotype.Service;

@Service
public class InvokeService {
	
	public void invoke() {
		System.out.println("Normal execution...");
	}
	
	public void invokeException() {
		throw new PessimisticLockingFailureException("ִException...");
	}

}
