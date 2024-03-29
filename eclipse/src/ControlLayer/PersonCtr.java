package ControlLayer;
import ModelLayer.CustomerCollection;
import ModelLayer.ContractorCollection;
import ModelLayer.EmployeeCollection;

/**
 * Write a description of class PersonCtr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PersonCtr
{
    CustomerCollection customer;
    ContractorCollection contractor;
    EmployeeCollection employee;

    public PersonCtr()
    {
        customer=ModelLayer.CustomerCollection.getInstance(); 
        contractor=ModelLayer.ContractorCollection.getInstance();
        employee=ModelLayer.EmployeeCollection.getInstance();
    }

    // CUSTOMER section
    public void createCustomer(String name, String id, String address, String phoneNumber)
    {
        customer.createCustomer(name, id, address, phoneNumber);
    }

    public String listAllCustomers()
    {
        return customer.listAllCustomers();
    }
    
    
    public String listAllCustomersWithStatistics()
    {
        return customer.listAllCustomersWithStatistics();
    }
    
    public String listCustomersWithStatistics(String name)
    {
        return customer.listCustomersWithStatistics(name);
    }
    
    public boolean listCustomerByName(String name)
    {
        return customer.listCustomerByName(name);
    }
    public String listCustomerByNamePrint(String name)
    {
        return customer.listCustomerByNamePrint(name);
    }
        
    public void deleteCustomer(String name)
    {
        customer.deleteCustomer(name);
    }

    public void updateCustomerId(String name, String id)
    {
        customer.updateCustomerId(name,id);
    }

    public void updateCustomerAddress(String name, String address)
    {
        customer.updateCustomerAddress(name,address);
    }

    public void updateCustomerPhoneNumber(String name, String phoneNumber)
    {
        customer.updateCustomerPhoneNumber(name,phoneNumber);
    }
    
    public void setDiscountCategory(String name, int discountCategory)
    {
        customer.setDiscountCategory(name,discountCategory);
    }

    //EMPLOYEE section
    public void createEmployee(String name, String id, String address, String phoneNumber,String position, int salary)
    {
        employee.createEmployee(name,id,address,phoneNumber,position,salary);
    }

    public String listAllEmployees()
    {
        return employee.listAllEmployees();
    }
    
    public String listAllEmployeesWithStatistics()
    {
        return employee.listAllEmployeesWithStatistics();
    }
    
    public String listEmployeesWithStatistics(String name)
    {
        return employee.listEmployeesWithStatistics(name);
    }
    
    public boolean listEmployeeByName(String name)
    {
        return employee.listEmployeeByName(name);
    }
    public String listEmployeeByNamePrint(String name)
    {
        return employee.listEmployeeByNamePrint(name);
    }
    
    public void deleteEmployee(String name)  
    {
        employee.deleteEmployee(name);
    }

    public void updateEmployeeId(String name, String id)
    {
        employee.updateEmployeeId(name,id);
    }

    public void updateEmployeeAddress(String name, String address)
    {
        employee.updateEmployeeAddress(name,address);
    }

    public void updateEmployeePhoneNumber(String name, String phoneNumber)
    {
        employee.updateEmployeePhoneNumber(name,phoneNumber);
    }

    public void updateEmployeePosition(String name, String position)
    {
        employee.updateEmployeePosition(name,position);
    }

    public void updateEmployeeSalary(String name, int salary)
    {
        employee.updateEmployeeSalary(name,salary);
    }

    //CONTRACTORS section
    public void createContractor(String name, String id, String address, String phoneNumber)
    {
        contractor.createContractor(name,id,address,phoneNumber);
    }

    public String listAllContractors()
    {
        return contractor.listAllContractors();
    }
    public boolean listContractorByName(String name)
    {
        return contractor.listContractorByName(name);
    }
    public String listContractorByNamePrint(String name)
    {
        return contractor.listContractorByNamePrint(name);
    }
    public void deleteContractor(String name)
    {
        contractor.deleteContractor(name);
    }

    public void updateContractorId(String name, String id)
    {
        contractor.updateContractorId(name,id);
    }

    public void updateContractorPhoneNumber(String name, String phoneNumber)
    {
        contractor.updateContractorPhoneNumber(name,phoneNumber);
    }

    public void updateContractorAddress(String name, String address)
    {
        contractor.updateContractorAddress(name,address);
    }

    
}
