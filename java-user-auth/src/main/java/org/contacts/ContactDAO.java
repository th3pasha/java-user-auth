package org.contacts;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContactDAO
{
    Connection conn;
    String url, sql, nom, prenom, email;
    Statement stmt;
    ResultSet rset;

    public ContactDAO(Contacts contacts) throws SQLException
    {
        url = "jdbc:oracle:thin:@localhost:1521:XE";
        conn = DriverManager.getConnection(url,"system","oracle");

        sql = "INSERT INTO contacts values(" +contacts.getNom() +"," +contacts.getPrenom() +"," + contacts.getEmail() +")";
        stmt = conn.createStatement();

        rset = stmt.executeQuery(sql);
        rset.close();
    }
}
