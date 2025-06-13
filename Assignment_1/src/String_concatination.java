// 6.WAP to take your first and last name as command line argument and print
//by converting into a single string. 
import java.util.Scanner;
public class String_concatination {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the frist name:");
		//String fname="Surojit";
		String fname=sc.nextLine();
		System.out.print("Enter your last name:");
		//String lname="Saha";
		String lname=sc.nextLine();
		System.out.print("Your Full Name Is:"+fname +" "+lname);



}

}
