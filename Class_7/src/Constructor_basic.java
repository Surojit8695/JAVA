
public class Constructor_basic {

	public static void main(String[] args) {
		System.out.println("Main is called:");
		Test obj1=new Test();
		Test obj2=new Test();

	}
}
class Test{
	int x,y;
	
	
	//default constructor
	Test(){
		System.out.println("Test is called.");
	}
	
	void input()
	{
		
	}
	
	void display()
	{
		
	}
}
