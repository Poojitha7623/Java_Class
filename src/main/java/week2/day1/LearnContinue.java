package week2.day1;

public class LearnContinue {
	
	public static void main(String[] args) {
		for (int i = 1; i <= 7; i++) {
			
			if(i==5) {
			System.out.println("Five");
			continue;// it continues to next line and print
			//break;// it breaks from next line and print the before condition iterations
		}
			System.out.println(i);
	}
}

}
