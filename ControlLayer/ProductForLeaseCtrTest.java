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
        productF1.makeProductForLease("b1", "a", "a", "a", "a", 5);
        productF1.makeProductForLease("b2", "b", "b", "b", "b", 10);
        leaseCtr1 = new ControlLayer.LeaseCtr();
        leaseCtr1.makeLease("id1");
        leaseCtr1.addSubLeaseToLease("id1", "a", 5);
        leaseCtr1.calculateTotalForLease("id1");
        leaseCtr1.print();
        leaseCtr1.print();
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
