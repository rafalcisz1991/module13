package com.kodilla.hibernate.invoice.dao;


import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ItemDao itemDao;

    @Autowired
    private ProductDao productDao;



    private static final String NUMBER = "12345/2022";

    @Test
    void testInvoiceDaoSave() {
        //Given
        Invoice invoice = new Invoice(NUMBER);

        //When
        invoiceDao.save(invoice);

        //Then
        int id = invoice.getId();
        Optional<Invoice> readInvoice = invoiceDao.findById(id);
        assertTrue(readInvoice.isPresent());

        //CleanUp
        invoiceDao.deleteById(id);
    }

    @Test
    void testSaveItemsAndProducts() {
        //Given
        Product notebook = new Product("Notebook");
        Item notebooks = new Item(new BigDecimal("399.99"), 10);
        notebooks.setProduct(notebook);
        ArrayList<Item> notebookItem = new ArrayList<>();
        notebookItem.add(notebooks);
        notebook.setItems(notebookItem);

        Invoice invoice1 = new Invoice(NUMBER);

        notebooks.setInvoice(invoice1);
        invoice1.setItems(notebookItem);

        //When
        //itemDao.save(notebooks);
        productDao.save(notebook);

        invoiceDao.save(invoice1);

        int expectedInvoiceID = invoice1.getId();
        String expectedInvoiceNumber = invoice1.getNumber();
        BigDecimal expectedInvoiceValue = (invoice1.getItems().get(0).getValue());
        String allProductsNames = invoice1.getItems().get(0).getProduct().getName();

        //Then
        assertEquals(0, expectedInvoiceID);
        assertEquals("12345/2022", expectedInvoiceNumber);
        assertEquals(new BigDecimal("1234,10"), expectedInvoiceValue);
        assertEquals("qwr", allProductsNames);

        //cleanUp
        invoiceDao.deleteById(expectedInvoiceID);
        invoiceDao.deleteAll();
    }
}











 /*   @Test
    void testSaveItemsAndProducts() {
        //Given
        Product notebook = new Product("Notebook");
        Item notebooks = new Item(new BigDecimal("399.99"), 10);
        notebooks.setProduct(notebook);
        itemDao.save(notebooks);
        ArrayList<Item> notebookItem = new ArrayList<>();
        notebookItem.add(notebooks);
        notebook.setItems(notebookItem);
        productDao.save(notebook);

        Invoice invoice1 = new Invoice(NUMBER);
        notebooks.setInvoice(invoice1);
        invoice1.setItems(notebookItem);

        //When
        invoiceDao.save(invoice1);
        int expectedInvoiceID = invoice1.getId();
        String expectedInvoiceNumber = invoice1.getNumber();
        BigDecimal expectedInvoiceValue = (invoice1.getItems().get(0).getValue());
        String allProductsNames = invoice1.getItems().get(0).getProduct().getName();

        //Then
        assertEquals(0, expectedInvoiceID);
        assertEquals("12345/2022", expectedInvoiceNumber);
        assertEquals(new BigDecimal("1234,10"), expectedInvoiceValue);
        assertEquals("qwr", allProductsNames);

        //cleanUp
        invoiceDao.deleteById(expectedInvoiceID);
        invoiceDao.deleteAll();
    }
}*/