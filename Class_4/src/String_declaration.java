import java.util.Scanner;

public class String_declaration {

	public static void main(java.lang.String[] args) {
		Scanner sc=new Scanner(System.in);
		char s[]= {'h','e','l','l','o'};//This is character array not string
		System.out.println("Character array is:"+s);//print the character array
		
		
		String name="Surojit Saha";//this is string 
		System.out.println("Your name is(String):"+name);//print the string
		
		
		
		System.out.println(s[2]);//this is possible (output will be 'l')
//		System.out.println(name[0]);//but this is not possible
		sc.close();
	}

}
