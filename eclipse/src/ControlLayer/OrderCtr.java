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
    
    public String searchOrder(String id)
    {
        return order.searchOrder(id);
    }
    
    public String orderDetails(String id)
    {
        return order.orderDetails(id);
    }
    
    public String listOrders()
    {
        return order.listOrders();
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
