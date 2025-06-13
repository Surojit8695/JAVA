//21.Write a program to check whether a string is a palindrome (make this case-insensitive).

import java.util.Scanner;

public class String_palindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.next();

        StringBuffer sb = new StringBuffer(input);//here we use string buffer class
        String reversed = sb.reverse().toString();

        if (input.equalsIgnoreCase(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();


	}

}
