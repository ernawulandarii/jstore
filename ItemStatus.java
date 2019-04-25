
/**
 * Enumeration class ItemStatus - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
package jstore;
public enum ItemStatus
{
    New("New"), Second("Second"), Refurbished("Refurbished"), Sold("Sold");
    
    private String description;
    
    private ItemStatus(String description)
    {
        this.description = description;
    }
    
    public String toString()
    {
        return description;
    }
}
