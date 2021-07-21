import java.util.Scanner;

class PowerQ8 {
	public static void main(String[] args) {
		// TODO Sum of the Squares and the Square of the Sum of natural numbers
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number[n]: ");
		int n = scan.nextInt();
		scan.close();
		
        System.out.println(checkNum(n) ? (n + " is a power of 2.") : (n + " is not a power of 2."));         
    }
	
    static boolean checkNum (int x) {
        return x!=0 && ((x&(x-1)) == 0);         
    }

}
