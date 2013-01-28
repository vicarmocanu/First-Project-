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
    Order order;
    private static OrderCollection instance=null;

    private OrderCollection()
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

    public void createOrder(String id,String customerName,String employeeName)
    {
        Order order=new Order(id,customerName,employeeName);
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

    public String listOrders()
    {
//        if(listOfOrders.size()!=0)
//        {
//            for(Order i: listOfOrders)
//            {
//                i.print();
//                System.out.println("*************************");
//            }
//        }
//        else System.out.println("The list is empty!");
    	
    	String text;
    	text = "";
    	if (listOfOrders.size()!=0)
        {
            for(Order i : listOfOrders)
            {
                text += i.print() + "\n";

            }
        }
        else text = "No orders registered in the system";
    	return text;
    }
    
   
}

