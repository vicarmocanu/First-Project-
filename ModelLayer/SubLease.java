package ModelLayer;
import java.util.Date;
import java.util.Calendar;

/**
 * Write a description of class SubLease here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SubLease
{
    Calendar currenttime = Calendar.getInstance();
    String name;
    Date startPeriod;
    int numberOfDays;
    Date endPeriod;
    int subTotal;
    ProductCollectionForLease productCollectionForLease=ProductCollectionForLease.getInstance();

    public SubLease(String name, int numberOfDays)
    {
        this.name=name;
        this.startPeriod=new Date(((currenttime.getTime()).getTime())/1000);       
        this.numberOfDays=numberOfDays;
        long seconds = numberOfDays*24*60*60;
        endPeriod=new Date((startPeriod.getTime()+seconds)*1000);
        this.startPeriod=new Date((this.startPeriod.getTime())*1000);
    }

    public void makeLease(String name, Date endPeriod)
    {
        this.name=name;
        this.startPeriod=new Date((currenttime.getTime()).getTime());
        this.endPeriod=endPeriod;
    }

    public void subTotal()
    {
        subTotal=(productCollectionForLease.searchProduct(name).pricePerDay);
    }

    public void print()
    {
        System.out.println("Name: " + name);
        System.out.println("Start of Period: " + startPeriod);
        System.out.println("End of Period: " + endPeriod);
    }
}
