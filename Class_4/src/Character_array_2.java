import java.util.Scanner;

public class Character_array_2 {//this is not consider as string this is character array

	public static void main(java.lang.String[] args) {
		//char s[30];//we can not write this like c
		//char s[]= {'h','e','l','l','o'};//s[0]=h,s[0]=h,s[1]=e,s[2]=l,s[3]=l,s[4]=o,
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of the string:");
		int n=sc.nextInt();
		char s[]=new char [n];
		System.out.println("Enter the string:");
		for(int i=0;i<s.length;i++)
		{
			System.out.print("S["+i+"]=");
			s[i]=sc.next().charAt(0);
		}
		
		System.out.print("String is:");
		for(char x:s)
		{
			System.out.print(x);
		}
sc.close();
	}

}
