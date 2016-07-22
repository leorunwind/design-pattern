package strategy.basic;

import strategy.bebaviorImpl.FlyWithWings;
import strategy.bebaviorImpl.Quack;

public class MallardDuck extends Duck {
	
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I'm a real duck");
	}

}
