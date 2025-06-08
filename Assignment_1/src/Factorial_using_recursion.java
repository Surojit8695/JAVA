//Factorial using recursion
import java.util.Scanner;

public class Factorial_using_recursion {
	
	int factorial(int n) {
		
		if(n==1||n==0)
		{
			return 1;	
		}
		else
		{
			return n*factorial(n-1);
		}
		
		
	}

	public static void main(String[] args) {
		System.out.print("Enter the value of n:");
		Scanner sc= new Scanner(System.in);
		int i;
		int n=sc.nextInt();
		int fact=factorial(n);
		System.out.println("The factorial of "+n+" is:"+fact);

	}
	
}
