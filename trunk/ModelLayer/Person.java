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
public String name;
private String address;
private String phoneNumber;
private ArrayList<Person> listOfPersons;

public Person(String name, String id, String address, String phoneNumber)
{
    this.id =id;
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
    listOfPersons= new ArrayList<>();
}

public void updatePersonId(String name, String id)
    {
        ArrayList<Person> select=new ArrayList<Person>();
        if(listOfPersons.size()!=0)
        {
            for(Person a: listOfPersons)
            {
                if(a.name.equals(name))
                {
                    select.add(a);
                    a.setId(id);
                    System.out.println("Update Successful!");
                }
            }
        }
        else System.out.println("No contractor registred with that name in the system");
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
    
public void print()
    {
        System.out.println("id :"+ id);
        System.out.println("name :"+ name);
        System.out.println("address :"+ address);
        System.out.println("phone number :"+ phoneNumber);
    }


}