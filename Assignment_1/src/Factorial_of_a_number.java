//8. Write a program to find the factorial of a given integer number  

import java.util.Scanner;

public class Factorial_of_a_number {

	public static void main(String[] args) {
		System.out.print("Enter the value of n:");
		Scanner sc= new Scanner(System.in);
		int i,fact=1;
		int n=sc.nextInt();
		sc.close();
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("The factorial of "+n+" is:"+fact);
	
	}

}
