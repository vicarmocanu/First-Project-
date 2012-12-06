package ModelLayer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class CategoryCollection
{
    private static final CategoryCollection instance = new CategoryCollection();
    
    ArrayList<Category> listOfCategory;
    int categoryNumber;
    Category category;
    int categoryDiscount;
    /**
     * Constructor for objects of class CustCategory
     */
    private CategoryCollection()
    {
        listOfCategory=new ArrayList<>();
    }

    private static CategoryCollection getInstance()       //singleton of the class;
    {
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
        /*
        Iterator<Category> it = listOfCategory.iterator();
        while(it.hasNext())
        {
            int x=it.next().categoryNumber;
            if(x == categoryNumber)
            {
              category.updateDiscounts(newDiscount);
            }
        }
        */
        ArrayList<Category> select=new ArrayList<Category>();
        if(listOfCategory.size()!=0)
        {
            for(Category a: listOfCategory)
            {
                if(a.categoryNumber==categoryNumber)
                {
                    select.add(a);
                    a.updateDiscounts(newDiscount);
                    System.out.println("Update Successful!");
                }
            }
        }
        else System.out.println("No products in stock");
       
    }
}

