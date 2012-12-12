package ModelLayer;
import java.util.ArrayList;

/**
 * Write a description of class Sale here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sale
{
    String id;
    int total;
    String customerName;
    String employeeName;
    ArrayList<SubSale> listOfSubSales;
    EmployeeCollection employeeCollection=EmployeeCollection.getInstance();

    public Sale(String id, String customerName, String employeeName)
    {
        String test;
        listOfSubSales=new ArrayList();
        this.id=id;
        this.customerName=customerName;
        this.employeeName=employeeName;
    }

    public void setId(String id)
    {
        this.id=id;
    }

    public String getId()
    {
        return id;
    }

    public void print()
    {
        System.out.println("ID: " + id);
        for(SubSale i: listOfSubSales)
        {
            i.print();
        }
        
        System.out.println("Employee name: " + employeeName);
        System.out.println("Total: " + total);
    }

    public void makeSale(String id, int total)
    {
        this.id=id;
        this.total=total;
    }

    public void addSubSale(int amount, String barCode)
    {
        SubSale subSale=new SubSale(amount, barCode);
        subSale.subTotal(amount);
        listOfSubSales.add(subSale);
    }

    public void calculateTotal()
    {        
        for(SubSale i : listOfSubSales)
        {
            total=total+i.subTotal;
        }
        addTotalToEmployee(employeeName, total);
    }

    public void addTotalToEmployee(String employeeName, int total)
    {
        employeeCollection.updateEmployeeTotalFromSales(employeeName,total);
    }

    

}
