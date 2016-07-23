package observer.impl;

import java.util.Observable;

/**
 * 观察者模式
 * 气象主题，实现了java内置的主题类
 * @author Administrator
 *
 */
public class WeatherData extends Observable {
	private float temp;
	private float humi;
	
	public WeatherData() {
		
	}
	
	public void dataChanged() {
		setChanged(); //指示出状态已改变
		notifyObservers(); //通知所有观察者
	}
	
	public void setData(float temp, float humi) {
		this.temp = temp;
		this.humi = humi;
		dataChanged();
	}
	
	public float getTemp() {
		return this.temp;
	}
	
	public float getHumi() {
		return this.humi;
	}
}
