package ControlLayer;
import ModelLayer.ProductCollection;

/**
 * Write a description of class ProductCtr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProductCtr
{
    ProductCollection colection;

    public ProductCtr()
    {

    }

    public void addProduct(String barCode, String location, String name,String description, int buyPrice, int salePrice, int min, int max,int quantity)
    {
        colection.addProduct(barCode,location,name,description,buyPrice,salePrice,min,max,quantity);
    }

    public void searchProduct(String name)
    {
        colection.searchProduct(name);
    }

    public void listAllProducts()
    {
        colection.listAllProducts();
    }

    public void deleteProduct(String name)          
    {
        colection.deleteProduct(name);
    }

    public void updateProductBarCode(String name, String barCode)
    {
        colection.updateProductBarCode(name,barCode);
    }

    public void updateProductLocation(String name, String location)
    {
        colection.updateProductLocation(name,location);
    }

    public void updateProductDescription(String name, String description)
    {
        colection.updateProductDescription(name,description);
    }

    public void updateProductBuyPrice(String name, int buyPrice)
    {
        colection.updateProductBuyPrice(name,buyPrice);
    }

    public void updateProductSalePrice(String name, int salePrice)
    {
        colection.updateProductSalePrice(name,salePrice);
    }

    public void updateProductMin(String name, int min)
    {
        colection.updateProductMin(name,min);
    }

    public void updateProductMax(String name, int max)
    {
        colection.updateProductMax(name,max);
    }

            
        

}
