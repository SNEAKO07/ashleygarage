class Item
{
	String item_name;
	int qty;
	float unit_price;
Item()
{
	item_name=null;
	qty=0;
	unit_price=0.0f;
}
Item(String a, int b, float c)
{
	item_name=a;
	qty=b;
	unit_price=c;
}

void purchase(int val)
{
	qty-=val;
	System.out.print("Name\t" + "Unit_cost\t"+"Qyt\t" +"Total\n");
	System.out.println(item_name+"\t"+unit_price+"\t\t"+val+"\t"+(val*unit_price));
}

void stock(int amt)
{
 qty+=amt;
}

void print_item()
{
System.out.println("Name:"+item_name);
System.out.println("Qty_Avail:"+qty);
System.out.println("Unit_cost"+unit_price);
}
}

public class Item_Demo {

	public static void main(String[] args) {
		Item obj=new Item("pencil", 25, 5.0f);
		obj.purchase(7);
		System.out.println("------------------------------------");
		obj.print_item();
		System.out.println("------------------------------------");
		obj.stock(50);
		obj.print_item();
		System.out.println("------------------------------------");

	}

}
