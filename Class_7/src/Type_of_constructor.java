
public class Type_of_constructor {

	public static void main(String[] args) {
		System.out.println("Main is called:");
		Test1 obj1=new Test1();
		Test1 obj2=new Test1();
		Test1 obj3=new Test1(5);
		Test1 obj4=new Test1(10,20);
		
		
		//display the object items
		obj1.display();
		//obj2.display();
		obj3.display();
		obj4.display();
		
		

	}

}

class Test1{
	int x,y;
	
	void display() {
		System.out.println("X:"+x);
		System.out.println("Y:"+y);
		
	}
	//default constructor or zero argument constructor
	Test1(){
		System.out.println("Default or zero argument constructor is called.");
		x=0;
		y=0;
	}
	
	Test1(int a){//one argument is passed
		System.out.println("Parameterised constructor 1 is called.");
		x=a;
		y=a;
	}
	

	Test1(int a,int b){//Two argument is passed
		System.out.println("Parameterised constructor 2 is called.");
		x=a;
		y=b;
	}
	
}