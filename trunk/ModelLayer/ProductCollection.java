package ModelLayer;

import java.util.ArrayList;

public class ProductCollection
{
	ArrayList<Product> prodList;
	
	public void listAllProducts()
	{
		for(Product i : prodList)
		{
			i.print();
			System.out.println("                               ");
		}
	}
}
