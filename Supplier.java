
/**
 * Write a description of class Location here.
 *
 * @author Erna Wulandari
 * @version 28-03-2019
 */
package jstore;
public class Supplier
{
    // instance variables - replace the example below with your own
    private int id;
    private static String name;
    private String email;
    private String phoneNumber;
    private Location location;

    /**
     * Constructor for objects of class Supplier
     */
    public Supplier(int id, String name, String email, 
    String phoneNumber, Location location)
    {
        this.id=DatabaseSupplier.getLastSupplierID()+1;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }
   
    public int getId()
    {
        return id;
    }
    
    public static String getName()
    {
        return name;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
       
    public Location getLocation()
    {
        return location;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    
    public void setLocation(Location location)
    {
        this.location = location;
    }
    
    public String toString()
    {
        System.out.println("SUPPLIER");
        System.out.println("ID" + id);
        System.out.println("NAMA" + name);
        System.out.println("EMAIL" + email);
        System.out.println("NOMOR TELFON" + phoneNumber);
        System.out.println("Lokasi" + location.getCity());
        return "";
    }
}
