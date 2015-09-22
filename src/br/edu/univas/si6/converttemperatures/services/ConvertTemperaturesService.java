package br.edu.univas.si6.converttemperatures.services;

import java.text.DecimalFormat;

public class ConvertTemperaturesService {
	private ConvertTemperaturesService() {
		//To avoid a new instance of BMIService class
	}
	
	public static String getTemperature(Float temperature, String type) {
		String result ="";
		float calculate = 0f;
		
		
		if(type.equals("fahrenheit")){
			calculate=(float) ((temperature-32)*5/9);
		}else if (type.equals("celsius")){
			calculate=(float) ((temperature*1.8)+32);
		}
		result = getDescription(calculate, type);
		return result;
	}
	
	private static String getDescription(Float temperature,String type) {
		String result = "";
		String temperatureFormat=formatNumber(temperature);
		
		if(type.equals("fahrenheit")){
			 result=temperatureFormat+" ºC";
		}else if (type.equals("celsius")){
			result=temperatureFormat+" ºF";
		}
		
		return result;
	}
	
	private static String formatNumber(Float number){
		
		
		DecimalFormat decimalFormat = new DecimalFormat("0.##");
		
		
		return decimalFormat.format(number);
	}
	

}
