package main.java.Arrays;

import java.util.Arrays;

public class SortArray {
	
	public static void main(String[] args) {

		int[] array = { 100, 20, 0, 200 };

		// Call Arrays.sort on the int array.
		Arrays.sort(array);

		for (int elem : array) {
		    System.out.println(elem);
		}
	}

}
