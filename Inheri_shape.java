class Solid_Shape
{
	String name;
	String type;
	Solid_Shape(String x, String y)
	{
		name=x;
		type=y;
	}
}

class Sqr extends Solid_Shape
{
	int side;
	Sqr(String x, String y, int z)
	{
		super(x,y);
		side=z;
	}
	
	int area()
	{
		return(side*side);
	}
	int perimeter()
	{
		return(4*side);
	}
	void print()
	{
	System.out.println(name+" "+type+ " ");
	System.out.println("Area: "+area());
	System.out.println("Perimeter: "+perimeter());
	
	}
}
public class Inheri_shape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sqr obj = new Sqr("Square","Solid",6);
		obj.print();

	}

}
