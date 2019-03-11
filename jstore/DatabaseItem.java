
/**
 * Write a description of class Location here.
 *
 * @author Erna Wulandari
 * @version 28-03-2019
 */
public class DatabaseItem
{
    // instance variables - replace the example below with your own
    private String[] listItem;
    private Item item;
    

    /**
     * Constructor for objects of class DatabaseItem
     */
    public static boolean addItem(Item item)
    {
        return true;
    }

    public static boolean removeItem(Item item)
    {
        return true;
    }
    
    public Item getItem()
    {
        return item;
    }
    
    public String[] getItemDatabase()
    {
        return listItem;
    }
}
