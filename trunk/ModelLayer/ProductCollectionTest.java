package ModelLayer;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ProductCollectionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ProductCollectionTest
{
    private ModelLayer.ProductCollection productC1;

    /**
     * Default constructor for test class ProductCollectionTest
     */
    public ProductCollectionTest()
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
        productC1 = new ModelLayer.ProductCollection();
        productC1.addProduct("barcode1", "location1", "name1", "description1", 125, 255, 2, 7, 5);
        productC1.addProduct("barcode2", "location2", "name2", "description2", 250, 500, 5, 15, 9);
        productC1.listAllProducts();
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
