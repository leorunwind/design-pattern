package factory.abst;

/**
 * 工厂模式：创建者类
 * @author Administrator
 *
 */
public abstract class PizzaStore {

	// 实例化pizza的人物被移到该方法中，该方法就相当于一个“工厂”
	protected abstract Pizza createPizza(String type);
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.wrap();
		
		return pizza;
	}
}
