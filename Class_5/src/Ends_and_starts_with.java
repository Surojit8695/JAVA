
public class Ends_and_starts_with {

	public static void main(String[] args) {
		String s1="Kolkata city of joy";
		
		//ends with
		System.out.println(s1.endsWith("o"));
		System.out.println(s1.endsWith("y"));
		System.out.println(s1.endsWith("oy"));
		
		//starts with
		System.out.println(s1.startsWith("o"));
		System.out.println(s1.startsWith("K"));
		System.out.println(s1.startsWith("Kol"));
		
		
		//trim function
		String name=" 			Surojit Saha     		";
		System.out.println("Before trim:");
		System.out.println(name);
		System.out.println("After trim:");
		System.out.println(name.trim());
		

	}

}
