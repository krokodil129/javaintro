package javaBasics;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] zahlen = { 9, 1, 5, 7, 4, 6, 3, 2, 8, 0 };
		for (int j = 0; j < zahlen.length - 1; j++) { // Number of runs depends on array length
			for (int i = 0; i < zahlen.length - 1; ++i) { // Every run makes checks between each pair of numbers
				if (zahlen[i] > zahlen[i + 1]) { // If the first number is larger than the second, the numbers switch
													// places
					int temporary = zahlen[i];
					zahlen[i] = zahlen[i + 1];
					zahlen[i + 1] = temporary;
				}
			}
		}
	}

}
