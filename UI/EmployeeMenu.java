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
    ProductControllMenu productControllMenu;
    OrderControllMenu orderControllMenu;
    LeaseControllMenu leaseControllMenu;
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

            String choice = textEmployeeMenu();
            switch (choice)
            {
                case "1":
                {
                    customerControllMenu = new CustomerControllMenu();
                    break;
                }
                
                case "2":
                {
                    saleControllMenu = new SaleControllMenu();
                    break;
                }
                case "3":
                {
                    productControllMenu = new ProductControllMenu();
                    break;
                }
                case "4":
                {
                    orderControllMenu = new OrderControllMenu();
                    break;
                }
                case "5":
                {
                    leaseControllMenu = new LeaseControllMenu();
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
    // Here it display the option that you have

    private String textEmployeeMenu()
    { 
        // creates a keyboard object to read input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Employee Menu ***");
        System.out.println(" [1] Customer Control Menu");
        System.out.println(" [2] Sales Control Menu");
        System.out.println(" [3] Product Control Menu");
        System.out.println(" [4] Order Control Menu");
        System.out.println(" [5] Order Control Menu");
        System.out.println("");
        System.out.println(" [0] Back to Main Menu");
        System.out.print("\n Make your choice: ");
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
    // Print "bye bye" when you close the program
    private void end()
    {
        System.out.println("Bye bye");
    }
}
