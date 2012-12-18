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
        productC1.addProduct("b1", "DIY", "wood", "best wood ever", 10, 15, 10, 1000, 500);
        productC1.addProduct("b2", "DIY", "hammer", "hammer", 15, 30, 5, 1000, 120);
        productC1.addProduct("b3", "Timber Laber", "table", "school table", 120, 160, 5, 140, 60);
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
