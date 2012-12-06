package ModelLayer;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a description of class EmployeeCollection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EmployeeCollection
{

    ArrayList<Employee> listOfEmployees;
    Person person;
    

    public EmployeeCollection()
    {
        listOfEmployees=new ArrayList<>();
    }

    public void createEmployee(String name, String id, String address, String phoneNumber,String position, int salary)
    {
        Employee employee=new Employee( name,  id,  address,  phoneNumber, position,  salary);
        listOfEmployees.add(employee);
        
    }

    public void listAllEmployees()
    {
        if (listOfEmployees.size()!=0){
            for(Employee i : listOfEmployees)
            {
                i.printEmployee();
                System.out.println("*****************************");
            }
        }
        else System.out.println("No employees registred in the system");
    }

    public void deleteEmployee(String name)          
    {
        Iterator<Employee> it = listOfEmployees.iterator();

        while(it.hasNext())
        {
            if(it.next().name.equals(name))
            {
                it.remove();
                System.out.println("Employee successfuly deleted from the system!");
            }
        }
    }
    
    public void updateId(String name, String id)
    {
        person.updatePersonId(name, id);
    }

}
