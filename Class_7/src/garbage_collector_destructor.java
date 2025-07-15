
public class garbage_collector_destructor {

	public static void main(String[] args) {
		System.out.println("Main is called.");
		Test4 ob1=new Test4();
		Test4 ob2=new Test4(5);
		Test4 ob3=new Test4(10);
		
		//System.gc();//after null only gc will run or collect the gurbage
		ob1=null;
		ob2=null;
		//ob3=null;
		System.gc();

	}

}
class Test4{
	
	//this is the function fot gurbage collector 
	protected void finalize()
	{
		System.out.println("Destructor is Called.");
	}
	
	
	
	
	
	Test4()
	{
		System.out.println("My constructor is called.");
	}
	
	Test4(int a)
	{
		System.out.println("My constructor is called.");
	}
	
}
