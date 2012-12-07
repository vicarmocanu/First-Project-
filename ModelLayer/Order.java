package ModelLayer;


/**
 * Write a description of class Order here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Order
{
    String id;
    int total;
    
    public Order(String id, int total)
    {
        this.id=id;
        this.total=total;
    }
    
    public void setId(String id)
    {
        this.id=id;
    }
    
    public String getId()
    {
        return id;
    }
    
    public void setTotal(int total)
    {
        this.total=total;
    }
    
    public void print()
    {
        System.out.println("ID: " + id);
        System.out.println("Total: " + total);
    }
    
    public void makeOrder(String id, int total)
    {
        this.id=id;
        this.total=total;
    }
    
}
