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
        notebook.setItems(notebookItem);
        notebook.setItems(notebookItem);

        Invoice invoice1 = new Invoice(NUMBER);

        notebooks.setInvoice(invoice1);
        invoice1.setItems(notebookItem);


        //When
        invoiceDao.save(invoice1);
        productDao.save(notebook);
        itemDao.save(notebooks);
        //funkcje czyszczenia zadziałały dopiero po dodaniu poniższego wiersza
        invoice1.getItems().add(notebooks);

        int expectedInvoiceID = invoice1.getId();
        String expectedInvoiceNumber = invoice1.getNumber();
        BigDecimal expectedInvoiceValue = (invoice1.getItems().get(0).getValue());
        String allProductsNames = invoice1.getItems().get(0).getProduct().getName();


        //Then
        //assertEquals(194, expectedInvoiceID);
        assertEquals("12345/2022", expectedInvoiceNumber);
        assertEquals(new BigDecimal("3999.90"), expectedInvoiceValue);
        assertEquals("Notebook", allProductsNames);

        //cleanUp
        invoiceDao.deleteAll();
        productDao.deleteAll();
        itemDao.deleteAll();
    }
}











