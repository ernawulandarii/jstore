package jstore.controller;

import jstore.DatabaseSupplier;
import jstore.Supplier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class SupplierController {

    @RequestMapping(value = "/suppliers", method= RequestMethod.GET)
    public ArrayList<Supplier> supplierList()
    {
        ArrayList<Supplier> list;
        try {
            list = DatabaseSupplier.getSupplierDatabase();
        } catch (Exception ex) {
            ex.getMessage();
            return null;
        }
        return list;
    }

    @RequestMapping(value = "/suppliers/{id_supplier}", method= RequestMethod.GET)
    public Supplier getItemFromID(@PathVariable int id_supplier)
    {
        Supplier supplier;
        try {
            supplier = DatabaseSupplier.getSupplier(id_supplier);
        } catch (Exception ex) {
            ex.getMessage();
            return null;
        }
        return supplier;
    }
}
