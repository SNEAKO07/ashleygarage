interface num
{
	void get();
}

interface Add extends num
{
	void d0_op();
}

class Basic_op implements Add
{
   int a,b;
	@Override
	public void get() {
		a=20;b=15;
		
	}

	@Override
	public void d0_op() {
		System.out.println("The addition resultant into "+(a+b));
		
	}
	
}

public class interface_extend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basic_op obj = new Basic_op();
		obj.get();
		obj.d0_op();

	}

}
