package strategy.basic;

import strategy.bebaviorImpl.FlyRocketPowered;
import strategy.bebaviorImpl.MuteQuack;

public class DuckTest {
	public static void main(String[] args) {
		Duck maDuck = new MallardDuck();
		maDuck.display();
		maDuck.performFly();
		maDuck.performQuack();
		maDuck.setQuackBehavior(new MuteQuack());
		System.out.println(maDuck.getQuackBehavior().getClass());
		maDuck.performQuack();
		
		Duck modelDuck = new ModelDuck();
		modelDuck.display();
		modelDuck.performFly();
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		System.out.println(modelDuck.getFlyBehavior().getClass());
		modelDuck.performFly();
	}
}
