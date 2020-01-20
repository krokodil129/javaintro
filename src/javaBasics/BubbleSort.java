package javaBasics;

public class BubbleSort {

	public static void main(String[] args) {
		int[] zahlen = { 1, 34, 5, 6, 9 };
		for (int j = 0; j < zahlen.length - 1; j++) {
			for (int i = 0; i < zahlen.length - 1; ++i) {
				if (zahlen[i] > zahlen[i + 1]) {
					int temporary = zahlen[i];
					zahlen[i] = zahlen[i + 1];
					zahlen[i + 1] = temporary;
				}
			}
		}
		System.out.println(zahlen[0]);
		System.out.println(zahlen[1]);
		System.out.println(zahlen[2]);
		System.out.println(zahlen[3]);
		System.out.println(zahlen[4]);
	}

}
