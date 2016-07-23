package factory.basic;

import factory.abst.Pizza;
import factory.abst.PizzaStore;

/**
 * ����һ����������Ľӿڣ������������Ҫʵ������������һ���������ʵ�����Ƴٵ����ࡣ
 * @author Administrator
 *
 */
public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYPizzaStore();
		
		Pizza pizza = nyPizzaStore.orderPizza("cheese"); //�����������pizzaʵ����װ��Store����
		System.out.println("Customer order a" + pizza.getName() + "\n");
		
		Pizza pizza2 = nyPizzaStore.orderPizza("clam");
		System.out.println("Customer order a" + pizza2.getName() + "\n");
	}
}
