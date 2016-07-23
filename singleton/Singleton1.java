package singleton;

/**
 * ˫�ؼ����������ȼ��ʵ���Ƿ񴴽���,���δ�����Ž���ͬ��������һ����ֻ�е�һ�λ�ͬ����������ͬ�������������½�
 * @author Administrator
 *
 */
public class Singleton1 {

	private volatile static Singleton1 stInstance; // volatileȷ������߳��ܻ�����µ�stInstance��ֵ
	
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
