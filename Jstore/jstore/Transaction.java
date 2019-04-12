
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Transaction
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class Transaction
     */
    

    
    public static void orderNewItem(Item item)
    {
        ArrayList<Integer> idItem = new ArrayList<Integer>();
        idItem.add(item.getId());
        Invoice invoice=new Buy_Paid(idItem);
        DatabaseInvoice.addInvoice(invoice);
        
    }
    
        /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void orderSecondItem(Item item)
    {
        ArrayList<Integer> idItem = new ArrayList<Integer>();
        idItem.add(item.getId());
        Invoice invoice=new Buy_Paid(idItem);
        DatabaseInvoice.addInvoice(invoice);
    }
    
        /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void orderRefurbishedItem(Item item)
    {
        ArrayList<Integer> idItem = new ArrayList<Integer>();
        idItem.add(item.getId());
        Invoice invoice=new Buy_Paid(idItem);
        DatabaseInvoice.addInvoice(invoice);
    }
    
        /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void sellItemPaid(Item item, Customer customer)
    {
        ArrayList<Integer> idItem = new ArrayList<Integer>();
        idItem.add(item.getId());
        Invoice invoice=new Sell_Paid(idItem,customer);
        DatabaseInvoice.addInvoice(invoice);
    }
    
     /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void sellItemUnpaid(Item item, Customer customer)
    {
        ArrayList<Integer> idItem = new ArrayList<Integer>();
        idItem.add(item.getId());
        Invoice invoice=new Sell_Unpaid(idItem,customer);
        DatabaseInvoice.addInvoice(invoice);
    }
    
     /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void sellItemInstallment(Item item, Customer customer, 
    int installmentPeriod)
    {
        ArrayList<Integer> idItem = new ArrayList<Integer>();
        idItem.add(item.getId());
        Invoice invoice=new Sell_Installment(idItem,installmentPeriod,customer);
        DatabaseInvoice.addInvoice(invoice);
    }
    
    public boolean finishTransaction(Invoice invoice)
    {
        boolean value=false;
        for (Invoice dataInvoice : DatabaseInvoice.getInvoiceDatabase()){
            if (dataInvoice.getId()==invoice.getId()){
                invoice.setIsActive(false);
                System.out.print(invoice.getIsActive());
                value=true;
            }
        }
        return value;
    }
    
    public boolean cancelTransaction(Invoice invoice)
    {
         boolean value=false;
        for (Invoice dataInvoice : DatabaseInvoice.getInvoiceDatabase()){
               if (dataInvoice.getId()==invoice.getId()){
                   DatabaseInvoice.removeInvoice(invoice.getId());
                   value=true;
               }
           }
        return value;
    }
        
}
