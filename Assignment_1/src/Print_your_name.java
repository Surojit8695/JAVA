//1. Write a program to print your name

import java.util.Scanner;

public class Print_your_name {

	public static void main(String[] args) {
		System.out.print("Enter your full name:");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("Your name is: "+name);

	}

}
