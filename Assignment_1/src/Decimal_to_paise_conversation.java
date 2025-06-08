//Write a program to read the price of an item in the decimal from 
//(like 75.95) and print the output in paise(like 7595).
import java.util.Scanner;

public class Decimal_to_paise_conversation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the price in Decimal:");
		float d=sc.nextFloat();
		float p=d*100;
		System.out.println("Paise is:"+p);
		sc.close();
	}

}
