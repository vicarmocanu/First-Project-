package ModelLayer;


/**
 * Write a description of class subOrder here.
 * 
 * @author (your name) 
 * @version (a version amount or a date)
 */
public class SubOrder
{
    int amount;
    int subTotal;
    String name;
    public SubOrder(int amount, String name)
    {
        this.amount=amount;
        this.name=name;
    }
        
    public void subTotal()
    {
        ProductCollection prodColl=ProductCollection.getInstance();
        subTotal=amount*(prodColl.searchProduct(name).salePrice);
    }
    
    public void print()
    {
        System.out.println("Amount: " + amount);
        System.out.println("SubTotal: " + subTotal);
        System.out.println("                ");
    }
}
