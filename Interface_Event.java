interface Event
{ 
	default void welcome_msg()
	{
	System.out.println("Welcome to the event  ");	
	}
	static void Thank_you_msg()
	{
		System.out.println("Thanks for coming to the event");	
	}
  double expenditure();
  void prizes();
}
interface Invitation extends Event
{
	String msg="Welcome to the great event of";
	
	void design_invitation();
	
    void display_invitation();	
    
    void internal_details();
}

class Birthday implements Invitation
{
	String birthday_baby;
	int age;
	int mem_count;
	String return_gift;
	String date;
	String venue;
	
	Birthday(String a, int b, int c, String x, String y, String z)
	{
		birthday_baby=a;
		age=b;
		mem_count=c;
		return_gift=x;
		date=y;
		venue=z;
	}

	@Override
	public double expenditure() {
		
		return(mem_count*300);
	}

	@Override
	public void prizes() {
		System.out.println(return_gift);
		
	}

	@Override
	public void design_invitation() {
		System.out.println("Date : "+date +"  Venue :"+venue);
		System.out.println("All are invited");
		
	}

	@Override
	public void display_invitation() {
		welcome_msg();
		System.out.println("Hello All!!! /n Here is the birthday Party of "+birthday_baby);
		System.out.println("He/she is going to turn into " + age);
		design_invitation();
		Event.Thank_you_msg();
	}
	
	public void internal_details()
	{
		System.out.println("Expenditure of the party " + expenditure());
		System.out.println("The return gift is going to be ");
		prizes();
	}
	
}

class Symposium implements Invitation
{
String event_name;
int year;
int prize_amt;
int arr_amt;
String date;
String venue;
String pgms[]={"Code-bug", "Web-toe","Man-learning MAchine","Quizzino"};

Symposium(String a, int b, int c,  int d, String x, String y)
{
event_name=a;
year=b;
prize_amt=c;
arr_amt=d;
date=x;
venue=y;
}
@Override
	public double expenditure() {
		
		return(prize_amt + arr_amt);
	}

	@Override
	public void prizes() {
		System.out.println("The worth of prize amt is  "+ prize_amt );
		
	}

	@Override
	public void design_invitation() {
		System.out.println("Date : "+date +"  Venue :"+venue);
		System.out.println("All are invited");
		
	}

	@Override
	public void display_invitation() {
		welcome_msg();
		System.out.print(event_name);
		System.out.println(" "+year+ "th of year celebration ");
        prizes();
        System.out.println("With following events");
        for (String x: pgms)
           System.out.println(x); 
		design_invitation();
		Event.Thank_you_msg();
	}
	
	public void internal_details()
	{
		System.out.println("Expenditure of the event" + expenditure());
		
		
	}
}

public class Interface_Event {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invitation obj;
		
		Birthday Eobj=new Birthday("Rishu", 4, 50, "pencil-box" ,"14/07/2016", "Yazhi-apartment");
		obj=Eobj;
		obj.display_invitation();
		System.out.println("------------------------------");
		obj.internal_details();
		
		System.out.println("------------------------------");
		Symposium Eobj1= new Symposium("Codevera", 5, 200000,400000,"21/9/2020","Karunya-campus");
		obj=Eobj1;
		obj.display_invitation();
		System.out.println("------------------------------");
		obj.internal_details();

	}

}
