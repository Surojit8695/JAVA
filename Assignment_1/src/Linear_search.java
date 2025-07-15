//17. Write a program to implement Linear Search, taking values via command-line arguments.
import java.util.Scanner;

public class Linear_search {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=sc.nextInt();
		int a[]=new int [n];
		int i;
		for( i=0;i<n;i++)
		{
			System.out.print("A["+i+"]=");
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the key value:");
		int key=sc.nextInt();
		sc.close();
		int flag=0;
		for( i=0;i<n;i++)
		{
			if(a[i]==key)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println(key+" is founded at pos "+i);
		}
		else
		{
			System.out.println(key+" is not founded at pos "+i);
		}
	}

}
