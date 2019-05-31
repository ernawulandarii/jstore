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
        SpringApplication.run(JStore.class, args);

        Location l1 = new Location("Jawa Barat", "Bogor", "Kabupaten");

        try {
            DatabaseSupplier.addSupplier(new Supplier( "Erna", "erna@mail.com", "081234567", l1));

            DatabaseItem.addItem(new Item("erna", ItemStatus.New, 50000, DatabaseSupplier.getSupplier(1), ItemCategory.Electronics));
            DatabaseItem.addItem(new Item("erna", ItemStatus.New, 50000, DatabaseSupplier.getSupplier(2), ItemCategory.Electronics));
            DatabaseItem.addItem(new Item("erna", ItemStatus.New, 50000, DatabaseSupplier.getSupplier(3), ItemCategory.Electronics));

        } catch (Exception e) {

        }

    }
}