package ModelLayer;


/**
 * Write a description of class ProductForLease here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProductForLease
{
    String barCode;
    String location;
    String name;
    String description;
    String status;
    int pricePerDay;
    
    public ProductForLease(String barCode, String location, String name, String description, String status, int pricePerDay)
    {
        this.barCode=barCode;
        this.location=location;
        this.name=name;
        this.description=description;
        this.status=status;
        this.pricePerDay=pricePerDay;
    }
    
    public void makeProduct(String barCode, String location, String name, String description, String status)
    {
        this.barCode=barCode;
        this.location=location;
        this.name=name;
        this.description=description;
        this.status=status;
        this.pricePerDay=pricePerDay;
    }
    
    public void updateStatus(String status)
    {
        this.status=status;
    }
    
    public void print()
    {
        System.out.println("BarCode: " + barCode);
        System.out.println("Location: " + location);
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Status: " + status);
        System.out.println("Price per day: " + pricePerDay);
    }
}
