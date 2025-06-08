//7. Write a program to find the product the sum of digits  of a given integer number
//(take input using command-line argument). 
import java.util.Scanner;

public class Sum_of_digit {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i,sum=0;
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int temp=num;
		while(temp!=0)
		{
			int rem=temp%10;
			sum=sum+rem;
			temp=temp/10;
		}
		System.out.println("The sum of the digit "+num+" is :"+sum);
		
	}
}
