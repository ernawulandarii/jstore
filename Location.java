package jstore;

public class Location
{
    // instance variables - replace the example below with your own
    private String province;
    private String description;
    private String city;

    /**
     * Konstruktor untuk objek dari kelas Supplier
     */
    public Location(String city, String province, String description)
    {
        // initialise instance variables
        this.city = city;
        this.province = province;
        this.description = description;
    }

    /**
     * Method getter untuk mengambil data
     *
     * @return    province
     */
    public String getProvince()
    {
        // put your code here
        return this.province;
    }
    
    /**
     * Method getter untuk mengambil data
     *
     * @return    city
     */
    public String getCity()
    {
        return this.city;
    }
    
    /**
     * Method getter untuk mengambil data
     *
     * @return    description
     */
    public String getDescription()
    {
        return this.description;
    }
    
    /**
     * Method setter untuk menentukan data
     *
     * @param province
     */
    public void setProvince(String province)
    {
        this.province = province;
    }
    
    /**
     * Method setter untuk menentukan data
     *
     * @param city 
     */
    public void setCity(String city)
    {
        this.city = city;
    }
    
    /**
     * Method setter untuk menentukan data
     *
     * @param description 
     */
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    public String toString()
    {
        return "Province: " +province+ "\nCity: " +city+ "\nDescription: " +description;
    }
}
