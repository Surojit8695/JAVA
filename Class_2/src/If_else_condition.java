//if_else condition is same as c programing
//Elegable for vote or not check
import java.util.Scanner;
public class If_else_condition {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the age:");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("You can Vote");
		}
		else
		{
			System.out.println("You can't Vote");
		}

		sc.close();
	}

}
