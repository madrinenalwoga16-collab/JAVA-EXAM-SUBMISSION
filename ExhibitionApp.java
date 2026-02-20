import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class ExhibitionApp {
    public static void main(String[] args) {

        JFrame frame = new JFrame("VUE Exhibition Registration");
        frame.setSize(400, 400);
        frame.setLayout(new GridLayout(8,2));

        JTextField regID = new JTextField();
        JTextField name = new JTextField();
        JTextField faculty = new JTextField();
        JTextField project = new JTextField();
        JTextField contact = new JTextField();
        JTextField email = new JTextField();

        JButton register = new JButton("Register");
        JButton clear = new JButton("Clear");
        JButton exit = new JButton("Exit");

        frame.add(new JLabel("Registration ID")); frame.add(regID);
        frame.add(new JLabel("Student Name")); frame.add(name);
        frame.add(new JLabel("Faculty")); frame.add(faculty);
        frame.add(new JLabel("Project Title")); frame.add(project);
        frame.add(new JLabel("Contact Number")); frame.add(contact);
        frame.add(new JLabel("Email Address")); frame.add(email);

        frame.add(register); frame.add(clear);
        frame.add(exit);

        register.addActionListener(e -> {
            try {
                Connection conn = DriverManager.getConnection(
                    "jdbc:ucanaccess://VUE_Exhibition.accdb");
                PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO Participants VALUES (?,?,?,?,?,?)");

                ps.setString(1, regID.getText());
                ps.setString(2, name.getText());
                ps.setString(3, faculty.getText());
                ps.setString(4, project.getText());
                ps.setString(5, contact.getText());
                ps.setString(6, email.getText());

                ps.executeUpdate();
                JOptionPane.showMessageDialog(frame, "Registered Successfully");
                conn.close();

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Database Error");
            }
        });

        clear.addActionListener(e -> {
            regID.setText(""); name.setText(""); faculty.setText("");
            project.setText(""); contact.setText(""); email.setText("");
        });

        exit.addActionListener(e -> System.exit(0));
        frame.setVisible(true);
    }
} 
    

