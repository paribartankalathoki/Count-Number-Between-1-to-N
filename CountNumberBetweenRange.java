import java.io.*; 
import java.util.*;
 
public class CountNumberBetweenRange {
	
	static int countNumber(int n, int num) {
		int total  = 0;
		for (int i=1; i<=n; i++)
			total += containsNumber(i, num)? 1 : 0;

		return total;
	}

	static boolean containsNumber(int n, int num) {
		while (n != 0) {
			if(n%10 == num)
			return true;
			n = n /10;
		}
		return false;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter last number to from 1 that you want to count: ");
		int n = sc.nextInt();

		System.out.println("Enter number to count: ");
		int num = sc.nextInt();
		System.out.println("Total Number from 1 to " + n + " that have " + num + " as a digit is: " + countNumber(n, num));
	}

}
