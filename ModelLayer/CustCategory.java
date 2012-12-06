package ModelLayer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class CustCategory
{
    ArrayList<Category> listOfCategory;
    int categoryNumber;
    Category category;
    int categoryDiscount;
    /**
     * Constructor for objects of class CustCategory
     */
    public CustCategory()
    {
        listOfCategory=new ArrayList<>();
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
        while(it.hasNext())
        {
            int x=it.next().categoryNumber;
            if(x == categoryNumber)
            {
                it.remove();
            }
        }
    }
    
    public void updateDiscount(int categoryNumber)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Write new discount:");
        int newDiscount=keyboard.nextInt();
        
        Iterator<Category> it = listOfCategory.iterator();
        while(it.hasNext())
        {
            int x=it.next().categoryNumber;
            if(x == categoryNumber)
            {
              category.updateDiscounts(newDiscount);
            }
        }
        
        
       
    }
}

