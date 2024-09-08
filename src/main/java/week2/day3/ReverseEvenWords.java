package week2.day3;

public class ReverseEvenWords {
	
	public static void main(String[] args) {
		//INitialize an input
		String text="I am a software  tester";
		//i ma a erawtfos tester

		//Segrate the sentence into words
		//type text.split(" ") nd ctrl+2 l enter
		
		String[] split = text.split(" ");
		//	        	split[0]=i
		//				split[1]=am
		//				split[2]=a
		//				split[3]=software
		//				split[4]=tester


		// iterate the values
		
		for (int i = 0; i < split.length; i++) {
			if(i%2!=0) {
				//System.out.println(split[i]); am software
				
				//Converted string into charArray
				
			//split[i].toCharArray() ctrl+
				
				
			char[] charArray = split[i].toCharArray();
				
			//Iterate the values by using reverse for loop
			//for(int j=0;j<charArray.length;j++) reverse the loop as below
			
				for(int j=charArray.length-1;j>=0;j--) {
					System.out.print(charArray[j]);
				} }else {
					System.out.print(" ");// to add spaces b/n words
				System.out.print(split[i]+" ");
			}}
			
		}

}
