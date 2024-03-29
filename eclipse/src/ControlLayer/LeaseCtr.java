package ControlLayer;
import ModelLayer.LeaseCollection;
import java.util.Date;
/**
 * Write a description of class LeaseCtr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeaseCtr
{
    LeaseCollection leaseColl;

    public LeaseCtr()
    {
        leaseColl=ModelLayer.LeaseCollection.getInstance();
    }
    
    public void makeLease(String id,String customerName,String employeeName)
    {
        leaseColl.makeLease(id,customerName,employeeName);
    }
    
    public void addSubLeaseToLease(String id, String name, int numberOfDays)
    {
        leaseColl.addSubLeaseToLease(id, name, numberOfDays);
    }
    
    public String searchLease(String id)
    {
        return leaseColl.searchLease(id);
    }
    
    public String print()
    {
        return leaseColl.print();
    }
    
    public void calculateTotalForLease(String id)
    {
        leaseColl.calculateTotalForLease(id);
    }
    
    public void returnLeasedProduct(String id, String name)
    {
        leaseColl.returnLeasedProduct(id, name);
    }
    
}
