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
    ProductCollection collection;

    public ProductCtr()
    {
        collection=ModelLayer.ProductCollection.getInstance(); 
    }

    public void addProduct(String barCode, String location, String name,String description, int buyPrice, int salePrice, int min, int max,int quantity)
    {
        collection.addProduct(barCode,location,name,description,buyPrice,salePrice,min,max,quantity);
    }

    public void searchProduct(String name)
    {
        collection.searchProduct(name);
    }
    
    public void listProductsWithoutSalePrice()
    {
        collection.listProductsWithoutSalePrice();
    }

    public boolean searchProductAndPrint(String name)
    {
        return collection.searchProductAndPrint(name);
    }

    public void searchProductByBarCode(String name)
    {
        collection.searchProductByBarCode(name);
    }

    public void searchProductByBarCodeAndPrint(String name)
    {
        collection.searchProductByBarCodeAndPrint(name);
    }

    public void listAllProducts()
    {
        collection.listAllProducts();
    }
    public String listAllProductsToString()
    {
    	return collection.listAllProductsToString();
    }

    public void deleteProduct(String name)          
    {
        collection.deleteProduct(name);
    }

    public void updateProductBarCode(String name, String barCode)
    {
        collection.updateProductBarCode(name,barCode);
    }

    public void updateProductLocation(String name, String location)
    {
        collection.updateProductLocation(name,location);
    }

    public void updateProductDescription(String name, String description)
    {
        collection.updateProductDescription(name,description);
    }

    public void updateProductBuyPrice(String name, int buyPrice)
    {
        collection.updateProductBuyPrice(name,buyPrice);
    }

    public void updateProductSalePrice(String name, int salePrice)
    {
        collection.updateProductSalePrice(name,salePrice);
    }

    public void updateProductMin(String name, int min)
    {
        collection.updateProductMin(name,min);
    }

    public void updateProductMax(String name, int max)
    {
        collection.updateProductMax(name,max);
    }

}
