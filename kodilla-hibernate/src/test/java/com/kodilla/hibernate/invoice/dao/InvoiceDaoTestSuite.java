package com.kodilla.hibernate.invoice.dao;


import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired ItemDao itemDao;

    @Autowired ProductDao productDao;

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
        Product iPhone = new Product("iPhone");

        Item notebooks = new Item(new BigDecimal("399.99"), 10);
        Item iPhones = new Item(new BigDecimal("99.99"), 20);

        Invoice invoice1 = new Invoice(NUMBER);

        notebook.getItems().add(notebooks);
        iPhone.getItems().add(iPhones);
        iPhone.getItems().add(iPhones);
        invoice1.getItems().add(notebooks);
        invoice1.getItems().add(iPhones);

        //When
        invoiceDao.save(invoice1);
        int expectedInvoiceID = invoice1.getId();
        String expectedInvoiceNumber = invoice1.getNumber();
        BigDecimal expectedInvoiceValue = (invoice1.getItems().get(0).getValue())
                .add(invoice1.getItems().get(0).getValue());
        String allProductsNames = invoice1.getItems().get(0).getProduct().getName()
                + invoice1.getItems().get(1).getProduct().getName();

        //Then
        assertEquals(0, expectedInvoiceID);
        assertEquals("12345/2022", expectedInvoiceNumber);
        assertTrue(new BigDecimal("1234,10").equals(expectedInvoiceValue));
        assertEquals("qwr", allProductsNames);

        //cleanUp
        //invoiceDao.deleteById(expectedInvoiceID);
    }
}
