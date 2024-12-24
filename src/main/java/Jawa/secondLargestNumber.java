package Jawa;

import java.util.Arrays;

public class secondLargestNumber {

	
	public static void main(String[] args) {
		
		
		int[] inp = {3,5,7,1,4,8,11};
		
		Arrays.sort(inp);
		
		System.out.println(inp[inp.length-2]);
	}
}
