
public class String_compaire {

	public static void main(String[] args) {
		String s1="Ami";//Ascii value of A=65,a=97
		String s2="ami";
		
		if(s1.compareTo(s2)>0)//compairing two striing we will get 3 result either greater than 0 ,less than zero, or 0
		{
			System.out.println("S1 is grater than s2");
		}
		else if(s1.compareTo(s2)==0)
		{
			System.out.println("S2==S1");
		}
		else 
		{
			System.out.println("S2>S1");
		}
		
		int value=s2.compareTo(s1);//s2-s1=97-65=32
		System.out.println(value);//32

	}

}
