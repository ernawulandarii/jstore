
/**
 * Kelas ini berfungsi untuk membuat invoice dari tiap transaksi.
 *
 * @author Erna Wulandari
 * @version 28-Feb-2019
 */
package jstore;
import java.util.*;
import java.util.ArrayList;

public abstract class Invoice
{
    private static int id;
    private ArrayList<Integer> item = new ArrayList<Integer>();
    private Calendar date;
    private int totalPrice;
    private boolean isActive;
    private Customer customer;
    private static InvoiceStatus status;
    
    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(ArrayList<Integer> item)
    {
        this.item = item;
        id=DatabaseInvoice.getLastInvoiceID()+1;
        this.date = new GregorianCalendar();
    }

    /**
     * Method untuk mengembalikan id invoice
     *
     * @return    id invoice
     */
    public static int getId()
    {
        return id;
    }
    
    /**
     * Method untuk mengembalikan item yang dibeli
     *
     * @return    objek item
     */
    public ArrayList<Integer> getItem()
    {
        return item;
    }
    
    /**
     * Method untuk mengembalikan tanggal invoice
     *
     * @return    tanggal invoice
     */
    public Calendar getDate()
    {
        return date;
    }
    
    /**
     * Method untuk mengembalikan total harga item yang dibeli
     *
     * @return    total harga
     */
    public int getTotalPrice()
    {
        return totalPrice;
    }
    
    /**
     * 
     *
     * @return    
     */
    public static boolean getIsActive()
    {
        return true;
    }
    
    public Customer getCustomer()
    {
        return customer;
    }
    
    /**
     * 
     *
     * @return    
     */
    public abstract InvoiceStatus getInvoiceStatus();
        
    public abstract InvoiceType getInvoiceType();
    
    /**
     * Method untuk mengubah id invoice
     *
     * @param  id  id dari suatu invoice
     */
    public void setId(int id)
    {
        this.id = id;
    }
    
    /**
     * Method untuk mengubah item pada invoice
     *
     * @param  item  objek item dari suatu invoice
     */
    public void setItem(ArrayList<Integer> item)
    {
        this.item = item;
    }
    
    /**
     * Method untuk mengubah tanggal invoice
     *
     * @param  date  tanggal dari suatu invoice
     */
    public void setDate(Calendar date)
    {
        this.date = date;
    }
    
    /**
     * Method untuk mengubah total harga pada invoice
     *
     * @param  totalPrice  total harga dari suatu invoice
     */
    public void setTotalPrice(int totalPrice)
    {
        ArrayList<Integer> listItemID = DatabaseInvoice.getInvoice(id).getItem();
        for(int priceID : listItemID)
        {
            this.totalPrice = totalPrice + DatabaseItem.getItemFromID(priceID).getPrice();
        }
    }
    
    /**
     * 
     *
     * @param  
     */
    //public abstract void setInvoiceStatus(InvoiceStatus status);
    
    public void setIsActive(boolean isActive)
    {
        this.isActive=isActive;
    }
    
    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    } 
    
    /**
     * Method untuk menampilkan total harga pada invoice
     *
     */
    public String toString()
    {
        System.out.println("");
        return "";
    }
    
}
