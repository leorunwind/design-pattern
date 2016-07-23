package singleton;

public class SingletonTest implements Runnable {

	private String name;
	
	public SingletonTest(String name) {
		this.setName(name);
	}
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("try to create singleton " + name);
		Singleton2.getInstance();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		SingletonTest st1 = new SingletonTest("A");
		SingletonTest st2 = new SingletonTest("B");
		SingletonTest st3 = new SingletonTest("C");
		st1.run();
		st2.run();
		st3.run();
	}
	
}
