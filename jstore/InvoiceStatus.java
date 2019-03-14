
/**
 * Enumeration class InvoiceStatus - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum InvoiceStatus
{
    Paid, Unpaid, Installment{
        public String toString(){
            return "Paid, Unpaid, Installment";
        }
}
}

