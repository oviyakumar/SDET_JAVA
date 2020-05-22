package sdet_java.task4;

import java.util.Arrays;

public class Q8 {
	static void moveZerosToEnd(int inputArray[]) {

		int counter = 0;

		for (int i = 0; i < inputArray.length; i++) {
 
			if (inputArray[i] != 0) {

				inputArray[counter] = inputArray[i];

				counter++;
			}
		}

		while (counter < inputArray.length) {
			inputArray[counter] = 0;

			counter++;
		}

		System.out.println(Arrays.toString(inputArray));
	}

	public static void main(String[] args) {
		
		moveZerosToEnd(new int[] { 12, 0, 7, 0, 8, 0, 3 });

	}
}