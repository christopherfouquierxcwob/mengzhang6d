package meng.spring.test16.aop;

public class AspectBiz {

	public void biz() {
		System.out.println("business: biz");
		// test aop:after-throwing
		// throw new RuntimeException();
	}

	public void init(String name, int count) {
		System.out.println("business:" + name + "," + count);
	}

}
