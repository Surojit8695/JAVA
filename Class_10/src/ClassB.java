
public class ClassB extends ClassA {
	
	ClassB()
	{
		
		System.out.println("Inside Class B");
	}
	protected void finalize()
	{
		System.out.println("Inside class B finalize");
	}
}
