
/**
 * Write a description of class Location here.
 *
 * @author Erna Wulandari
 * @version 28-03-2019
 */
package jstore;
public class Item
{
    // instance variables - replace the example below with your own
    private int id;
    private String name;
    private int price;
    private ItemCategory category;
    private ItemStatus status;
    private Supplier supplier;
    

    /**
     * Constructor for objects of class Item
     */
    public Item(String name, ItemStatus status,
    int price, Supplier supplier, ItemCategory category)
    {
        this.id=DatabaseItem.getLastItemID()+1;
        this.name = name;
        this.status = status;
        this.price = price;
        this.supplier = supplier;
        this.category = category;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param
     * @return    the sum of x and y
     */
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;     
    }

    public int getPrice()
    {
        return price;
    }
    
    public ItemCategory getCategory()
    {
       return category;
    }
    
    public ItemStatus getStatus()
    {
        return status;
    }
    
    public Supplier getSupplier()
    {
        return supplier;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setPrice(int price)
    {
        this.price = price;
    }
    
    public void setCategory(ItemCategory category)
    {
        this.category = category;
    }
    
    public void setStatus(ItemStatus status)
    {
        this.status = status;
    }
    
    public void setSupplier(Supplier supplier)
    {
        this.supplier = supplier;
    }
    
    public String toString()
    {
        System.out.println("ITEM");
        System.out.println("ID" + id);
        System.out.println("Name" + name);
        System.out.println("Price:" + price);
        System.out.println("kategory"+ category);
        System.out.println("Status"+ status);
        System.out.println("Supplier" + supplier.getName());
        return "";
    }
    
}
    
    

    
    

