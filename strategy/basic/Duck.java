package strategy.basic;

import strategy.interfaces.FlyBehavior;
import strategy.interfaces.QuackBehavior;

/**
 * 策略模式：定义一系列的算法,把每一个算法封装起来, 并且使它们可相互替换。本模式使得算法可独立于使用它的客户而变化
 * @author Administrator
 *将Fly类和Quack类独立于Duck类封装起来，并可以被设置成具体的实现类，使得Fly和Quack的对象可独立于Duck子类的对象变化
 *这是一个超类，也是一个抽象类，带abstract修饰符的方法必须得到实现
 */
public abstract class Duck {
	
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public void setFlyBehavior(FlyBehavior fb) {
		this.flyBehavior = fb;
	}
	
	public FlyBehavior getFlyBehavior() {
		return this.flyBehavior;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		this.quackBehavior = qb;
	}
	
	public QuackBehavior getQuackBehavior() {
		return this.quackBehavior;
	}
	
	public abstract void display(); // 子类必须实现此方法
	
	public void performFly() {
		flyBehavior.fly(); // 委托给行为类
	}
	
	public void performQuack() {
		quackBehavior.quack(); // 委托给行为类
	}
	
	public void swim() {
		System.out.println("Swim"); //所有子类都将继承此方法
	}
	
}
