package UI;
import java.util.Scanner;
import java.util.ArrayList;
/**
 * This is the main menu of the program.
 * 
 * @author (Group3) 
 * @version (0.1)
 */
public class MainMenu
{
    ManagerMenu managerMenu;
    EmployeeMenu employeeMenu;

    boolean newAcc;
    ArrayList<ArrayList<String>> userpass;
    int login = 0;
    String error = "";
    public MainMenu()
    {
        newAcc = false;

        userpass = new ArrayList<ArrayList<String>>();
        startMainMenu();
    }
    
//    public static void main(String[] args)
//    {
//        new MainMenu();
//    }
    // Here are the 4 options that you have 
    public void startMainMenu()
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
                    managerMenu = new ManagerMenu(userpass);
                    break;
                }
                case "2":
                {
                    employeeMenu = new EmployeeMenu();
                    break;
                }
                case "3":
                {
                    newAcc = true;

                    createManager();
                    newAcc = false;
                    break;
                }
                case "0":
                {
                    exit = true;
                    end();
                    break;
                }
            }
        }// end else
    }
    // Here it display the option that you have
    private String textMainMenu()
    { 
        // creates a keyboard object to read input
        Scanner keyboard = new Scanner(System.in);
        createManager();
        System.out.println("\f *** MainMenu ***");

        System.out.println(" [1] Manager Menu");
        System.out.println(" [2] Employee Menu");
        System.out.println("");
        System.out.println(" [3] Add New Manager (needs manager account)");
        System.out.println("");
        System.out.println(" [0] Exit System");
        System.out.print("\nChoice: ");
        String choice = keyboard.nextLine();
        while(!choice.equals("0") && !choice.equals("1") && !choice.equals("2") && !choice.equals("3"))
        {
            System.out.println("\b !!! No such choice available !!! ");
            System.out.print("Choice: ");
            choice = keyboard.nextLine();
        }
        // Return the choice
        return choice;
    }
    // Print "bye bye" when you close the program
    private void end()
    {
        System.out.println("Bye bye");
    }

    public void createManager()
    {
        Scanner keyboard = new Scanner(System.in);

        while(userpass.size() == 0 || newAcc)
        {
            if (newAcc)login();
            if ((login == 1 || userpass.size() == 0) && login != 2 )
            {
                
                int size = userpass.size();

                System.out.println("\f !!! CREATE MANAGER PROCESS STARTED !!! ");

                ArrayList<String> userandpass = new ArrayList<String>();
                System.out.print(" USERNAME : ");
                String username = keyboard.nextLine();
                while (username.equals("") || username.contains(" "))
                {
                    System.out.println("Wrong combination of characters (no spaces allowed no empty field)");
                    System.out.println(" USERNAME : ");
                    username = keyboard.nextLine();
                }
                System.out.print(" PASSWORD : ");
                String password = keyboard.nextLine();
                while (password.equals(""))
                {
                    System.out.println("Password can't be empty");
                    System.out.println(" PASSWORD : ");
                    password = keyboard.nextLine();
                }
                userandpass.add(username);
                userandpass.add(password);
                userpass.add(size, userandpass);
            }
            newAcc = false;
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

    private void login()
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
                {
                    login = 1;
                    break;
                }
                else
                {
                    error = " !!! Wrong username and password !!! ";
                    login();
                    break;
                }
            }
            case "2":
            {
                login = 2;
                break;
            }
        }

    }
}
