
/**
 * Write a description of class Sell_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.text.*;

public class Sell_Paid extends Invoice
{
    private static InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    private Customer customer;
    private SimpleDateFormat date = new SimpleDateFormat ("dd MMM yyy");

    /**
     * Constructor for objects of class Sell_Paid
     */
    public Sell_Paid(int id, Item item, int totalItem, Customer customer)
    {
        super(id, item, totalItem);
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
        System.out.println("Item = " + super.getItem().getName());
        System.out.println("Amount = " + super.getTotalItem());
        System.out.println("Buy date = " + date.format(super.getDate().getTime()));
        System.out.println("Price = " + super.getItem().getPrice());
        System.out.println("Price total = " + super.getTotalPrice());
        System.out.println("Supplier ID = " + super.getItem().getSupplier().getId());
        System.out.println("Supplier name = " + super.getItem().getSupplier().getName());
        System.out.println("Customer ID = " + customer.getId());
        System.out.println("Customer name = " + customer.getName());
        System.out.println("Status = " + this.getInvoiceStatus());
        System.out.println("Sell success.");
        return "";
    }
}
