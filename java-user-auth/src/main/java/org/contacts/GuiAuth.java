package org.contacts;

import org.user.User;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.List;

public class GuiAuth extends Frame
{

    TextField nomTextField;
    TextField prenomTextField;
    TextField emailTextField;

    Button submitButton;
    Button importButton;

    public GuiAuth(List<User> users)
    {
        setLayout(new FlowLayout(FlowLayout.LEADING));
        setSize(200, 200);

        submitButton = new Button("Valider");
        importButton = new Button("Importer");
        nomTextField = new TextField();
        nomTextField.setPreferredSize(new Dimension(70, 20));
        prenomTextField = new TextField();
        prenomTextField.setPreferredSize(new Dimension(70, 20));
        emailTextField = new TextField();
        emailTextField.setPreferredSize(new Dimension(70,20));

        add(new Label("Nom       "));
        add(nomTextField);
        add(new Label("Prenom    "));
        add(prenomTextField);
        add(new Label("Email     "));
        add(emailTextField);

        add(submitButton);
        add(importButton);

        setVisible(true);
        setResizable(false);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (submitButton.isEnabled())
                {
                    Contacts contacts = new Contacts(nomTextField.getText(), prenomTextField.getText(), emailTextField.getText());
                    try {
                        new ContactDAO(contacts);
                    } catch (SQLException ex) {
                        throw new RuntimeException(ex);
                    }
                    System.out.println(contacts.toString());
                }
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
