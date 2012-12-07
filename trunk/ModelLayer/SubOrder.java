package ModelLayer;


/**
 * Write a description of class subOrder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SubOrder
{
    int number;
    int subTotal;
    
    public void SubOrder(int number, String name)
    {
        this.number=number;
    }
        
    public void print()
    {
        System.out.println("Number: " + number);
        System.out.println("SubTotal: " + subTotal);
        System.out.println("                ");
    }
}
