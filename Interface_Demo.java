
interface Arithmetic
{
	void add();
	void sub();
	
}

class primary_op implements Arithmetic
{
	int a,b;
	primary_op(int x,int y)
	{
		a=x;
		b=y;
	}

	@Override
	public void add() {
		System.out.println("The addition of " +a +" and " +b + " is "+(a+b));
		}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("The Subtraction  of " +a +" from " +b + " is "+(a-b));
	}
	
}
public class Interface_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic obj=new primary_op(10,5);
		obj.add();
		obj.sub();
		

	}

}
