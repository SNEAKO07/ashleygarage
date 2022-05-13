class A
{
	 final int val;
	A()
	{
		val=10;
	}
	final void print()
	{
		//val+=10; Error because the val is final
		System.out.println(val);
	}
}

final class B extends A
{
	int val1;
	B()
	{
		val1=10;
	}
	//overriding
	/*void print()// can't override the final method
	{
		val1+=10; 
		System.out.println(val1 +" "+ val);
	}*/
	
}
/*class C extends B // final class cannot be extended
{
	
}*/
public class Final_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
        obj.print();
        
	}

}
