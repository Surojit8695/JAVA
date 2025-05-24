//Here we take user input from scanner class
import java.util.Scanner;

public class Add_to_number_from_user_input {

	public static void main(String[] args) {
		int x,y,z;
		Scanner sc= new Scanner(System.in);
		System.out.print("Entet the first number:");
		x=sc.nextInt();
		System.out.print("Entet the second number:");
		y=sc.nextInt();
		z=x+y;
		System.out.println("Addition of " +x +" and " +y +" is:"+z);
	}
}
