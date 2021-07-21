import java.util.Scanner;

public class IncQ7 {
	
    public static void main(String args[]) {
       
       int number;
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter Number : ");
       number = scan.nextInt();
       scan.close();
       
       System.out.println(checkNum(number) ? (number + " are not in increasing order.") : (number + " are in increasing order."));   
    }

	private static boolean checkNum(int number) {
		boolean f = false;
		int currentDigit = number % 10;
		number = number/10;
		while(number>0){
			if(currentDigit <= number % 10){
				f = true;
		        break;
		    }
		    currentDigit = number % 10;
		    number = number/10;
		}
		   return f;
	}
	
}

