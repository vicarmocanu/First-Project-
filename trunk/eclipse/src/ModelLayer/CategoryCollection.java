package ModelLayer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class CategoryCollection
{
    ArrayList<Category> listOfCategory;
    int categoryNumber;
    Category category;
    int categoryDiscount;
    private static CategoryCollection instance=null;
    
    /**
     * Constructor for objects of class CustCategory
   private CategoryCollection instance;
   */
  
  
    private CategoryCollection()
    {
        listOfCategory=new ArrayList<>();
    }

    public static CategoryCollection getInstance()
    {
        if(instance==null)
        {
            instance=new CategoryCollection();
            
        }
        
            return instance;
    }
    
    public void createCategory(int categoryNumber,int categoryDiscount)
    {
        Category category=new Category(categoryNumber,categoryDiscount);
        listOfCategory.add(category);
    }

    
    public void listAllCategories()
    {
        
        if (listOfCategory.size()!=0){
            for(Category i : listOfCategory)
            {
                i.print();
                System.out.println("*****************************");
            }
        }
        else System.out.println("No products in stock");
    }

    public void deleteCategory(int categoryNumber)          
    {
        Iterator<Category> it = listOfCategory.iterator();
        boolean found=false;
        while(it.hasNext())
        {
            int x=it.next().categoryNumber;
            if(x == categoryNumber)
            {
                it.remove();
                found=true;
                System.out.println("Category deleted");
            }
        }
       if(!found) System.out.println("No category registed with that number in the system");
    }
    
    public void updateDiscount(int categoryNumber, int newDiscount)
    {
        
       
        ArrayList<Category> select=new ArrayList<Category>();
        boolean found=false;
        if(listOfCategory.size()!=0)
        {
            for(Category a: listOfCategory)
            {
                if(a.categoryNumber==categoryNumber)
                {
                    select.add(a);
                    a.updateDiscounts(newDiscount);
                    System.out.println("Update Successful!");
                    found=true;
                }
            }
            if (!found)  System.out.println("No category registred with that number in the system.");
        }
        else System.out.println("No category registred in the system");
       
    }
}

