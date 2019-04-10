
/**
 * Write a description of class Sell_Installment here.
 *
 * @author Erna Wulandari
 * @version (a version number or a date)
 */
import java.text.*;

public class Sell_Installment extends Invoice
{
    // instance variables - replace the example below with your own
    private static InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
    private Customer customer;
    private SimpleDateFormat date = new SimpleDateFormat ("dd MMM yyy");
    
    /**
     * Constructor for objects of class Sell_Installment
     */
    public Sell_Installment(int id, Item item, int totalItem, int installmentPeriod,
    Customer customer)
    {
        super(id, item, totalItem);
        this.installmentPeriod = installmentPeriod;
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
        System.out.println("ID = " + super.getId());
        System.out.println("Item = " + super.getItem().getName());
        System.out.println("Amount = " + super.getTotalItem());
        System.out.println("Buy date = " + date.format(super.getDate().getTime()));
        System.out.println("Price = " + super.getItem().getPrice());
        System.out.println("Price total = " + super.getTotalPrice());
        System.out.println("Installment price = " + installmentPrice);
        System.out.println("Supplier ID = " + super.getItem().getSupplier().getId());
        System.out.println("Supplier name = " + super.getItem().getSupplier().getName());
        System.out.println("Customer ID = " + customer.getId());
        System.out.println("Customer name = " + customer.getName());
        System.out.println("Status = " + INVOICE_STATUS);
        System.out.println("Installment period = " + installmentPeriod);
        System.out.println("Sell success.");
        return "";
    }
}
