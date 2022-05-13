class GrandFather
{
	GrandFather()
	{
		System.out.println("I have a cart");
	}
	GrandFather(String x)
	{
		System.out.println("I have a "+ x);
	}
}
class Father extends GrandFather
{
	Father()
	{
		System.out.println("I have a scooter");
	}
	Father(String x, String y)
	{
		super(x);
		System.out.println("I have a "+y);
	}
}

class Son extends Father
{
	Son()
	{
		System.out.println("I have a car");
	}
	Son(String x,String y, String z)
	{
	super(x,y);
	System.out.println("I have a "+z);
	}
}
public class Inheritance_MultiLevel {

	public static void main(String[] args) {
		
		Son Joy=new Son();
		Son Ron=new Son("Jeep", "Lancer","Jet");

	}

}
