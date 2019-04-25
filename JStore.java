//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//
package jstore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;

@SpringBootApplication

public class JStore {
    public JStore() {
    }

    public static void main(String[] args) {

        Location l1 = new Location("Jawa Barat", "Bogor", "Kabupaten");
        Location l2 = new Location("Jawa Barat", "Depok", "Kota");
        Location l3 = new Location("Jawa Barat", "Bandung", "Kabupaten");


        try {
            DatabaseSupplier.addSupplier(new Supplier(1, "Erna", "erna@mail.com", "081234567", l1));
            DatabaseSupplier.addSupplier(new Supplier(2, "Erna", "erna1@mail.com", "081234567", l2));
            DatabaseSupplier.addSupplier(new Supplier(3, "Erna", "erna2@mail.com", "081234567", l3));
            DatabaseItem.addItem(new Item("erna", ItemStatus.New, 50000, DatabaseSupplier.getSupplier(1), ItemCategory.Electronics));
            DatabaseItem.addItem(new Item("erna", ItemStatus.New, 50000, DatabaseSupplier.getSupplier(2), ItemCategory.Electronics));
            DatabaseItem.addItem(new Item("erna", ItemStatus.New, 50000, DatabaseSupplier.getSupplier(3), ItemCategory.Electronics));
            DatabaseItem.addItem(new Item("erna", ItemStatus.New, 50000, DatabaseSupplier.getSupplier(4), ItemCategory.Electronics));

        } catch (Exception e) {

        }
        SpringApplication.run(JStore.class, args);

    }
}