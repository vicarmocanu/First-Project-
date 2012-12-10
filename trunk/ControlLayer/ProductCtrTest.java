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
        productC1.addProduct("b1", "a", "a", "a", 10, 20, 1, 10, 10);
        productC1.addProduct("b2", "b", "b", "b", 20, 30, 1, 10, 10);
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
