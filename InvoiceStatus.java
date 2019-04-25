
/**
 * Enumeration class InvoiceStatus - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
package jstore;
public enum InvoiceStatus
{
    Paid("Paid"), Unpaid("Unpaid"), Installment("Installment");
    
    private String description;
    
    private InvoiceStatus(String description)
    {
        this.description = description;
    }
    
    public String toString()
    {
        return description;
    }
}
