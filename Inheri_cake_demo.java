class Cake
{
	String name;
	double rate;
	
	Cake(String n, double r)
	{
		name=n;
		rate=r;
	}
	public double calcPrice()
	{
		return 0.0;
	}
	
	public String toString()
	{
		return name+"\t"+rate;
	}
	
	Cake high_price(Cake obj)
	{
		if(rate>obj.rate)
			return this;
		else
			return obj;
	}
}
class Ordered_Cake extends Cake
{
	int weight;
	
	Ordered_Cake(String x, double y, int z)
	{
		super(x,y);
		weight=z;
	}
	
	public double calcPrice()
	{
		rate=weight*rate;
		return rate;
	}
	
}
class Readymade_Cake extends Cake
{
	int qty;
	
	Readymade_Cake(String x, double y, int z)
	{
		super(x,y);
		qty=z;
	}
	
	public double calcPrice()
	{
		rate=qty*rate;
		return rate;
	}
	public String toString()
	{
		return name+"\t"+rate+"\tQty "+qty;
	}
	
	
	
}
public class Inheri_cake_demo {
	public static void main(String ar[])
	{
		Cake items[]=new Cake[3];
		
		items[0]=new Cake("Honey",400.0);
		items[1]=new Ordered_Cake("Nuts",750.0,3);
		items[2]=new Readymade_Cake("Fruit of forest",1200.0,2);
		
		Cake highest=new Cake("None",0.0);
		for(int i=0;i<items.length;i++)
		{
			items[i].calcPrice();
			System.out.println(items[i]);
			System.out.println("--------------------");
			highest=highest.high_price(items[i]);
		}
		System.out.println("The highest sale is:");
		System.out.println(highest);
		
		
	}

}
