
/**
 * Enumeration class ItemCategory - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
package jstore;
public enum ItemCategory
{
    Electronics("Electronics"), Furniture("Furniture"), 
    Stationery("Stationery");
    
    private String description;
    
    private ItemCategory(String description)
    {
        this.description = description;
    }
    
    public String toString()
    {
        return description;
    }
}
