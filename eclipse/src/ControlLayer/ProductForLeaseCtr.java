package ControlLayer;
import ModelLayer.ProductCollectionForLease;

/**
 * Write a description of class ProductForLeaseCtr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProductForLeaseCtr
{
    ProductCollectionForLease prodCollForLease;
    
    public ProductForLeaseCtr()
    {
        prodCollForLease=ModelLayer.ProductCollectionForLease.getInstance();
    }
    
    public void makeProductForLease(String barCode, String location, String name, String description, String status, int pricePerDay)
    {
        prodCollForLease.makeProductForLease(barCode, location, name, description, status, pricePerDay);
    }
    
    public void changeProductForLeaseStatus(String name)
    {
        prodCollForLease.changeProductForLeaseStatus(name);
    }
    
    public void searchProduct(String name)
    {
        prodCollForLease.searchProduct(name);
    }
    public boolean searchExistProduct(String name)
    {
        return prodCollForLease.searchExistProduct(name);
    }
    
    public String print()
    {
        return prodCollForLease.print();
    }
}
