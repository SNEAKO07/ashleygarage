class Animal
{
	String name;
	int  max_age;
	
	Animal()
	{
		name="Anon";
		max_age=0;
	}
	Animal(String a, int b)
	{
		name=a;
		max_age=b;
	}
	
	void know_animal()
	{
		System.out.println("Name: "+name+"\n"+"Max age: "+max_age);
		
	}
}

class Wild_animal extends Animal
{
	boolean predator;
	String food;
	
	Wild_animal()
	{
		predator=true;
		food="Rabbit";
	}
	
	Wild_animal(boolean a,String b,String x, int y)
	{
		super(x,y);
		predator=a;
		food=b;
	}
	void know_child()
	{
		know_animal();
		System.out.println("Predator: "+predator+"\n"+"Food: "+food);
	}
	
}


public class Inheritance_animal {
	

	public static void main(String[] args) 
	{
		Wild_animal obj=new Wild_animal(true,"hippo","Wild-Dog",15);
		obj.know_child();
		
		
	}

}
