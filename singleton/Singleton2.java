package singleton;

/**
 * 利用static初始化实例，依赖JVM在加载这个类时马上创建此唯一的单一实例
 * @author Administrator
 *
 */
public class Singleton2 {

	private static Singleton2 stInstance = new Singleton2();
		
	private Singleton2() {
		System.out.println("I'm a singleton");
	}
	
	public static Singleton2 getInstance() {
		return stInstance;
	}

}
