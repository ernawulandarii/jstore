package jstore.controller;

import jstore.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class InvoiceController {

    @RequestMapping(value = "/invoicecustomer/{id_customer}", method= RequestMethod.GET)
    public ArrayList<Invoice> invoiceCust(@PathVariable int id_customer)
    {
        ArrayList<Invoice> list;
        Customer customer;
        try {
            customer = DatabaseCustomer.getCustomer(id_customer);
            list = DatabaseInvoice.getActiveOrder(customer);
            return list;
        } catch (Exception ex) {
            ex.getMessage();
            return null;
        }

    }

    @RequestMapping(value = "/invoice/{id_invoice}", method= RequestMethod.GET)
    public Invoice getInvoice(@PathVariable int id_invoice)
    {
        Invoice invoice;
        try {
            invoice = DatabaseInvoice.getInvoice(id_invoice);
        } catch (Exception ex) {
            ex.getMessage();
            return null;
        }
        return invoice;
    }

    @RequestMapping(value = "/createinvoicepaid", method= RequestMethod.POST)
    public Invoice createInvoicePaid(@RequestParam(value="listItem") ArrayList<Integer> listItem,
                                     @RequestParam(value="id_customer") int id_customer)
    {
        Customer customer;
        try {
            customer = DatabaseCustomer.getCustomer(id_customer);
        } catch (Exception ex) {
            ex.getMessage();
            return null;
        }

        Invoice invoice = new Sell_Paid(listItem, customer);

        try {
            DatabaseInvoice.addInvoice(invoice);
        } catch (Exception ex) {
            ex.getMessage();
            return null;
        }
        return invoice;
    }

    @RequestMapping(value = "/createinvoiceunpaid", method= RequestMethod.POST)
    public Invoice createInvoiceUnpaid(@RequestParam(value="listItem") ArrayList<Integer> listItem,
                                       @RequestParam(value="id_customer") int id_customer)
    {
        Customer customer;
        try {
            customer = DatabaseCustomer.getCustomer(id_customer);
        } catch (Exception ex) {
            ex.getMessage();
            return null;
        }

        Invoice invoice = new Sell_Unpaid(listItem, customer);

        try {
            DatabaseInvoice.addInvoice(invoice);
        } catch (Exception ex) {
            ex.getMessage();
            return null;
        }
        return invoice;
    }

    @RequestMapping(value = "/createinvoiceinstallment", method= RequestMethod.POST)
    public Invoice createInvoiceInstallment(@RequestParam(value="listItem") ArrayList<Integer> listItem,
                                            @RequestParam(value="installment_period") int installment_period,
                                            @RequestParam(value="id_customer") int id_customer)
    {
        Customer customer;
        try {
            customer = DatabaseCustomer.getCustomer(id_customer);
        } catch (Exception ex) {
            ex.getMessage();
            return null;
        }

        Invoice invoice = new Sell_Installment(listItem, installment_period,customer);

        try {
            DatabaseInvoice.addInvoice(invoice);
        } catch (Exception ex) {
            ex.getMessage();
            return null;
        }
        return invoice;
    }

    @RequestMapping(value = "/canceltransaction/{id_invoice}", method= RequestMethod.POST)
    public Invoice cancelTransaction(@PathVariable int id_invoice)
    {
        Invoice invoice;
        try {
            invoice = DatabaseInvoice.getInvoice(id_invoice);
            Transaction.cancelTransaction(invoice);
        } catch (Exception ex) {
            ex.getMessage();
            return null;
        }
        return invoice;
    }

    @RequestMapping(value = "/finishtransaction/{id_invoice}", method= RequestMethod.POST)
    public Invoice finishTransaction(@PathVariable int id_invoice)
    {
        Invoice invoice;
        try {
            invoice = DatabaseInvoice.getInvoice(id_invoice);
            Transaction.finishTransaction(invoice);
        } catch (Exception ex) {
            ex.getMessage();
            return null;
        }
        return invoice;
    }
}
