
/**
 * Write a description of class Location here.
 *
 * @author Erna Wulandari
 * @version 28-03-2019
 */
public class DatabaseItem
{
    // instance variables - replace the example below with your own
    private Item[] listItem;
    private static Item itemDB;
    

    /**
     * Constructor for objects of class DatabaseItem
     */
    public static boolean addItem(Item item)
    {
        itemDB = item;
        return true;
    }

    public static boolean removeItem(Item item)
    {
        return true;
    }
    
    public static Item getItem()
    {
        return itemDB;
    }
    
    public Item[] getItemDatabase()
    {
        return listItem;
    }
}
