
/**
 * Write a description of class Location here.
 *
 * @author Erna Wulandari
 * @version 28-03-2019
 */
import java.util.ArrayList;

public class DatabaseSupplier
{
    // instance variables - replace the example below with your own
    private static ArrayList<Supplier> SUPPLIER_DATABASE;
    private static int LAST_SUPPLIER_ID;

    /**
     * Constructor for objects of class DatabaseSupplier
     */
    
    public static ArrayList<Supplier> getSupplierDatabase()
    {
         return SUPPLIER_DATABASE;
    }
    
    public static int getLastSupplierID()
    {
        return LAST_SUPPLIER_ID;
    }
    
    public static boolean addSupplier(Supplier supplier)
    {
        boolean value=false;
        for(Supplier supplierDB : SUPPLIER_DATABASE)
        {
            if(supplier.getName()!=supplierDB.getName()&&supplier.getEmail()!=supplierDB.getEmail()&&supplier.getPhoneNumber()!=supplierDB.getPhoneNumber())
            {
            SUPPLIER_DATABASE.add(supplier);
            LAST_SUPPLIER_ID=supplier.getId();
            value=true;
            }
        }
        return value;
    }
    
    public Supplier getSupplier(int id)
    {
        Supplier value=null;
        for(Supplier supplierDB : SUPPLIER_DATABASE)
        {
            if(supplierDB.getId()==id)
            {
                value=supplierDB;
            }
        }
        return value;
    }
    
    public boolean removeSupplier(int id)
    {
        boolean value=false;
        for(Supplier supplierDB : SUPPLIER_DATABASE)
        {
            if(supplierDB.getId()==id)
            {
                DatabaseItem.getItemDatabase().removeAll(DatabaseItem.getItemFromSupplier(supplierDB));
                SUPPLIER_DATABASE.remove(id);
                value=true;
            }
        }
        return value;
    }
    
}
