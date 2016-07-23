package singleton;

/**
 * 用 synchronized关键字，处理多线程的情况，在多线程访问时同一时刻只能有一个线程能使用synchronized修饰的方法或代码块
 * 缺点：同步带来的性能下降
 * @author Administrator
 *
 */
public class Singleton0 {
	
	private static Singleton0 stInstance;
	
	private Singleton0() {
		System.out.println("I'm a singleton");
	}
	
	public static synchronized Singleton0 getInstance() {
		if (stInstance == null) {
			stInstance = new Singleton0();
		}
		return stInstance;
	}
}
