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
    
    public void changeProductForLeaseStatus(String name, String status)
    {
        prodCollForLease.changeProductForLeaseStatus(name, status);
    }
    
    public void searchProduct(String name)
    {
        prodCollForLease.searchProduct(name);
    }
    
    public void print()
    {
        prodCollForLease.print();
    }
}
