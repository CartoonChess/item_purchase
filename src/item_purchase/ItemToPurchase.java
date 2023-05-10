package item_purchase;

public class ItemToPurchase {
    private String itemName;
    private String itemDescription;
    private double itemPrice;
    private int itemQuantity;

    public ItemToPurchase(String itemName, String itemDescription, double itemPrice, int itemQuantity) {
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    public ItemToPurchase(String itemName) {
        this(itemName, "none", 0, 0);
    }

    public ItemToPurchase(String itemName, String itemDescription) {
        this(itemName, itemDescription, 0, 0);
    }

    public void setDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getDescription() {
        return itemDescription;
    }

    public void printItemCost() {
        double subtotal = itemQuantity * itemPrice;
        // format to show prices to two decimal places
        System.out.println(itemName + ", " + itemQuantity + " @ $" + String.format("%.2f", itemPrice) + " = $" + String.format("%.2f", subtotal));
    }

    public void printItemDescription() {
        System.out.println(itemName + ": " + itemDescription);
    }
}