package ModelLayer;
import java.util.Iterator;
import java.util.ArrayList;

public class ProductCollection
{
    private static ProductCollection instance;

    ArrayList<Product> listOfProducts=null;

    private ProductCollection()
    {
        listOfProducts=new ArrayList<>();
    }

    public static ProductCollection getInstance()       //singleton of the class;
    { 
        if(instance==null)
        {
            instance=new ProductCollection();

        }

        return instance;
    }

    public void addProduct(String barCode, String location, String name,String description, int buyPrice, int salePrice, int min, int max,
    int quantity)
    {
        Product product=new Product(barCode, location, name, description, buyPrice, salePrice, min, max, quantity);
        listOfProducts.add(product);
    }


    public Product searchProduct(String name)
    {
        Product result=null;
        if(listOfProducts.size()!=0)
        {
            for(Product i : listOfProducts)
            {
                if(i.name.equals(name))
                {
                    result=i;
                }
            }
        }
        else System.out.println("The list is empty");
        return result;
    }
    
    public Product searchProductByBarCode(String barCode)
    {
        Product result=null;
        if(listOfProducts.size()!=0)
        {
            for(Product i : listOfProducts)
            {
                if(i.barCode.equals(barCode))
                {
                    result=i;
                }
            }
        }
        else System.out.println("The list is empty");
        return result;
    }
    
    
     public void updateProductStockByBarCode(int numberOfItems,String barCode)
    {
        
        
        Product result=null;
        if(listOfProducts.size()!=0)
        {
            for(Product i : listOfProducts)
            {
                if(i.barCode.equals(barCode))
                {
                    result=i;
                    result.setQuantity(numberOfItems);
                }
            }
        }
        else System.out.println("The list is empty");
        
    }
    
    public void updateProductStockByName(int numberOfItems,String name)
    {
        Product result=null;
        if(listOfProducts.size()!=0)
        {
            for(Product i : listOfProducts)
            {
                if(i.name.equals(name))
                {
                    result=i;
                    result.setQuantity(numberOfItems);
                }
            }
        }
        else System.out.println("The list is empty");
    }

    public void listAllProducts()
    {
        if (listOfProducts.size()!=0)
        {
            for(Product i : listOfProducts)
            {
                i.print();
                
            }
        }
        else System.out.println("No products in stock");
    }

    public void deleteProduct(String name)          
    {
        if(listOfProducts.size()!=0)
        {
            boolean found=false;
            Iterator<Product> it = listOfProducts.iterator();
            while(it.hasNext())
            {
                if(it.next().name.equals(name))
                {
                    it.remove();
                    System.out.println("Product deleted successfuly.");
                    found=true;
                }
                else System.out.println("No product with that name in the system.");
            }
            if (!found) System.out.println("No product registred with that name in the system");
        }
        else System.out.println("No products in stock");

    }

    public void updateProductBarCode(String name, String barCode)
    {
        ArrayList<Product> select=new ArrayList<Product>();
        boolean found=false;
        if(listOfProducts.size()!=0)
        {
            for(Product a: listOfProducts)
            {
                if(a.name.equals(name))
                {
                    select.add(a);
                    a.setBarCode(barCode);
                    System.out.println("Update Successful!");
                    found=true;
                }

            }
            if (!found) System.out.println("No product with that name in the system.");
        }
        else System.out.println("No such product in stock");
    }

    public void updateProductLocation(String name, String location)
    {
        ArrayList<Product> select=new ArrayList<Product>();
        boolean found=false;
        if(listOfProducts.size()!=0)
        {
            for(Product a: listOfProducts)
            {
                if(a.name.equals(name))
                {
                    select.add(a);
                    a.setLocation(location);
                    System.out.println("Update Successful!");
                    found=true;
                }

            } 
            if (!found) System.out.println("No product with that name in the system.");
        }
        else System.out.println("No such product in stock");
    }

    public void updateProductDescription(String name, String description)
    {
        ArrayList<Product> select=new ArrayList<Product>();
        boolean found=false;
        if(listOfProducts.size()!=0)
        {
            for(Product a: listOfProducts)
            {
                if(a.name.equals(name))
                {
                    select.add(a);
                    a.setDescription(description);
                    System.out.println("Update Successful!");
                    found=true;
                }

            }
            if (!found) System.out.println("No product with that name in the system.");
        }
        else System.out.println("No such product in stock");
    }

    public void updateProductBuyPrice(String name, int buyPrice)
    {
        ArrayList<Product> select=new ArrayList<Product>();
        boolean found=false;
        if(listOfProducts.size()!=0)
        {
            for(Product a: listOfProducts)
            {
                if(a.name.equals(name))
                {
                    select.add(a);
                    a.setBuyPrice(buyPrice);
                    System.out.println("Update Successful!");
                    found=true;
                }

            }
            if (!found) System.out.println("No product with that name in the system.");
        }
        else System.out.println("No such product in stock");
    }

    public void updateProductSalePrice(String name, int salePrice)
    {
        ArrayList<Product> select=new ArrayList<Product>();
        boolean found=false;
        if(listOfProducts.size()!=0)
        {
            for(Product a: listOfProducts)
            {
                if(a.name.equals(name))
                {
                    select.add(a);
                    a.setSalePrice(salePrice);
                    System.out.println("Update Successful!");
                    found=true;
                }

            }
            if (!found) System.out.println("No product with that name in the system.");
        }
        else System.out.println("No such product in stock");
    }

    public void updateProductMin(String name, int min)
    {
        ArrayList<Product> select=new ArrayList<Product>();
        boolean found=false;
        if(listOfProducts.size()!=0)
        {
            for(Product a: listOfProducts)
            {
                if(a.name.equals(name))
                {
                    select.add(a);
                    a.setMin(min);
                    System.out.println("Update Successful!");
                    found=true;
                }

            }
            if (!found) System.out.println("No product with that name in the system.");
        }
        else System.out.println("No such product in stock");
    }

    public void updateProductMax(String name, int max)
    {
        ArrayList<Product> select=new ArrayList<Product>();
        boolean found=false;
        if(listOfProducts.size()!=0)
        {
            for(Product a: listOfProducts)
            {
                if(a.name.equals(name))
                {
                    select.add(a);
                    a.setMax(max);
                    System.out.println("Update Successful!");
                    found=true;
                }

            }
            if (!found) System.out.println("No product with that name in the system.");
        }
        else System.out.println("No such product in stock");
    }

}
