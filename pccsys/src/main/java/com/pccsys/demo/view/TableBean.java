package com.pccsys.demo.view;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TableBean implements Serializable {
	static String[] colors1;
	static String[] manufacturers1;
	static {
		colors1 = new String[10];
		colors1[0] = "Black";
		colors1[1] = "White";
		colors1[2] = "Green";
		colors1[3] = "Red";
		colors1[4] = "Blue";
		colors1[5] = "Orange";
		colors1[6] = "Silver";
		colors1[7] = "Yellow";
		colors1[8] = "Brown";
		colors1[9] = "Maroon";
		
		manufacturers1 = new String[10];
		manufacturers1[0] = "Mercedes";
		manufacturers1[1] = "BMW";
		manufacturers1[2] = "Volvo";
		manufacturers1[3] = "Audi";
		manufacturers1[4] = "Renault";
		manufacturers1[5] = "Opel";
		manufacturers1[6] = "Volkswagen";
		manufacturers1[7] = "Chrysler";
		manufacturers1[8] = "Ferrari";
		manufacturers1[9] = "Ford";
	}
	
	private List<Car> carsSmall = new ArrayList<Car>();;
	
	public TableBean() {
		populateRandomCars(carsSmall, 9);
	}
	
	private void populateRandomCars(List<Car> list, int size) {
		for(int i = 0 ; i < size ; i++)
			list.add(new Car(getRandomModel(), getRandomYear(), getRandomManufacturer(), getRandomColor()));
	}
	
	public List<Car> getCarsSmall() {
		return carsSmall;
	}

	private int getRandomYear() {
		return (int) (Math.random() * 50 + 1960);
	}
	
	private String getRandomColor() {
		return colors1[(int) (Math.random() * 10)];
	}
	
	private String getRandomManufacturer() {
		return manufacturers1[(int) (Math.random() * 10)];
	}
	
	private String getRandomModel() {
		return UUID.randomUUID().toString().substring(0, 8);
	}
}
				