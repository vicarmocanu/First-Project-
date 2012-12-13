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

    public void addSubLease(String name, int numberOfDays)
    {
        SubLease sublease=new SubLease(name, numberOfDays);
        if(sublease.checkAvailability(name).equals("Available"))
        {
            sublease.subTotal();
            sublease.changeProductForLeaseStatus(name);
            listOfSubLeases.add(sublease);
        }
        else System.out.println("The item is already leased!");
    }

    public void calculateTotal()
    {
        total=0;
        for(SubLease i: listOfSubLeases)
        {
            total=total+i.subTotal;
        }
    }

    public void returnSubLease(String name)
    {
        if(listOfSubLeases.size()!=0)
        {
            for(SubLease i: listOfSubLeases)
            {
                if(i.name.equals(name))
                {
                    //listOfSubLeases.remove(name);
                    i.changeProductForLeaseStatus(name);
                    i.leasedProductReturned();
                }
            }
        }
        else System.out.println("There are no sub-leases!");
    }

    public SubLease searchSubLease(String name)
    {
        SubLease result=null;
        if(listOfSubLeases.size()!=0)
        {
            for(SubLease i: listOfSubLeases)
            {
                if(i.name.equals(name))
                {
                    result=i;
                }
            }
        }
        else System.out.println("The list is empty!");
        return result;
    }

    public void print()
    {
        System.out.println("ID: " + id);
        if(listOfSubLeases.size()!=0)
        {
            for(SubLease i: listOfSubLeases)
            {
                i.print();
                System.out.println("           ");
            }
        }
        System.out.println("Total: " + total);
    }
}
