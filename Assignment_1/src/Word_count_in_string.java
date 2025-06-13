//20.Write a program to count the number of words in a string.
import java.util.*;
public class Word_count_in_string {

	public static void main(String[] args) {
		System.out.println("Enter the string: ");
		Scanner sc=new Scanner(System.in);
		String s1;
		String arr[]=new String[20];
		s1=sc.nextLine();
		arr=s1.split(" ");
		int count=0;
		for(String x: arr)
		{
			count++;
		}
		System.out.println("Total word :"+count);
		

	}

}
