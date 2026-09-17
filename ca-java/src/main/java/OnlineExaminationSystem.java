import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OnlineExaminationSystem extends JFrame {

    JTextField nameField;
    JButton startButton, submitButton;
    JLabel status;

    public OnlineExaminationSystem() {

        setTitle("Online Examination System");
        setSize(500, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        nameField = new JTextField(20);
        startButton = new JButton("Start Exam");
        submitButton = new JButton("Submit");
        status = new JLabel("Exam Not Started");

        add(new JLabel("Student Name:"));
        add(nameField);
        add(startButton);
        add(submitButton);
        add(status);

        // a) Start Exam button - ActionListener
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                status.setText("Exam Started");
            }
        });

        // b) Submit button - Anonymous ActionListener
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                status.setText("Answer Submitted Successfully");
            }
        });

        // c) Mouse event handling using MouseAdapter
        startButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                status.setText("Mouse Entered Start Exam Button");
            }
        });

        submitButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                status.setText("Mouse Entered Submit Button");
            }
        });

        // d) Keyboard event handling using KeyAdapter
        nameField.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                int count = nameField.getText().length();
                status.setText("Characters Entered: " + count);
            }
        });

        // e) Event source, event object, listener and listener method
        // Source = submitButton
        // Event Object = ActionEvent e
        // Listener = ActionListener
        // Listener Method = actionPerformed()
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Object source = e.getSource();

                if (source == submitButton) {
                    System.out.println("Event Source: " + source);
                    System.out.println("Event Object: " + e);
                    System.out.println("Listener: ActionListener");
                    System.out.println("Listener Method: actionPerformed()");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new OnlineExaminationSystem();
    }
}