package taskOne;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int arr[] = new int[] {0,5,2,4,7,1,3,19};
		int counter = 0;
		
		for( int el : arr ) {
			if( el % 2 != 0 ) {
				counter += 1;
			}
		}

		System.out.println( "The array " + Arrays.toString(arr) + " contain " + counter + " odd numbers " );
	}

}
