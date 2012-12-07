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
    private static CustomerCollection instance;

    private CustomerCollection()
    {
        listOfCustomers=new ArrayList<>();
    }

    public static CustomerCollection getInstance()
    {
        if(instance!=null)
        {
            instance=new CustomerCollection();
            return instance;
        }
        else
            return instance;
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
        boolean found=false;
        while(it.hasNext())
        {
            if(it.next().name.equals(name))
            {
                it.remove();
                System.out.println("Customer successfuly deleted from the system!");
                found=true;
            }

        }
        if (!found) System.out.println("No customer registred in the system with that name");
        
    }

    public void updateCustomerId(String name, String id)
    {
        ArrayList<Customer> select=new ArrayList<Customer>();
        boolean found=false;
        if(listOfCustomers.size()!=0)
        {

            for(Customer a: listOfCustomers)
            {
                if(a.name.equals(name))
                {
                    select.add(a);
                    a.setId(id);
                    found=true;
                    System.out.println("Update Successful!");
                }

            }
            if (!found)  System.out.println("No employee with that name in the system.");
        }
        else System.out.println("No customer registred in the system");
    }

    public void updateCustomerAddress(String name, String address)
    {
        ArrayList<Customer> select=new ArrayList<Customer>();
        boolean found=false;
        if(listOfCustomers.size()!=0)
        {

            for(Customer a: listOfCustomers)
            {
                if(a.name.equals(name))
                {
                    select.add(a);
                    a.setAddress(address);
                    System.out.println("Update Successful!");
                    found=true;
                }

            }
            if (!found) System.out.println("No customer with that name in the system.");
        }
        else System.out.println("No customer registred in the system");
    }

    public void updateCustomerPhoneNumber(String name, String phoneNumber)
    {
        ArrayList<Customer> select=new ArrayList<Customer>();
        boolean found=false;
        if(listOfCustomers.size()!=0)
        {

            for(Customer a: listOfCustomers)
            {
                if(a.name.equals(name))
                {
                    select.add(a);
                    a.setPhoneNumber(phoneNumber);
                    System.out.println("Update Successful!");
                    found=true;
                }

            }
            if (!found)  System.out.println("No employee with that name in the system.");
        }
        else System.out.println("No employee registred in the system");
    }

   
   
}
