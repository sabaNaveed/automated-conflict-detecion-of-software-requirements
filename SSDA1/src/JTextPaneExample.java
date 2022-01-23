import java.awt.BorderLayout;  
import java.awt.Color;  
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;  
import javax.swing.text.BadLocationException;  
import javax.swing.text.Document;  
import javax.swing.text.SimpleAttributeSet;  
import javax.swing.text.StyleConstants;  
public class JTextPaneExample {  
    public static void main(String args[]) throws BadLocationException {  
        //initialize
    	JFrame frame = new JFrame("GUI");  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        Container cp = frame.getContentPane();  
        JTextPane pane = new JTextPane();  
        JScrollPane scrollPane = new JScrollPane(pane);  
        final JTextArea outputText = new JTextArea();
        JLabel inputLbl = new JLabel("Enter your Expression: ");
        JButton btn=new JButton("Check Results");
        final JPanel outputPanel = new JPanel();
        //size set
        inputLbl.setBounds(10,16,84,20);
        outputText.setColumns(60);
        outputText.setRows(15);
        //add in panels
        outputPanel.add(btn);    
        outputPanel.add(outputText);
        
        //add in frame
        cp.add(inputLbl, BorderLayout.NORTH);  
        cp.add(scrollPane, BorderLayout.CENTER);
        cp.add(outputPanel, BorderLayout.SOUTH);
        frame.setSize(700, 600);  
        frame.setVisible(true);  
      }  
}
