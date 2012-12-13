package ControlLayer;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ProductForLeaseCtrTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ProductForLeaseCtrTest
{
    private ControlLayer.ProductForLeaseCtr productF1;
    private ControlLayer.LeaseCtr leaseCtr1;

    /**
     * Default constructor for test class ProductForLeaseCtrTest
     */
    public ProductForLeaseCtrTest()
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
        productF1 = new ControlLayer.ProductForLeaseCtr();
        productF1.print();
        productF1.print();
        productF1.makeProductForLease("b1", "location1", "a", "desc1", "Available", 5);
        productF1.makeProductForLease("b2", "loc2", "b", "desc2", "Unavailable", 10);
        productF1.makeProductForLease("b3", "loc3", "c", "desc3", "Available", 100);
        productF1.print();
        leaseCtr1 = new ControlLayer.LeaseCtr();
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
