package Assignment1_17._05;

import Assignment1_17._01.Car;
import Assignment1_17._01.Day;
import Assignment1_17._01.ExCar;

public class CarTester2 {
	public static void main(String[] args) {
		
		Car car1 = new ExCar("W221",1845,1490,5205,95.0,new Day(2015,12,24));
		
		car1.putSpec();
	}
}
