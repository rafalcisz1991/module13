package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StoredProcTestSuite {

    @Test
    public void testUpdateVipLevels() throws SQLException {
        // Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"Not set\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"Not set\"";


        // When
        String sqlProcedureCall = "CALL UpdateVipLevels()";
        statement.execute(sqlProcedureCall);

        // Then
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = -1;
        while (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }

        rs.close();
        statement.close();
        assertEquals(0, howMany);
    }

    @Test
    void testUpdateBestsellers() throws SQLException{
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE books SET BESTSELLER= FALSE";
        Statement statement = dbManager.getConnection().createStatement();
        statement.executeUpdate(sqlUpdate);
        String sqlProcedureCall = "CALL UpdateBestsellerStatus()";
        statement.executeQuery(sqlProcedureCall);

        //When
        String sqlCheckIsNotBestSeller = "SELECT COUNT(*) AS HOW_MANY FROM books WHERE BESTSELLER=FALSE";
        String sqlCheckIsBestSeller = "SELECT COUNT(*) AS HOW_MANY FROM books WHERE BESTSELLER=TRUE";
        String sqlCountAllBooks = "SELECT COUNT(*) AS HOW_MANY FROM books";
        String sqlGetBestsellerTitle = "SELECT TITLE, PUBYEAR FROM books WHERE BESTSELLER=TRUE";

        //Then
        ResultSet rs1 = statement.executeQuery(sqlCheckIsNotBestSeller);
        int howMany1 = 0;
        while (rs1.next()) {
            howMany1 = rs1.getInt("HOW_MANY");
        }
        rs1.close();

        ResultSet rs2 = statement.executeQuery(sqlCheckIsBestSeller);
        int howMany2 = 0;
        while (rs2.next()) {
            howMany2 = rs2.getInt("HOW_MANY");
        }
        rs2.close();

        ResultSet rs3 = statement.executeQuery(sqlCountAllBooks);
        int howMany3 = 0;
        while (rs3.next()) {
            howMany3 = rs3.getInt("HOW_MANY");
        }
        rs3.close();

        ResultSet rs4 = statement.executeQuery(sqlGetBestsellerTitle);
        rs4.next();
        String bookTitle = "Title: " + rs4.getString("TITLE");
        int pubYear = rs4.getInt("PUBYEAR");
        rs4.close();

        statement.close();

        assertEquals(4, howMany1);
        assertEquals(1, howMany2);
        assertEquals(5, howMany3);
        assertEquals("Title: Mans Fate", bookTitle);
        assertEquals(1933, pubYear);
    }
}


