import java.util.Scanner;

class Emp
{
	String name;
	String desig;
	int exp;
	float sal;
	Scanner sc=new Scanner(System.in);
	
	Emp()
	{
		name="Anon";
		desig="None";
		exp=0;
		sal=0.0f;
	}
	Emp(String a, String b, int c, float d)
	{
		name=a;
		desig=b;
		exp=c;
		sal=d;
	}
	
	
	void add_emp()
	{System.out.println("Enter the name");
	name=sc.next();
	System.out.println("Enter the Designation");
	desig=sc.next();
	System.out.println("Enter the exp");
	exp=sc.nextInt();
	System.out.println("Enter the Salary");
	sal=sc.nextFloat();
	}
	
    void print_emp()
    {
    	System.out.println("-------------------");
    	System.out.println("Employee Details :");
    	System.out.println("-------------------");
    	System.out.println("Name: "+name);
    	System.out.println("Designation: "+desig);
    	System.out.println("Exp: "+exp);
    	System.out.println("Salary: "+sal);
    	System.out.println("-------------------");
    	
    }
}

public class Employee_Demo
{
	public static void main(String a[])
	{
		/*Emp obj=new Emp();
		Emp obj1= new Emp("Mythily","E-1229",14,25000.0f);
		Emp obj2=new Emp();
		obj2.add_emp();
		obj.print_emp();
		obj1.print_emp();
		obj2.print_emp();*/
		Emp Eobj[]= new Emp[5];
		Eobj[0]=new Emp();
		Eobj[1]=new Emp("Mythily","E-1229",14,25000.0f);
		Eobj[2]=new Emp();
		Eobj[2].add_emp();
		Eobj[3]=new Emp();
		Eobj[3].add_emp();
		Eobj[4]=new Emp();
		
		for(int i=0; i<Eobj.length; i++)
		{
			Eobj[i].print_emp();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}