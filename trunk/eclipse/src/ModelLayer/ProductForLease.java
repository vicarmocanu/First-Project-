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
    
    public void setBarCode(String barCode)
    {
        this.barCode=barCode;
    }
    
    public String getBarCode()
    {
        return barCode;
    }
    
    public void setLocation(String location)
    {
        this.location=location;
    }
    
    public String getLocation()
    {
        return location;
    }
    
    public void setName(String name)
    {
        this.name=name;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setDescription(String description)
    {
        this.description=description;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public void setStatus(String status)
    {
        this.status=status;
    }
    
    public String getStatus()
    {
        return status;
    }
    
    public void setPricePerDay(int pricePerDay)
    {
        this.pricePerDay=pricePerDay;
    }
    
    public int getPricePerDay()
    {
        return pricePerDay;
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
