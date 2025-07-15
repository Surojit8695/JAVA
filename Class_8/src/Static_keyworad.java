import java.util.Scanner;

public class Static_keyworad {
	
	int x;
	static int y;
	
	void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter X:");
		x=sc.nextInt();
		
	}
	void display()
	{
		System.out.println("X:"+x);
		System.out.println("Y:"+y);
	}
	
	
	static void getStaticData() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Y:");
		y=sc.nextInt();
		showStaticData();
	}
	static void showStaticData()
	{
		int z=20;
		System.out.println(z);
	//	System.out.println("X:"+x);//error because member variable
		System.out.println("Y:"+y);
	//	display(); //error because member function
		showStaticData();
	}
	
	public static void main(String[] args) {
		Static_keyworad ob1=new Static_keyworad();   //ob1.x=5 ob1.input() ob1.display()
								// y=20 getStaticData()
		Static_keyworad ob2=new Static_keyworad(); // ob2.x=6 ob2.input() ob2.display()
	
		ob1.input();
		Static_keyworad.getStaticData();
		ob2.input();
		Static_keyworad.getStaticData();
		
		ob1.display();
		ob2.display();
		
	}

}
