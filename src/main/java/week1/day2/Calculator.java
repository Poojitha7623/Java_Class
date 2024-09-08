package week1.day2;

public class Calculator {
	public void add() {
	    int a=100;
	    int b=50;
	    int c=a+b;
	  System.out.println(c);
	  
	}
	public void sub() {
	    int a=100;
	    int b=50;
	    int c=a-b;
	   System.out.println(c);
	}
	public static void main(String[] args) {
		Calculator calC=new Calculator();
		calC.add();
		calC.sub();
		
	}

}
