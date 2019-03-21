
/**
 * Write a description of class Sell_Installment here.
 *
 * @author Erna Wulandari
 * @version (a version number or a date)
 */
public class Sell_Installment extends Invoice
{
    // instance variables - replace the example below with your own
    private InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;;
    private int installmentPeriod;
    private int installmentPrice;

    /**
     * Constructor for objects of class Sell_Installment
     */
    public Sell_Installment(int id, Item item, String date, int 
    totalPrice, int totalItem, int installmentPeriod)
    {
        // initialise instance variables
        super(id,item,date,totalPrice,installmentPeriod);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getInstallmentPeriod()
    {
        // put your code here
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
    
    public void setIntallmentPrice()
    {
        this.installmentPrice = (totalPrice/installmentPeriod)*102/100;
    }
    
    public void setTotalPrice()
    {
        this.totalPrice = (totalPrice*installmentPeriod);
    }
    
    public void printData()
    {
        System.out.println("==========INVOICE==========");
        System.out.println("ID:" + super.getId());
        System.out.println("Date:" + super.getDate());
        System.out.println("Item:" + super.getItem().getName());
        System.out.println("Total Item:" + super.getTotalItem());
        System.out.println("Total Price:" + super.getTotalPrice());
        System.out.println("Status:" + getInvoiceStatus());
        System.out.println("InstallmentPrice" +installmentPrice);
    }
}
