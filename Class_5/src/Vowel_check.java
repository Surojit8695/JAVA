
public class Vowel_check {

	public static void main(String[] args) {
		String vowel="AEIOUaeiou";
		String name="Surojit Saha";
		System.out.println("Vowels are:");
		for(int i=0;i<name.length();i++)
		{
			String s1="";
			s1=s1+name.charAt(i);
			//System.out.println(s1);
			if(vowel.contains(s1))
			{
				System.out.println(s1);
			}
			
		}

	}

}
