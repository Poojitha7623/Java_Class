package week1.day2;

public class Car {

	public  void driveCar() {
		System.out.println("Drive a car carefully");
	}
	public void applyBreak() {
		System.out.println("Apply the break");
	}
	public void soundHorn() {
		System.out.println("press the horn sound");
	}
	public void applyGear() {
		System.out.println("Apply the Gear");
	}
	public void switchOnAC() {
		System.out.println("on the Ac switch");
	}
	public void putPetrol() {
		System.out.println("fill the petrol");
	}
	public void isPunctured() {
		System.out.println("tire is punctured");
	}
	public static void main(String[] args) {
		// Classname objectName = new Classname() or constructor();
		Car myCar = new Car();
		myCar.driveCar();
		myCar.applyBreak();
		myCar.soundHorn();
		myCar.applyGear();
		myCar.switchOnAC();
		myCar.putPetrol();
		myCar.isPunctured();
	}
}
