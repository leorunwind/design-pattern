package factory.basic;

import factory.abst.Pizza;
import factory.abst.PizzaStore;

/**
 * ��������ľ���ʵ����
 * @author Administrator
 *
 */
public class NYPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		// TODO Auto-generated method stub
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		} else {
			return null;
		}
	}
	
}
