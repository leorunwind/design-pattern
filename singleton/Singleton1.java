package singleton;

/**
 * 双重检查加锁。首先检查实例是否创建了,如果未创建才进行同步。这样一来，只有第一次会同步，避免了同步带来的性能下降
 * @author Administrator
 *
 */
public class Singleton1 {

	private volatile static Singleton1 stInstance; // volatile确保多个线程能获得最新的stInstance的值
	
	private Singleton1() {
		System.out.println("I'm a singleton");
	}
	
	public static Singleton1 getInstance() {
		if (stInstance == null) {
			synchronized (Singleton1.class) {
				if (stInstance == null) {
					stInstance = new Singleton1();
				}
			}
		}
		return stInstance;
	}
}
