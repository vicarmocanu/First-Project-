package ModelLayer;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ProductCollectionForLeaseTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ProductCollectionForLeaseTest
{
    private ModelLayer.ProductCollectionForLease productC1;

    /**
     * Default constructor for test class ProductCollectionForLeaseTest
     */
    public ProductCollectionForLeaseTest()
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
        productC1 = new ModelLayer.ProductCollectionForLease();
        productC1.makeProductForLease("b1", "a", "a", "a", "Available", 5);
        productC1.makeProductForLease("b2", "b", "b", "b", "Unavailable", 10);
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
