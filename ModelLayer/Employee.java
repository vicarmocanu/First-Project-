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

    private int totalAmountFromSales;
    private int numberOfSales;

    private int totalAmountFromLeases;
    private int numberOfLeases;


    public Employee(String name, String id, String address, String phoneNumber, String position, int salary)
    {
        super(name,id,address,phoneNumber);
        this.position = position;
        this.salary = salary;
        this.numberOfOrders=0;
        this.totalAmountFromOrders=0;

        this.totalAmountFromSales=0;
        this.numberOfSales=0;

        this.totalAmountFromLeases=0;
        this.numberOfLeases=0;

    }

    public void setPosition(String position)
    {
        this.position=position;
    }

    public void setSalary(int salary)
    {
        this.salary=salary;
    }

     public void setTotalAmountFromSales(int totalAmountFromSales)
    {
        this.totalAmountFromSales=totalAmountFromSales;
        numberOfSales=numberOfSales+1;
    }
    
    public void setTotalAmountFromOrders(int totalAmountFromOrders)
    {
        this.totalAmountFromOrders=totalAmountFromOrders;
        numberOfOrders=numberOfOrders+1;
    }
    
     public void setTotalAmountFromLeases(int totalAmountFromLeases)
    {
        this.totalAmountFromLeases=totalAmountFromLeases;
        numberOfSales=numberOfSales+1;
    }
    
    public void printEmployee()
    {
        print();
        System.out.println("Position :" + position);
        System.out.println("Salary   :" + salary);
        
        

    }
    
    public void printEmployeeWithStatistics()
    {
        print();
        System.out.println("Position :" + position);
        System.out.println("Salary   :" + salary);
        
        System.out.println("Total amount from orders: " + totalAmountFromOrders);
        System.out.println("Total number of orders placed: " + numberOfOrders );
        
        System.out.println("Total amount from sales: " + totalAmountFromSales);
        System.out.println("Total number of sales placed: " + numberOfSales );
        
        
        
         System.out.println("Total amount from leases: " + totalAmountFromLeases);
        System.out.println("Total number of leases placed: " + numberOfLeases );
    }
    
    // MISSING LEASE UPDATE TO EMPLOYEE

   
}
