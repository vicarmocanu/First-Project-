package ModelLayer;
import java.util.Iterator;
import java.util.ArrayList;

public class ProductCollection
{
    ArrayList<Product> prodList;
    String name;

    public ProductCollection()
    {
        prodList=new ArrayList<>();
    }

    public void addProduct(Product products)
    {
        prodList.add(products);
    }

    public void listAllProducts()
    {
        if (prodList.size()!=0){
        for(Product i : prodList)
        {
            i.print();
            System.out.println("                               ");
        }
    }
    else System.out.println("No products in stock");
    }

   
    public void deleteProduct(String name)          
    {
        Iterator<Product> it = prodList.iterator();
        while(it.hasNext())
        {
            if(it.next().name.equals(name))
            {
                it.remove();
            }
        }

    }
}
