package UI;
import ControlLayer.CategoryCtr;
import java.util.Scanner;
public class DiscountControllMenu
{
    CategoryCtr controller;
    public DiscountControllMenu()
    {
        controller = new CategoryCtr();
        startMenu();
    }

    public void startMenu()
    {
        boolean exit=false;
        while (!exit) //! means while exit not is true (that is: false)
        {
            // var choice it's that number that you selected
            String choice = textSaleControllMenu();
            switch (choice)
            {
                case "1":
                {
                    addNewCategory();
                    break;
                }
                case "2":
                {
                    deleteCategory();
                    break;
                }
                case "3":
                {
                    updateDiscount();
                    break;
                }
                case "4":
                {
                    listAll();
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

    private void updateDiscount()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Update Discount Process ***");
        System.out.print(" Category Number: ");
        String category = keyboard.nextLine();
        while (category.equals(""))
        {
            System.out.println("Empty fields are not allowed");
            System.out.print(" Category Number           : ");
            category = keyboard.nextLine();
        }
        System.out.print(" Discount Ammount: ");
        String discount= keyboard.nextLine();
        while (discount.equals(""))
        {
            System.out.println("Empty fields are not allowed");
            System.out.print(" Discount Ammount: ");
            discount = keyboard.nextLine();
        }
        controller.updateDiscount(Integer.parseInt(category), Integer.parseInt(discount));

        System.out.println(" [1] New Update " + "\n [0] Return to Manager Menu");
        System.out.print(" Choice: ");
        String choice = keyboard.nextLine();
        while (!choice.equals("1") && !choice.equals("0"))
        {
            System.out.println(" !!! No such choice available !!! ");
            System.out.print(" Choice: ");
            choice = keyboard.nextLine();

        }
        if(choice.equals("1"))
        {
            updateDiscount();
            return;
        }
        return;

    }

    private void listAll()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Listing All Cateories ***");
        controller.listAllCategories();
        System.out.println(" [0] Return to Manager Menu");
        System.out.print(" Choice: ");
        String choice = keyboard.nextLine();
        while (!choice.equals("0"))
        {
            System.out.println(" !!! No such choice available !!! ");
            System.out.print(" Choice: ");
            choice = keyboard.nextLine();

        }
        return;
    }

    private void deleteCategory()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Delete Category Process ***");
        System.out.print(" Category Number: ");
        String category = keyboard.nextLine();
        while (category.equals(""))
        {
            System.out.println("Empty fields are not allowed");
            System.out.print(" Category Number           : ");
            category = keyboard.nextLine();
        }
        controller.deleteCategory(Integer.parseInt(category));

        System.out.println(" [1] Delete another Category " + "\n [0] Return to Manager Menu");
        System.out.print(" Choice: ");
        String choice = keyboard.nextLine();
        while (!choice.equals("1") && !choice.equals("0"))
        {
            System.out.println(" !!! No such choice available !!! ");
            System.out.print(" Choice: ");
            choice = keyboard.nextLine();

        }
        if(choice.equals("1"))
        {
            deleteCategory();
            return;
        }
        return;
    }

    private void addNewCategory()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Create Category Process ***");
        System.out.print(" Category Number: ");
        String category = keyboard.nextLine();
        while (category.equals(""))
        {
            System.out.println("Empty fields are not allowed");
            System.out.print(" Category Number           : ");
            category = keyboard.nextLine();
        }
        System.out.print(" Discount Ammount: ");
        String discount= keyboard.nextLine();
        while (discount.equals(""))
        {
            System.out.println("Empty fields are not allowed");
            System.out.print(" Discount Ammount: ");
            discount = keyboard.nextLine();
        }
        controller.createCategory(Integer.parseInt(category), Integer.parseInt(discount));

        System.out.println(" [1] New Category " + "\n [0] Return to Manager Menu");
        System.out.print(" Choice: ");
        String choice = keyboard.nextLine();
        while (!choice.equals("1") && !choice.equals("0"))
        {
            System.out.println(" !!! No such choice available !!! ");
            System.out.print(" Choice: ");
            choice = keyboard.nextLine();

        }
        if(choice.equals("1"))
        {
            addNewCategory();
            return;
        }
        return;
    }

    private String textSaleControllMenu()
    { 
        // creates a keyboard object to read input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Employee Controll Menu ***");
        System.out.println(" [1] Add New Category");
        System.out.println(" [2] Delete Category");
        System.out.println(" [3] Update Category Discount");
        System.out.println(" [4] List all categorys");

        System.out.println("");
        System.out.println(" [0] Back to Employee Menu");
        System.out.print("\n Choice: ");
        String choice = keyboard.nextLine();
        while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3") && !choice.equals("4") && !choice.equals("0"))
        {
            System.out.println(" !!! No such choice available !!! ");
            System.out.print(" Choice: ");
            choice = keyboard.nextLine();

        }
        // Return the choice
        return choice;
    }

}
