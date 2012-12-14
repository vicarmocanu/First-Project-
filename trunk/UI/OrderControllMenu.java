package UI;
import ControlLayer.OrderCtr;
import java.util.Scanner;

public class OrderControllMenu
{OrderCtr controller;
    public OrderControllMenu()
    {
        controller = new OrderCtr();
        startMenu();
    }

    public void startMenu()
    {
        boolean exit=false;
        while (!exit) //! means while exit not is true (that is: false)
        {
            // var choice it's that number that you selected
            String choice = textSaleControllMenu();
            switch (choice)
            {
                case "1":
                {
                    startScan();
                    break;
                }
                case "2":
                {
                    listAllOrders();
                    break;
                }
                case "3":
                {
                    searchOrder();
                    break;
                }
                case "0":
                {
                    exit = true;
                    return;
                }
            }
        }
    }

    private void searchOrder()
    {
        String choice = "1";
        while (choice.equals("1"))
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("\f *** Find Order ***");
            System.out.print("Search ID: ");
            String id = keyboard.nextLine();
            controller.searchOrder(id);
            System.out.println("\n [1] Search another");
            System.out.println(" [0] Return to Employee menu");
            System.out.print("Choice: ");
            choice = keyboard.nextLine();
            while (!choice.equals("1") && !choice.equals("0")) 
            {
                System.out.println(" !!! No such choice available !!!");
                System.out.println(" [1] Search another");
                System.out.println(" [0] Return to Employee menu");
                System.out.print("Choice: ");
                choice = keyboard.nextLine();
            }
        }
    }

    private void listAllOrders()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** List Orders ***");
        controller.listOrders();
        System.out.println(" [0] Return to Employee Menu");    
        System.out.print("\n Choice: ");
        String choice = keyboard.nextLine();
        while (!choice.equals("0"))
        {
            System.out.println(" !!! No such choice available !!! ");
            System.out.print(" Choice: ");
            choice = keyboard.nextLine();
        }
        return;
    }

    private String textSaleControllMenu()
    { 
        // creates a keyboard object to read input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Order Controll Menu ***");
        System.out.println(" [1] Start Scanning Products");
        System.out.println(" [2] List All Orders");
        System.out.println(" [3] Search Order");
        System.out.println("");
        System.out.println(" [0] Back to Employee Menu");
        System.out.print("\n Choice: ");
        String choice = keyboard.nextLine();
        while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3") && !choice.equals("0"))
        {
            System.out.println(" !!! No such choice available !!! ");
            System.out.print(" Choice: ");
            choice = keyboard.nextLine();

        }
        // Return the choice
        return choice;
    }

    private void startScan()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Scanning Process ***");
        System.out.print(" ID: ");
        String id = keyboard.nextLine();
        while (id.equals(""))
        {
            System.out.println("Empty fields are not allowed");
            System.out.print(" ID           : ");
            id = keyboard.nextLine();
        }
        System.out.print(" Customer Name: ");
        String cname= keyboard.nextLine();
        while (cname.equals(""))
        {
            System.out.println("Empty fields are not allowed");
            System.out.print(" Customer Name: ");
            cname = keyboard.nextLine();
        }
        System.out.print(" Employee Name: ");
        String ename= keyboard.nextLine();
        while (ename.equals(""))
        {
            System.out.println("Empty fields are not allowed");
            System.out.print(" Employee Name: ");
            cname = keyboard.nextLine();
        }

        controller.createOrder(id, cname, ename);
        String another = "1";
        while (another.equals("1"))
        {

            System.out.print(" PRODUCT NAME: ");
            String name = keyboard.nextLine();

            while (name.equals(""))
            {
                System.out.println("Empty fields are not allowed");
                System.out.print(" PRODUCT NAME: ");
                name = keyboard.nextLine();
            }
            System.out.print(" Nr. of Products   : ");
            String qtty = keyboard.nextLine();

            while (qtty.equals(""))
            {
                System.out.println("Empty fields are not allowed");
                System.out.print(" Nr. of Products   : ");
                qtty = keyboard.nextLine();
            }
            controller.addSubOrderToOrder(id, Integer.parseInt(qtty), name);
            System.out.println(" [1] New Product " + "\n [2] Print Total");
            System.out.print(" Choice: ");
            String choice = keyboard.nextLine();
            while (!choice.equals("1") && !choice.equals("2"))
            {
                System.out.println(" !!! No such choice available !!! ");
                System.out.print(" Choice: ");
                choice = keyboard.nextLine();

            }

            if(choice.equals("2"))
            {
                controller.calculateTotalForOrder(id);
                controller.searchOrder(id);
                System.out.print("[0] Return");
                System.out.print(" Choice: ");
                String choice1 = keyboard.nextLine();
                while (!choice1.equals("0"))
                {
                    System.out.println(" !!! No such choice available !!! ");
                    System.out.print(" Choice: ");
                    choice1 = keyboard.nextLine();

                }
                if(choice1.equals("0")) return;
            }
            else if (choice.equals("1"))
            {
                another = "1";
            }
        }

    }
}
