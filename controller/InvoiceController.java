package jstore.controller;

import jstore.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

public class InvoiceController {
    @RequestMapping("/invoicecustomer/{id_customer}")
    public ArrayList<Invoice> invoiceCust(@PathVariable int id_customer){
        try{
            DatabaseInvoice.getActiveOrder(DatabaseCustomer.getCustomer(id_customer));
        }
        catch(CustomerDoesntHaveActiveException e){
            System.out.println(e);
        }
        return null;
    }

    @RequestMapping("/invoice/{id_invoice}")
    public Invoice getInvoice(int id_invoice){
        return DatabaseInvoice.getInvoice(id_invoice);

    }

    @RequestMapping(value = "/createinvoicepaid",method = RequestMethod.POST)
    public Invoice createInvoicePaid(@RequestParam(value = "listItem") ArrayList<Integer> listItem,
                              @RequestParam(value = "IDcustomer") @PathVariable int id_customer)
    {
        Invoice invoice = new Sell_Paid(listItem, DatabaseCustomer.getCustomer(id_customer));
        return invoice;
    }

    @RequestMapping(value = "/createinvoiceunpaid",method = RequestMethod.POST)
    public Invoice createInvoiceUnpaid(@RequestParam(value = "listItem") ArrayList<Integer> listItem,
                                     @RequestParam(value = "IDcustomer") @PathVariable int id_customer)
    {
        Invoice invoice = new Sell_Unpaid(listItem, DatabaseCustomer.getCustomer(id_customer));
        return invoice;
    }

    @RequestMapping(value = "/createinvoiceinstallment",method = RequestMethod.POST)
    public Invoice createInvoiceInstallment(@RequestParam(value = "listItem") ArrayList<Integer> listItem,
                                     @RequestParam(value = "durasiInstallment") @PathVariable int installment_period,
                                     @RequestParam(value = "IDcustomer") @PathVariable int id_customer)
    {
        Invoice invoice = new Sell_Installment(listItem, installment_period, DatabaseCustomer.getCustomer(id_customer));
        return invoice;
    }

    @RequestMapping(value = "/canceltransaction",method = RequestMethod.POST)
    public Invoice cancelTransaction(@RequestParam(value ="id") int id){
        try{
            Transaction.cancelTransaction(DatabaseInvoice.getInvoice(id));
        }catch(InvoiceNotFoundException e){
            System.out.println(e);
        }
        return DatabaseInvoice.getInvoice(id);
    }

    @RequestMapping(value = "/finishtransaction",method = RequestMethod.POST)
    public Invoice finishTransaction(@RequestParam(value ="id") int id){
        try{
            Transaction.cancelTransaction(DatabaseInvoice.getInvoice(id));
        }catch(InvoiceNotFoundException e){
            System.out.println(e);
        }
        return DatabaseInvoice.getInvoice(id);
    }

}

