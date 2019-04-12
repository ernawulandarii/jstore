
/**
 * Write a description of class DatabaseInvoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.List;

public class DatabaseInvoice
{
    // instance variables - replace the example below with your own
    private static ArrayList<Invoice> INVOICE_DATABASE;
    private static int LAST_INVOICE_ID = 0;

    /**
     * Constructor for objects of class DatabaseInvoice
     */
    public static ArrayList<Invoice> getInvoiceDatabase()
    {
        return INVOICE_DATABASE;
    }
    
    public static int getLastInvoiceID()
    {
        return LAST_INVOICE_ID;
    }
    
    public static boolean addInvoice(Invoice invoice)
    {
        INVOICE_DATABASE.add(invoice);
        //tambahan
        LAST_INVOICE_ID=invoice.getId();
        return true;
    }
    
    public static Invoice getInvoice (int id)
    {
        Invoice value=null;
        for(Invoice invoice : INVOICE_DATABASE)
        {
            if(invoice.getId()==id)
            {
                value=invoice;
            }
        }
        return value;
    }
                       
    public static Invoice getActiveOrder(Customer customer)
    {
        Invoice value=null;
        for(Invoice invoice : INVOICE_DATABASE)
        {
            if((invoice.getInvoiceStatus()==InvoiceStatus.Installment||invoice.getInvoiceStatus()==InvoiceStatus.Paid)&&invoice.getIsActive()==true)
            {
                value=invoice;
            }  
        }
        return value;
    }
    
    public static boolean removeInvoice(int id)
    {
        boolean value=false;
        for(Invoice invoice : INVOICE_DATABASE)
        {
            if(invoice.getId()==id&&invoice.getIsActive()==true)
            {
                invoice.setIsActive(false);
                INVOICE_DATABASE.remove(id);
                value=true;
            }
        }
        return value;
    }
      
    
}
