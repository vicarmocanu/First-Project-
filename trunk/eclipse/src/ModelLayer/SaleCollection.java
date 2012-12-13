package ModelLayer;
import java.util.ArrayList;


/**
 * Write a description of class SaleCollection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SaleCollection
{
        

        ArrayList<Sale> listOfSales;  
        Sale sale;
        String barCode;
        private static SaleCollection instance=null;
        
    public SaleCollection()
    {
       listOfSales=new ArrayList<>();
    }
    
    public static SaleCollection getInstance()
    {
        if(instance==null)
        {
            instance=new SaleCollection();
            
        }
        
            return instance;
    }
    
    public void createSale(String id,String customerName, String employeeName)
    {
        Sale sale=new Sale(id,customerName,employeeName);
        listOfSales.add(sale);
    }
    
     public void addSubSaleToSale(String id, int amount, String barCode)
    {        
        for(Sale i: listOfSales)
        {
            if(i.id.equals(id))
            {
                i.addSubSale(amount, barCode);
            }
        }
    }
    
     public void calculateTotalForSale(String id)
    {
        for(Sale i: listOfSales)
        {
            if(i.id.equals(id))
            {
                i.calculateTotal();
            }
        }
    }
       
   public void listSales()
    {
        if(listOfSales.size()!=0)
        {
            for(Sale i: listOfSales)
            {
                i.print();
                System.out.println("*************************");
            }
        }
        else System.out.println("The list is empty!");
    }
    
    public void searchSale(String id)
    {
        ArrayList<Order> select=new ArrayList();

        if(listOfSales.size()!=0)
        {
            for(Sale i : listOfSales)
            {
                if(i.id.equals(id))
                {
                    i.print();
                    System.out.println("***************");
                }
            }
        }
        else System.out.println("The list is empty!");
    }
    

}
