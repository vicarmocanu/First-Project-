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

    public void setName(String name)
    {
        this.name=name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public Date getEndPeriod()
    {
        return endPeriod;
    }
    
    public void makeLease(String name, int numberOfDays)
    {
        this.name=name;
        this.startPeriod=new Date(((currenttime.getTime()).getTime())/1000);  
        this.numberOfDays=numberOfDays;
        long seconds = numberOfDays*24*60*60;
        endPeriod=new Date((startPeriod.getTime()+seconds)*1000);
        this.startPeriod=new Date((this.startPeriod.getTime())*1000);
    }
    
    public String checkAvailability(String name)
    {
        return productCollectionForLease.checkStatus(name);
    }
    
    public void changeProductForLeaseStatus(String name)
    {
        productCollectionForLease.changeProductForLeaseStatus(name);
    }
    
    public void subTotal()
    {
        subTotal=numberOfDays*(productCollectionForLease.searchProduct(name).getPricePerDay());
    }

    public void leasedProductReturned()
    {
        endPeriod=new Date(((currenttime.getTime()).getTime()));
    }
    
    public String print()
    {
    	String text = "";
        subTotal();
        text += "Name: " + name + "\n";
        text += "Price Per Day: " + productCollectionForLease.searchProduct(name).getPricePerDay()  + "\n";
        text += "Number Of Days: " + numberOfDays + "\n";
        text += "Sub Total: " + subTotal + "\n";
        text += "Start of Period: " + startPeriod + "\n";
        text += "End of Period: " + endPeriod + "\n";
        return text;
    }
}
