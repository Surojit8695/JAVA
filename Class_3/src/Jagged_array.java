import java.util.Scanner;

public class Jagged_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the row:");
		int r=sc.nextInt();
		int a[][]=new int [r][];
		int i,j;
		for(i=0;i<a.length;i++)
		{
			System.out.print("Enter the number of column for row "+i+" :");
			int c=sc.nextInt();
			a[i]=new int [c];
		}
		System.out.println("Enter the element");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Array  element are");
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
		
		//print the jagged array using enhance for loop
		System.out.println("Array  element are(using enhance for loop)");
		for(int x[]:a)
		{
			for(int y:x)
			{
				System.out.print(y +" ");
			}
			System.out.println();
		}
		
		//sc.close();
	}

}
