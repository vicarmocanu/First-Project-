package ModelLayer;


/**
 * Write a description of class SubSale here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SubSale
{
   
   String barCode;
   int numberOfProducts;
   ProductCollection productCollection;
   Product product;
   
   public SubSale()
    {
        productCollection=  ProductCollection.getInstance(); 
        product=null;
    }
    
   public int scanNewProduct(int numberOfProducts,String barCode)
    {
        int subTotal=0;
        product=productCollection.searchProductByBarCode(barCode);
        subTotal=product.getSalePrice() * numberOfProducts;
        productCollection.updateProductStockByBarCode(numberOfProducts,barCode);
        return subTotal;        
    }

    
}
