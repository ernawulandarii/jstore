
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Buy_Paid extends Invoice
{
    
    private InvoiceType INVOICE_TYPE = InvoiceType.Buy;
    private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    
    public Buy_Paid(int id, Item item, String date, int totalPrice, int totalItem)
    {
        super(id,item,date,totalPrice,totalItem);
   
    }

    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    
    /**
     * @method printData()
     */
    public void printData()
    {
        System.out.println("==========INVOICE==========");
        System.out.println("ID:" + super.getId());
        System.out.println("Date:" + super.getDate());
        System.out.println("Item:" + super.getItem().getName());
        System.out.println("Total Item:" + super.getTotalItem());
        System.out.println("Total Price:" + super.getTotalPrice());
        System.out.println("Status:" + getInvoiceStatus());
        System.out.println("Type:" + getInvoiceType());
    }
    
}