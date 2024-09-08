package week1.day2;

public class Laptop {
	
	public void onLaptop() {
		System.out.println("Switch on the Laptop");
	}
	public void sendingDocuments() {
		System.out.println("Send the document");
	}
	public void playingGames() {
		System.out.println("play the game");
	}
	public void makeVideoCall() {
		System.out.println("making the video call");
	}
	public void watchingVideos() {
		System.out.println("watching the videos");
	}
	public void switchOff() {
		System.out.println("Switch Off the Laptop");
	}
	public static void main(String[] args) {
		Laptop myLaptop = new Laptop();
		myLaptop.onLaptop();
		myLaptop.sendingDocuments();
		myLaptop.playingGames();
		myLaptop.makeVideoCall();
		myLaptop.watchingVideos();
		myLaptop.switchOff();
	}
}
