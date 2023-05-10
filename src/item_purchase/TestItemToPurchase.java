package item_purchase;

import java.util.Scanner;;

public class TestItemToPurchase {
    public static void runTests() {
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

    public static void main(String[] args) {
        String name = "none";
        String description;
        double price;
        int quantity;
        ItemToPurchase item = new ItemToPurchase(name);

        // Scanner input = new Scanner(System.in);
        Scanner input = new Scanner(System.in).useDelimiter("\n");

        while (true) {
            System.out.println();
            System.out.println("OPTIONS");
            System.out.println("1. Run Tests");
            System.out.println("2. Create New Item (name only)");
            System.out.println("3. Create New Item (name and description)");
            System.out.println("4. Create New Item (name, description, price, and quantity)");
            System.out.println("5. Show Item Description");
            System.out.println("6. Change Item Description");
            System.out.println("7. Show Item Name and Description");
            System.out.println("8. Show Item Subtotal");
            System.out.println("9. Exit");
            System.out.println();
            
            
            System.out.print("Enter a number to choose an option: ");
            int option = input.nextInt();
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
                    System.out.print("Enter price: ");
                    price = input.nextDouble();
                    System.out.print("Enter quantity: ");
                    quantity = input.nextInt();
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