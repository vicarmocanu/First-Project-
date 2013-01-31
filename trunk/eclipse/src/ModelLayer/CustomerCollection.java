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
    
    
    private static CustomerCollection instance=null;

    private CustomerCollection()
    {
        listOfCustomers=new ArrayList<>();
    }

    public static CustomerCollection getInstance()
    {
        if(instance==null)
        {
            instance=new CustomerCollection();
            
        }
        
            return instance;
    }

    public void createCustomer(String name, String id, String address, String phoneNumber)
    {
        Customer customer=new Customer( name,  id,  address,  phoneNumber);
        listOfCustomers.add(customer);
        System.out.println(" Customer added ! ");
    }

    public String listAllCustomers()
    {
//        if (listOfCustomers.size()!=0){
//            for(Customer i : listOfCustomers)
//            {
//                i.printCustomer();
//                System.out.println("*****************************");
//            }
//        }
//        else System.out.println("No customers registred in the system");
    	
    	String text;
    	text = "";
    	if (listOfCustomers.size()!=0)
        {
            for(Customer i : listOfCustomers)
            {
                text += i.printCustomer();
                text += "********************" + "\n";
            }
        }
        else text = "No customers registered in the system";
    	return text;
    }
    
     public String listAllCustomersWithStatistics()
    {
    	String text = "";
    	boolean found = false;
        if (listOfCustomers.size()!=0){
            for(Customer i : listOfCustomers)
            {
                text += i.printCustomerWithStatistics();
                text += "*****************************" + "\n";
                
            }
        }
        else text = "No customers registred in the system";
        if (text.equals("")) text = "No customer with that name found in the system";
        return text;
    }
     public String listCustomersWithStatistics(String name)
     {
     	String text;
     	text = "";
         if (listOfCustomers.size()!=0){
             for(Customer i : listOfCustomers)
             {
            	 if(i.getName().equals(name))
            	 {
                 text = i.printCustomerWithStatistics()+ "\n";
            	 }
             }
         }
         else text = "No customers registred in the system";
         return text;
     }
    
    public boolean listCustomerByName(String name)
    {
    	if (listOfCustomers.size()!=0){
          for(Customer i : listOfCustomers)
          {
              if(i.name.equals(name))
              {
                  i.printCustomer();
                  System.out.println("*****************************");
                  return true;
              }
          }
          
      }
      System.out.println("No customer with that name in the system");
      return false;
    }
    public String listCustomerByNamePrint(String name)
    {
//        if (listOfCustomers.size()!=0){
//            for(Customer i : listOfCustomers)
//            {
//                if(i.name.equals(name))
//                {
//                    i.printCustomer();
//                    System.out.println("*****************************");
//                    return true;
//                }
//            }
//            
//        }
//        System.out.println("No customer with that name in the system");
//        return false;
    	
    	String text;
    	text = "";
    	if (listOfCustomers.size()!=0){
            for(Customer i : listOfCustomers)
            {
                if(i.name.equals(name))
                {
                	text += i.printCustomer() + "\n";
                	break;
                }
                
            }
           
            
        }
    	else text = "No customers in the system" + "\n";
    	if (text.equals("")) text = "No customer with that name in the system.";
        return text;
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
            if (!found)  System.out.println("No Customer with that name in the system.");
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
        boolean found=false;
        if(listOfCustomers.size()!=0)
        {

            for(Customer a: listOfCustomers)
            {
                if(a.name.equals(name))
                {
                    a.setPhoneNumber(phoneNumber);
                    System.out.println("Update Successful!");
                    found=true;
                }

            }
            if (!found)  System.out.println("No customer with that name in the system.");
        }
        else System.out.println("No customer registred in the system");
    }
    
    public int getDiscountCategory(String name)
    {
        int result=0;
        if(listOfCustomers.size()!=0)
        {
            for(Customer a: listOfCustomers)
            {
                if(a.name.equals(name))
                {
                    result=a.getDiscountCategory();
                }
            }
        }
        else System.out.println("No customers in the system!");
        
        return result;
    }
    
    public void setDiscountCategory(String name, int discountCategory)
    {
        boolean found=false;
        if(listOfCustomers.size()!=0)
        {

            for(Customer a: listOfCustomers)
            {
                if(a.name.equals(name))
                {
                    a.setDiscountCategory(discountCategory);
                    System.out.println("Customer category succesfully added!");
                    found=true;
                }

            }
            if (!found)  System.out.println("No customer with that name in the system.");
        }
        else System.out.println("No customer registred in the system");
    }
    
     public void updateCustomerTotalFromOrders(String name, double total)
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
                    a.setTotalAmountFromOrders(total);
                    found=true;
                    System.out.println("Order successfuly registred to customer's statistics!");
                }
               
            }
            if (!found)  System.out.println("No customer with that name in the system.");
        }
        else System.out.println("No customer registred in the system");
    }
    
      public void updateCustomerTotalFromSales(String name, int total)
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
                    a.setTotalAmountFromSales(total);
                    found=true;
                    System.out.println("Order successfuly registred to customer's statistics!");
                }
               
            }
            if (!found)  System.out.println("No customer with that name in the system.");
        }
        else System.out.println("No customer registred in the system");
    }
    
    public void updateCustomerTotalFromLeases(String name, int total)
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
                    a.setTotalAmountFromLeases(total);
                    found=true;
                    System.out.println("Lease successfuly registred to customer's statistics!");
                }
               
            }
            if (!found)  System.out.println("No customer with that name in the system.");
        }
        else System.out.println("No customer registred in the system");
    }

   
   
}
