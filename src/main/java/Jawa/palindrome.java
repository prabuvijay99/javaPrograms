package Jawa;

public class palindrome {
	
	public static void main(String[] args) {
		
		String word = "roastsaOr";
		String rev_word ="";
		char[] charArray = word.toCharArray();
		for(int i=charArray.length-1;i>=0;i--) {
			rev_word+=charArray[i];
		}
		
		if(rev_word.equalsIgnoreCase(word)) {
			System.out.println("palindorme");
		}else {
			System.out.println("not Plaindrome");
		}
	}

}
