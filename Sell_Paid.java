
/**
 * Write a description of class Sell_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
package jstore;
import java.text.*;
import java.util.ArrayList;

public class Sell_Paid extends Invoice
{
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    private Customer customer;
    private boolean isActive;
    private SimpleDateFormat date = new SimpleDateFormat ("dd MMM yyy");
    
    /**
     * Constructor for objects of class Sell_Paid
     */
    public Sell_Paid(ArrayList<Integer> item, Customer customer)
    {
        super(item);
        this.customer=customer;
        this.isActive=false;
    }

    /**
     * An 
     *
     * @param  y  a 
     * @return    th
     */
    public Customer getCustomer()
    {
        return customer;
    }
    
    /**
     * An 
     *
     * @param  y  a sa
     * @return    the 
     */
    @Override
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    /**
     * An 
     *
     * @param  y  a 
     * @return    th
     */
    @Override
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    
    /**
     * An 
     *
     * @param  y  a 
     * @return    th
     */
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    
    /**
     * Me
     *
     */    
    @Override
    public String toString()
    {
        System.out.println("ID = " + super.getId());
        ArrayList<Integer> listItemID = DatabaseInvoice.getInvoice(super.getId()).getItem();
        for(int itemID : listItemID)
        {
            System.out.println("Item = " + 
            DatabaseItem.getItemFromID(itemID).getName());
            System.out.println("Price = " + 
            DatabaseItem.getItemFromID(itemID).getPrice());
            System.out.println("Supplier ID = " + 
            DatabaseItem.getItemFromID(itemID).getSupplier().getId());
            System.out.println("Supplier name = " + 
            DatabaseItem.getItemFromID(itemID).getSupplier().getName());
        }
        System.out.println("Buy date = " + date.format(super.getDate().getTime()));
        System.out.println("Price total = " + super.getTotalPrice());
        //System.out.println("Customer ID = " + costumer.getId());
        //System.out.println("Customer name = " + costumer.getName());
        System.out.println("Status = " + this.getInvoiceStatus());
        System.out.println("Sell success.");
        return "";
    }
}
