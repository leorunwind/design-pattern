package decorator.basic;

import decorator.abst.Beverage;

/**
 * 咖啡，是一种饮料
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
