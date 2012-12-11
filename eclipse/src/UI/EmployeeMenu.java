package UI;
import java.util.Scanner;
/**
 * This is the Manager menu of the program.
 * 
 * @author (Group3) 
 * @version (0.1)
 */
public class EmployeeMenu
{
    CustomerControllMenu customerControllMenu;
    SaleControllMenu saleControllMenu;
    String error = "";
    public EmployeeMenu()
    {
        startMenu();
    }
    // Here are the 4 options that you have 
    public void startMenu()
    {
        boolean exit=false;

        while (!exit) //! means while exit not is true (that is: false)
        {

            int choice = textEmployeeMenu();
            switch (choice)
            {
                case 1:
                {
                    customerControllMenu = new CustomerControllMenu();
                    break;
                }
                
                case 2:
                {
                    saleControllMenu = new SaleControllMenu();
                    break;
                }
                case 0:
                {
                    exit = true;
                    return;
                }
            }

        }
    }
    // Here it display the option that you have

    private int textEmployeeMenu()
    { 
        // creates a keyboard object to read input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Employee Menu ***");
        System.out.println(" [1] Customer Control Menu");
        System.out.println(" [2] Sales Control Menu");
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
