package decorator.basic;

import decorator.abst.Beverage;

/**
 * ���ȣ��̳�������
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
