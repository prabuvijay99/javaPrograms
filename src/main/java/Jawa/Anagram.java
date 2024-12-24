package Jawa;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		
		String word1 = "listen";
		String word2 = "silat";
		
		if(word1.length()!=word2.length()) {
			System.out.println("This is not anagram");
			return;
		}
		
		char[] charArray = word1.toCharArray();
		char[] charArray2 = word2.toCharArray();
		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		
		
			if(Arrays.equals(charArray, charArray2)) {
				System.out.println("This is Anagram");
			}else {
				System.out.println("This is not Anagram");
			}
			
			
			
	}
	
}
