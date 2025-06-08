import java.util.Scanner;

public class String_input_one_word {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter the string:");
		str=sc.next();//if we give several world input it will take only one word
		// like 'hello world kolkata surojit' it will rake only 'hello' rest of the word after space will not be taken
		System.out.println(str);

	}

}
