package ModelLayer;
import java.util.ArrayList;


/**
 * Write a description of class Sale here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sale
{
    String id;
    int total;
    ArrayList<SubSale> listOfSubSales;
    
    public Sale(String id)
    {
       listOfSubSales=new ArrayList();
        this.id=id;
    }
    
     public void setId(String id)
    {
        this.id=id;
    }
    
    public String getId()
    {
        return id;
    }
    
  public void print()
    {
        System.out.println("ID: " + id);
        for(SubSale i: listOfSubSales)
        {
            i.print();
        }
        System.out.println("Total: " + total);
    }
    
    public void makeSale(String id, int total)
    {
        this.id=id;
        this.total=total;
    }
    
    public void addSubSale(int amount, String barCode)
    {
        SubSale subSale=new SubSale(amount, barCode);
        subSale.subTotal(amount);
        listOfSubSales.add(subSale);
    }
    
    public void calculateTotal()
    {        
        for(SubSale i : listOfSubSales)
        {
            total=total+i.subTotal;
        }
    }
    
    
    
    

}
