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
    
    public void makeLease(String id)
    {
        leaseColl.makeLease(id);
    }
    
    public void addSubLeaseToLease(String id, String product, Date endPeriod)
    {
        leaseColl.addSubLeaseToLease(id, product, endPeriod);
    }
    
    public void searchLease(String id)
    {
        leaseColl.searchLease(id);
    }
    
    public void print()
    {
        leaseColl.print();
    }
    
}
