package observer.impl;

import java.util.Observable;
import java.util.Observer;

import observer.interfaces.DisplayElement;

/**
 * ������Ϣչʾ(�۲���)������ʵ��java���õĹ۲��߽ӿں�DisplayElement�ӿ�
 * @author Administrator
 *
 */
public class CurConditionDisplay implements Observer, DisplayElement{

	Observable observable;
	private float temp;
	private float humi;
	
	public CurConditionDisplay(Observable ob) {
		this.observable = ob;
	}
	
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("CurTem: "+this.temp+"CurHumidity: "+this.humi);
	}

	public void update(Observable obs, Object arg) {
		// TODO Auto-generated method stub
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)obs;
			this.temp = weatherData.getTemp();
			this.humi = weatherData.getHumi();
			display();
		}
	}

}
