
/**
 * Write a description of class Transaction here.
 *
 * @author Erna Wulandari
 * @version 14-03-2019
 */
public class Transaction
{
    public Transaction()
    {
    }
    
    public static void orderNewItem(Item item)
    {
        Invoice buy = new Buy_Paid(1, item, "21 Maret 2019", 5, item.getPrice());
        
        if (buy instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else
        {
            System.out.println("Salah, Invoice Type bulan Sell_Paid");
        }
        
    }
    
    public static void orderSecondItem(Item item)
    {
        Invoice buy = new Buy_Paid(1, item, "21 Maret 2019", 5, item.getPrice());
        
        if (buy instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else
        {
            System.out.println("Salah, Invoice Type bulan Sell_Paid");
        }
    }
    
    public static void orderRefurbishedItem(Item item)
    {
        Invoice invoice = new Buy_Paid(1, item, "21 Maret 2019", 3, item.getPrice());
        
        if (invoice instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }
        else
        {
            System.out.println("Salah, Invoice Type bulan Sell_Paid");
        }
    }
    
     public static void sellItemPaid(Item item)
    {
        Invoice buy1 = new Sell_Paid(4, item, "21 Mar 2019", 4, item.getPrice());
        InvoiceStatus statusinvoice = InvoiceStatus.Paid;
        ItemStatus statusitem = ItemStatus.Sold;

        buy1.setInvoiceStatus(statusinvoice);
        item.setStatus(statusitem);
        
        item.printData();
        buy1.printData();
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void sellItemUnpaid(Item item)
    {
        Invoice buy = new Sell_Paid(5, item, "21 Mar 2019", 5, item.getPrice());
        InvoiceStatus status = InvoiceStatus.Unpaid;
        ItemStatus itemstatus = ItemStatus.Sold;

        item.setStatus(itemstatus);

        item.printData();
        buy.printData();
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void sellItemInstallment(Item item)
    {
        Invoice sell = new Sell_Paid(6, item, "21 Mar 2019", 6, item.getPrice());
        InvoiceStatus invoicestatus = InvoiceStatus.Installment;
        ItemStatus itemstatus = ItemStatus.Sold;

        item.setStatus(itemstatus);

        item.printData();
        sell.printData();
    }
    
}