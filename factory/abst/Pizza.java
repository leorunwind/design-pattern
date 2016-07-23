package factory.abst;

import java.util.ArrayList;

/**
 * 工厂模式：产品类
 * @author Administrator
 *
 */
public abstract class Pizza {
	
	private String name;
	private String saurce;
	private ArrayList processList = new ArrayList();
	
	void prepare() {
		System.out.println("Preparing "+getName());
		System.out.println("Adding "+getSaurce());
		for (int i = 0;i < getProcessList().size();i++) {
			System.out.println(" " + getProcessList().get(i));
		}
	}
	
	void bake() {
		System.out.println("Baking pizza...");
	}
	
	void cut() {
		System.out.println("Cutting pizza...");
	}
	
	void wrap() {
		System.out.println("Wraping pizza...");
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSaurce() {
		return saurce;
	}

	public void setSaurce(String saurce) {
		this.saurce = saurce;
	}

	public ArrayList getProcessList() {
		return processList;
	}

	public void setProcessList(ArrayList processList) {
		this.processList = processList;
	}
}
