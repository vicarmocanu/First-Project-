package UI;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * This is the Manager menu of the program.
 * 
 * @author (Group3) 
 * @version (0.1)
 */
public class ManagerMenu
{
    ContractorControllMenu contractorControllMenu;
    CustomerControllMenu customerControllMenu;
    EmployeeControllMenu employeeControllMenu;
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
