package ModelLayer;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Date;

/**
 * Write a description of class Lease here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lease
{
    String id;
    int total;
    ArrayList<SubLease> listOfSubLeases;
    
    public Lease(String id)
    {
        this.id=id;
        listOfSubLeases=new ArrayList();
    }
    
    public void makeLease(String id)
    {
        this.id=id;
    }
    
    public void addSubLease(String id, Date startPeriod, Date endPeriod)
    {
        SubLease sublease=new SubLease(id, startPeriod, endPeriod);
        listOfSubLeases.add(sublease);
    }
    
    public void calcTotal()
    {
        
    }
    
    public void print()
    {
        System.out.println("ID: " + id);
        System.out.println("Total: " + total);
    }
}
