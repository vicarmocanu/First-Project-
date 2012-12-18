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
        productF1.makeProductForLease("b5", "DIY", "washing machine", "industrial washing machine", "Available", 50);
        productF1.makeProductForLease("b6", "Timber Department", "desk", "long school desk", "Available", 64);
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
