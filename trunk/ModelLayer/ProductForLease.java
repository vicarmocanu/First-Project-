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
    
    public void ProductForLease(String barCode, String location, String name, String description, String status)
    {
        this.barCode=barCode;
        this.location=location;
        this.name=name;
        this.description=description;
        this.status=status;
    }
    
    public void makeProduct(String barCode, String location, String name, String description, String status)
    {
        this.barCode=barCode;
        this.location=location;
        this.name=name;
        this.description=description;
        this.status=status;
    }
    
    public void updateStatus(String status)
    {
        this.status=status;
    }
}
