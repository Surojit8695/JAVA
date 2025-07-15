
public class Method_overloading {
	
	void f()
	{
		System.out.println("In f1");
	}
	void f(int x)
	{
		System.out.println("In f2");
	}
	void f(int x,float y)
	{
		System.out.println("In f3");
	}
	void f(float y)
	{
		System.out.println("In f4");
	}
	void f(float y,int x)
	{
		System.out.println("In f5");
	}
	public static void main(String[] args) {
		
		Method_overloading ob=new Method_overloading();
		
		ob.f();//f1
		ob.f(5);//f2
		ob.f(5.5f,6);//f5
		ob.f(9.5f);//f4
		ob.f(5,6.5f);//f3

	}

}
