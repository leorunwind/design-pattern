package observer.basic;

import observer.impl.CurConditionDisplay;
import observer.impl.WeatherData;

public class WeatherStationTest {
	
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurConditionDisplay curDisplay = new CurConditionDisplay(weatherData);
		
		weatherData.setData(80, 65);
		
		curDisplay.display();
	}
}
