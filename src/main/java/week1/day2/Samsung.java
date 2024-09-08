package week1.day2;

public class Samsung {
	public static void main(String[] args) {
		  Mobile myMobile=new Mobile();
		  myMobile.makeCall();
		  myMobile.sendMsg();//-- it is default only used in one package not able use in other packages
		  myMobile.payment();
		  //myMobile.photos();--as its private we cannot use in another class but 
		  //remaining all can be used in all classes of one package
		  Laptop myLaptop = new Laptop();
		  myLaptop.watchingVideos();
			myLaptop.switchOff();
			Car myCar = new Car();
			myCar.applyBreak();
			myCar.soundHorn();
			myCar.applyGear();
	}

}
