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
    String product;
    Date startPeriod;
    int numberOfDays;
    Date endPeriod;
    int subTotal;
    ProductCollectionForLease productCollection=ProductCollectionForLease.getInstance();

    public SubLease(String product, int numberOfDays)
    {
        this.product=product;
        this.startPeriod=new Date(((currenttime.getTime()).getTime())/1000);       
        this.numberOfDays=numberOfDays;
        long seconds = numberOfDays*24*60*60;
        endPeriod=new Date((startPeriod.getTime()+seconds)*1000);
        this.startPeriod=new Date((this.startPeriod.getTime())*1000);
    }

    public void makeLease(String product, Date endPeriod)
    {
        this.product=product;
        this.startPeriod=new Date((currenttime.getTime()).getTime());
        this.endPeriod=endPeriod;
    }

    public void subTotal()
    {
        ProductCollectionForLease prodColl=ProductCollectionForLease.getInstance();
        subTotal=prodColl.searchProduct(product).pricePerDay;
    }

    public void print()
    {
        System.out.println("Product: " + product);
        System.out.println("Start of Period: " + startPeriod);
        System.out.println("End of Period: " + endPeriod);
    }
}
