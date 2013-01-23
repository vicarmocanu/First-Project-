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
    
    public void createOrder(String id,String customerName, String employeeName)
    {
        order.createOrder(id,customerName,employeeName);
    }
    
    public void searchOrder(String id)
    {
        order.searchOrder(id);
    }
    
    public void orderDetails(String id)
    {
        order.orderDetails(id);
    }
    
    public void listOrders()
    {
        order.listOrders();
    }
        
    public void addSubOrderToOrder(String id, int amount, String name)
    {
        order.addSubOrderToOrder(id, amount, name);
    }
    
    public void calculateTotalForOrder(String id)
    {
        order.calculateTotalForOrder(id);
    }
    
    
    
}
