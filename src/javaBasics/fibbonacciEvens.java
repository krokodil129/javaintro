package javaBasics;

public class fibbonacciEvens {

	public static void main(String[] args) {
		long sum=0;
		long[] fibbonacci= new long[2];
		fibbonacci[0]=0;
		fibbonacci[1]=1;
		while(fibbonacci[1]<4000000) {
			long switcherOne=fibbonacci[0]+fibbonacci[1];
			fibbonacci[0]=fibbonacci[1];
			fibbonacci[1]=switcherOne;
			if (switcherOne % 2==0) {
				sum+=switcherOne;
			}
		}
		System.out.println(sum);
	}

}
