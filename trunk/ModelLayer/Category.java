package ModelLayer;


/**
 * Write a description of class Category here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Category
{
   
    int categoryNumber;
    int categoryDiscount;
    
    /**
     * Constructor for objects of class Category
     */
    public Category(int NewcategoryNumber, int NewcategoryDiscount)
    {
       categoryNumber=NewcategoryNumber;
       categoryDiscount=NewcategoryDiscount;
    }
    
    public void createCategory(int NewcategoryNumber, int NewcategoryDiscount)
    {
       categoryNumber=NewcategoryNumber;
       categoryDiscount=NewcategoryDiscount;
    }
    
    public void print()
    {
        System.out.println (" Category number: " + categoryNumber);
        System.out.println (" Discount: " + categoryDiscount);
    }
    
    public void updateDiscounts(int categoryDiscount)
    {
        this.categoryDiscount=categoryDiscount;
        System.out.println(" Update successful");
    }
            
            

    
}
