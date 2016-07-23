package decorator.basic;

import decorator.abst.Beverage;

public class StarBuzzTest {
	public static void main(String[] args) {
		// 点一杯Espresso不加任何调料
		Beverage esBeverage = new Espresso();
		System.out.println(esBeverage.getDesc() + ", $"+esBeverage.cost());
		
		Beverage esBeverage2 = new Espresso();
		esBeverage2 = new Mocha(esBeverage2, 2); //加双份Mocha调料
		esBeverage2 = new Whip(esBeverage2, 1); // 再加奶泡
		System.out.println(esBeverage2.getDesc() + ", $"+esBeverage2.cost());
		
		Beverage hBeverage = new HouseBlend();
		hBeverage = new Mocha(hBeverage, 2);
		hBeverage = new Whip(hBeverage, 1);
		System.out.println(hBeverage.getDesc() + ", $"+hBeverage.cost());
	}
}
