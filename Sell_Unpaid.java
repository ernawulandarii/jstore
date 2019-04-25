
/**
 * Write a description of class Sell_Unpaid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
package jstore;
import java.io.IOException;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.*;
import java.text.*;

public class Sell_Unpaid extends Invoice
{
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Unpaid;
    private Calendar dueDate;
    private Customer customer;
    private boolean isActive;
    private SimpleDateFormat date = new SimpleDateFormat ("dd MMM yyy");
    
    /**
     * Constructor for objects of class Sell_Unpaid
     */
    public Sell_Unpaid(ArrayList<Integer> item, Customer customer)
    {
        super(item);
        this.customer=customer;
        this.isActive=true;
        this.dueDate=new GregorianCalendar();
        dueDate.add((GregorianCalendar.DATE), 1);
    }

    /**
     * An 
     *
     * @param
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
     * @param
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
     * @param
     * @return    th
     */
    public Customer getCustomer()
    {
        return customer;
    }
    
    /**
     * An 
     *
     * @param
     * @return    th
     */
    public Calendar getDueDate()
    {
        return dueDate;
    }
    
    /**
     * An 
     *
     * @param
     * @return    th
     */
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    
    /**
     * An 
     *
     * @param
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
        ArrayList<Integer> listItemID = DatabaseInvoice.getInvoice(super.getId()).getItem();
        for(int itemID : listItemID)
        { if (DatabaseItem.getItemFromID(itemID) != null){
                System.out.println("Item = " +
                        DatabaseItem.getItemFromID(itemID).getName());
                System.out.println("Price = " +
                        DatabaseItem.getItemFromID(itemID).getPrice());
                System.out.println("Supplier ID = " +
                        DatabaseItem.getItemFromID(itemID).getSupplier().getId());
                System.out.println("Supplier name = " +
                        DatabaseItem.getItemFromID(itemID).getSupplier().getName());
          }
        }
        System.out.println("Buy date = " + date.format(super.getDate().getTime()));
        System.out.println("Price total = " + super.getTotalPrice());
        System.out.println("Customer ID = " + customer.getId());
        System.out.println("Customer name = " + customer.getName());
        System.out.println("Status = " + INVOICE_STATUS);
        System.out.println("Due date = " + date.format(dueDate));
        System.out.println(
        "If payment is not received by dueDate, transaction will be cancelled.");
        return "";
    }
}
