import java.util.Scanner;

public class CalSum5Q {

	public static void main(String[] args) {
		// TODO Sum of First n Natural Number divisible by 3 or 5.
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number[n]: ");
		int n = scan.nextInt();
		scan.close();
	    int a = 3, b = 5;
	    
	    int output = calculateSum(n, a, b);
	    System.out.println("Sum of Natural Number upto " + n + " is " + output);    
	}
	
	private static int calculateSum(int input, int a, int b) {
		// We will us Arithmetic Progression Formula Sn = (n/2) * {2*a + (n-1)*d}
		// n = input / a or b or a*b
		
	    int sumA = ((input / a)) * (2 * a + (input / a - 1) * a) / 2;
	    int sumB = ((input / b)) * (2 * b + (input / b - 1) * b) / 2;
	    int sumAB = ((input / (a * b))) * (2 * (a * b) + (input / (a * b) - 1) * (a * b))/ 2;
	    int sum = sumA + sumB - sumAB;
	    
	    return sum;	
	}
	
}
