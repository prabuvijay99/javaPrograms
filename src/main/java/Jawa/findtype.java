package Jawa;

public class findtype {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		int digitCount = 0;
		int alphaCount = 0;
		int spaceCount = 0;
		int symbolCount = 0;
		String input ="Hi hello 123 $how old are you 15 or 17?";
		
		char[] charArr = input.toCharArray();
		
		for(int i=0;i<=charArr.length-1;i++) {
			if(Character.isDigit(charArr[i])) {
				digitCount++;
			}else if(Character.isAlphabetic(charArr[i])) {
				alphaCount++;
			}else if(Character.isSpace(charArr[i])) {
				spaceCount++;				
			}else {
				symbolCount++;
			}
		}
		
		System.out.println("Digit"+digitCount);
		System.out.println("alpha"+alphaCount);
		System.out.println("space"+spaceCount);
		System.out.println("symbol"+symbolCount);
	}

}
