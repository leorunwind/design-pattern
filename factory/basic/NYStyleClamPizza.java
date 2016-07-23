package factory.basic;

import java.util.ArrayList;

import factory.abst.Pizza;

public class NYStyleClamPizza extends Pizza {
	
private ArrayList nyStyleProcList = new ArrayList();
	
	public NYStyleClamPizza() {
		setName("NYStyleClamPizza");
		setSaurce("Shredded clam source");
		nyStyleProcList.add("Special NYStyleClamPizza process");
		setProcessList(nyStyleProcList);
	}
}
