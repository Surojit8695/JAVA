
public class Index_of {

	public static void main(String[] args) {
		String name="Surojit Saha";
		System.out.println(name.indexOf('S'));//0
		System.out.println(name.indexOf('a'));//9
		System.out.println(name.lastIndexOf('a'));//11
		String s1="Kolkata city of joy a westbengal";
		System.out.println(s1.indexOf('a',5));//6//this is not generalized
		System.out.println(s1.indexOf('a',s1.indexOf('a')+1));//6
		

	}

}
