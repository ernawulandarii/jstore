
/**
 * Write a description of class Location here.
 *
 * @author Erna Wulandari
 * @version 28-03-2019
 */
import java.util.ArrayList;
import java.util.*;

public class DatabaseSupplier
{
    // instance variables - replace the example below with your own
    private static ArrayList<Supplier> SUPPLIER_DATABASE = new ArrayList<Supplier>();
    private static int LAST_SUPPLIER_ID = 0;

    /**
     * Constructor for objects of class DatabaseSupplier
     */
    public DatabaseSupplier()
    {

    }

    public static ArrayList<Supplier> getSupplierDatabase()
    {
        return SUPPLIER_DATABASE;
    }
    public static int getLastSupplierID()
    {
        return LAST_SUPPLIER_ID;
    }

    public static boolean addSupplier(Supplier supplier) throws SupplierAlreadyExistsException
    {
        for(Supplier temp : SUPPLIER_DATABASE)
        {
            if(((temp.getEmail() == supplier.getEmail()) &&
                    (temp.getPhoneNumber() == supplier.getPhoneNumber())))
            {
                throw new SupplierAlreadyExistsException(supplier);
            }
        }
        SUPPLIER_DATABASE.add(supplier);
        LAST_SUPPLIER_ID++;
        return true;
    }

    public static Supplier getSupplier(int id)
    {
        for(Supplier temp : SUPPLIER_DATABASE)
        {
            if(temp.getId() == id)
            {
                return temp;
            }
        }
        return null;
    }
    public static boolean removeSupplier(int id)throws SupplierNotFoundException, ItemNotFoundException
    {
        for(Supplier temp : SUPPLIER_DATABASE)
        {
            if(temp.getId() == id)
            {
                ArrayList<Item> list = DatabaseItem.getItemFromSupplier(temp);
                for(Item temp1 : list)
                {
                    DatabaseItem.removeItem(temp.getId());
                }
                SUPPLIER_DATABASE.remove(temp);
                return true;
            }
        }
        throw new SupplierNotFoundException(id);
    }
}