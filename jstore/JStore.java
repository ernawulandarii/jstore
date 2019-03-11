
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
    Supplier suplier = new Supplier(123, "Erna", "erna.wulandari@ui.ac.id", "0858-1234-5678", city);
    Item item = new Item(1, "Saudy", 5, 50000, "Hijab", suplier);
    Invoice invoice = new Invoice(2, item, "6 Maret 2019", 50000);
    suplier.printData();
    suplier.setName("Khairi");
    suplier.printData();
    item.printData();
    
    }

    /**
     * Constructor for objects of class JStore
     */
    public JStore()
    {
         
    }
    
   
    
   
}

   
