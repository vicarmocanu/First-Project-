package ModelLayer;


/**
 * Write a description of class Customer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Customer extends Person
{
    int discountCategory;
    
    public Customer(String name, String id, String address, String phoneNumber)
    {
        super(name,id,address,phoneNumber);
        discountCategory=0;
    }
    
      
    public void printCustomer()
    {
     print();
     System.out.println("Discount category: " + discountCategory);
     }
     
     public void setDiscountCategory(int discountCategory)
     {
        this.discountCategory=discountCategory;
        }
    
   

    
}
