package week3.day2assignment;

import java.util.Arrays;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] arr= {"HCL", "Wipro",  "Aspire Systems", "CTS"};
int length = arr.length;
Arrays.sort(arr);

for (int i = length-1; i >= 0; i--) {
	System.out.println(arr[i]);

	}
	}
}
