
public class Copy_constructor {

	public static void main(String[] args) {
		Test2 ob1=new Test2();
		Test2 ob2=new Test2(5);
		Test2 ob3=new Test2(10,20);
		
		ob1.display();
		ob2.display();
		ob3.display();
		System.out.println("\nCopy constructor");
		Test2 ob4=new Test2(ob3);
		ob4.display();
		

	}

}
class Test2{
	int x,y;
	
	void display() {
		System.out.println("X:"+x);
		System.out.println("Y:"+y);
		
	}
	//default constructor or zero argument constructor
	Test2(){
		x=0;
		y=0;
	}
	
	Test2(int a){//one argument is passed
		x=a;
		y=a;
	}
	
	Test2(Test2 obj){//copy constructor
		x=obj.x;
		y=obj.y;
	}
	

	Test2(int a,int b){//Two argument is passed
		x=a;
		y=b;
	}
	
}
