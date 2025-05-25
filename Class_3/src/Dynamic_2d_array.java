import java.util.Scanner;

public class Dynamic_2d_array {

	public static void main(String[] args) {
		//int a[3][4];//this is not possible in java
		int i,j,r,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the row:");
		r=sc.nextInt();
		System.out.print("\nEnter the column:");
		c=sc.nextInt();
		int a[][] =new int [r][c];//a[r][c];
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print("A["+i+"]["+j+"]=");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("\nArray elements are:");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
