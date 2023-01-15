package org.main;

import org.user.Gui;
import org.user.User;
import org.user.UserDAO;

import java.sql.SQLException;
import java.util.List;

public class Main
{
    public static void main(String[] args) throws SQLException
    {

        UserDAO userdao = new UserDAO();
        List<User> users = userdao.addUser();
        System.out.println(users);
        Gui gui = new Gui(users);

    }
}