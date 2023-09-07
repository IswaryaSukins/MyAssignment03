package week3.day2assignment;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
        Arrays.sort(arr);
       
		for (int i = 0; i < arr.length-1; i++) {
			if((arr[i+1]-arr[i])!= arr[0]) {
				
				System.out.println("Missing Element is " +(arr[i]+arr[0]));
	break;
			}

}
	}

}
