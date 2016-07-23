package decorator.basic;

import decorator.abst.Beverage;
import decorator.abst.CondimentDecr;

/**
 * Mocha，配料。这是是一个装饰者
 * @author Administrator
 *
 */
public class Mocha extends CondimentDecr {
	
	Beverage beverage;
	int cnt;
	
	public Mocha(Beverage beverage, int cnt) {
		this.beverage = beverage; //将被装饰者(饮料)和份数记录到此实例变量中
		this.cnt = cnt;
	}

	public String getDesc() {
		// TODO Auto-generated method stub
		return beverage.getDesc() + ", "+ this.cnt+ " Mocha";
	}

	public double cost() {
		// TODO Auto-generated method stub
		return beverage.cost() + this.cnt * 0.20;
	}

}
