package meng.spring.test2;

public class InjectionDAOImpl implements InjectionDAO {
	
	public void save(String arg) {
		System.out.println("daoImpl-" + arg);
	}

}
