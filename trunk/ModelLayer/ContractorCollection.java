package ModelLayer;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Write a description of class ContractorCollection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ContractorCollection
{
    ArrayList<Contractor> listOfContractors;
    Person person;
   
    public ContractorCollection()
    {
        listOfContractors=new ArrayList<>();
    }

   public void createContractor(String name, String id, String address, String phoneNumber,String position, int salary)
    {
        Contractor contractor=new Contractor( name,  id,  address,  phoneNumber );
      listOfContractors.add(contractor);
    }
    
     public void listAllContractors()
    {
        if (listOfContractors.size()!=0){
            for(Contractor i : listOfContractors)
            {
                i.printContractor();
                System.out.println("*****************************");
            }
        }
        else System.out.println("No contractor registred in the system");
    }
    
     public void deleteContractor(String name)          
    {
         Iterator<Contractor> it = listOfContractors.iterator();
      
        while(it.hasNext())
        {
            if(it.next().name.equals(name))
            {
                it.remove();
                System.out.println("Contractor successfuly deleted from the system!");
            }
        }
    }
    
    }
