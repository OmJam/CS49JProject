import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class studentGUI implements ActionListener {

    public static LinkedList<assignStudent> ENGRschool = new LinkedList<assignStudent>();
    public static ArrayList<assignStudent> SCIschool = new ArrayList<assignStudent>();
    public static Stack<assignStudent> BIOschool = new Stack<assignStudent>();
    public static ArrayList<assignStudent> Professor = new ArrayList<assignStudent>();

    static JFrame frame = new JFrame();
    static JButton enterButton = new JButton("ENTER");
    static JButton resetButton = new JButton("RESET");
    static JLabel userNameLabel = new JLabel("Name: ");
    static JLabel userAgeLabel = new JLabel("Age: ");
    static JLabel header = new JLabel("Enter Student Information");
    static JTextField userNameField = new JTextField();
    static JTextField userAgeField = new JTextField();
    static JLabel schoolInfoLabel = new JLabel("WRITE: Engineering, Science, Biology, or Professor");
    static JTextField userSchoolField = new JTextField();
    static JLabel userSchoolLabel = new JLabel("School: ");

    studentGUI() {

        userNameLabel.setBounds(50, 100, 75, 25);
        userAgeLabel.setBounds(50, 150, 75, 25);
        header.setBounds(125, 50, 250, 35);
        header.setFont(new Font(null, Font.BOLD, 12));

        userNameField.setBounds(125, 100, 200, 25);
        userAgeField.setBounds(125, 150, 200, 25);

        resetButton.setBounds(225, 300, 100, 25);
        enterButton.setBounds(125, 300, 100, 25);

        schoolInfoLabel.setBounds(50, 250, 500, 25);
        userSchoolField.setBounds(125, 200, 200, 25);
        userSchoolLabel.setBounds(50, 200, 75, 25);

        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == enterButton) {

                    if (userSchoolField.getText().toLowerCase().equals("engineering")) {
                        String studentName = userNameField.getText();
                        int studentAge = Integer.parseInt(userAgeField.getText());

                        ENGRstudent create = new ENGRstudent(studentName, studentAge);
                        create.printInfo();
                        ENGRschool.add(create);
                        userNameField.setText("");
                        userAgeField.setText("");
                        userSchoolField.setText("");
                    }

                    else if (userSchoolField.getText().toLowerCase().equals("science")) {
                        String studentName = userNameField.getText();
                        int studentAge = Integer.parseInt(userAgeField.getText());

                        SCIstudent create = new SCIstudent(studentName, studentAge);
                        create.printInfo();
                        SCIschool.add(create);
                        userNameField.setText("");
                        userAgeField.setText("");
                        userSchoolField.setText("");

                    } else if (userSchoolField.getText().toLowerCase().equals("biology")) {
                        String studentName = userNameField.getText();
                        int studentAge = Integer.parseInt(userAgeField.getText());

                        BIOstudent create = new BIOstudent(studentName, studentAge);
                        create.printInfo();
                        BIOschool.push(create);
                        userNameField.setText("");
                        userAgeField.setText("");
                        userSchoolField.setText("");
                    } else if (userSchoolField.getText().toLowerCase().equals("professor")) {
                        String studentName = userNameField.getText();
                        int studentAge = Integer.parseInt(userAgeField.getText());

                        Professor create = new Professor(studentName, studentAge);
                        create.printInfo();
                        Professor.add(create);
                        userNameField.setText("");
                        userAgeField.setText("");
                        userSchoolField.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "Enter a valid school", "INVALID", //
                                JOptionPane.PLAIN_MESSAGE);

                    }
                }

            }

        });

        resetButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if (e.getSource() == resetButton) {
                    userNameField.setText("");
                    userAgeField.setText("");
                    userSchoolField.setText("");
                }

            }

        });

        frame.add(schoolInfoLabel);
        frame.add(userSchoolField);
        frame.add(userSchoolLabel);
        frame.add(userAgeField);
        frame.add(userNameField);
        frame.add(userAgeLabel);
        frame.add(userNameLabel);
        frame.add(enterButton);
        frame.add(resetButton);
        frame.add(header);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        studentGUI student = new studentGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

}
