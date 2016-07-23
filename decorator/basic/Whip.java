package decorator.basic;

import decorator.abst.Beverage;
import decorator.abst.CondimentDecr;

/**
 * 奶泡类，是一种配料。这是一个装饰者
 * @author Administrator
 *
 */
public class Whip extends CondimentDecr {

	Beverage beverage; //Whip类Has-a beverage对象
	int cnt;
	
	public Whip(Beverage beverage, int cnt) {
		this.beverage = beverage;
		this.cnt = cnt;
	}
	
	public String getDesc() {
		// TODO Auto-generated method stub
		return beverage.getDesc() + ", " + this.cnt + " Whip";
	}

	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost() + this.cnt * 0.36;
	}

}
