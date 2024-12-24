package Jawa;

public class cahrOccurence {

	
	public static void main(String[] args) {
		
		
		String input = "Welcome to chennai";
		
		int repeat = 0;
		char[] charArray = input.toCharArray();
		
		
		for(int i=0;i<=charArray.length-1;i++) {
			for(int j=i+1;j<=charArray.length-1;j++) {
				if(charArray[i]==charArray[j]) {
					repeat++;
					System.out.println(charArray[i]);
										
				}
				
			}
			
		}
		System.out.println(repeat);
	}
}
