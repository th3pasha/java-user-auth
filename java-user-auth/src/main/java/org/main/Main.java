package org.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) throws SQLException
    {
        List<User> users;

        UserDAO userdao = new UserDAO();
        users = userdao.addUser();

        System.out.println(users);

        Gui gui = new Gui(users);

    }
}