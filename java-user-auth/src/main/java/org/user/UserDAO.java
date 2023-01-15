package org.user;

import org.user.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO
{
    List<User> users;
    User user;

    Connection conn;
    String url;
    Statement stmt;
    ResultSet rset;


    public UserDAO() throws SQLException
    {
        url = "jdbc:oracle:thin:@localhost:1521:XE";
        conn = DriverManager.getConnection(url,"system","oracle");
        users = new ArrayList<>();

    }

    public List<User> addUser() throws SQLException
    {
        stmt = conn.createStatement();
        rset = stmt.executeQuery("select * from SYSTEM.USERS");

        while(rset.next())
        {
            user = new User(rset.getString("userid"),rset.getString("username"), rset.getString("password"));
            users.add(user);
        }

        stmt.close();

        return users;
    }
}
