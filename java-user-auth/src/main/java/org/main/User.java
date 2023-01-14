package org.main;

import java.util.UUID;

public class User
{
    UUID id;
    String username, password;

    public User(String username, String password)
    {
        this.id = UUID.randomUUID();
        this.username = username;
        this.password = password;
    }
    public User()
    {

    }
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString()
    {
        return "User{ " +
                "userID='" + id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
