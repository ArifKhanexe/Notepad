
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class About extends JFrame implements ActionListener{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton b1;
	About(){
		setBounds(600,200,700,600);
		setLayout(null);
		
	    ImageIcon window= new ImageIcon("windows.png");
	    Image i2= window.getImage().getScaledInstance(400,80,Image.SCALE_DEFAULT);
	    ImageIcon i3= new ImageIcon(i2);
	    JLabel l1= new JLabel(i3);
	    l1.setBounds(150,40,400,80);
	    add(l1);
	    
	    ImageIcon notepad= new ImageIcon("notepad.png");
	    Image i4= notepad.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
	    ImageIcon i5= new ImageIcon(i4);
	    JLabel l2= new JLabel(i5);
	    l2.setBounds(50,180,70,70);
	    add(l2);
	    
	    JLabel l3=new JLabel("<html> Created by Arif Khan <br> on November 2021 <br> All rights reserved <br> Notepad is a simple text editor for Windows; it creates and edits plain text documents. </html> ");
	    l3.setBounds(150,130,500,300);
	    l3.setFont(new Font("SAN SERIF", Font.PLAIN, 20));
	    add(l3);
	    
	    b1=new JButton("OK");
	    b1.setBounds(580,500,80,25);
	    b1.addActionListener(this);
	    add(b1);
	}
	
	public void actionPerformed(ActionEvent ae) {
		this.setVisible(false);
		}
	
	public static void main(String[] args) {
		
		new About().setVisible(true);
		
	}
}
