package ModelLayer;


/**
 * Write a description of class Sale here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sale
{
    SubSale subSale;
    String id;
    int intermediate;
    int total;
    
    public Sale(String id)
    {
       this.id=id;
        subSale=new SubSale();
    }
    
    
    public void scanNewProduct(int numberOfProducts,String barCode )
    {
        intermediate=subSale.scanNewProduct( numberOfProducts, barCode);
        total=total + intermediate;
    }
    
    public void printTotal()
    {
        System.out.println(total);
    }
    
    public void print()
    {
        
        System.out.println("Id: " + id);
        System.out.println("Total: " + total);
    }

}
