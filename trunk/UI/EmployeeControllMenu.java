package UI;
import ControlLayer.PersonCtr;
import java.util.Scanner;
/**
 * This is the main menu of the program.
 * 
 * @author (Group3) 
 * @version (0.1)
 */
public class EmployeeControllMenu
{
    PersonCtr controller = new PersonCtr();
    // instance variables
    // The constructor initializez the variables and call the Menu
    public EmployeeControllMenu()
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
                    createEmployee();
                    break;
                }
                case 2:
                {
                    updateEmployee();
                    break;
                }
                case 3:
                {
                    deleteEmployee();
                    break;
                }
                case 4:
                {
                    listAllEmployees();
                    break;
                }
                case 5:
                {
                    findEmployeeByName();
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
        System.out.println("\f *** Employee Controll Menu ***");
        System.out.println(" [1] Create");
        System.out.println(" [2] Update");
        System.out.println(" [3] Delete");
        System.out.println(" [4] List All");
        System.out.println(" [5] Find Employee");
        System.out.println("");
        System.out.println(" [0] Back to Manager Menu");
        System.out.print("\n Make your choice: ");
        int choice = keyboard.nextInt();
        // Return the choice
        return choice;
    }

    private void findEmployeeByName()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Find Employee ***");
        System.out.print("Search Name: ");
        String name = keyboard.nextLine();
        controller.listEmployeeByName(name);
        System.out.println("\n Press ENTER to return to previous menu");
        String exit = keyboard.nextLine();
    }

    private void updateEmployee()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Update Employee Menu ***");
        System.out.print("Search Name: ");
        String name = keyboard.nextLine();
        if(controller.listEmployeeByName(name))
        {
            System.out.println("What do you want to update: ");
            System.out.println(" [1] ID ");
            System.out.println(" [2] Address ");
            System.out.println(" [3] Phone Number ");
            System.out.println(" [4] Position ");
            System.out.println(" [5] Salary ");
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
                    controller.updateEmployeeId(name, change);
                    break;
                }
                case 2:
                {
                    controller.updateEmployeeAddress(name, change);
                    break;
                }
                case 3:
                {
                    controller.updateEmployeePhoneNumber(name, change);
                    break;
                }
                case 4:
                {
                    controller.updateEmployeePosition(name, change);
                    break;
                }
                case 5:
                {
                    boolean good = false;
                    while(!good)
                    {
                        try
                        {
                            controller.updateEmployeeSalary(name, Integer.parseInt(change));
                            good = true;
                        }
                        catch (java.lang.NumberFormatException e)
                        {
                            System.out.print("Not a good number format, input again:");
                            change = keyboard.nextLine();

                        }
                    }
                    break;
                }
            }

        }
        else
        {
            System.out.println("Press ENTER to try again" + "\nType exit to return to the Manager menu");
            String exit = keyboard.nextLine();
            if (!exit.toUpperCase().equals("EXIT")) updateEmployee();
            return;
        }

    }

    private void listAllEmployees()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Employee List ***");
        controller.listAllEmployees();
        System.out.println("\n Press ENTER to return to previous menu");
        String exit = keyboard.nextLine();

    }

    private void createEmployee()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Create Employee ***");
        System.out.print("Name     : ");
        String name = keyboard.nextLine();
        System.out.print("ID       : ");
        String id = keyboard.nextLine();
        System.out.print("Address  : ");
        String address = keyboard.nextLine();
        System.out.print("Tel nr   : ");
        String phone = keyboard.nextLine();
        System.out.print("Position : ");
        String position = keyboard.nextLine();
        System.out.print("Salary   : ");
        int salary = keyboard.nextInt();
        if(name.equals("") || id.equals("") || address.equals("") || phone.equals("") || position.equals("") || salary == 0)
        {
            System.out.println("One or more fields are EMPTY");
            System.out.println("Press ENTER to try again" + "\nType exit to return to the Manager menu");
            String exit = keyboard.nextLine();
            if (!exit.toUpperCase().equals("EXIT")) createEmployee();
            return;
        }
        controller.createEmployee(name, id, address, phone, position, salary);
    }

    private void deleteEmployee()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Delete Employee Menu ***");
        System.out.print("Search Name: ");
        String confirm = "";
        String name = keyboard.nextLine();

        if(controller.listEmployeeByName(name))
        {
            System.out.print("Are you sure you want to delete this Employee? (y/n): ");
            confirm = keyboard.nextLine();
        }
        else
        {
            System.out.println("Press ENTER to try again" + "\nType exit to return to the Manager menu");
            String exit = keyboard.nextLine();
            if (!exit.toUpperCase().equals("EXIT")) deleteEmployee();
            return;
        }
        if (confirm.toUpperCase().equals("Y")) 
        {
            controller.deleteEmployee(name);
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
