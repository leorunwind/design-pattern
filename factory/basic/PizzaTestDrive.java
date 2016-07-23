package factory.basic;

import factory.abst.Pizza;
import factory.abst.PizzaStore;

/**
 * 定义一个创建对象的接口，但由子类决定要实例化的类是哪一个。让类把实例化推迟到子类。
 * @author Administrator
 *
 */
public class PizzaTestDrive {

	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYPizzaStore();
		
		Pizza pizza = nyPizzaStore.orderPizza("cheese"); //创建具体风格的pizza实例封装在Store类中
		System.out.println("Customer order a" + pizza.getName() + "\n");
		
		Pizza pizza2 = nyPizzaStore.orderPizza("clam");
		System.out.println("Customer order a" + pizza2.getName() + "\n");
	}
}
