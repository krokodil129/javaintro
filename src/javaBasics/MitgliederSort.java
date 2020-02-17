package javaBasics;

import java.util.ArrayList;
import java.util.Scanner;

public class MitgliederSort {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a name, press Enter and enter next name,\nenter \"end\" to have the names sorted and printed: ");
		String input = in.nextLine();
		while (!input.equalsIgnoreCase("END")) {
			names.add(input);
			input = in.nextLine();
		}

		for (int j = 0; j < names.size() - 1; j++) {
			for (int i = 0; i < names.size() - 1; ++i) {
				if (names.get(i).compareToIgnoreCase(names.get(i + 1)) > 0) {

					String temporary = names.get(i);
					names.set(i, names.get(i + 1));
					names.set(i + 1, temporary);
				}
			}
		}
		//System.out.print(names);
		for(String s:names) {
			System.out.println(s);
		}
	}

}
