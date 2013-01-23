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
    CategoryCollection categoryCollection;

    private int numberOfOrders;
    private double totalAmountFromOrders;

    private int totalAmountFromSales;
    private int numberOfSales;

    private int totalAmountFromLeases;
    private int numberOfLeases;

    public Customer(String name, String id, String address, String phoneNumber)
    {
        super(name,id,address,phoneNumber);

        this.numberOfOrders=0;
        this.totalAmountFromOrders=0;

        this.totalAmountFromSales=0;
        this.numberOfSales=0;

        this.totalAmountFromLeases=0;
        this.numberOfLeases=0;

        this.discountCategory=discountCategory;
    }

    public void setTotalAmountFromSales(int totalAmountFromSales)
    {
        this.totalAmountFromSales=totalAmountFromSales;
        numberOfSales=numberOfSales+1;
    }

    public void setTotalAmountFromOrders(double totalAmountFromOrders)
    {
        this.totalAmountFromOrders=totalAmountFromOrders;
        numberOfOrders=numberOfOrders+1;
    }

    public void setDiscountCategory(int discountCategory)
    {
        this.discountCategory=discountCategory;
    }

    public int getDiscountCategory()
    {
        return discountCategory;
    }

    public void setTotalAmountFromLeases(int totalAmountFromLeases)
    {
        this.totalAmountFromLeases=totalAmountFromLeases;
        numberOfOrders=numberOfOrders+1;
    }

    public void printCustomer()
    {
        print();
        System.out.println("Discount category: " + discountCategory);
    }

    public void printCustomerWithStatistics()
    {
        print();

        System.out.println("Total amount from orders: " + totalAmountFromOrders);
        System.out.println("Total number of orders placed: " + numberOfOrders );

        System.out.println("Total amount from sales: " + totalAmountFromSales);
        System.out.println("Total number of sales placed: " + numberOfSales );

        
        System.out.println("Total amount from leases: " + totalAmountFromLeases);
        System.out.println("Total number of leases placed: " + numberOfLeases );
    }
}
