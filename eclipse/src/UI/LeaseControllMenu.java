package UI;
import ControlLayer.ProductForLeaseCtr;
import ControlLayer.LeaseCtr;
import java.util.Scanner;

public class LeaseControllMenu
{
    ProductForLeaseCtr controller;
    LeaseCtr controller2;
    public LeaseControllMenu()
    {
        controller = new ProductForLeaseCtr();
        controller2 = new LeaseCtr();
        startMenu();
    }

    public void startMenu()
    {
        boolean exit=false;
        while (!exit) //! means while exit not is true (that is: false)
        {
            // var choice it's that number that you selected
            String choice = textProductControllMenu();
            switch (choice)
            {
                case "1":
                {
                    addProduct();
                    break;
                }
                case "2":
                {
                    changeStatus();
                    break;
                }
                case "3":
                {
                    makeLease();
                    break;
                }
                case "4":
                {
                    returnLeasedProduct();
                    break;
                }
                case "5":
                {
                    searchLease();
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

    private String textProductControllMenu()
    { 
        // creates a keyboard object to read input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Product FOR LEASE Controll Menu ***");
        System.out.println(" [1] Add");
        System.out.println(" [2] Change Status");
        System.out.println(" [3] Make Lease");
        System.out.println(" [4] Return Product");
        System.out.println(" [5] Search");

        System.out.println("");
        System.out.println(" [0] Back to Employee Menu");
        System.out.print("\n Choice: ");
        String choice = keyboard.nextLine();
        while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3") && !choice.equals("4") && !choice.equals("5") && !choice.equals("0"))
        {
            System.out.println(" !!! No such choice available !!! ");
            System.out.print(" Choice: ");
            choice = keyboard.nextLine();

        }
        // Return the choice
        return choice;
    }
    private void searchLease()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Search ***");
        System.out.print(" ID: ");
        String id = keyboard.nextLine();
        while (id.equals(""))
        {
            System.out.println("Empty fields are not allowed");
            System.out.print(" ID           : ");
            id = keyboard.nextLine();
        }
        controller2.searchLease(id);
        System.out.println(" [1] Search another " + "\n [2] Return to Employee menu");
        System.out.print(" Choice: ");
        String choice = keyboard.nextLine();
        while (!choice.equals("1") && !choice.equals("2"))
        {
            System.out.println(" !!! No such choice available !!! ");
            System.out.print(" Choice: ");
            choice = keyboard.nextLine();

        }

        if(choice.equals("0")) return;

        else if (choice.equals("1"))
        {
            searchLease();
            return;
        }
    }
    private void returnLeasedProduct()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Returning Process ***");
        System.out.print(" ID: ");
        String id = keyboard.nextLine();
        while (id.equals(""))
        {
            System.out.println("Empty fields are not allowed");
            System.out.print(" ID           : ");
            id = keyboard.nextLine();
        }
        System.out.print(" NAME: ");
        String name= keyboard.nextLine();
        while (name.equals(""))
        {
            System.out.println("Empty fields are not allowed");
            System.out.print(" NAME: ");
            name = keyboard.nextLine();
        }
        controller2.returnLeasedProduct(id, name);

        System.out.println(" [1] Return another product " + "\n [2] Return to Employee menu");
        System.out.print(" Choice: ");
        String choice = keyboard.nextLine();
        while (!choice.equals("1") && !choice.equals("2"))
        {
            System.out.println(" !!! No such choice available !!! ");
            System.out.print(" Choice: ");
            choice = keyboard.nextLine();

        }

        if(choice.equals("0")) return;

        else if (choice.equals("1"))
        {
            returnLeasedProduct();
            return;
        }
    }

    private void makeLease()
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

        controller2.makeLease(id, cname, ename);
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

            System.out.print(" How many Days?: ");
            String days = keyboard.nextLine();

            while (days.equals(""))
            {
                System.out.println("Empty fields are not allowed");
                System.out.print(" How many Days?: ");
                days = keyboard.nextLine();
            }

            controller2.addSubLeaseToLease(id, name, Integer.parseInt(days));
            System.out.println(" [1] New Lease " + "\n [2] Finish Lease");
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
                controller.changeProductForLeaseStatus(name);
                controller2.searchLease(id);
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

    private void changeStatus()
    {
        Scanner keyboard = new Scanner(System.in);
        boolean sure = false;
        String nname = "";
        while(!sure)
        {
            System.out.println("\f *** Change Status FOR LEASE Menu ***");
            System.out.print("Search Name: ");
            String name = keyboard.nextLine();

            while (name.equals(""))
            {
                System.out.println("No empty fields are allowed");
                System.out.print("Search Name: ");
                name= keyboard.nextLine();
            }
            if(controller.searchExistProduct(name))
            {
                System.out.print("Do you want to change status?(y/n): ");
                String ssure = keyboard.nextLine();
                while (!ssure.toUpperCase().equals("Y") && !ssure.toUpperCase().equals("N"))
                {
                    System.out.println("!!! No such choice available !!!");
                    System.out.print("Do you want to change status?(y/n): ");
                    ssure = keyboard.nextLine();
                }
                if(ssure.toUpperCase().equals("Y")) {sure = true; nname = name;}
                else {return;}
            }
        }
        controller.changeProductForLeaseStatus(nname);
        System.out.println(" [1] Try again ");
        System.out.println(" [0] Return to Employee menu");
        System.out.print(" Choice: ");
        String choice = keyboard.nextLine();
        while (!choice.equals("1") && !choice.equals("0") )
        {
            System.out.println("!!! No such choice available !!!");
            System.out.println(" [1] Try again ");
            System.out.println(" [0] Return to Employee menu");
            System.out.print(" Choice: ");
            choice = keyboard.nextLine();
        }
        if(choice.equals("1")) {changeStatus(); return;}
        return;

    }

    private void addProduct()
    {
        Scanner keyboard = new Scanner(System.in);
        boolean sure = false;
        String nname = "";
        System.out.println("\f *** Add Product FOR LEASE Menu ***");
        while(!sure)
        {
            //name
            System.out.print(" NAME           : ");
            String name = keyboard.nextLine();
            while (name.equals(""))
            {
                System.out.println("No empty fields are allowed");
                System.out.print(" NAME           : ");
                name= keyboard.nextLine();
            }

            System.out.print("Is this name correct?(y/n): ");
            String ssure = keyboard.nextLine();
            while (!ssure.toUpperCase().equals("Y") && !ssure.toUpperCase().equals("N"))
            {
                System.out.println("!!! No such choice available !!!");
                System.out.print("Is this name correct?(y/n): ");
                ssure = keyboard.nextLine();
            }
            if(ssure.toUpperCase().equals("Y")) {sure = true; nname = name;}
            else sure = false;
        }

        //bar code
        System.out.print(" SCANN BAR CODE : ");
        String barCode = keyboard.nextLine();
        while ( barCode.equals(""))
        {
            System.out.println("No empty fields are allowed");
            System.out.print(" SCANN BAR CODE : ");
            barCode = keyboard.nextLine();
        }
        //location
        System.out.print(" Location       : ");
        String location = keyboard.nextLine();
        while (location.equals(""))
        {
            System.out.println("No empty fields are allowed");
            System.out.print(" Location       : ");
            location = keyboard.nextLine();
        }
        //Description
        System.out.print(" Description    : ");
        String description = keyboard.nextLine();
        while (description.equals(""))
        {
            System.out.println("No empty fields are allowed");
            System.out.print(" Description    : ");
            description = keyboard.nextLine();
        }

        System.out.print(" Price/ day : ");
        String priceDay = keyboard.nextLine();
        while (priceDay.equals(""))
        {
            System.out.println("No empty fields are allowed");
            System.out.print(" Price/ day : ");
            priceDay = keyboard.nextLine();
        }
        String status = "Available";
        controller.makeProductForLease(barCode, location, nname, description, status, Integer.parseInt(priceDay));
        System.out.println("");
        System.out.println(" [1] Add Another");
        System.out.println(" [0] Return to Employee Menu");        
        System.out.print("\n Choice: ");
        String choice = keyboard.nextLine();
        while (!choice.equals("1") && !choice.equals("0"))
        {
            System.out.println(" !!! No such choice available !!! ");
            System.out.print(" Choice: ");
            choice = keyboard.nextLine();
        }
        if(choice.equals("1")) {addProduct();return;}
        else
        {return;}
    }

}
