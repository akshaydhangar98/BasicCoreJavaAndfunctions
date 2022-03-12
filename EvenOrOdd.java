package day5coreJavafunctions;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		int input;
		System.out.println("Enter a number to find out if it is odd or even");
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		sc.close();

		if (input % 2 == 0)
			System.out.println(input + " is an even number");
		else
			System.out.println(input + " is an odd number ");
	}
	}

