
/**
 * Write a description of class Location here.
 *
 * @author Erna Wulandari
 * @version 28-03-2019
 */
package jstore;
public class Location
{
    // instance variables - replace the example below with your own
    private String province;
    private String description;
    private String city;

    /**
     * Constructor for objects of class Location
     */
    public Location(String province, String city,
    String description)
    {
        
        this.province = province;
        this.city = city;
        this.description = description;
    }

    /**
     * @return province digunakan untuk mengembalikan nilai province
     */
    public String getProvince()
    {
        return province;
    }
    
    /**
     * @return city digunakan untuk mengembalikan nilai city
     */
    public String getCity()
    {
        return city;
    }
    
    /**
     * @return description digunakan untuk mengembalikan nilai description
     */
    public String getDescription()
    {
        return description;
    }
    
    /**
     * @param method digunakan untuk menentukan nilai province
     */
    public void setProvince(String province)
    {
        this.province = province;
    }
    
    public void setCity(String city)
    {
        this.city = city;
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    public String toString()
    {
        System.out.println("LOCATION");
        System.out.println("PROVINSI" + province);
        System.out.println("KOTA" + city);
        System.out.println("Deskripsi" + description);
        return "";
    }
}
