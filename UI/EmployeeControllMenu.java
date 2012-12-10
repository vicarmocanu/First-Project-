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
    String error;
    // instance variables
    // The constructor initializez the variables and call the Menu
    public EmployeeControllMenu()
    {
        error = "";
        startMenu();
    }
    // Here are the 4 options that you have 
    public void startMenu()
    {
        boolean exit=false;
        while (!exit) //! means while exit not is true (that is: false)
        {
            // var choice it's that number that you selected
            String choice = textMainMenu();
            switch (choice)
            {
                case "1":
                {
                    createEmployee();
                    break;
                }
                case "2":
                {
                    updateEmployee();
                    break;
                }
                case "3":
                {
                    deleteEmployee();
                    break;
                }
                case "4":
                {
                    listAllEmployees();
                    break;
                }
                case "5":
                {
                    findEmployeeByName();
                    break;
                }
                case "0":
                {
                    exit = true;
                    return;
                }
            }
        }// end else
    }
    // Here it display the option that you have
    private String textMainMenu()
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

    private void findEmployeeByName()
    {
        String choice = "1";
        while (choice.equals("1"))
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("\f *** Find Employee ***");
            System.out.print("Search Name: ");
            String name = keyboard.nextLine();
            controller.listEmployeeByName(name);
            System.out.println("\n [1] Search another");
            System.out.println(" [0] Return to Manager menu");
            System.out.print("Choice: ");
            choice = keyboard.nextLine();
            while (!choice.equals("1") && !choice.equals("0")) 
            {
                System.out.println(" !!! No such choice available !!!");
                System.out.println(" [1] Search another");
                System.out.println(" [0] Return to Manager menu");
                System.out.print("Choice: ");
                choice = keyboard.nextLine();
            }
        }
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
            String choice = keyboard.nextLine();
            while(!(choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4") || choice.equals("5")))
            {
                System.out.print(" !!! No such Choice available !!! ");
                System.out.print("\n Choice  : ");
                choice = keyboard.nextLine();
            }
            System.out.print("Change With: ");
            String change = keyboard.nextLine();
            while (change.equals(""))
            {
                System.out.println("Empty fields are not allowed");
                System.out.print("Change With: ");
                change = keyboard.nextLine();
            }
            switch (choice)
            {
                case "1":
                {
                    controller.updateEmployeeId(name, change);
                    break;
                }
                case "2":
                {
                    controller.updateEmployeeAddress(name, change);
                    break;
                }
                case "3":
                {
                    controller.updateEmployeePhoneNumber(name, change);
                    break;
                }
                case "4":
                {
                    controller.updateEmployeePosition(name, change);
                    break;
                }
                case "5":
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
            System.out.println(" [1] Try again" + "\n [0] Return to the Manager menu");
            String exit = keyboard.nextLine();
            while (!(exit.equals("1") || exit.equals("0")))
            {
                System.out.println("!!! No such choice available !!!" + "\n [1] Try again" + "\n [0] Return to the Manager menu");
                exit = keyboard.nextLine();
            }
            if (exit.equals("1")) 
            {
                updateEmployee();return;
            }
            if (exit.equals("0"))
            {
                return;
            }
        }

    }

    private void listAllEmployees()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Employee List ***");
        controller.listAllEmployees();
        System.out.println("\n [0] Return to previous menu");
        System.out.print("Choice: ");
        String choice = keyboard.nextLine();
        while (!choice.equals("0"))
        {
            System.out.println(" !!! No such choice available !!!");
            System.out.println("[0] Return to previous menu");
            System.out.print("Choice: ");
            choice = keyboard.nextLine();
        }

    }

    private void createEmployee()
    {
        String another = "1";

        while(another.equals("1"))
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("\f *** Create Employee ***");
            if (!error.equals(""))
            {
                System.out.println(error);
                error = "";
            }

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
            if(name.equals("") || id.equals("") || address.equals("") || phone.equals("") || position.equals(""))
            {
                System.out.println("One or more fields are EMPTY");
                System.out.println("Type [1] to try again" + "\nType [0] to return to the Manager menu");
                System.out.print(" Choice: ");
                String exit = keyboard.nextLine();
                if (exit.toUpperCase().equals("1")) {createEmployee(); return;}
                if (exit.toUpperCase().equals("0")) {return;}
                else
                {
                    error = " !!! No such choice available !!! ";
                }
                return;
            }
            
            controller.createEmployee(name, id, address, phone, position, salary);
            System.out.print(" [1] Add another Employee" + "\n [0] to return to the Manager menu");
            another = keyboard.nextLine();
            another = keyboard.nextLine();
            while (!(another.equals("1") || another.equals("0")))
            {
                System.out.print(" !!! No such choice available !!! " + "\n [1] Add another Employee" + "\n [0] to return to the Manager menu" + "\n Choice:");
                another = keyboard.nextLine();
            }
        }
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
            while (!confirm.toUpperCase().equals("Y") && !confirm.toUpperCase().equals("N"))
            {
                System.out.print("!!! No such choice available !!! " + "\nAre you sure you want to delete this Employee? (y/n): ");
                confirm = keyboard.nextLine();
            }
        }
        else
        {
            System.out.println("[1] Try again" + "\n [0] Return to the Manager menu");
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
                deleteEmployee();
                return;
            }

            return;

        }
        if (confirm.toUpperCase().equals("Y")) 
        {
            controller.deleteEmployee(name);
        }
        if (confirm.toUpperCase().equals("N"))
        {
            System.out.println(" [1] Try again" + "\n [0] Return to the Manager menu");
            System.out.print(" Choice: ");
            String choice = keyboard.nextLine();
            while(!choice.equals("1") && !choice.equals("0"))
            {
                System.out.println(" !!! No such choice available !!! " +"\n [1] Try again" + "\n [0] Return to the Manager menu");
                System.out.print(" Choice: ");
                choice = keyboard.nextLine();
            }
            if(choice.equals("1")) {deleteEmployee();return;}
            if(choice.equals("0")) return;
        }
        System.out.println(" [1] Try again" + "\n [0] Return to the Manager menu");
        System.out.print(" Choice: ");
        String choice = keyboard.nextLine();
        while(!choice.equals("1") && !choice.equals("0"))
        {
            System.out.println(" !!! No such choice available !!! " +"\n [1] Try again" + "\n [0] Return to the Manager menu");
            System.out.print(" Choice: ");
            choice = keyboard.nextLine();
        }
        if(choice.equals("1")) {deleteEmployee();return;}
        if(choice.equals("0")) return;
    }
    // Print "bye bye" when you close the program
    private void End()
    {
        System.out.println("Bye bye");
    }
}
