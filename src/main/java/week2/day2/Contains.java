package week2.day2;

public class Contains {
	
	public static void main(String[] args) {
		String text="Leaftaps - TestLeaf Automation Platform";
		String title="Leaftaps";
		
		
		//we use to match if the sentence partially matches or not
		//if(name1.contains(name1)
		
		if(text.contains(title)) {
			System.out.println("Partially match");
		}else {
			System.out.println("not match");
		}
	}

}
