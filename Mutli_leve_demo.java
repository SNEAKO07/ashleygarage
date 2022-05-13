class Vehicle
{
	String model;
	int seat;
	Vehicle(String a, int b)
	{
		model=a;
		seat=b;
	}
	void display_vehicle()
	{
		System.out.println("It is a "+model+ " Vehicle");
		System.out.println("With "+ seat+" Seater");
	}
}


class Two_wheeler extends Vehicle
{   
    String energy;
    
	Two_wheeler(String a, int b,String c) {
		super(a, b);
		energy=c;
	}
	
	void display_vehicle()
	{
		super.display_vehicle();
		System.out.println("Driven by the power of " +energy);
		
	}
}

class Gear_less extends Two_wheeler
{
    boolean gear_less;
	Gear_less(String a, int b, String c, boolean z) {
		super(a, b, c);
		gear_less=z;
	}
	void display_vehicle()
	{
		super.display_vehicle();
		System.out.println("It is a gearless vehicle "+ gear_less);
	}
	
	
}
public class Mutli_leve_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle obj = new Gear_less("M123",2,"Battery",true);
		obj.display_vehicle();

	}

}
