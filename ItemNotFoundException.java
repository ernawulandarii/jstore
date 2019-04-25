package jstore;
public class ItemNotFoundException extends Exception
{
    private int item_error;

    public ItemNotFoundException(int item_input)
    {
        super("Item ID: ");
        this.item_error = item_input;
    }

    public String getExMessage()
    {
        System.out.println("\n====Item Not Found Exception====");
        return super.getMessage() + item_error + " not found.";
    }
}
