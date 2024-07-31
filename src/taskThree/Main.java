package taskThree;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random rn = new Random();
		int initialArr[] = new int[15];
		
		
		for( int i = 0; i < initialArr.length; i++ ) {
			initialArr[i] = rn.nextInt( 1, 60 );
		}
		
		int copyArr[] = Arrays.copyOfRange(initialArr, 0, initialArr.length * 2 );
		
		for( int j = initialArr.length; j < copyArr.length; j++ ) {
			copyArr[j] = initialArr[ j - initialArr.length ] * 2;
		}
		
		System.out.println( Arrays.toString(initialArr) );
		System.out.println( Arrays.toString(copyArr) );		

	}

}
