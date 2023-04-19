package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrincipalPanel extends Container {
    private JButton nombreButton;
    private JButton IDButton;
public PrincipalPanel() {
    JFrame frame = new JFrame("PostGuy");
    frame.setContentPane(new PrincipalPanel());

    nombreButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
}
}
