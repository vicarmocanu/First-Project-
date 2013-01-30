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
       
   public String listSales()
    {
	   String text = "";
        if(listOfSales.size()!=0)
        {
            for(Sale i: listOfSales)
            {
                text += i.print()  + "\n";
                text += "*************************" + "\n";
            }
        }
        else text += "The list is empty!" + "\n";
        return text;
    }
    
    public String searchSale(String id)
    {
       String text = "";

        if(listOfSales.size()!=0)
        {
            for(Sale i : listOfSales)
            {
                if(i.id.equals(id))
                {
                    text += i.print() + "\n";
                    text += "***************" + "\n";
                }
            }
        }
        else text = "The list is empty!" + "\n";

        if(text.equals("")) text = "No sale with that ID in the system";
        return text;
    }
    

}
