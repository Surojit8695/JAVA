import java.util.Scanner;

public class String_to_character_array_conversation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//This is how we take a user input string
		String str1;
		System.out.print("Enter the string:");
		str1=sc.nextLine();//if we give multi world input it will take multi world input
		// like- 'hello world' input output will be 'hello world'
		System.out.println("String is(In String):"+str1);
		
		
		//string to character array convertion
		char s1[]=str1.toCharArray();
		System.out.print("String is(In Character array):");
		for(char x:s1)
		{
			System.out.print(x);
		}
sc.close();
	}

}
