package Jawa;

public class printAlphaandNumericSeparately {
	
	public static void main(String[] args) {
		
		String inp = "Hello123Prabha";
		
		String numOnly = inp.replaceAll("[^0-9]", "");
		System.out.println(numOnly);
		
		String alphaOnly = inp.replaceAll("[^a-z,A-Z]", "");
		System.out.println(alphaOnly);
	}

}
