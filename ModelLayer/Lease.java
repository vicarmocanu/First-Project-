package ModelLayer;


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
    String startPeriod;
    String endPeriod;
    
    public Lease(String id, int total, String startPeriod, String endPeriod)
    {
        this.id=id;
        this.total=total;
        this.startPeriod=startPeriod;
        this.endPeriod=endPeriod;
    }
    
    public void makeLease(String id, int total, String startPeriod, String endPeriod)
    {
        this.id=id;
        this.total=total;
        this.startPeriod=startPeriod;
        this.endPeriod=endPeriod;
    }
    
    public void print()
    {
        System.out.println("ID: " + id);
        System.out.println("Total: " + total);
        System.out.println("Start of Period: " + startPeriod);
        System.out.println("End of Period: " + endPeriod);
    }
}
