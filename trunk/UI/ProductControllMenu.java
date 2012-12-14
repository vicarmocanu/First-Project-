package UI;
import ControlLayer.ProductCtr;
import java.util.Scanner;

import ModelLayer.Product;
public class ProductControllMenu
{
    ProductCtr controller;
    public ProductControllMenu()
    {
        controller = new ProductCtr();
        startMenu();
    }

    public void startMenu()
    {
        boolean exit=false;
        while (!exit) //! means while exit not is true (that is: false)
        {
            // var choice it's that number that you selected
            String choice = textProductControllMenu();
            switch (choice)
            {
                case "1":
                {
                    addProduct();
                    break;
                }
                case "2":
                {
                    updateProduct();
                    break;
                }
                case "3":
                {
                    deleteProduct();
                    break;
                }
                case "4":
                {
                    listAll();
                    break;
                }
                case "5":
                {
                    searchProduct();
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

    private String textProductControllMenu()
    { 
        // creates a keyboard object to read input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Product Controll Menu ***");
        System.out.println(" [1] Add");
        System.out.println(" [2] Update");
        System.out.println(" [3] Delete");
        System.out.println(" [4] List All");
        System.out.println(" [5] Search");

        System.out.println("");
        System.out.println(" [0] Back to Employee Menu");
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
    
    private void deleteProduct()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Delete Product Menu ***");
        System.out.print("Search Name: ");
        String confirm = "";
        String name = keyboard.nextLine();

        if(controller.searchProductAndPrint(name))
        {
            System.out.print("Are you sure you want to delete this Product? (y/n): ");
            confirm = keyboard.nextLine();
            while (!confirm.toUpperCase().equals("Y") && !confirm.toUpperCase().equals("N"))
            {
                System.out.print("!!! No such choice available !!! " + "\nAre you sure you want to delete this Customer? (y/n): ");
                confirm = keyboard.nextLine();
            }
        }
        else
        {
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
                deleteProduct();
                return;
            }

            return;

        }
        if (confirm.toUpperCase().equals("Y")) 
        {
            controller.deleteProduct(name);
        }
        if (confirm.toUpperCase().equals("N"))
        {
            System.out.println(" [1] Try again" + "\n [0] Return to the Employee menu");
            System.out.print(" Choice: ");
            String choice = keyboard.nextLine();
            while(!choice.equals("1") && !choice.equals("0"))
            {
                System.out.println(" !!! No such choice available !!! " +"\n [1] Try again" + "\n [0] Return to the Manager menu");
                System.out.print(" Choice: ");
                choice = keyboard.nextLine();
            }
            if(choice.equals("1")) {deleteProduct();return;}
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
        if(choice.equals("1")) {deleteProduct();return;}
        if(choice.equals("0")) return;
    }
    
    private void updateProduct()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Update Product Menu ***");
        System.out.print("Search Name: ");
        String name = keyboard.nextLine();
        
        if(controller.searchProductAndPrint(name))
        {
            
            System.out.println("What do you want to update: ");
            System.out.println(" [1] Bar Code");
            System.out.println(" [2] Buy Price ");
            System.out.println(" [3] Description ");
            System.out.println(" [4] Location");
            System.out.println(" [5] Max");
            System.out.println(" [6] Min");
            System.out.print("\n Choice  : ");
            String choice = keyboard.nextLine();
            while(!(choice.equals("1") || choice.equals("2") || choice.equals("3") || choice.equals("4")|| choice.equals("5")|| choice.equals("6")))
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
                    controller.updateProductBarCode(name, change);
                    break;
                }
                case "2":
                {
                    controller.updateProductBuyPrice(name, Integer.parseInt(change));
                    break;
                }
                case "3":
                {
                    controller.updateProductDescription(name, change);
                    break;
                }
                case "4":
                {
                    controller.updateProductLocation(name, change);
                    break;
                }
                case "5":
                {
                    controller.updateProductMax(name, Integer.parseInt(change));
                    break;
                }
                case "6":
                {
                    controller.updateProductMin(name, Integer.parseInt(change));
                    break;
                }
            }

        }
        else
        {
            System.out.println(" [1] Try again" + "\n [0] Return to the Employee menu");
            String exit = keyboard.nextLine();
            while (!(exit.equals("1") || exit.equals("0")))
            {
                System.out.println("!!! No such choice available !!!" + "\n [1] Try again" + "\n [0] Return to the Employee menu");
                exit = keyboard.nextLine();
            }
            if (exit.equals("1")) 
            {
                updateProduct();return;
            }
            if (exit.equals("0"))
            {
                return;
            }
        }

    }

    private void addProduct()
    {
        Scanner keyboard = new Scanner(System.in);
        boolean sure = false;
        String nname = "";
        System.out.println("\f *** Add Product Menu ***");
        while(!sure)
        {
            //name
            System.out.print(" NAME           : ");
            String name = keyboard.nextLine();
            while (name.equals(""))
            {
                System.out.println("No empty fields are allowed");
                System.out.print(" NAME           : ");
                name= keyboard.nextLine();
            }

            System.out.print("Is this name correct?(y/n): ");
            String ssure = keyboard.nextLine();
            while (!ssure.toUpperCase().equals("Y") && !ssure.toUpperCase().equals("N"))
            {
                System.out.println("!!! No such choice available !!!");
                System.out.print("Is this name correct?(y/n): ");
                ssure = keyboard.nextLine();
            }
            if(ssure.toUpperCase().equals("Y")) {sure = true; nname = name;}
            else sure = false;
        }

        //bar code
        System.out.print(" SCANN BAR CODE : ");
        String barCode = keyboard.nextLine();
        while ( barCode.equals(""))
        {
            System.out.println("No empty fields are allowed");
            System.out.print(" SCANN BAR CODE : ");
            barCode = keyboard.nextLine();
        }
        //location
        System.out.print(" Location       : ");
        String location = keyboard.nextLine();
        while (location.equals(""))
        {
            System.out.println("No empty fields are allowed");
            System.out.print(" Location       : ");
            location = keyboard.nextLine();
        }
        //Description
        System.out.print(" Description    : ");
        String description = keyboard.nextLine();
        while (description.equals(""))
        {
            System.out.println("No empty fields are allowed");
            System.out.print(" Description    : ");
            description = keyboard.nextLine();
        }
        //buy price
        System.out.print(" Buy Price      : ");
        String buyPrice = keyboard.nextLine();
        while (buyPrice.equals(""))
        {
            System.out.println("No empty fields are allowed");
            System.out.print(" Buy Price      : ");
            buyPrice = keyboard.nextLine();
        }
        //min
        System.out.print(" Min products   : ");
        String min = keyboard.nextLine();
        while (min.equals(""))
        {
            System.out.println("No empty fields are allowed");
            System.out.print(" Min Products   : ");
            min = keyboard.nextLine();
        }
        //max
        System.out.print(" Max products   : ");
        String max = keyboard.nextLine();
        while (max.equals(""))
        {
            System.out.println("No empty fields are allowed");
            System.out.print(" Max Products   : ");
            max = keyboard.nextLine();
        }
        //quantity
        System.out.print(" Nr of Products : ");
        String quantity = keyboard.nextLine();
        while (quantity.equals(""))
        {
            System.out.println("No empty fields are allowed");
            System.out.print(" Nr of Products : ");
            quantity = keyboard.nextLine();
        }
        controller.addProduct(barCode, location, nname,description, Integer.parseInt(buyPrice), 0, Integer.parseInt(min), Integer.parseInt(max), Integer.parseInt(quantity));
        System.out.println("");
        System.out.println(" [1] Add Another");
        System.out.println(" [0] Return to Employee Menu");        
        System.out.print("\n Choice: ");
        String choice = keyboard.nextLine();
        while (!choice.equals("1") && !choice.equals("0"))
        {
            System.out.println(" !!! No such choice available !!! ");
            System.out.print(" Choice: ");
            choice = keyboard.nextLine();
        }
        if(choice.equals("1")) {addProduct();return;}
        else
        {return;}
    }

    private void listAll()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Add Product Menu ***");
        controller.listAllProducts();
        System.out.println(" [0] Return to Employee Menu");    
        System.out.print("\n Choice: ");
        String choice = keyboard.nextLine();
        while (!choice.equals("0"))
        {
            System.out.println(" !!! No such choice available !!! ");
            System.out.print(" Choice: ");
            choice = keyboard.nextLine();
        }
        return;

    }

