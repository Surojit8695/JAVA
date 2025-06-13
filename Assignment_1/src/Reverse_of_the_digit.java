//7. Write a program to find the product the  reverse of a given integer number
//(take input using command-line argument). 

import java.util.Scanner;

public class Reverse_of_the_digit {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i,sum=0;
		System.out.println("Enter the Digit:");
		int num=sc.nextInt();
		int temp=num;
		while(temp!=0)
		{
			int rem=temp%10;
			sum=sum*10+rem;
			temp=temp/10;
		}
		System.out.println("The reverse of the Digit"+num+"is :"+sum);
		sc.close();
	}
}
