package jstore;

public class CustomerDoesntHaveActiveException extends Exception
{
    private Customer customer_error;

    public CustomerDoesntHaveActiveException(Customer customer_input)
    {
        super("Customer");
        this.customer_error = customer_input;

    }

    public String getExMessage()
    {
        System.out.println("\n====Customer Doesnt Have Active Exception====");
        return super.getMessage() + customer_error + "\nDoesnt have active invoice";
    }
}
