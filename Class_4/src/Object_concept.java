
public class Object_concept {

	public static void main(String[] args) {
		String s1="hello";
		String s2="World";
		String s3="hi";
		String s4="hello";
		String s5="Hello";
		
		
		//String using new keyword
		String str1 =new String("hello");
		String str2 =new String("World");
		String str3 =new String("hello");
		
		System.out.println(s1.hashCode());//99162322
		System.out.println(s2.hashCode());//83766130
		System.out.println(s3.hashCode());//3329
		System.out.println(s4.hashCode());//99162322
		System.out.println(s5.hashCode());//69609650
		
		System.out.println();
		System.out.println(str1.hashCode());//99162322
		System.out.println(str2.hashCode());//83766130
		System.out.println(str3.hashCode());//99162322
		
		
		System.out.println("Object compare");
		if(s1==str1)
		{
			System.out.println("Same");
		}else {
			System.out.println("Different");
		}
		
		if(s1==s4)
		{
			System.out.println("Same");
		}else {
			System.out.println("Different");
		}
		
		System.out.println("Object value compare");
		
		if(s1.equals(s4))
		{
			System.out.println("Same");
		}else {
			System.out.println("Different");
		}
		
		if(s1.equals(str2))
		{
			System.out.println("Same");
		}else {
			System.out.println("Different");
		}
	}

}
