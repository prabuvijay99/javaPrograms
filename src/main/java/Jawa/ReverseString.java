package Jawa;

public class ReverseString {

	public static void main(String[] args) {
		
		String words= "How beautiful they are ?";
		String[] split = words.split(" ");
		for(int i=split.length-1;i>=0;i--) {
			System.out.print(split[i]+" ");
		}

	}

}
	