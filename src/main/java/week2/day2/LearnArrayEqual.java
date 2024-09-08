package week2.day2;

import java.util.Arrays;

public class LearnArrayEqual {
	
	public static void main(String[] args) {
		String text1="act";
		String text2 ="cat";
		
		//to compare both texts we use these
		char[] charArray = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();
		
		// to sort out the no.of chars in strings we use this 
		
		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		
		// to print the comparison type if(Arrays.ctrl+2 select equals(char[]a,...
		
		if(Arrays.equals(charArray, charArray2)) {
			System.out.println("both are equal");
		}else {
			System.out.println("Both are not equal");
		}
	}

}
