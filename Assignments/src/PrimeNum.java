import java.util.*;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Prime Number
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int b = scan.nextInt();
		scan.close();
		
		for(int a=1; a<=b; a++) {
			int i, m=0, flag=0; 
			int n = a;
			m=n/2;      
			if(n==0||n==1){  
				continue;      
			}
			else{  
				for(i=2;i<=m;i++){      
					if(n%i==0){            
						flag=1;      
						break;      
					}
			    
				}
			  if(flag==0) { 
				  System.out.println(n+" is prime number"); 
			  }  
			
			}
			
		}

	}


}
