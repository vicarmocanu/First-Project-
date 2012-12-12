package ModelLayer;

/**
 * Write a description of class Employee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Employee extends Person
{
    private String position;
    private int salary;
    private int numberOfOrders;
    private int totalAmountFromOrders;
    

    public Employee(String name, String id, String address, String phoneNumber, String position, int salary)
    {
        super(name,id,address,phoneNumber);
        this.position = position;
        this.salary = salary;
        this.numberOfOrders=0;
        this.totalAmountFromOrders=0;

    }
    
    public void setPosition(String position)
    {
        this.position=position;
    }
    
    public void setSalary(int salary)
    {
        this.salary=salary;
    }
    
    public void setTotalAmountFromOrders(int totalAmountFromOrders)
    {
        this.totalAmountFromOrders=totalAmountFromOrders;
    }

    
    public void printEmployee()
    {
       print();
       System.out.println("Position :" + position);
       System.out.println("Salary   :" + salary);
       System.out.println("Total amount from order: " + totalAmountFromOrders);
    }
    
    
   
}
