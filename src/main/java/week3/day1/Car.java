package week3.day1;

// for single inheritance example

public class Car extends Vehicle {
	// we use the extends here to run the actions on vehicle 
	public void applyGear() {
		System.out.println("Apply gear");
	}
	public void switchOnAc() {
		System.out.println("Switch on AC");
	}
	public static void main(String[] args) {
		Car obj=new Car();
		obj.switchOnAc();
		obj.applyGear();
		obj.applyBreak();
		obj.soundHorn();
		}

}
