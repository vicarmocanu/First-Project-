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
    Employee employee;
    String customerName;
    String employeeName;
    ArrayList<SubOrder> listOfSubOrders;
    
    public Order(String id, String customerName, String employeeName)
    {
        listOfSubOrders=new ArrayList();
        this.customerName=customerName;
        this.employeeName=employeeName;
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
        for(SubOrder i: listOfSubOrders)
        {
            i.print();
        }
        System.out.println("Customer name: " + customerName);
        System.out.println("Employee name: " + employeeName);
        System.out.println("Total: " + total);
    }
    
    public void makeOrder(String id)
    {
        this.id=id;
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
        addTotalToEmployee(employeeName, total);
    }
    
    public void addTotalToEmployee(String employeeName, int total)
    {
        employee.setTotalAmountFromOrders(total);
    }
    
}
