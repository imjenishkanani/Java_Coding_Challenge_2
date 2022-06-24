//Que 4: print all odd numbers in comma separated form from 1 till end.
import java.util.*;

public class Que4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		int number = sc.nextInt();
		int s = 1;
		
		while(s <= number) {
			if(s%2 != 0) {
				System.out.print(s + ", ");
			}
			s++;
		}
	}
}
