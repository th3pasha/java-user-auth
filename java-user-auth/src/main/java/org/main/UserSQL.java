package org.main;

import java.sql.*;
import java.util.List;

public class UserSQL
{
    User user;
    List<String> users;
    public UserSQL() throws SQLException
    {
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        Connection conn = DriverManager.getConnection(url,"system","oracle");

        Statement stmt = conn.createStatement();
        ResultSet rset = stmt.executeQuery("select * from SYSTEM.users");

        while (rset.next())
        {
            user = new User(rset.getString(2), rset.getString(3));
            System.out.println(user);
        }

        stmt.close();
    }
}
