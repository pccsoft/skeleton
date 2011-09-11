package com.pccsys.demo.view;

public class Car {
	private String model;
	private int year;
	private String manufacturer;
	private String color;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Car(String model, int year, String manufacturer, String color) {
		super();
		this.model = model;
		this.year = year;
		this.manufacturer = manufacturer;
		this.color = color;
	}

	
	
}
