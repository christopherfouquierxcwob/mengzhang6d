package meng.spring.test1.ioc;

public class OneInterfaceImpl implements OneInterface {
	
	public void say(String arg) {
		System.out.println("Realization way one," + arg);
	}

}
