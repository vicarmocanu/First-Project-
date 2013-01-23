package UI;
import ControlLayer.SaleCtr;
import java.util.Scanner;
public class SaleControllMenu
{
    SaleCtr controller;
    public SaleControllMenu()
    {
        controller = new SaleCtr();
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

                case "0":
                {
                    exit = true;
                    return;
                }
            }
        }
    }

    private String textSaleControllMenu()
    { 
        // creates a keyboard object to read input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Employee Controll Menu ***");
        System.out.println(" [1] Start Scanning Products");
        System.out.println("");
        System.out.println(" [0] Back to Employee Menu");
        System.out.print("\n Choice: ");
        String choice = keyboard.nextLine();
        while (!choice.equals("1") && !choice.equals("0"))
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
        
        controller.createSale(id, cname, ename);
        String another = "1";
        while (another.equals("1"))
        {
            System.out.print(" Nr. of Products   : ");
            String qtty = keyboard.nextLine();

            while (qtty.equals(""))
            {
                System.out.println("Empty fields are not allowed");
                System.out.print(" Nr. of Products   : ");
                qtty = keyboard.nextLine();
            }
            System.out.print(" SCANN PRODUCT CODE: ");
            String barCode = keyboard.nextLine();

            while (barCode.equals(""))
            {
                System.out.println("Empty fields are not allowed");
                System.out.print(" SCANN PRODUCT CODE: ");
                barCode = keyboard.nextLine();
            }
            controller.addSubSaleToSale(id, Integer.parseInt(qtty), barCode);
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
                controller.calculateTotalForSale(id);
                controller.searchSale(id);
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
