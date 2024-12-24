package Jawa;

public class findIntersection {
	
	public static void main(String[] args) {
		int[] arr = {3,2,11,4,6,7};
		int[] arr1= {1,2,8,4,9,7};
		
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<=arr1.length-1;j++) {
				if(arr[i]==arr1[j]) {
					System.out.println(arr[i]);
				}
			}
		}

	}
}
