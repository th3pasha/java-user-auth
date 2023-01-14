package org.main;

import java.sql.SQLException;

public class Main
{
    public static void main(String[] args) throws SQLException
    {
        User user = new User("admin","password");
        Gui gui = new Gui(user);

    }
}