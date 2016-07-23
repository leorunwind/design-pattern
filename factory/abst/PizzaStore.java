package factory.abst;

/**
 * ����ģʽ����������
 * @author Administrator
 *
 */
public abstract class PizzaStore {

	// ʵ����pizza�����ﱻ�Ƶ��÷����У��÷������൱��һ����������
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
