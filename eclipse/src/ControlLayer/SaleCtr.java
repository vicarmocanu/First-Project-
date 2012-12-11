package ControlLayer;
import ModelLayer.SaleCollection;
import ModelLayer.Sale;

/**
 * Write a description of class SaleCtr here.
 * 
 * @author (your barCode) 
 * @version (a version number or a date)
 */
public class SaleCtr
{
    SaleCollection sale;
    
    public SaleCtr()
    {
        sale=ModelLayer.SaleCollection.getInstance();
    }
    
    public void createSale(String id)
    {
        sale.createSale(id);
    }
    
    public void searchSale(String id)
    {
        sale.searchSale(id);
    }
    
    
    
    public void listSales()
    {
        sale.listSales();
    }
        
    public void addSubSaleToSale(String id, int amount, String barCode)
    {
        sale.addSubSaleToSale(id, amount, barCode);
    }
    
    public void calculateTotalForSale(String id)
    {
        sale.calculateTotalForSale(id);
    }
    
}
    
    

  

