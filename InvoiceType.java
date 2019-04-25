
/**
 * Enumeration class InvoiceType - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
package jstore;
public enum InvoiceType
{
    Buy("Buy"), Sell("Sell");
    
    private String description;
    
    private InvoiceType(String description)
    {
        this.description = description;
    }
    
    public String toString()
    {
        return description;
    }
}
