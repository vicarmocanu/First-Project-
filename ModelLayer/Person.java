package ModelLayer;
import java.util.Iterator;
import java.util.ArrayList;

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Person
{
private String id;
private String name;
private String address;
private String phoneNumber;

public Person(String name, String id, String address, String phoneNumber)
{
    this.id =id;
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
}

public void setId(String id)
    {
        this.id = id;
    }
    
public String getId()
    {
        return id;
    }
    
public void setName(String name)
    {
        this.name = name;
    }
    
public String getName()
    {
        return name;
    } 
    
public void setAddress(String address)
    {
        this.address = address;
    }
    
public String getAddress()
    {
        return address;
    }
 
public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber= phoneNumber;
    }
    
public String getPhoneNumber()
    {
        return phoneNumber;
    }
    
public void printAll()
    {
        System.out.println("id is:"+ id);
        System.out.println("name is:"+ name);
        System.out.println("address is:"+ address);
        System.out.println("phoneNumber is:"+ phoneNumber);
    }

public void deletePerson(String name)          
    {
    
    }
}