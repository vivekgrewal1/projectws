import java.util.Scanner;

public class Diff6Q {

	public static void main(String[] args) {
		// TODO Sum of the Squares and the Square of the Sum of natural numbers
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number[n]: ");
		int n = scan.nextInt();
		scan.close();

		System.out.println("Difference of (Sum of Square) and (Square of sum) upto " + n + " is " + calDiff(n));
	}

	private static Object calDiff(int n) {
		// TODO 
		int squareSum = (n * (n + 1) * (2 * n + 1)) / 6;
		int sumSquare = (n* (n + 1) / 2);
		int sum = (sumSquare * sumSquare) - squareSum;
		
		return sum;
	}

}
