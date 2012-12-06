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
    
    public Employee(String name, String id, String address, String phoneNumber, String posiition, int salary)
    {
        super(name,id,address,phoneNumber);
        this.position = position;
        this.salary = salary;
        
    }
}
