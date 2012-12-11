package ModelLayer;
import java.util.Date;

/**
 * Write a description of class SubLease here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SubLease
{
    String product;
    Date startPeriod;
    Date endPeriod;
    
    public SubLease(String product, Date startPeriod, Date endPeriod)
    {
        this.product=product;
        this.startPeriod=startPeriod;
        this.endPeriod=endPeriod;
    }
    
    public void makeLease(String product, Date startPeriod, Date endPeriod)
    {
        this.product=product;
        this.startPeriod=startPeriod;
        this.endPeriod=endPeriod;
    }
    
    public void print()
    {
        System.out.println("Product: " + product);
        System.out.println("Start of Period: " + startPeriod);
        System.out.println("End of Period: " + endPeriod);
    }
}
