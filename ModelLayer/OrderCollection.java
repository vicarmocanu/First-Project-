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

    public OrderCollection()
    {
        listOfOrders=new ArrayList();
    }

    public void createOrder(String id, int total)
    {
        Order order=new Order(id, total);
        listOfOrders.add(order);
    }

    public void searchOrder(String id)
    {
        ArrayList<Order> select=new ArrayList();

        if(listOfOrders.size()!=0)
        {
            for(Order i : listOfOrders)
            {
                if(i.id.equals(id))
                {
                    i.print();
                    System.out.println("                 ");
                }
            }
        }
        else System.out.println("The list is empty!");
    }

    public void listOrders(String id)
    {
        ArrayList<Order> select=new ArrayList();

        if(listOfOrders.size()!=0)
        {
            for(Order i: listOfOrders)
            {
                i.print();
                System.out.println("                ");
            }
        }
        else System.out.println("The list is empty!");
    }
}

