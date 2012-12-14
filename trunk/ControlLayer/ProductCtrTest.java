package ControlLayer;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ProductCtrTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ProductCtrTest
{
    private ControlLayer.ProductCtr productC1;
    private ControlLayer.PersonCtr personCt1;
    private ControlLayer.CategoryCtr category1;
    private ControlLayer.OrderCtr orderCtr1;

    
    
    
    

    
    
    

    
    

    
    

    /**
     * Default constructor for test class ProductCtrTest
     */
    public ProductCtrTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        productC1 = new ControlLayer.ProductCtr();
        productC1.addProduct("b1", "a", "a", "a", 10, 20, 1, 100, 52);
        productC1.addProduct("b2", "b", "b", "b", 55, 10, 1, 1000, 500);
        personCt1 = new ControlLayer.PersonCtr();
        personCt1.createEmployee("cirstea", "id1", "add1", "p1", "pos1", 100);
        personCt1.createEmployee("razvan", "id2", "add2", "p2", "pos2", 200);
        personCt1.createCustomer("gabriel", "id10", "add1", "p1", 2);
        personCt1.createCustomer("victor", "id22", "add2", "p2", 3);
        personCt1.listAllCustomers();
        category1 = new ControlLayer.CategoryCtr();
        category1.createCategory(2, 10);
        category1.createCategory(3, 20);
        orderCtr1 = new ControlLayer.OrderCtr();
        orderCtr1.createOrder("id1", "gabriel", "razvan");
        orderCtr1.addSubOrderToOrder("id1", 5, "a");
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
