package singleton;

/**
 * �� synchronized�ؼ��֣�������̵߳�������ڶ��̷߳���ʱͬһʱ��ֻ����һ���߳���ʹ��synchronized���εķ���������
 * ȱ�㣺ͬ�������������½�
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
