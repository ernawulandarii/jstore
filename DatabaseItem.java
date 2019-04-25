
/**
 * Write a description of class Location here.
 *
 * @author Erna Wulandari
 * @version 28-03-2019
 */
package jstore;
import java.util.ArrayList;
import java.util.*;

public class DatabaseItem
{
    // instance variables - replace the example below with your own
    private static ArrayList<Item> ITEM_DATABASE = new ArrayList<Item>();
    private static int LAST_ITEM_ID=0;
    

    /**
     * Constructor for objects of class DatabaseItem
     */
    public DatabaseItem()
    {

    }
    public static ArrayList<Item> getItemDatabase()
    {
        return ITEM_DATABASE;
    }
    
    public static int getLastItemID()
    {
        return LAST_ITEM_ID;
     }
        
    public static boolean addItem(Item item) throws ItemAlreadyExistsException
    {

        for(Item temp : ITEM_DATABASE)
        {
            if(temp.getName() == item.getName() &&
                    temp.getStatus() == item.getStatus()
                    && temp.getSupplier() == item.getSupplier() &&
                    temp.getCategory() == item.getCategory())
            {
                throw new ItemAlreadyExistsException(item);
            }
        }
        ITEM_DATABASE.add(item);
        LAST_ITEM_ID = item.getId();
        return true;
    }
    
    public static Item getItemFromID(int id)
    {
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getId()==id)
            {
                return itemDB;
            }
        }
        return null;
    }
    
    public static ArrayList<Item> getItemFromSupplier(Supplier supplier)
    {
        ArrayList<Item> list = new ArrayList<Item>();
        boolean value = false;
        for(Item itemDB : ITEM_DATABASE) 
        {
            if(itemDB.getSupplier() == supplier) 
            {
                list.add(itemDB);
                value = true;
            }
        }
        if(value)
        {
            return list;
        }
        else
        {
            return null;
        }
    }
    
    public ArrayList<Item> getItemFromCategory(ItemCategory category)
    {
        ArrayList<Item> list = new ArrayList<Item>();
        boolean value = false;
        for(Item itemDB : ITEM_DATABASE) 
        {
            if(itemDB.getCategory() == category) 
            {
                list.add(itemDB);
               value = true;
            }
        }
        if(value)
        {
            return list;
        }
        else
        {
            return null;
        }
    }
    
    public ArrayList<Item> getItemFromStatus(ItemStatus status)
    {
        ArrayList<Item> list = new ArrayList<Item>();
        boolean value = false;
        for(Item itemDB : ITEM_DATABASE) 
        {
            if(itemDB.getStatus() == status) 
            {
                list.add(itemDB);
                value = true;
            }
        }
        if(value)
        {
            return list;
        }
        else
        {
            return null;
        }
    }
    
    public static boolean removeItem(int id) throws ItemNotFoundException
    {
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getId()==id)
            {
                ITEM_DATABASE.remove(id);
                 return true;
            }
        }
        throw new ItemNotFoundException(id);
    }
    
}
