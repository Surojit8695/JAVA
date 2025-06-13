//16.Write a program to find the sum and average of several integers
//stored in an array using an enhanced-for loop.
import java.util.Scanner;

public class Sum_of_array_elements {

	public static void main(String[] args) {
		System.out.print("Enter the number of elements:");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("A["+i+"]=");
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int x:arr)
		{
			sum=sum+x;
		}
		System.out.println("Sum of the element is: "+sum);
		float avg=((float)sum/arr.length);
		System.out.println("Average of the array element is:"+ avg);
		sc.close();

	}

}
