
/**
 * Write a description of class JStore here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JStore
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
    Location location = new Location("Bogor", "Jawa Barat", "Kabupaten");
        Supplier supplier = new Supplier(1, "Bamb", "erna.wulandari@ui.ac.id", "0857-8212-3456", location);
        Item item = new Item(1, "Erna", 300, 100000, ItemCategory.Electronics, ItemStatus.New, supplier);
        DatabaseItem.addItem(item);
        Transaction.orderNewItem(item);
        Transaction.sellItemPaid(item);
        Transaction.sellItemUnpaid(item);
        Transaction.sellItemInstallment(item);
    }

    /**
     * Constructor for objects of class JStore
     */
    public JStore()
    {
         
    }
    
   
    
   
}

   
