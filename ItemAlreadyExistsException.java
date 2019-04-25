package jstore;
import java.lang.Exception;

public class ItemAlreadyExistsException extends Exception {
    private Item item_error;

    public ItemAlreadyExistsException(Item item_Input) {
        super("Item Name: ");
        this.item_error = item_Input;
    }

    public String getExMessage()
    {
        System.out.println("\n====Item Already Exists Exception====");
        return super.getMessage() + item_error.getName() + " ,Category: " + item_error.getCategory() +
                " ,Status: " + item_error.getStatus() + " from: " +
                item_error.getSupplier().getName()
                + " already exists.";
    }
}
