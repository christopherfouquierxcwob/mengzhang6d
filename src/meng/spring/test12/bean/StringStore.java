package meng.spring.test12.bean;

public class StringStore implements Store {

	@Override
	public void init() {
		System.out.println("it is init.");
	}

	@Override
	public void destroy() {
		System.out.println("it is destroy.");
	}

}
