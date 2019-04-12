
/**
 * Write a description of class Sell_Installment here.
 *
 * @author Erna Wulandari
 * @version (a version number or a date)
 */
import java.text.*;
import java.util.ArrayList;

public class Sell_Installment extends Invoice
{
    // instance variables - replace the example below with your own
    static final private InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    static final private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
    private Customer customer;
    private boolean isActive;
    
    /**
     * Constructor for objects of class Sell_Installment
     */
    public Sell_Installment(ArrayList<Integer> item,
    int installmentPeriod, Customer customer)
    {
        super(item);
        this.installmentPeriod = installmentPeriod;
        this.customer=customer;
        isActive=true;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
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
        string += "\nInstallment Price: " + installmentPrice;
        string += "\nCustomer ID: " + customer.getId();
        string += "\nCustomer Name: " + customer.getName();
        string += "\nStatus: " + INVOICE_STATUS;
        string += "\nInstallment period: " + installmentPeriod;
        string += "\nSell Success";
        return string;
    }
}
