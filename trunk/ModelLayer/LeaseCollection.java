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

    private LeaseCollection()
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

    public void addSubLeaseToLease(String id, String product, Date startPeriod, Date endPeriod)
    {
         for(Lease i: listOfLeases)
        {
            if(i.id.equals(id))
            {
                i.addSubLease(product, startPeriod, endPeriod);
            }
        }
    }
    
    public void searchLease(String id)
    {
        ArrayList<Order> select=new ArrayList();

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
}
