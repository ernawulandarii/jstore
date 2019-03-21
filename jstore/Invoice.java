
/**
 * Kelas ini berfungsi untuk membuat invoice dari tiap transaksi.
 *
 * @author Erna Wulandari
 * @version 28-Feb-2019
 */
public abstract class Invoice
{
    private int id;
    private Item item;
    private String date;
    protected int totalPrice;
    private int totalItem;
    private InvoiceStatus status;
    private InvoiceType type;

    /**
     * Constructor for objects of class Invoice
     */
    public Invoice(int id, Item item, String date,int totalItem,
    int totalPrice)
    {
        this.id = id;
        this.item = item;
        this.date = date;
        this.totalItem = totalItem;
        this.totalPrice = totalPrice;
        
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
    public Item getItem()
    {
        return item;
    }
    
    /**
     * Method untuk mengembalikan tanggal invoice
     *
     * @return    tanggal invoice
     */
    public String getDate()
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
    public int getTotalItem()
    {
        return totalItem;
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
    public void setItem(Item item)
    {
        this.item = item;
    }
    
    /**
     * Method untuk mengubah tanggal invoice
     *
     * @param  date  tanggal dari suatu invoice
     */
    public void setDate(String date)
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
        this.totalPrice = totalPrice;
    }
    
    /**
     * 
     *
     * @param  
     */
    public void setTotalItem(int totalItem)
    {
        this.totalItem = totalItem;
    }
    
    /**
     * 
     *
     * @param  
     */
    public void setInvoiceStatus(InvoiceStatus status)
    {
        this.status = status;
    }
    
    /**
     * Method untuk menampilkan total harga pada invoice
     *
     */
    public abstract void printData();
    
}
