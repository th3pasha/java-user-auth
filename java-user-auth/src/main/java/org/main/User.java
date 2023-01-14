package org.main;

public class User
{
    String userID, username, password;

    public User(String userID, String username, String password)
    {
        this.userID = userID;
        this.username = username;
        this.password = password;
    }
    public User()
    {

    }

    @Override
    public String toString()
    {
        return "User{ " +
                "userID='" + userID + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
