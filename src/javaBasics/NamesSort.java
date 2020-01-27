package javaBasics;

import java.util.ArrayList;
import java.util.Collections;

public class NamesSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		names.add("Fedor");
		names.add("Leo");
		names.add("Basti");
		names.add("Martin");
		names.add("Martina");
		names.add("Chemmy");
		names.add("Oleg");
		
		Collections.sort(names);
		System.out.print(names);
	}

}
