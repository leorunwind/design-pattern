package strategy.basic;

import strategy.bebaviorImpl.FlyNoWay;
import strategy.bebaviorImpl.MuteQuack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new MuteQuack();
	}
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a model duck");
	}
	
}
