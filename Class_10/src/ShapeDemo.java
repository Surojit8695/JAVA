
public class ShapeDemo {

	public static void main(String[] args) {
		
		Shape sq;//sq is reference of class Shape 
		
		//dynamic method dispatch   very very important
		sq=new Square();//up-casting 
		sq.input();
		sq.findArea();

		sq=new Rectangle();
		sq.input();
		sq.findArea();
		
		//Square s1=(Square) new Shape();//down-casting
		
			
		
		//re.input();
		
	}

}
