import java.util.Scanner;

public class String_input_multi_line {

	public static void main(String[] args) {
		
				Scanner sc=new Scanner(System.in);
				
				//This is how we take a user input string
				String str1;
				System.out.print("Enter the string:");
				str1=sc.nextLine();//if we give multi world input it will take multi world input
				// like- 'hello world' input output will be 'hello world'
				System.out.println("String is:"+str1);
				sc.close();
	}

}
