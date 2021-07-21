import java.util.Scanner;

public class Fibonacci {

	public static void main(String args[])
    {
        System.out.println("Enter the number[n]: ");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextShort();
        scan.close();
        FiboSeies obj = new FiboSeies();
        int output = obj.in(input);
        
        System.out.println(input +"th number of fibonacci series is " + output);
    }
}
    
class FiboSeies {
    
    int a=1;
    int b=1;
    int c=0;
    int count;
    int in(int a)
    {
        count=a;
        if (count==1)
        	return 1;
        
        else {
        	count=fibo(count);
            return count;
        }
    }
    
    int fibo(int count)
    {
        if(count!=2)
        {
            c=a+b;
            a=b;
            b=c;
            fibo(--count);
        }
        else
        	return 1;
        return c;
    }
}
