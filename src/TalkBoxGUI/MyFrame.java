package TalkBoxGUI;

import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class MyFrame extends JFrame
{
    MyFrame() {
        setTitle("TalkBox Configuration App");//setting title of the window
        setVisible(true);
        setSize(600, 400);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        setLayout( new FlowLayout());
        String audioChoices[] = { "Happy", "Sad" ,"Excited", "Proud", "Tired", "Sick","Laughing", "Crying"};
        JComboBox audioFiles = new JComboBox(audioChoices);
        getContentPane().add(new JLabel("Feeling"));
        getContentPane().add(audioFiles);


        String btnChoices[] = { "1", "2" ,"3", "4", "5", "6"};
        JComboBox btnFiles = new JComboBox(btnChoices);
        getContentPane().add(new JLabel("Button Order"));
        getContentPane().add(btnFiles);

        JButton editBtn = new JButton();
        editBtn.setText("EDIT");
        getContentPane().add(editBtn);

        String audioList[] = { "Happy", "Sad" ,"Excited", "Proud", "Tired", "Sick"};
        JList initialList = new JList(audioList);
        getContentPane().add(new JLabel("Initial List"));
        getContentPane().add(initialList);

        JList updatedList = new JList(audioList);
        getContentPane().add(new JLabel("Updated List"));
        getContentPane().add(updatedList);

        JButton saveChangesBtn = new JButton();
        saveChangesBtn.setText("Save Changes");
        getContentPane().add(saveChangesBtn);
    }
}
