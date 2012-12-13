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
    private static ProductCollectionForLease instance;

    ArrayList<ProductForLease> listOfProductsForLease;
    
    public ProductCollectionForLease()
    {
        listOfProductsForLease=new ArrayList();
    }
    
    public static ProductCollectionForLease getInstance()       //singleton of the class;
    { 
        if(instance==null)
        {
            instance=new ProductCollectionForLease();

        }

        return instance;
    }
    
    public void addProductForLease(ProductForLease product)
    {
        listOfProductsForLease.add(product);
    }
    
    public void makeProductForLease(String barCode, String location, String name, String description, String status, int pricePerDay)
    {
        ProductForLease product=new ProductForLease(barCode, location, name, description, status, pricePerDay);
        listOfProductsForLease.add(product);
    }
    
    public String checkStatus(String name)
    {
        String result=null;
        if(listOfProductsForLease.size()!=0)
        {
            for(ProductForLease i: listOfProductsForLease)
            {
                if(i.name.equals(name))
                {
                    result=i.getStatus();
                }
            }
        }
        else 
        {
            System.out.println("The list is empty!");
            result=null;
        }
        return result;
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
    
    public ProductForLease searchProduct(String name)
    {
        ProductForLease result=null;
        if(listOfProductsForLease.size()!=0)
        {
            for(ProductForLease i : listOfProductsForLease)
            {
                if(i.name.equals(name))
                {
                    result=i;
                }
            }
        }
        else System.out.println("The list is empty");
        return result;
    }

    public void print()
    {
        if(listOfProductsForLease.size()!=0)
        {
        for(ProductForLease i: listOfProductsForLease)
        {
            i.print();
            System.out.println("******************");
        }
    }
    else System.out.println("The list is empty!");
    }
    
}
