package ModelLayer;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class EmployeeCollectionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class EmployeeCollectionTest
{
    private ModelLayer.EmployeeCollection employee1;
    private ModelLayer.EmployeeCollection employee2;

    /**
     * Default constructor for test class EmployeeCollectionTest
     */
    public EmployeeCollectionTest()
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
        EmployeeCollection employee1;
        employee1 = EmployeeCollection.getInstance();
        employee1.listAllEmployees();
        employee1.createEmployee("laszlo", "id1", "ad1", "p1", "poz1", 10);
        employee1.createEmployee("razvan", "id2", "ad2", "p2", "pos2", 20);
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
