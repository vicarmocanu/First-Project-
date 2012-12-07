package ModelLayer;
import java.util.ArrayList;
/**
 * Write a description of class LeaseCollection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeaseCollection
{
    ArrayList<Lease> listOfLeases;

    public LeaseCollection()
    {
        listOfLeases=new ArrayList();
    }
    
    public void makeLease(String id, int total, String startPeriod, String endPeriod)
    {
        Lease lease=new Lease(id, total, startPeriod, endPeriod);
        listOfLeases.add(lease);
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
