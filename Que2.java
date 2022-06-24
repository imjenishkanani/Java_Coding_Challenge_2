//Que 2: Write a java program to calculate the sum of numbers from 1 till upper bound.

import java.util.Scanner;

public class Que2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter upperBound : ");
		int upperBound = sc.nextInt();
		int number = 1, sum = 0;
		
		while(number <= upperBound) {
			sum=sum+number;
			number++;
		}
		System.out.println("sum is : " + sum);
	}
}
