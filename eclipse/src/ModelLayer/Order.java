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
    double total;
    double discount;
    
    String customerName;
    String employeeName;
   
    ArrayList<SubOrder> listOfSubOrders;
    EmployeeCollection employeeCollection=EmployeeCollection.getInstance();
    CustomerCollection customerCollection=CustomerCollection.getInstance();
    CategoryCollection categoryCollection=CategoryCollection.getInstance();
    
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
    
    
    public String print()
    {
    	String text;
    	text = "";
        text += "ID: " + id + "\n";
        for(SubOrder i: listOfSubOrders)
        {
            i.print();
        }
        text += "Customer name: " + customerName + "\n";
        text += "Employee name: " + employeeName + "\n";
        text += "Discount: " + discount + "\n";
        text += "Total: " + total + "\n";
        return text;
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
        discount=0;
        total=0;
        
        for(SubOrder i : listOfSubOrders)
        {
            total=total+i.subTotal;
        }
        discount=categoryCollection.getDiscount(customerCollection.getDiscountCategory(customerName));
        discount=total * discount/100;
        total=total-discount;
       
        addTotalToEmployee(employeeName, total);
        addTotalToCustomer(customerName, total);
    }
    
    public void addTotalToEmployee(String employeeName,double total)
    {
        employeeCollection.updateEmployeeTotalFromOrders(employeeName,total);
    }
    
     public void addTotalToCustomer(String customerName,double total)
    {
        customerCollection.updateCustomerTotalFromOrders(customerName,total);
    }
    
}
