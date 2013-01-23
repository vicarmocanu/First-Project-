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

    public void listAllCustomers()
    {
        customer.listAllCustomers();
    }
    
    public void listAllCustomersWithStatistics()
    {
        customer.listAllCustomersWithStatistics();
    }
    
    public boolean listCustomerByName(String name)
    {
        return customer.listCustomerByName(name);
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

    public void listAllEmployees()
    {
        employee.listAllEmployees();
    }
    
    public void listAllEmployeesWithStatistics()
    {
        employee.listAllEmployeesWithStatistics();
    }
    
    public boolean listEmployeeByName(String name)
    {
        return employee.listEmployeeByName(name);
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

    public void listAllContractors()
    {
        contractor.listAllContractors();
    }
    public boolean listContractorByName(String name)
    {
        return contractor.listContractorByName(name);
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
