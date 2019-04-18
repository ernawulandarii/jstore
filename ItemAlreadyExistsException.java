public class ItemAlreadyExistsException extends Exception
{
    private Item item_error;

    public ItemAlreadyExistsException(Item item_Input)
    {
        super("Item Name: ");
        this.item_error = item_Input;
    }

    public String getExMessage()
    {
        return super.getMessage() + item_error.getName() + ", Category: " + item_error.getCategory()
                + " ,status: " + item_error.getStatus() + "from: " + item_error.getSupplier().getName() + "already exists.";
    }


}
