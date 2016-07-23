package decorator.basic;

import decorator.abst.Beverage;
import decorator.abst.CondimentDecr;

/**
 * Mocha�����ϡ�������һ��װ����
 * @author Administrator
 *
 */
public class Mocha extends CondimentDecr {
	
	Beverage beverage;
	int cnt;
	
	public Mocha(Beverage beverage, int cnt) {
		this.beverage = beverage; //����װ����(����)�ͷ�����¼����ʵ��������
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
