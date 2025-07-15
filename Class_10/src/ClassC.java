
public class ClassC extends ClassB  {

	ClassC()
	{
			System.out.println("Inside Class C");
			
	}
	
	protected void finalize()
	{
		System.out.println("Inside class C finalize");
	}
}
