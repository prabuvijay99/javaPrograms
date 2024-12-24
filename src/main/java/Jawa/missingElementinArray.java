package Jawa;

import java.util.Arrays;

public class missingElementinArray {
	
	public static void main(String[] args) {
		
		 int[] num={1,5,2,8,4,3,6,10};
		 Arrays.sort(num);
		 System.out.println(Arrays.toString(num)); 
		 
		 for(int i=0;i<num.length-1;i++) {
			 if((num[i]+1) !=(num[i+1])) {
				 System.out.println(num[i]+1);
		 }
	}

}
}
