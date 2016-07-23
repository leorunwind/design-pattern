package decorator.basic;

import decorator.abst.Beverage;

public class StarBuzzTest {
	public static void main(String[] args) {
		// ��һ��Espresso�����κε���
		Beverage esBeverage = new Espresso();
		System.out.println(esBeverage.getDesc() + ", $"+esBeverage.cost());
		
		Beverage esBeverage2 = new Espresso();
		esBeverage2 = new Mocha(esBeverage2, 2); //��˫��Mocha����
		esBeverage2 = new Whip(esBeverage2, 1); // �ټ�����
		System.out.println(esBeverage2.getDesc() + ", $"+esBeverage2.cost());
		
		Beverage hBeverage = new HouseBlend();
		hBeverage = new Mocha(hBeverage, 2);
		hBeverage = new Whip(hBeverage, 1);
		System.out.println(hBeverage.getDesc() + ", $"+hBeverage.cost());
	}
}
