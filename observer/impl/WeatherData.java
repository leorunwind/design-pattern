package observer.impl;

import java.util.Observable;

/**
 * �۲���ģʽ
 * �������⣬ʵ����java���õ�������
 * @author Administrator
 *
 */
public class WeatherData extends Observable {
	private float temp;
	private float humi;
	
	public WeatherData() {
		
	}
	
	public void dataChanged() {
		setChanged(); //ָʾ��״̬�Ѹı�
		notifyObservers(); //֪ͨ���й۲���
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
