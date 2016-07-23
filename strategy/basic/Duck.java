package strategy.basic;

import strategy.interfaces.FlyBehavior;
import strategy.interfaces.QuackBehavior;

/**
 * ����ģʽ������һϵ�е��㷨,��ÿһ���㷨��װ����, ����ʹ���ǿ��໥�滻����ģʽʹ���㷨�ɶ�����ʹ�����Ŀͻ����仯
 * @author Administrator
 *��Fly���Quack�������Duck���װ�����������Ա����óɾ����ʵ���࣬ʹ��Fly��Quack�Ķ���ɶ�����Duck����Ķ���仯
 *����һ�����࣬Ҳ��һ�������࣬��abstract���η��ķ�������õ�ʵ��
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
	
	public abstract void display(); // �������ʵ�ִ˷���
	
	public void performFly() {
		flyBehavior.fly(); // ί�и���Ϊ��
	}
	
	public void performQuack() {
		quackBehavior.quack(); // ί�и���Ϊ��
	}
	
	public void swim() {
		System.out.println("Swim"); //�������඼���̳д˷���
	}
	
}
