package ModelLayer;
import java.util.ArrayList;

/**
 * Write a description of class ProductCollectionForLease here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProductCollectionForLease
{
    ArrayList<ProductForLease> listOfProductsForLease;
    
    public void ProductCollectionForLease()
    {
        listOfProductsForLease=new ArrayList();
    }
    
    public void addProductForLease(ProductForLease product)
    {
        listOfProductsForLease.add(product);
    }
    
    public void changeProductForLeaseStatus(String name, String status)
    {
        if(listOfProductsForLease.size()!=0)
        {
            for(ProductForLease i: listOfProductsForLease)
            {
                if(i.name.equals(name))
                {
                    i.updateStatus(status);
                }
            }
        }
        else System.out.println("The list is empty!");
    }
}
