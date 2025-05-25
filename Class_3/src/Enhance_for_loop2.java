import java.util.Scanner;

public class Enhance_for_loop2 {

	public static void main(String[] args) {
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
//		for(i=0;i<a.length;i++)
//		{
//			for(j=0;j<a[i].length;j++)
//			{
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
		//Enhance for loop
		for(int x[]:a)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}

	}

}
