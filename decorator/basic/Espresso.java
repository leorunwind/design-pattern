package decorator.basic;

import decorator.abst.Beverage;

/**
 * ���ȣ���һ������
 * @author Administrator
 *
 */
public class Espresso extends Beverage {

	public Espresso() {
		this.setDesc("Espressor Coffee");
	}
	
	public double cost() {
		// TODO Auto-generated method stub
		return 1.99;
	}

}
