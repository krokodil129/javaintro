package javaBasics;

public class VariablesBasics {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//boolean
		boolean wahr_oder_falsch;
		wahr_oder_falsch=false;
		wahr_oder_falsch=true;
		System.out.println(wahr_oder_falsch);
		//short
		short ganz_kleine_zahl = 120;
		System.out.println(ganz_kleine_zahl);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		//byte
		byte zahl = 1;
		System.out.println(zahl);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		//integer
		int kleine_zahl = 123456;
		System.out.println(kleine_zahl);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		//long
		long grosse_zahl = 1234567890;
		System.out.println(grosse_zahl);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		//float
		float kleiner_komma_zahl=123.123F; //ACHTUNG - OHNE F IST ES DOUBLE!!
		System.out.println(kleiner_komma_zahl);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		//double
		double grosser_komma_zahl = 123456789.0987654321;
		double kooleZahl = -123;
		System.out.println(grosser_komma_zahl);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		//
		char ein_zeichen = 'a';
		System.out.println(ein_zeichen);
		// char zweizeichen='asd'; geht nicht
		
		//String 
		String text = "abcdefgh";
		System.out.println(text);
		
	}

}
