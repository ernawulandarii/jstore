
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.text.*;

public class Buy_Paid extends Invoice
{
    // instance variables - replace the example below with your own
    private static InvoiceType INVOICE_TYPE = InvoiceType.Buy;
    private static InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    private SimpleDateFormat date = new SimpleDateFormat ("dd MMM yyy");
    
    /**
     * Constructor for objects of class Buy_Paid
     */
    public Buy_Paid(int id, Item item, int totalItem)
    {
        super(id, item, totalItem);
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
        System.out.println("ID = " + super.getId());
        System.out.println("Item = " + super.getItem().getName());
        System.out.println("Amount = " + super.getTotalItem());
        System.out.println("Buy date = " + date.format(super.getDate().getTime()));
        System.out.println("Price = " + super.getItem().getPrice());
        System.out.println("Price total = " + super.getTotalPrice());
        System.out.println("Supplier ID = " + super.getItem().getSupplier().getId());
        System.out.println("Supplier name = " + super.getItem().getSupplier().getName());
        System.out.println("Status = " + this.getInvoiceStatus());
        System.out.println("Buy success.");
        return "";
    }
}
