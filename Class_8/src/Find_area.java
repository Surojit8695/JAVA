
public class Find_area {
	double area;
	
	void findArea(int side)
	{
		area=side*side;
		System.out.println("Area of Square is:"+area);
	}
	void findArea(int side1 ,int side2)
	{
		area=side1*side2;
		System.out.println("Area of Rectangle is:"+area);
	}
	void findArea(int side1,int side2,int side3)
	{
		double s=(side1+side2+side3)/2;
		area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		System.out.format("Area of Triangle is:%.2f\n",area);
	}
	void findArea(double radius)
	{
		area=Math.PI*Math.pow(radius,2);
		System.out.format("Area of Circle is:%.2f\n",area);
	}
	public static void main(String[] args) {
		Find_area s=new Find_area();
		s.findArea(5.5);//circle
		s.findArea(5);//sqare
		s.findArea(4,5);//rectangle
		s.findArea(4,5,6);//triangle

	}

}
