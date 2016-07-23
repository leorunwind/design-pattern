package decorator.basic;

import decorator.abst.Beverage;

/**
 * ¿§·È£¬¼Ì³Ğ×ÔÒûÁÏ
 * @author Administrator
 *
 */
public class HouseBlend extends Beverage {

	public HouseBlend() {
		 this.setDesc("House Blend Coffee");
	}
	
	public double cost() {
		// TODO Auto-generated method stub
		return 0.89;
	}
	
}
