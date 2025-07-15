//Find max among 3 number
import java.util.Scanner;

public class Else_if_condition {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter 3 number:");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int max;
		if(x==y&&y==z)
		{
			System.out.println("All Numbers are equal");
		}
		else
		{
			if(x>y)
			{
				if(x>z)
				{
					max=x;
				}
				else
				{
					max=z;
				}
			}
			else
			{
				if(y>z)
				{
					max=y;
				}
				else
				{
					max=z;
				}
			}
			System.out.println("Maximum is: "+max);
		}
		sc.close();
		

	}

}
