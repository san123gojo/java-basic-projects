import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingEventsDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Events Demo");
        frame.setSize(450, 300);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Enter your name:");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Submit");
        JLabel output = new JLabel("");
        JCheckBox checkBox = new JCheckBox("Show Greeting");

        // Button Action Listener (Logic from your notes)
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (checkBox.isSelected()) {
                    output.setText("Hello, " + textField.getText() + "!");
                } else {
                    output.setText("Greeting Disabled");
                }
            }
        });

        // Mouse Listener for Hover Effect
        button.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                button.setBackground(Color.YELLOW);
            }
            public void mouseExited(MouseEvent e) {
                button.setBackground(null);
            }
        });

        // Window Listener
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(frame, "Window is Closing... Goodbye!");
            }
        });

        // Adding components to frame
        frame.add(label);
        frame.add(textField);
        frame.add(button);
        frame.add(checkBox);
        frame.add(output);
        
        frame.setVisible(true);
    }
}