    private void searchProduct()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("\f *** Add Product Menu ***");
        System.out.println(" [1] Search By Name");  
        System.out.println(" [2] Search By ID");    
        System.out.print("\n Choice: ");
        String choice = keyboard.nextLine();

        while (!choice.equals("1") && !choice.equals("2"))
        {
            System.out.println(" !!! No such choice available !!! ");
            System.out.print(" Choice: ");
            choice = keyboard.nextLine();
        }
        switch (choice)
        {
            case "1":
            {
                System.out.print(" Search Name:");
                String search = keyboard.nextLine();
                controller.searchProductAndPrint(search);
                break;
            }

            case "2":
            {
                System.out.print(" Search ID:");
                String search = keyboard.nextLine();
                controller.searchProductByBarCodeAndPrint(search);
                break;
            }
        }

        System.out.println(" [1] Search Another");  
        System.out.println(" [0] Return to Employee Menu");    
        System.out.print("\n Choice: ");
        choice = keyboard.nextLine();
        while (!choice.equals("1") && !choice.equals("0"))
        {
            System.out.println(" !!! No such choice available !!! ");
            System.out.print(" Choice: ");
            choice = keyboard.nextLine();
        }
        if(choice.equals("1")) {searchProduct();return;}
        else
        {return;}
    }

}
