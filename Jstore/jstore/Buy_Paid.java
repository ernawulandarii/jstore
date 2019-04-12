
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.text.*;
import java.util.ArrayList;


public class Buy_Paid extends Invoice
{
    // instance variables - replace the example below with your own
    static final private InvoiceType INVOICE_TYPE = InvoiceType.Buy;
    static final private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    private boolean isActive;
    private SimpleDateFormat date = new SimpleDateFormat ("dd MMM yyy");
    
    /**
     * Constructor for objects of class Buy_Paid
     */
    public Buy_Paid(ArrayList<Integer> item)
    {
        super(item);
        isActive=false;
    }

    /**
     * An example 
     *
     * @param  y  a sample
     * @return    the s
     */
    @Override
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    /**
     * An example of our own
     *
     * @param  y  aerethod
     * @return    t
     */
    @Override
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    
    
    /**
     * Me
     *
     */    
    @Override
    public String toString()
    {
        String string="==========INVOICE=======";
        string += "\nID ="+getId();
        string += "\nBuy date =" + getDate();
        for (Integer invoice : getItem())
        {
            Item item = DatabaseItem.getItemFromID(invoice.intValue());
            string += "\nItem: " + item.getName();
            string += "\nAmount: " + getItem().size();
            string += "\nPrice: " + item.getPrice();
            string += "\nSupplier ID: " + item.getSupplier().getId();
            string += "\nSupplier Name: " + item.getSupplier().getName();
        }
        string += "\nPrice Total: " + getTotalPrice();
        string += "\nStatus: " + INVOICE_STATUS;
        string += "\nBuy Success";
        return string;
    }
}
