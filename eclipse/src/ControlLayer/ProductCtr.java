package ControlLayer;
import ModelLayer.ProductCollection;
import ModelLayer.Product;

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

    public Product searchProduct(String name)
    {
        return collection.searchProduct(name);
    }
    
    public String listProductsWithoutSalePrice()
    {
        return collection.listProductsWithoutSalePrice();
    }

    public boolean searchProductAndPrint(String name)
    {
        return collection.searchProductAndPrint(name);
    }
    public String searchProductAndPrintPrint(String name)
    {
        return collection.searchProductAndPrintPrint(name);
    }

    public Product searchProductByBarCode(String name)
    {
        return collection.searchProductByBarCode(name);
    }

    public String searchProductByBarCodeAndPrint(String name)
    {
        return collection.searchProductByBarCodeAndPrint(name);
    }

    public String listAllProducts()
    {
        return collection.listAllProducts();
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
