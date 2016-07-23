package singleton;

/**
 * ����static��ʼ��ʵ��������JVM�ڼ��������ʱ���ϴ�����Ψһ�ĵ�һʵ��
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
