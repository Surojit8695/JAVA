import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int number=sc.nextInt();
		int sum=0,count=0;
		int temp=number;
		while(temp!=0)
		{
			temp=temp/10;
			count++;
		
		}
		temp=number;
		while(temp!=0)
		{
			int rem=temp%10;
			int val = (int) Math.pow(rem, count);
			sum=sum+ val;
			temp=temp/10;
		}
		if(sum==number)
		{
			System.out.println(number+" Is Armstrong number");
		}
		else
		{
			System.out.println(number+" Is Not Armstrong number");
		}
		

	}

}
