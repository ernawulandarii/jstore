package jstore;
public class InvoiceNotFoundException extends Exception
{
    private int invoice_error;

    public InvoiceNotFoundException(int invoice_input)
    {
        super("Invoice ID: ");
        this.invoice_error = invoice_input;
    }

    public String getExMessage()
    {
        System.out.println("\n====Invoice Not Found Exception====");
        return super.getMessage() + invoice_error + " not found.";
    }
}
