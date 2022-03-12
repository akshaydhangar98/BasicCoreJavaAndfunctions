package day5coreJavafunctions;

import java.util.Scanner;

public class Flipcoin {

	public static void main(String[] args) {
		
		int headCount=0; 
		int tailCount=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of times you wanto flip the coin");
		int flip = sc.nextInt();
		sc.close();

		for(int count=0;count<flip;++count) {
			double n =Math.floor(Math.random()*10)%2;

			if(n<0.5){
				System.out.println("Hey! It's a Head.");
				headCount++;
			}
			else{
				System.out.println("ohh! It's a Tail");
				tailCount++;
			}
		}
		System.out.println("Head Count :" +headCount );
		System.out.println("Tail Count :" +tailCount );
		System.out.println("headCount Percentage : " +(headCount*100)/flip );
		System.out.println("tailCountPercentage : " +(tailCount*100)/flip);

	}

}
