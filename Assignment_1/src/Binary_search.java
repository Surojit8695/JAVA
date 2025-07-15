//18.Write a program to implement Binary Search.
import java.util.Scanner;

public class Binary_search {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements(n):");
		int n=sc.nextInt();
		int a[]=new int [n];
		int i;
		for( i=0;i<n;i++)
		{
			System.out.print("A["+i+"]=");
			a[i]=sc.nextInt();
		}
		System.out.println("The elements are:");
		for( i=0;i<n;i++)
		{
			System.out.println("A["+i+"]="+a[i]);
		}
		System.out.println("Enter the key value:");
		int key=sc.nextInt();
		sc.close();
		int low=0,mid=0,up=n-1;
		int flag=0;
		while(low<=up)
		{
			mid=(low+up)/2;
			if(a[mid]==key)
			{
				flag=1;
				break;
			}
			else if(a[mid]<key)
			{
				low=mid+1;
			}
			else if(a[mid]>key)
			{
				up=mid-1;
			}
		}
		if(flag==1)
		{
			System.out.println(key+" is founded at pos "+mid);
		}
		else
		{
			System.out.println("Not founded");
		}
		sc.close();

	}

}
