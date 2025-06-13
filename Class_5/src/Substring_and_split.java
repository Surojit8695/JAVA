
public class Substring_and_split {

	public static void main(String[] args) {
		String s1 ="Kolkata city of joy";
		System.out.println(s1.substring(3));//kata city of joy
		System.out.println(s1.substring(2));//lkata city of joy
		
		//starting index to ending index
		System.out.println(s1.substring(2, 6));//lkat  
		//from 2 to less than 6
		
		//split
		String s2="Java is everything for me!";
		String str1[]= s2.split(" ");
		for(int i=0;i<str1.length;i++)
		{
			System.out.println(str1[i]);
		}
System.out.println(str1.length);//5
	}

}
