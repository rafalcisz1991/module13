package com.kodilla.jdbc;

import org.junit.jupiter.api.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class DbManagerTestSuite {

    @Test
    void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        assertNotNull(dbManager.getConnection());
    }

    @Test
    void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(5, counter);
    }

    @Test
    void testSelectUsersAndPosts() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery1 = "SELECT U.FIRSTNAME, U.LASTNAME, P.USER_ID, COUNT(*) AS POSTS_NUMBER\n" +
                "FROM users U\n" +
                "JOIN posts p ON U.ID = p.USER_ID\n" +
                "GROUP BY USER_ID\n" +
                "HAVING COUNT(*) > 2";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery1);

        //Then
        String resultNames = "Result names are: ";
        int counter = 0;
        while (rs.next()) {
            if (counter == 0) {
                resultNames = resultNames + rs.getString("FIRSTNAME");
            } else {
                resultNames = resultNames + " and " + rs.getString("FIRSTNAME");
            }
            counter++;
        }
        rs.close();
        statement.close();
        assertEquals(2, counter);
        assertEquals("Result names are: John and Tom", resultNames);
    }
}


