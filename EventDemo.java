import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventDemo extends JFrame{
private  JLabel lblMessage;
private JButton btnClick;

public EventDemo(){
setTitle("DElegation Event Title Model");
setSize(350,200);
setLayout(new FlowLayout());
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

btnClick = new JButton("click me");
lblMessage = new JLabel("button not clciked yet");

add(btnClick);
add(lblMessage);
btnClick.addActionListener(new ButtonHandler());
setVisible(true);
}
 
 private class ButtonHandler implements ActionListener{
 @Override
 public void actionPerformed(ActionEvent e){
 lblMessage.setText("button clicked event handled");
 }
 }
 public static void main(String[]args)
 {
 new EventDemo();
 }
 }
 
