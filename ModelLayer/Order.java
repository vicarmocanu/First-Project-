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
    
    String customerName;
    String employeeName;
   
    ArrayList<SubOrder> listOfSubOrders;
    EmployeeCollection employeeCollection=EmployeeCollection.getInstance();
    CustomerCollection customerCollection=CustomerCollection.getInstance();
    
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
        addTotalToCustomer(customerName, total);
    }
    
    public void addTotalToEmployee(String employeeName, int total)
    {
        employeeCollection.updateEmployeeTotalFromOrders(employeeName,total);
    }
    
     public void addTotalToCustomer(String customerName, int total)
    {
        customerCollection.updateCustomerTotalFromOrders(customerName,total);
    }
    
}
