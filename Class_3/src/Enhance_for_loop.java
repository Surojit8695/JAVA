import java.util.Scanner;

public class Enhance_for_loop {

	public static void main(String[] args) {
		
		//Enhance for loop only work for displaying the array
		int a[],i;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of element:");
		int	n=sc.nextInt();
		a=new int[n];
		for(i=0;i<a.length;i++)
		{
			System.out.print("A["+i+"]=");
			a[i]=sc.nextInt();
		}
		System.out.println("Array elements are:");
		for(int x:a)
		{
			System.out.println(x);
		}

	}

}
