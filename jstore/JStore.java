
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
    Location city = new Location("Bogor", "Jawa Barat", "Kabupaten");
    Supplier supplier = new Supplier(123, "Erna", "erna.wulandari@ui.ac.id", "0858-1234-5678", city);
    city.printData();
    supplier.printData();
    Transaction transaksi = new Transaction();
      transaksi.orderNewItem(supplier);
      transaksi.orderSecondItem(supplier);
      transaksi.orderRefurbishedItem(supplier);
      transaksi.sellItemPaid(DatabaseItem.getItem());
      transaksi.sellItemUnpaid(DatabaseItem.getItem());
      transaksi.sellItemInstallment(DatabaseItem.getItem());
    
    }

    /**
     * Constructor for objects of class JStore
     */
    public JStore()
    {
         
    }
    
   
    
   
}

   
