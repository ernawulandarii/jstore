package jstore;
import java.lang.Exception;

public class InvoiceAlreadyExistsException extends Exception
{
    private Invoice invoice_error;

    public InvoiceAlreadyExistsException(Invoice invoice_input)
    {
        super("Invoice with Item List ");
        this.invoice_error = invoice_input;
    }

    public String getExMessage()
    {
        System.out.println("\n====Invoice Already Exists Exception====");
        return super.getMessage() + invoice_error.getItem() + " already ordered by " +
                invoice_error.getCustomer().getUsername();
    }


}
