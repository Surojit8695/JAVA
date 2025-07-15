//8.Write a program to find the factorial of a given integer number using recursion 
//(take input using command-line arguments).
import java.util.Scanner;

public class Factorial_using_recursion {

	public static void main(String[] args) {
		System.out.print("Enter the value of n:");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		Factorialclass f1= new Factorialclass();
		int fact=f1.factorial(n);
		System.out.println("The factorial of "+n+" is:"+fact);
		sc.close();

	}
}

class Factorialclass{
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
}