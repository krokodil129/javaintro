package javaBasics;

public class SchleifenBasics {

	public static void main(String[] args) {
		// for schleife
		for (int i = 0; i < 5; i++)
			System.out.println(i);
		//
		System.out.println("-----");
		//
		int j = 1;
		for (; j < 10;) {
			System.out.println(j);
			j = j + 1;
		}
		// endlosschleife
		for (; 3 < 4;) {
			System.out.println("Uh oh");
		}

	}

}
