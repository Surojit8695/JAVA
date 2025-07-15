
public class Constructor_overloading {
	int x,y;
	
	Constructor_overloading()//zero argument / default constructor
	{
		x=0;
		y=0;
		System.out.println("Constructor1 is called");
	}
	Constructor_overloading(int a)//parameterized  constructor
	{
		System.out.println("Constructor2 is called");
		x=a;
		y=a;
	}
	Constructor_overloading(int a,int b)//parameterized  constructor
	{
		System.out.println("Constructor3 is called");
		x=a;
		y=b;
	}
	Constructor_overloading(Constructor_overloading obj)//parameterized  constructor(act as a copy constructor)
	{
		System.out.println("Constructor4 is called");
		x=obj.x;
		y=obj.y;
	}
	
	
	void display() {
		System.out.println("X:"+x);
		System.out.println("Y:"+y);
	}
	public static void main(String[] args) {
		
		Constructor_overloading ob1=new Constructor_overloading(); //default
		Constructor_overloading ob2=new Constructor_overloading(5);//parameterized
		Constructor_overloading ob3=new Constructor_overloading(10,20);//parameterized
		Constructor_overloading ob4=new Constructor_overloading(ob3);//parameterized
		
		
		ob1.display();
		ob2.display();
		ob3.display();
		ob4.display();
		
		
	}

}
