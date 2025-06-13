
public class Concate_and_replace {

	public static void main(String[] args) {
		String s1="kolkata";
		System.out.println(s1.concat(",City of joy"));
		System.out.println(s1);
		s1=s1.concat(",City of joy");
		System.out.println(s1);
		
		//replace
		String s2="He is a good boy good in codding";
		System.out.println(s2.replace("good", "bad"));//He is a bad boy bad in codding
		//here good replace with bad

	}

}
