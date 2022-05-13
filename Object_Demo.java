class Trial
{
	public String toString()
	{
		return "I am a customized statement of Trial class";
	}
	
}
public class Object_Demo {

	public static void main(String[] args) {
		Object ob=new Object();
		System.out.println(ob.getClass());
         Trial t= new Trial();
         System.out.println(t.getClass());
         System.out.println(t);
         
	}

}
