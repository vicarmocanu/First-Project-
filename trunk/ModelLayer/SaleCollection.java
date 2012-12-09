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
    ArrayList<Sale> saleCollection;   

    public SaleCollection()
    {
       saleCollection=new ArrayList<>();
    }
    
    public void addSale(Sale sale)
    {
        saleCollection.add(sale);
    }
    
    public void listAllSales()
    {
        if (saleCollection.size()!=0)
        {
            for(Sale i : saleCollection)
            {
                i.print();
                
            }
        }
        else System.out.println("No sales registred to system");
    }
    

}
