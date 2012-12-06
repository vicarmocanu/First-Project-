package ModelLayer;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a description of class CustomerCollection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CustomerCollection
{

    ArrayList<Customer> listOfCustomers;
    Person person;

    public CustomerCollection()
    {
        listOfCustomers=new ArrayList<>();
    }

    public void createCustomer(String name, String id, String address, String phoneNumber )
    {
        Customer customer=new Customer( name,  id,  address,  phoneNumber);
        listOfCustomers.add(customer);
    }

    public void listAllCustomers()
    {
        if (listOfCustomers.size()!=0){
            for(Customer i : listOfCustomers)
            {
                i.printCustomer();
                System.out.println("*****************************");
            }
        }
        else System.out.println("No customers registred in the system");
    }
    
    public void deleteCustomer(String name)          
    {
         Iterator<Customer> it = listOfCustomers.iterator();
      
        while(it.hasNext())
        {
            if(it.next().name.equals(name))
            {
                it.remove();
                System.out.println("Customer successfuly deleted from the system!");
            }
        }
    }
    
   
   
    
   
}
