interface Toys
{
	String intro="Welcome to toy zone";
	
	void describe();
	
}

class Soft_toys implements Toys
{
	float cost;
	String manufact;
	String spec;
	Soft_toys(String a, String b, float c)
	{
		spec=a;
		manufact=b;
		cost=c;
		
	}
	@Override
	public void describe() {
		//intro();
		System.out.println("It is my Soft toy "+"looks like "+spec);
		System.out.println("Made -in "+manufact+" and costs Rs."+cost);
		
		}
}

class Sport_toys implements Toys
{
	float cost;
	String brand_name;
	String sports_name;
	Sport_toys(String a, String b, float c)
	{
		sports_name=a;
		brand_name=b;
		cost=c;
		
	}
	@Override
	public void describe() {
		//intro();
		System.out.println("I love the sport "+sports_name);
		System.out.println("I bought it from "+brand_name+" and costs Rs."+cost);
		}
}
public class Interface_toy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Toys.intro);
		Toys t=new Soft_toys("Croc","india",900.56f);
		t.describe();
		System.out.println("**************************");
		t=new Sport_toys("Shuttle","Yonex",70000.0f);
		t.describe();
		

	}

}
