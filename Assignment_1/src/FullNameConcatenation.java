//6.Write a program to take your first and last name
//as command-line arguments and convert them into a single string.
//it will only run in command prompt
public class FullNameConcatenation {

	public static void main(String[] args) {
		
		String fullName = args[0] + " " + args[1];
        System.out.println("Full Name: " + fullName);

	}

}
