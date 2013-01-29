package ModelLayer;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

/**
 * Write a description of class LeaseCollection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeaseCollection
{
    Calendar currenttime = Calendar.getInstance();
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

    public void makeLease(String id,String customerName,String employeeName)
    {
        Lease lease=new Lease( id, customerName, employeeName);
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

    public void calculatePenalty(String id, String name)
    {
        SubLease subLease;
        if(listOfLeases.size()!=0)
        {
            for(Lease i: listOfLeases)
            {
                if(i.id.equals(id))
                {
                    subLease=i.searchSubLease(name);
                    if((subLease.getEndPeriod().getTime())<((currenttime.getTime()).getTime()))
                    {
                        
                    }
                }
            }
        }
        else System.out.println("The list is empty!");
    }

    public void returnLeasedProduct(String id, String name)
    {
        if(listOfLeases.size()!=0)
        {
            for(Lease i: listOfLeases)
            {
                if(i.id.equals(id))
                {
                    i.returnSubLease(name);
                    //calculatePenalty(id, name);
                }
            }
        }
        else System.out.println("The list is empty!");
    }

    public String searchLease(String id)
    {
    	String text = "";
        if(listOfLeases.size()!=0)
        {
            for(Lease i : listOfLeases)
            {
                if(i.id.equals(id))
                {
                    text += i.print() + "\n";
                }
            }
        }
        else text = "The list is empty!";
        return text;
    }

    public String print()
    {
    	String text = "";
        if(listOfLeases.size()!=0)
        {
            for(Lease i : listOfLeases)
            {
                text += i.print() + "\n";

            }
        }
        else text = "The list is empty!" + "\n";
        return text;
    }
}
