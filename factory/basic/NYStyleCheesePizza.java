package factory.basic;

import java.util.ArrayList;
import factory.abst.Pizza;

/**
 * 产品类的具体实现类
 * @author Administrator
 *
 */
public class NYStyleCheesePizza extends Pizza {

	private ArrayList nyStyleProcList = new ArrayList();
	
	public NYStyleCheesePizza() {
		setName("NYStyleCheesePizza");
		setSaurce("Marinara source");
		nyStyleProcList.add("Special NYStyleCheesePizza process");
		setProcessList(nyStyleProcList);
	}
}
