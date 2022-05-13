import java.util.Scanner;

class Student
{
	String name;
	String regno;
	String year;
	float cgpa;
	Scanner sc= new Scanner(System.in);
	
	Student()
	{
		name="Anon";
		regno="ur18csXX";
		year="CSE";
		cgpa=6.0f;
	}
	
	Student(String a, String b, String c, float cgpa)
	{
		name=a;
		regno=b;
		year=c;
		this.cgpa=cgpa;
	}
	
	
	void get_data()
	{
		System.out.print("Enter Name :");
		name=sc.next();
		System.out.print("Enter Regno :");
		regno=sc.next();
		System.out.println("Enter year :");
		year=sc.next();
		System.out.println("Enter cgpa :");
		cgpa=sc.nextFloat();
	}
	
	void print_data()
	{
		System.out.println("Name : "+name);
		System.out.println("Regno: "+regno);
		System.out.println("Year : "+year);
		System.out.println("Cgpa : "+cgpa);
		
	}
	
	Student compare(Student ob2)
	{
		if(cgpa > ob2.cgpa)
			return this;
		else
			return ob2;
	}
	
}
public class Student_Demo {
	
	
	public static void main(String[] args) {
		
		Student obj[]=new Student[5];
		//for(int i=0;i<obj.length;i++)
			//obj[i]= new Student();
		obj[0]=new Student("Priya","urk17cs09","IV_CSE",4.78f);
		obj[1]=new Student("Ria", "ur18ec45","III_EC",7.8f);
		obj[2]=new Student("Kria","ur14ae67", "passed",8.5f);
		obj[3]=new Student("Nisha", "urk19cs45","II_CSE",8.1f);
		obj[4]=new Student("Jia","prkcs2001","I_PG_CSE", 9.5f);
		Student rank_holder=obj[0];
		 for (int i=1;i<obj.length;i++)
		 {
			 rank_holder=rank_holder.compare(obj[i]);
		 }
		 System.out.println("The topper is ");
		 rank_holder.print_data();
		
		
		
		
		
		
		
	}

}
