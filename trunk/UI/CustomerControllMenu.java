package UI;
import ControlLayer.PersonCtr;
import java.util.Scanner;
/**
 * This is the main menu of the program.
 * 
 * @author (Group3) 
 * @version (0.1)
 */
public class CustomerControllMenu
{
    PersonCtr controller = new PersonCtr();
    // instance variables
    // The constructor initializez the variables and call the Menu
    public CustomerControllMenu()
    {
        startMenu();
    }
    // Here are the 4 options that you have 
    public void startMenu()
    {
        boolean exit=false;
        while (!exit) //! means while exit not is true (that is: false)
        {
            // var choice it's that number that you selected
            int choice = textMainMenu();
            switch (choice)
            {
                case 1:
                {
                    createCustomer();
                    break;
                }
                case 2:
                {
                    updateCustomer();
                    break;
                }
                case 3:
                {
                    deleteCustomer();
                    break;
                }
                case 4:
                {
                    listAllCustomers();
                    break;
                }
                case 5:
                {
                    findCustomerByName();
                    break;
                }
                case 0:
                {
                    exit = true;
                    return;
                }
            }
        }// end else
    }
    // Here it display the option that you have
    private int textMainMenu()
    { 
        // creates a keyboard object to read input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Customer Controll Menu ***");
        System.out.println(" [1] Create");
        System.out.println(" [2] Update");
        System.out.println(" [3] Delete");
        System.out.println(" [4] List All");
        System.out.println(" [5] Find Customer");
        System.out.println("");
        System.out.println(" [0] Back to Manager Menu");
        System.out.print("\n Make your choice: ");
        int choice = keyboard.nextInt();
        // Return the choice
        return choice;
    }
    
    private void findCustomerByName()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Find Customer ***");
        System.out.print("Search Name: ");
        String name = keyboard.nextLine();
        controller.listCustomerByName(name);
        System.out.println("\n Press ENTER to return to previous menu");
        String exit = keyboard.nextLine();
    }

    private void updateCustomer()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Update Customer Menu ***");
        System.out.print("Search Name: ");
        String name = keyboard.nextLine();
        if(controller.listCustomerByName(name))
        {
            System.out.println("What do you want to update: ");
            System.out.println(" [1] ID ");
            System.out.println(" [2] Address ");
            System.out.println(" [3] Phone Number ");
            System.out.print("\n Choice  : ");
            int choice = keyboard.nextInt();
            String change = "not a change";
            while (change.equals("not a change"))
            {
                System.out.print("Change With: ");
                change = keyboard.nextLine();
                if(change.equals("")) change = "not a change";
            }
            switch (choice)
            {
                case 1:
                {
                    controller.updateCustomerId(name, change);
                    break;
                }
                case 2:
                {
                    controller.updateCustomerAddress(name, change);
                    break;
                }
                case 3:
                {
                    controller.updateCustomerPhoneNumber(name, change);
                    break;
                }
            }

        }
        else
        {
            System.out.println("Press ENTER to try again" + "\nType exit to return to the Manager menu");
            String exit = keyboard.nextLine();
            if (!exit.toUpperCase().equals("EXIT")) updateCustomer();
            return;
        }

    }

    private void listAllCustomers()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Customer List ***");
        controller.listAllCustomers();
        System.out.println("\n Press ENTER to return to previous menu");
        String exit = keyboard.nextLine();

    }

    private void createCustomer()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Create Customer ***");
        System.out.print("Name     : ");
        String name = keyboard.nextLine();
        System.out.print("ID       : ");
        String id = keyboard.nextLine();
        System.out.print("Address  : ");
        String address = keyboard.nextLine();
        System.out.print("Tel nr   : ");
        String phone = keyboard.nextLine();
        if(name.equals("") || id.equals("") || address.equals("") || phone.equals(""))
        {
            System.out.println("One or more fields are EMPTY");
            System.out.println("Press ENTER to try again" + "\nType exit to return to the Manager menu");
            String exit = keyboard.nextLine();
            if (!exit.toUpperCase().equals("EXIT")) createCustomer();
            return;
        }
        controller.createCustomer(name, id, address, phone);
    }

    private void deleteCustomer()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Delete Customer Menu ***");
        System.out.print("Search Name: ");
        String confirm = "";
        String name = keyboard.nextLine();

        if(controller.listCustomerByName(name))
        {
            System.out.print("Are you sure you want to delete this Customer? (y/n): ");
            confirm = keyboard.nextLine();
        }
        else
        {
            System.out.println("Press ENTER to try again" + "\nType exit to return to the Manager menu");
            String exit = keyboard.nextLine();
            if (!exit.toUpperCase().equals("EXIT")) deleteCustomer();
            return;
        }
        if (confirm.toUpperCase().equals("Y")) 
        {
            controller.deleteCustomer(name);
        }
        System.out.println("Press ENTER to return to previous menu");
        String exit = keyboard.nextLine();
    }
    // Print "bye bye" when you close the program
    private void End()
    {
        System.out.println("Bye bye");
    }
}
