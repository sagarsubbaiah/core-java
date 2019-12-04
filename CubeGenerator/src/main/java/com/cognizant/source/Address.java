package com.cognizant.source;

public class Address {
	
	private String cityName;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/*public Address(String cityName) {
		
		this.cityName = cityName;
	}*/
	
	
	@Override
	public String toString() {
		return cityName;
	}
	
	
	

}
