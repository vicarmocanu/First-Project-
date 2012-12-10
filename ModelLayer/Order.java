package ModelLayer;
import java.util.ArrayList;

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
    ArrayList<SubOrder> listOfSubOrders;
    
    public Order(String id)
    {
        listOfSubOrders=new ArrayList();
        this.id=id;
    }
    
    public void setId(String id)
    {
        this.id=id;
    }
    
    public String getId()
    {
        return id;
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
    
    public void addSubOrder(int amount, String name)
    {
        SubOrder suborder=new SubOrder(amount, name);
        suborder.subTotal();
        listOfSubOrders.add(suborder);
    }
    
    public void calculateTotal()
    {        
        for(SubOrder i : listOfSubOrders)
        {
            total=total+i.subTotal;
        }
    }
    
}
