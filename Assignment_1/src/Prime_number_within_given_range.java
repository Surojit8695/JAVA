//13.	Write a program to print all prime numbers within a given range.
import java.util.Scanner;

public class Prime_number_within_given_range {

	public static void main(String[] args) {
		System.out.println("Enter the lower and upper boundary:");
		Scanner sc= new Scanner(System.in);
		int low=sc.nextInt();
		int up=sc.nextInt();
		System.out.print("Prime number: " );
		for(int i=low;i<=up;i++)
		{
			int flag=0;
			for(int j=1;j<=i;j++)	
			{
				if(i%j==0)
				{
					flag++;				
				}
			}
			if(flag==2)
			{
				System.out.print(i+" ");
			}
		}
		sc.close();

	}

}
