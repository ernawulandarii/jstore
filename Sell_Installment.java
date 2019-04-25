
/**
 * Write a description of class Sell_Installment here.
 *
 * @author Erna Wulandari
 * @version (a version number or a date)
 */
package jstore;
import java.text.*;
import java.util.ArrayList;

public class Sell_Installment extends Invoice
{
    // instance variables - replace the example below with your own
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
    private Customer customer;
    private boolean isActive;
    private SimpleDateFormat date = new SimpleDateFormat (" dd MM yyy");
    
    /**
     * Constructor for objects of class Sell_Installment
     */
    public Sell_Installment(ArrayList<Integer> item, Customer customer)
    {
        super(item);
        this.installmentPeriod = installmentPeriod;
        this.customer=customer;
        this.isActive=true;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param
     * @return
     */
    public int getInstallmentPeriod()
    {
        return installmentPeriod;
    }
    
    public int getInstallmentPrice()
    {
        return installmentPrice;
    }
        
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
        }
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    
    public Customer getCustomer()
    {
        return customer;
    }
    
    public void setInstallmentPrice(int totalPrice)
    {
        installmentPrice = (int)(1.02 * (totalPrice / installmentPeriod));
    }
    
    public void setTotalPrice(int installmentPeriod)
    {
        int totalPrice = installmentPrice * installmentPeriod;
        super.setTotalPrice(totalPrice);
    }
    
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }
    
    /**
     * 
     */    
    @Override
    public String toString()
    {
        System.out.println("ID = " + super.getId());
        ArrayList<Integer> listItemID = DatabaseInvoice.getInvoice(super.getId()).getItem();
        for(int itemID : listItemID)
        {if (DatabaseItem.getItemFromID(itemID) != null) {
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
        System.out.println("Installment price = " + installmentPrice);
        //System.out.println("Customer ID = " + costumer.getId());
        //System.out.println("Customer name = " + costumer.getName());
        System.out.println("Status = " + INVOICE_STATUS);
        System.out.println("Installment period = " + installmentPeriod);
        System.out.println("Sell success.");
        return "";
    }
}
