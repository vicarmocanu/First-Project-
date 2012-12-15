package UI;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import ControlLayer.ProductCtr;
/**
 * This is the Manager menu of the program.
 * 
 * @author (Group3) 
 * @version (0.1)
 */
public class ManagerMenu
{
    ContractorControllMenu contractorControllMenu;
    EmployeeControllMenu employeeControllMenu;
    DiscountControllMenu discountControllMenu;
    ProductCtr controller = new ProductCtr();
    String error = "";
    int login;
    ArrayList<ArrayList<String>> userpass;

    public ManagerMenu(ArrayList<ArrayList<String>> userpass)
    {
        this.userpass = userpass;
        login = 0;
        startMenu();
    }
    // Here are the 4 options that you have 
    public void startMenu()
    {
        boolean exit=false;

        while (!exit) //! means while exit not is true (that is: false)
        {
            // var choice it's that number that you selected

            if (login == 0 || login == 2){login = login();}

            if(login == 1)
            {
                int choice = textManagerMenu();
                switch (choice)
                {
                    case 1:
                    {
                        contractorControllMenu = new ContractorControllMenu();
                        break;
                    }

                    case 2:
                    {
                        employeeControllMenu = new EmployeeControllMenu();
                        break;
                    }
                    case 3:
                    {
                        discountControllMenu = new DiscountControllMenu();
                        break;
                    }
                    case 4:
                    {
                        setSalePriceForProducts();
                        break;
                    }
                    case 0:
                    {
                        exit = true;
                        return;
                    }
                }
            }
            if (login == 2) error = " !!! Wrong username and password !!! "; 
            if (login == 3) return;
            if (login == 4) error = " !!! No such choice available (pick 1 or 2) !!! ";
        }

    }

    private void setSalePriceForProducts()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Set Sale Price For Product ***");
        System.out.println(" ** List Of Products without sale price **");
        controller.listProductsWithoutSalePrice();
        System.out.print("\n NAME: ");
        String name = keyboard.nextLine();
        while (name.equals(""))
        {
            System.out.println("Empty fields are not allowed");
            System.out.print(" NAME          : ");
            name = keyboard.nextLine();
        }
        if(controller.searchProductAndPrint(name))
        {
            System.out.print("Are you sure you want to modify this Product? (y/n): ");
            String confirm = keyboard.nextLine();
            while (!confirm.toUpperCase().equals("Y") && !confirm.toUpperCase().equals("N"))
            {
                System.out.print("!!! No such choice available !!! " + "\nAre you sure you want to modify this Product? (y/n): ");
                confirm = keyboard.nextLine();
            }
            if(confirm.toUpperCase().equals("Y"))
            {
                System.out.print(" Sale Price: ");
                String sPrice = keyboard.nextLine();
                while (name.equals(""))
                {
                    System.out.println("Empty fields are not allowed");
                    System.out.print(" Sale Price          : ");
                    sPrice = keyboard.nextLine();
                }
                controller.updateProductSalePrice(name, Integer.parseInt(sPrice));
            }
        }

        System.out.println("[1] Try again" + "\n [0] Return to the Employee menu");
        System.out.print(" Choice: ");
        String choice = keyboard.nextLine();
        while(!choice.equals("1") && !choice.equals("0"))
        {
            System.out.println(" !!! No such choice available !!! " +"\n [1] Try again" + "\n [0] Return to the Manager menu");
            System.out.print(" Choice: ");
            choice = keyboard.nextLine();
        }
        if (choice.equals("1"))
        {
            setSalePriceForProducts();
            return;
        }

    }

    private boolean checkUsernameAndPassword(String u, String p)
    {
        int size = userpass.size();

        int i = 0;
        while(i<size)
        {
            ArrayList<String> test = userpass.get(i);
            String uu = test.get(0);
            String pp = test.get(1);
            if(uu.equals(u) && pp.equals(p))
            {
                return true;
            }
            i++;
        }
        return false;
    }
    // Here it display the option that you have
    private int login()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Login Menu ***");
        if (!error.equals(""))
        {
            System.out.println(error);
            error = "";
        }
        System.out.print("Username:");
        String username = keyboard.nextLine();
        System.out.print("Password:");
        String password = keyboard.nextLine();
        System.out.println(" [1] Login");
        System.out.println(" [2] Calcel");
        System.out.print("Choice: ");
        String choice = keyboard.nextLine();
        while (!choice.equals("1") && !choice.equals("2"))
        {
            System.out.println(" !!! No such choice available !!! ");
            System.out.print("Choice: ");
            choice = keyboard.nextLine();
        }

        switch (choice)
        {
            case "1":
            {
                if(checkUsernameAndPassword(username, password))
                    return 1;
                else
                    return 2;
            }
            case "2":
            {
                return 3;
            }
        }
        return 4;

    }

    private int textManagerMenu()
    { 
        // creates a keyboard object to read input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** ManagerMenu ***");
        System.out.println(" [1] Contractor Control Menu");
        System.out.println(" [2] Employee Control Menu");
        System.out.println(" [3] Discount Control Menu");
        System.out.println(" [4] Set Sale Price For Products");
        System.out.println("");
        System.out.println(" [0] Back to Main Menu");
        System.out.print("\n Make your choice: ");
        int choice = keyboard.nextInt();
        // Return the choice
        return choice;
    }
    // Print "bye bye" when you close the program
    private void end()
    {
        System.out.println("Bye bye");
    }
}
