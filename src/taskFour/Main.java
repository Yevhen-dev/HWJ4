package taskFour;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int arr[] = new int [] {2, 6, 8, 15, 23};
		int value = 0;
		
		for( int i = 0; i < arr.length/2; i++ ) {
			value = arr[i];
			arr[i] = arr[ arr.length - 1 - i ];
			arr[ arr.length - 1 - i ] = value;
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
