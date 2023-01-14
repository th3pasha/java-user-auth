package org.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui extends Frame
{
    TextField userTextField;
    JPasswordField passTextField;
    Button enterButton;

    public Gui()
    {
        setLayout(new FlowLayout(FlowLayout.LEADING));
        setSize(200,200);

        enterButton = new Button("Enter");
        userTextField = new TextField();
        userTextField.setPreferredSize(new Dimension(70,20));
        passTextField = new JPasswordField();
        passTextField.setPreferredSize(new Dimension(70,20));

        add(new Label("Login        "));
        add(userTextField);
        add(new Label("Password"));
        add(passTextField);
        add(enterButton);

        setVisible(true);
        setResizable(false);


        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
