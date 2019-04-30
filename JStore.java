//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.ArrayList;


public class JStore {
    public JStore() {
    }

    public static void main(String[] args) {
        Location location = new Location("Jawa Barat", "Bogor", "Kabupaten");
        try {
            DatabaseSupplier.addSupplier(new Supplier(1, "Erna", "erna@ui.ac.id", "0812345678", location));
            DatabaseSupplier.addSupplier(new Supplier(2, "Erna2", "erna2@ui.ac.id", "0812345678", location));
            DatabaseSupplier.addSupplier(new Supplier(3, "Erna3", "erna@ui.ac.id", "0812345678", location));
            DatabaseSupplier.addSupplier(new Supplier(4, "Erna4", "erna4@ui.ac.id", "0812345678", location));
        } catch (SupplierAlreadyExistsException sup) {
            System.out.println(sup.getExMessage());
        }

        try {
            DatabaseCustomer.addCustomer(new Customer("Dewi", "Dewi@ui.ac.id", "dewi", "dewi123", 1998, 10, 16));
            DatabaseCustomer.addCustomer(new Customer("Nana", "Nana@ui.ac.id", "nana", "nana123", 1998, 10, 16));
            DatabaseCustomer.addCustomer(new Customer("Siema", "Siema@ui.ac.id", "siema", "siema123", 1998, 10, 16));
            DatabaseCustomer.addCustomer(new Customer("Nurjannah", "Nana@ui.ac.id", "nana", "nana123", 1998, 10, 16));
        } catch (CustomerAlreadyExistsException cust) {
            System.out.println(cust.getExMessage());
        }

        try {
            DatabaseItem.addItem(new Item("Buku", ItemStatus.New, 5000, DatabaseSupplier.getSupplier(1), ItemCategory.Electronics));
            DatabaseItem.addItem(new Item("Pulpen", ItemStatus.New, 5000, DatabaseSupplier.getSupplier(2), ItemCategory.Electronics));
            DatabaseItem.addItem(new Item("Buku", ItemStatus.New, 5000, DatabaseSupplier.getSupplier(1), ItemCategory.Electronics));
            DatabaseItem.addItem(new Item("Pensil", ItemStatus.New, 5000, DatabaseSupplier.getSupplier(4), ItemCategory.Electronics));
        } catch (ItemAlreadyExistsException item) {
            System.out.println(item.getExMessage());
        }

        ArrayList<Integer> item1 = new ArrayList<>();
        item1.add(1);
        item1.add(2);
        ArrayList<Integer> item2 = new ArrayList<>();
        item2.add(3);
        ArrayList<Integer> item3 = new ArrayList<>();
        item3.add(3);
        item3.add(2);

        try {
            DatabaseInvoice.addInvoice(new Sell_Paid(item1, DatabaseCustomer.getCustomer(1)));
            DatabaseInvoice.addInvoice(new Sell_Paid(item1, DatabaseCustomer.getCustomer(1)));
            DatabaseInvoice.addInvoice(new Sell_Unpaid(item2, DatabaseCustomer.getCustomer(2)));
            DatabaseInvoice.addInvoice(new Sell_Installment(item3, DatabaseCustomer.getCustomer(3)));
        } catch (InvoiceAlreadyExistsException invoice) {
            System.out.println(invoice.getExMessage());
        }

        try{
            DatabaseInvoice.removeInvoice(7);
        }catch (InvoiceNotFoundException remove){
            System.out.println(remove.getExMessage());
        }

        try{
            DatabaseCustomer.removeCustomer(7);
        }catch (CustomerNotFoundException remove){
            System.out.println(remove.getExMessage());
        }

        try{
            DatabaseSupplier.removeSupplier(7);
        }catch (SupplierNotFoundException remove){
            System.out.println(remove.getExMessage());
        }catch (ItemNotFoundException remove){
            System.out.println(remove.getExMessage());
        }

        try{
            DatabaseItem.removeItem(7);
        }catch (ItemNotFoundException remove){
            System.out.println(remove.getExMessage());
        }



        try{
            DatabaseInvoice.getActiveOrder(DatabaseCustomer.getCustomer(3));
        }catch (CustomerDoesntHaveActiveException c){
            System.out.println(c.getExMessage());
        }

        DatabaseSupplier.getSupplier(1);
        DatabaseCustomer.getCustomer(2);
        DatabaseItem.getItemFromID(3);
        DatabaseInvoice.getInvoice(4);


        Transaction.finishTransaction(DatabaseInvoice.getInvoice(2));

        try{
            Transaction.cancelTransaction(DatabaseInvoice.getInvoice(3));
        }
        catch (InvoiceNotFoundException cancel) {
            System.out.println(cancel);
        }

    }

}