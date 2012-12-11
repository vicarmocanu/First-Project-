package ControlLayer;
import ModelLayer.CategoryCollection;

/**
 * Write a description of class CategoryCtr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CategoryCtr
{
   CategoryCollection category;
   
   public CategoryCtr()
   {
        category=ModelLayer.CategoryCollection.getInstance(); 
   }
   
    public void createCategory(int categoryNumber,int categoryDiscount)
    {
        category.createCategory(categoryNumber,categoryDiscount);
    }
    
    public void listAllCategories()
    {
        category.listAllCategories();
    }
    
    public void deleteCategory(int categoryNumber)
    {
        category.deleteCategory(categoryNumber);
    }
    
    public void updateDiscount(int categoryNumber, int newDiscount)
    {
        category.updateDiscount(categoryNumber,newDiscount);
    } 
}