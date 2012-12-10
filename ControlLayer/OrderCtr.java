package ControlLayer;
import ModelLayer.OrderCollection;

/**
 * Write a description of class OrderCtr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OrderCtr
{
    OrderCollection order;
    
    public OrderCtr()
    {
        order=ModelLayer.OrderCollection.getInstance();
    }
    
    public void createOrder(String id)
    {
        order.createOrder(id);
    }
    
    public void searchOrder(String id)
    {
        order.searchOrder(id);
    }
    
    public void listOrders(String id)
    {
        order.listOrders(id);
    }
}
