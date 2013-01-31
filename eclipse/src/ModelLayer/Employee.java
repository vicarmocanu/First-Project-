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
    private double totalAmountFromOrders;

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
        this.totalAmountFromSales+=totalAmountFromSales;
        numberOfSales=numberOfSales+1;
    }
    
    public void setTotalAmountFromOrders(double totalAmountFromOrders)
    {
        this.totalAmountFromOrders+=totalAmountFromOrders;
        numberOfOrders=numberOfOrders+1;
    }
    
     public void setTotalAmountFromLeases(int totalAmountFromLeases)
    {
        this.totalAmountFromLeases+=totalAmountFromLeases;
        numberOfSales=numberOfSales+1;
    }
    
    public String printEmployee()
    {
    	String text = "";
        text += print();
        text += "Position :" + position+ "\n";
        text += "Salary   :" + salary+ "\n";
        
        return text;

    }
    
    public String printEmployeeWithStatistics()
    {
    	String text = "";
        text += printEmployee() + "\n";
        text += "Position :" + position + "\n";
        text += "Salary   :" + salary + "\n";
        
        text += "Total amount from orders: " + totalAmountFromOrders + "\n";
        text += "Total number of orders placed: " + numberOfOrders  + "\n";
        
        text += "Total amount from sales: " + totalAmountFromSales + "\n";
        text += "Total number of sales placed: " + numberOfSales  + "\n";
        
        
        
        text += "Total amount from leases: " + totalAmountFromLeases + "\n";
        text += "Total number of leases placed: " + numberOfLeases  + "\n";
        return text;
    }
    
    // MISSING LEASE UPDATE TO EMPLOYEE

   
}
