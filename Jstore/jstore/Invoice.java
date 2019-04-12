
/**
 * Kelas ini berfungsi untuk membuat invoice dari tiap transaksi.
 *
 * @author Erna Wulandari
 * @version 28-Feb-2019
 */

import java.util.*;
import java.util.ArrayList;

public abstract class Invoice
{
    private int id;
    private ArrayList<Integer> item;
    private Calendar date;
    private int totalPrice;
    private boolean isActive;
    private Customer customer;
    
    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(ArrayList<Integer> item)
    {
        this.item=item;
        id=DatabaseInvoice.getLastInvoiceID()+1;
    }

    /**
     * Method untuk mengembalikan id invoice
     *
     * @return    id invoice
     */
    public int getId()
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
    public boolean getIsActive()
    {
        return isActive;
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
        for(Integer invoice : item)
        {
            totalPrice=totalPrice+DatabaseItem.getItemFromID(invoice).getPrice();
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
