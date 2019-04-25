package jstore.controller;

import jstore.DatabaseSupplier;
import jstore.Supplier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class SupplierController {

    @RequestMapping("/suppliers")
    public ArrayList<Supplier> supplierList(){
        return DatabaseSupplier.getSupplierDatabase();
    }

    @RequestMapping("/suppliers/{id_supplier}")
    public Supplier getSupplier(@PathVariable int id_supplier){
        return DatabaseSupplier.getSupplier(id_supplier);
    }
}
