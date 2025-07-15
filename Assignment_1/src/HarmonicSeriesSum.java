/*5.Write a program to determine the sum of the following series for a given value of 
  n: (1 + 1/2 + 1/3 + ... + 1/n). Print the result up to two decimal places.*/
import java.util.Scanner;

public class HarmonicSeriesSum  {

	public static void main(String[] args) {
		System.out.print("Enter the number of term(n):");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		double sum=0.0;
		int i;
		for(i=1;i<=n;i++)
		{
			sum=sum+(1.0 / i);
		}
		System.out.printf("The sum of the series is: %.2f",sum);

	}

}
