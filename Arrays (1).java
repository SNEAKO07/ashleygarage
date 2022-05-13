import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		//1-d Array declaration and initialization
		Scanner sc=new Scanner(System.in);
		int []arr = new int[5];
		int []arr1 = new int[5];
		System.out.println("Array 1: ");
		for(int i=0;i<arr.length;i++)
			arr[i]=sc.nextInt();
		System.out.println("Array 2: ");
		for(int i=0;i<arr1.length;i++)
			arr[i]=sc.nextInt();
		boolean flag=false;
		int cnt=0;
		for(int i=0; i<arr.length; i++)
		{
			cnt=0;
			for(int j=0; j<arr1.length;j++)
			{
				if(arr[i]==arr1[j])
				{
					cnt++;
		            
				}
			}
			if(cnt==0)
			{
				flag=true;
				break;
				}
		
		}		
		if(flag==true)
			System.out.println("The arrays are not same");
		else
			System.out.println("The arrays are same");
		
	}
		}
