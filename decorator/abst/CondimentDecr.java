package decorator.abst;

/**
 * 必须让这个装饰器类能取代Beverage，所以采用继承
 * @author Administrator
 *
 */
public abstract class CondimentDecr extends Beverage {
	public abstract String getDesc(); // 所有调料装饰器必须重新实现此方法
}
