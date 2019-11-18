package javaBasics;

public class Bedingung {

	public static void main(String[] args) {
		if (1 < 3) {
			System.out.println("1 ist kleiner als 3");

		}
		//
		if (3 < 1) {
			System.out.println("3 ist kleiner als 1");
		}
		//
		int zahlA = 3;
		int zahlB = 1;
		if (zahlA < zahlB) {
			System.out.println(zahlA + " ist kleiner als " + zahlB);
		} else {
			System.out.println(zahlB + " ist kleiner als " + zahlA);
		}
		//
		if (zahlA == zahlB) {
		}
		//
		if (zahlA != zahlB) {
		}
		//
		if ("hans" == "hans") {
			System.out.println("Hans");
		}
		//
		String nameA = "hans";
		String nameB = "hans";
		if (nameA == nameB) {
			System.out.print(nameA + "\n");
		}
		//
		if ("hansi".equals("hansi")) {
			System.out.println("hansi");
		}
		//
		if (0 < 1)
			System.out.println("juhu");
		System.out.println("anderes juhu");
		//
		if (9 % 3 == 0) {
			System.out.println("Rest ist null");
		}
		System.out.println(9 % 2);
	}

}
