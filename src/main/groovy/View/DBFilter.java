package View;

import Controller.DBController;
import Model.DBModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBFilter {

    public JPanel panel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton buscarButton;
    private JButton buscarButton1;
    private JButton buscarButton2;
    private JTextPane textPane1;

    public DBFilter() {
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DBModel db = new DBModel();
                try {
                    Connection conn  = db.connect();
                    DBController controller = new DBController(conn);
                    ResultSet res = controller.selectByID(textField1.getText());
                    while (res.next()) {
                        String author_id = res.getString("author_id");
                        String url = res.getString("url");
                        String name = res.getString("name");
                        String email = res.getString("email");
                        String affiliations = res.getString("affiliatios");
                        textPane1.setText("\nAuthor ID:" + author_id +"\n"+url+ "\nName: " + name + "\nEmail: " + email + "\nAffiliation: " +affiliations);
                    }
                        conn.close();

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        buscarButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DBModel db = new DBModel();
                try {
                    Connection conn  = db.connect();
                    DBController controller = new DBController(conn);
                    ResultSet res = controller.selectByAuthorID(textField2.getText());
                    while (res.next()) {
                        String author_id = res.getString("author_id");
                        String url = res.getString("url");
                        String name = res.getString("name");
                        String email = res.getString("email");
                        String affiliations = res.getString("affiliatios");
                        textPane1.setText("\nAuthor ID:" + author_id +"\n"+url+ "\nName: " + name + "\nEmail: " + email + "\nAffiliation: " +affiliations);
                    }
                        conn.close();

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        buscarButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DBModel db = new DBModel();
                try {
                    Connection conn  = db.connect();
                    DBController controller = new DBController(conn);
                    ResultSet res = controller.selectByName(textField3.getText());
                    while (res.next()) {
                        String author_id = res.getString("author_id");
                        String url = res.getString("url");
                        String name = res.getString("name");
                        String email = res.getString("email");
                        String affiliations = res.getString("affiliatios");
                        textPane1.setText("\nAuthor ID:" + author_id +"\n"+url+ "\nName: " + name + "\nEmail: " + email + "\nAffiliation: " +affiliations);
                    }
                        conn.close();

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
}
