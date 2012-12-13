package ModelLayer;
import java.util.ArrayList;
import java.util.Date;
/**
 * Write a description of class LeaseCollection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeaseCollection
{
    ArrayList<Lease> listOfLeases;
    private static LeaseCollection instance=null;

    public LeaseCollection()
    {
        listOfLeases=new ArrayList();
    }
    
     public static LeaseCollection getInstance()
    {
        if(instance==null)
        {
            instance=new LeaseCollection();
            
        }
        
            return instance;
    }
    
    public void makeLease(String id)
    {
        Lease lease=new Lease(id);
        listOfLeases.add(lease);
    }
    
    public void addSubLeaseToLease(String id, String name, int numberOfDays)
    {
         for(Lease i: listOfLeases)
        {
            if(i.id.equals(id))
            {
                i.addSubLease(name, numberOfDays);
            }
        }
    }
    
    public void calculateTotalForLease(String id)
    {
        for(Lease i: listOfLeases)
        {
            if(i.id.equals(id))
            {
                i.calculateTotal();
            }
        }
    }

    public void returnProduct(String name)
    {
        
    }
    
    public void searchLease(String id)
    {
        if(listOfLeases.size()!=0)
        {
            for(Lease i : listOfLeases)
            {
                if(i.id.equals(id))
                {
                    i.print();
                    System.out.println("                 ");
                }
            }
        }
        else System.out.println("The list is empty!");
    }
    
    public void print()
    {
        if(listOfLeases.size()!=0)
        {
            for(Lease i : listOfLeases)
            {
                    i.print();
                    System.out.println("                 ");
            }
        }
        else System.out.println("The list is empty!");
    }
}
