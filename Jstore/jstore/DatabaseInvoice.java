
/**
 * Write a description of class DatabaseInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseInvoice
{
    // instance variables - replace the example below with your own
    private Invoice[] listInvoice;
    private Invoice invoice;

    /**
     * Constructor for objects of class DatabaseInvoice
     */
    public DatabaseInvoice()
    {
        // initialise instance variables
    }

    /**
     * Method untuk menambahkan supplier kedalam list
     *
     * @return    false
     */
    public boolean addInvoice(Invoice invoice)
    {
        return false;
    }
    
    /**
     * Method untuk menghapus supplier dari list
     *
     */
    public void removeInvoice(Invoice invoice)
    {
        // put your code here
    }
    
    /**
     * Method untuk mengembalikan supplier
     *
     * @return    objek supplier
     */
    public Invoice getInvoice()
    {
        return invoice;
    }
    
    /**
     * Method untuk mengembalikan list supplier
     *
     * @return    list supplier
     */
    public Invoice[] getListInvoice()
    {
        return listInvoice;
    }
}
