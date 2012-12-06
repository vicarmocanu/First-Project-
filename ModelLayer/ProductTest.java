package ModelLayer;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ProductTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ProductTest
{
    private ModelLayer.Product product1;
    private ModelLayer.ProductCollection productC1;

    /**
     * Default constructor for test class ProductTest
     */
    public ProductTest()
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
        product1 = new ModelLayer.Product("102XVG", "DIY", "wood", "best wood", 25, 35, 50, 700, 500);
        productC1 = new ModelLayer.ProductCollection();
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
