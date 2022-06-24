//Que 3: Write a program using while loop to print Even numbers from 1 to 100.
import java.util.*;

public class Que3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int number = sc.nextInt();
		int s = 1;
		
		while(s < number) {
			if(s%2 == 0) {
				System.out.print(s + " ");
			}
			s++;
		}
	}
}
