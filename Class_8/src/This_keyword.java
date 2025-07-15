
public class This_keyword {

	int x,y;
	This_keyword()
	{
		//this(4,5);
		System.out.println("in D Const");
		//this(4,5); //error
	}
	This_keyword(int x,int y)
	{
		this();
		System.out.println("in P Const");
	}
	void input(int x,int y)
	{
		this.x=x;
		this.y=y;
		
		this.display();
	}
	void display()
	{
		System.out.println("X:"+this.x);
		System.out.println("Y:"+this.y);
	}
	public static void main(String[] args) {
		
//		Test1 ob=new Test1();
//		ob.input(5, 6);
		//ob.display();
		This_keyword ob1=new This_keyword(10,15);
		ob1.input(15, 16);
		//ob1.display();
	}

}
