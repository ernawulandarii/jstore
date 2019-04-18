import java.util.ArrayList;
import java.util.*;

/**
 * Write a description of class JStore here.
 *
 * @author Erna Wulandari
 * @version (a version number or a date)
 */
public class JStore {
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class JStore
     */

    public JStore() {
        // initialise instance variables

    }

    public static void main(String[] args) {

        Location location = new Location("Jawa Barat", "Bogor", "Kabupaten");


        DatabaseSupplier.addSupplier(new Supplier(1, "erna1", "erna123@gmail.com", "081234567", location));
        DatabaseSupplier.addSupplier(new Supplier(2, "erna2", "erna123@gmail.com", "081234567", location));
        DatabaseSupplier.addSupplier(new Supplier(3, "erna3", "erna123@gmail.com", "081234567", location));

        for (Supplier temp : DatabaseSupplier.getSupplierDatabase()) {
            System.out.println(temp);
        }

        DatabaseCustomer.addCustomer(new Customer("erna", "erna123@gmail.com",
                "erna1", "COba1234", 1998, 10, 16));
        DatabaseCustomer.addCustomer(new Customer("erna2", "erna123@gmail.com",
                "erna12", "COba4567", 1998, 10, 16));
        DatabaseCustomer.addCustomer(new Customer("erna3", "erna123@gmail.com",
                "erna123", "COba8910", 1998, 10, 16));

        ArrayList<Customer> temCostumer = DatabaseCustomer.getCustomerDatabase();
        for (Customer temp : temCostumer) {
            System.out.println(temp);
        }

        DatabaseItem.addItem(new Item("erna1", 20, ItemStatus.New, 20000, DatabaseSupplier.getSupplier(1),
                ItemCategory.Electronics));
        DatabaseItem.addItem(new Item("erna2", 25, ItemStatus.New, 20000, DatabaseSupplier.getSupplier(2),
                ItemCategory.Electronics));
        DatabaseItem.addItem(new Item("erna3", 30, ItemStatus.New, 20000, DatabaseSupplier.getSupplier(3),
                ItemCategory.Electronics));

        ArrayList<Item> array = new ArrayList<Item>();
        for (Item temp : array) {
            System.out.println(temp);
        }

        ArrayList<Integer> array1 = new ArrayList<Integer>();
        array1.add(2);

        ArrayList<Integer> array2 = new ArrayList<Integer>();
        array2.add(2);
        array2.add(3);

        ArrayList<Integer> array3 = new ArrayList<Integer>();
        array3.add(3);
        array3.add(3);

        DatabaseInvoice.addInvoice(new Sell_Paid(array1, DatabaseCustomer.getCustomer(1)));
        DatabaseInvoice.addInvoice(new Sell_Installment(array2, DatabaseCustomer.getCustomer(2)));
        DatabaseInvoice.addInvoice(new Sell_Paid(array3, DatabaseCustomer.getCustomer(3)));

        ArrayList<Invoice> invoice = DatabaseInvoice.getInvoiceDatabase();
        for (Invoice temp : invoice) {
            System.out.println(temp);
        }


        Transaction.finishTransaction(DatabaseInvoice.getInvoice(2)))
            System.out.println("finish");
        Transaction.finishTransaction(DatabaseInvoice.getInvoice(3)))
            System.out.println("finish");
        System.out.println();

        if (!Transaction.cancelTransaction(DatabaseInvoice.getInvoice(1))) ;
        for (Invoice temp : invoice) {
            System.out.println(temp);
        }

    }
}