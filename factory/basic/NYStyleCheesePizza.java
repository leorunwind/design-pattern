package factory.basic;

import java.util.ArrayList;
import factory.abst.Pizza;

/**
 * ��Ʒ��ľ���ʵ����
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
