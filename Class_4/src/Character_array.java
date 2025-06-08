
public class Character_array {//this is not consider as string this is character array

	public static void main(java.lang.String[] args) {
		//char s[30];//we can not write this like c
		char s[]= {'h','e','l','l','o'};//s[0]=h,s[0]=h,s[1]=e,s[2]=l,s[3]=l,s[4]=o,
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]);
		}
		System.out.println();
		for(char x:s)
		{
			System.out.print(x);
		}

	}

}
