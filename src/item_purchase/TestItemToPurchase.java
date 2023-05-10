package item_purchase;

import java.util.Scanner;

public class TestItemToPurchase {
    private static Scanner input;

    private static void runTests() {
        ItemToPurchase[] items = {
            new ItemToPurchase("Item 1"),
            new ItemToPurchase("Item 2", "Old Description"),
            new ItemToPurchase("Bottled Water", "Deer Park, 12 oz.", 10, 1),
            new ItemToPurchase("Item 4", "Old Description", 1.09, 5)
        };

        for (ItemToPurchase item : items) {
            item.printItemDescription();
            System.out.println("Item description: " + item.getDescription());
            item.setDescription("New Description");
            item.printItemDescription();
            item.printItemCost();
            System.out.println();
        }
    }

    // Make sure the user enters an integer
    private static int getIntFromPrompt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String userInput = input.next();
    
            try {
                return Integer.parseInt(userInput);
            } catch (Exception err) {
                System.out.print("Make sure you enter a whole number. ");
            }   
        }
    }

    // Make sure the user enters a double
    private static double getDoubleFromPrompt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String userInput = input.next();
    
            try {
                return Double.parseDouble(userInput);
            } catch (Exception err) {
                System.out.print("Make sure you enter a number. ");
            }   
        }
    }

    public static void main(String[] args) {
        // Create a default object and let the user replace it at will
        String name = "none";
        String description;
        double price;
        int quantity;
        ItemToPurchase item = new ItemToPurchase(name);

        // The delimeter allows spaces in user input
        input = new Scanner(System.in).useDelimiter("\n");

        while (true) {
            System.out.println();
            System.out.println("OPTIONS");
            System.out.println("1. Run Tests");
            System.out.println("2. Create New Item (name only)");
            System.out.println("3. Create New Item (name and description)");
            System.out.println("4. Create New Item (name, description, price, and quantity)");
            System.out.println("5. Show Item Description"); // uses the getter
            System.out.println("6. Change Item Description");
            System.out.println("7. Show Item Name and Description");
            System.out.println("8. Show Item Subtotal");
            System.out.println("9. Exit");
            System.out.println();
            
            int option = getIntFromPrompt("Enter a number to choose an option: ");
            System.out.println();

            switch(option) {
                case 1:
                    runTests();
                    break;
                case 2:
                    System.out.print("Enter item name: ");
                    name = input.next();
                    item = new ItemToPurchase(name);
                    break;
                case 3:
                    System.out.print("Enter item name: ");
                    name = input.next();
                    System.out.print("Enter description: ");
                    description = input.next();
                    item = new ItemToPurchase(name, description);
                    break;
                case 4:
                    System.out.print("Enter item name: ");
                    name = input.next();
                    System.out.print("Enter description: ");
                    description = input.next();
                    price = getDoubleFromPrompt("Enter price: ");
                    quantity = getIntFromPrompt("Enter quantity: ");
                    item = new ItemToPurchase(name, description, price, quantity);
                    break;
                case 5:
                    System.out.println("Item description: " + item.getDescription());
                    break;
                case 6:
                    System.out.print("Enter description: ");
                    description = input.next();
                    item.setDescription(description);
                    break;
                case 7:
                    item.printItemDescription();
                    break;
                case 8:
                    item.printItemCost();
                    break;
                case 9:
                    System.out.println("Don't forget to paste the output in report.txt!");
                    System.out.print("(end of program)");
                    System.exit(0);
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        }
    }
}