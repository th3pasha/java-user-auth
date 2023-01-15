package org.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class Gui extends Frame
{
    TextField userTextField;
    JPasswordField passTextField;
    Button enterButton;

    public Gui(List<User> users)
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

        enterButton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (enterButton.isEnabled())
                {
                    for (int i = 0; i < users.size(); i++)
                    {

                        if (users.get(i).getUsername().equals(userTextField.getText()))
                        {
                            if (users.get(i).getPassword().equals(passTextField.getText()))
                            {
                                System.out.println("true");
                            }
                            else
                            {
                                System.out.println("pass false");
                            }
                        }
                        else
                        {

                        }
                    }
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
