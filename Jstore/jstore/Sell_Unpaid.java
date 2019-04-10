
/**
 * Write a description of class Sell_Unpaid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.*;
import java.text.*;

public class Sell_Unpaid extends Invoice
{
    private static InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static InvoiceStatus INVOICE_STATUS = InvoiceStatus.Unpaid;
    private Calendar dueDate;
    private Customer customer;
    private SimpleDateFormat date = new SimpleDateFormat ("dd MMM yyy");
    
    /**
     * Constructor for objects of class Sell_Unpaid
     */
    public Sell_Unpaid(int id, Item item, int totalItem, Customer customer)
    {
        super(id, item, totalItem);
        this.dueDate = new GregorianCalendar();
        this.customer = customer;
        dueDate.add((GregorianCalendar.DATE), 1);
        
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
    public Customer getCustomer()
    {
        return customer;
    }
    
    /**
     * An 
     *
     * @param  y  a 
     * @return    th
     */
    public Calendar getDueDate()
    {
        return dueDate;
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
     * An 
     *
     * @param  y  a 
     * @return    th
     */
    public void setDueDate(Calendar dueDate)
    {
        this.dueDate = dueDate;
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
        System.out.println("Status = " + INVOICE_STATUS);
        System.out.println("Due date = " + date.format(dueDate));
        System.out.println("If payment is not received by dueDate, transaction will be cancelled.");
        return "";
    }
}
