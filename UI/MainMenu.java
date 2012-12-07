package UI;
import java.util.Scanner;
/**
 * This is the main menu of the program.
 * 
 * @author (Group3) 
 * @version (0.1)
 */
public class MainMenu
{
    ManagerMenu managerMenu;
    public MainMenu()
    {
        startMainMenu();
    }
    // Here are the 4 options that you have 
    public void startMainMenu()
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
                    managerMenu = new ManagerMenu();
                    break;
                }
                case 2:
                {
                    
                    break;
                }
                case 3:
                {
                    exit = true;
                    end();
                    break;
                }
            }
        }// end else
    }
    // Here it display the option that you have
    private int textMainMenu()
    { 
        // creates a keyboard object to read input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** MainMenu ***");
        System.out.println(" [1] Manager Menu");
        System.out.println(" [2] Employee Menu");
        System.out.println("");
        System.out.println(" [3] Exit System");
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
