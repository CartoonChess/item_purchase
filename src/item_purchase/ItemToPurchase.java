package item_purchase;

public class ItemToPurchase {
    private String itemName;
    private String itemDescription;
    //double?
    private int itemPrice;
    private int itemQuantity;

    public ItemToPurchase(String itemName, String itemDescription, int itemPrice, int itemQuantity) {
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

    // static? doubtful
    public void setDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getDescription() {
        // this. ?
        return itemDescription;
    }

    public void printItemCost() {
        // name, quantity, price, subtotal
        // Bottled Water 10 @ $1 = $10
        // String.form("$.2f", num)
    }

    public void printItemDescription() {
        // name, description
        // Bottled Water: Deer Park, 12 oz.
    }
}