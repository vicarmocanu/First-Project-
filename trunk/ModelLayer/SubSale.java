package ModelLayer;


/**
 * Write a description of class SubSale here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SubSale
{
   
    int amount;
    int subTotal;
    String barCode;
    ProductCollection productCollection=ProductCollection.getInstance();
   
   public SubSale(int amount, String barCode)
    {
        this.amount=amount;
        this.barCode=barCode;
        productCollection.updateProductStockByBarCode(amount,barCode );
    }
    
   
    public void subTotal(int amount)
    {
        ProductCollection prodColl=ProductCollection.getInstance();
        subTotal=amount*(prodColl.searchProductByBarCode(barCode).salePrice);
    }
    
    public void print()
    {
        System.out.println("Bar code: " + barCode);
        System.out.println("Amount: " + amount);
        System.out.println("SubTotal: " + subTotal);
        System.out.println("                ");
    }
    
    
    
    
    

    
}
