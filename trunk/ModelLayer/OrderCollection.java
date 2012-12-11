package ModelLayer;
import java.util.ArrayList;
/**
 * Write a description of class OrderCollection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OrderCollection
{

    ArrayList<Order> listOfOrders;

    private static OrderCollection instance=null;

    public OrderCollection()
    {
        listOfOrders=new ArrayList();
    }

    public static OrderCollection getInstance()       //singleton of the class;
    { 
        if(instance==null)
        {
            instance=new OrderCollection();

        }

        return instance;
    }

    public void createOrder(String id)
    {
        Order order=new Order(id);
        listOfOrders.add(order);
    }

    public void addSubOrderToOrder(String id, int amount, String name)
    {        
        for(Order i: listOfOrders)
        {
            if(i.id.equals(id))
            {
                i.addSubOrder(amount, name);
            }
        }
    }

    public void calculateTotalForOrder(String id)
    {
        for(Order i: listOfOrders)
        {
            if(i.id.equals(id))
            {
                i.calculateTotal();
            }
        }
    }

    public void searchOrder(String id)
    {
        if(listOfOrders.size()!=0)
        {
            for(Order i : listOfOrders)
            {
                if(i.id.equals(id))
                {
                    i.print();
                    System.out.println("***************");
                }
            }
        }
        else System.out.println("The list is empty!");
    }

    public void orderDetails(String id)
    {
        if(listOfOrders.size()!=0)
        {
            for(Order i: listOfOrders)
            {
                if(i.id.equals(id))
                {
                    i.print();
                    System.out.println("***************");
                }
            }
        }
        else System.out.println("The list is empty!");
    }

    public void listOrders()
    {
        if(listOfOrders.size()!=0)
        {
            for(Order i: listOfOrders)
            {
                i.print();
                System.out.println("*************************");
            }
        }
        else System.out.println("The list is empty!");
    }
}

