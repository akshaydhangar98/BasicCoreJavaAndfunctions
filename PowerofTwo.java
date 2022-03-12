package day5coreJavafunctions;

import java.util.Scanner;

public class PowerofTwo {
	public static void main(String[] args) {
	int powerOfTwo;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Power Value Between 0 to 31: ");
	 int N = sc.nextInt();
	sc.close();

	for (int i = 1; i <= N; i++) {
		powerOfTwo = (int) Math.pow(i, 2);
		System.out.println(powerOfTwo + " ");
	}
}
}


