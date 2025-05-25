import java.util.Scanner;

public class Dynamic_1d_array {

	public static void main(String[] args) {
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
		for(i=0;i<a.length;i++)
		{
			System.out.println("A["+i+"]="+a[i]);
		}

	}

}