
/**
 * Write a description of class Transaction here.
 *
 * @author Erna Wulandari
 * @version 14-03-2019
 */
public class Transaction
{
    public void orderNewItem(Supplier supplier)
    {
        Item item1 = new Item(1, "Hijab", 5, 100000, ItemCategory.Electronics, ItemStatus.New, supplier);
        DatabaseItem.addItem(item1);
        Invoice invoice1 = new Invoice(2, item1, "6 Maret 2019", item1.getPrice(), 5, InvoiceStatus.Paid);
        item1.setStatus(ItemStatus.New);
        invoice1.setInvoiceStatus(InvoiceStatus.Paid);
        item1.printData();
        invoice1.printData();
    }
    
    public void orderSecondItem(Supplier supplier)
    {
        // put your code here
        Item item1 = new Item (1, "Hijab", 5, 100000, ItemCategory.Electronics, ItemStatus.Second, supplier);
        DatabaseItem.addItem(item1);
        Invoice invoice1 = new Invoice(2, item1, "6 Maret 2019", item1.getPrice(), 5, InvoiceStatus.Paid);
        item1.setStatus(ItemStatus.New);
        invoice1.setInvoiceStatus(InvoiceStatus.Paid);
        item1.printData();
        invoice1.printData();
    }
    
      public void orderRefurbishedItem(Supplier supplier)
    {
        // put your code here
        Item item1 = new Item(3, "Hijab", 5, 100000, ItemCategory.Electronics, ItemStatus.Refurbished, supplier);
        DatabaseItem.addItem(item1);
        Invoice invoice1 = new Invoice(2, item1, "6 Maret 2019", item1.getPrice(), 5, InvoiceStatus.Paid);
        item1.setStatus(ItemStatus.New);
        invoice1.setInvoiceStatus(InvoiceStatus.Paid);
        item1.printData();
        invoice1.printData();
    }
    
    public static void sellItemPaid(Item item)
    {
        Invoice invoice1 = new Invoice(2, item, "6 Maret 2019", item.getPrice(), 5, InvoiceStatus.Paid);
        item.setStatus(ItemStatus.Sold);
        invoice1.printData();
    }
    
    public static void sellItemUnpaid(Item item)
    {
        Invoice invoice1 = new Invoice(2, item, "6 Maret 2019", item.getPrice(), 5, InvoiceStatus.Unpaid);
        item.setStatus(ItemStatus.Sold);
        invoice1.printData();
    }
    public static void sellItemInstallment(Item item)
    {
        Invoice invoice1 = new Invoice(2, item, "6 Maret 2019", item.getPrice(), 5, InvoiceStatus.Installment);
        item.setStatus(ItemStatus.Sold);
        invoice1.printData();
    }
    
}
    
    