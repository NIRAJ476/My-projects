package nit;

import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class FrameButton extends JFrame 
{
	JButton bt;
	JTextField t;
	JLabel l,msg;
    FrameButton()
    {
    	this.setSize(800,400);
    	this.setTitle("Frame");
    	this.setVisible(true);
    	this.setLayout(null);
    	l=new JLabel("Enter Name:");
    	l.setBounds(50,50,250,60);
    	l.setFont(new Font("Serif",Font.BOLD,40));
    	add(l);
    	t=new JTextField("");
    	t.setBounds(310,50,200,60);
    	t.setFont(new Font("Serif",Font.BOLD,40));
    	add(t);
    	bt=new JButton("Enter");
    	bt.setBounds(520,50,150,50);
    	bt.setFont(new Font("Serif",Font.BOLD,40));
    	bt.setForeground(Color.blue);
    	add(bt);
    	bt.addActionListener(new ActionListener()
    			{
    		      public void actionPerformed(ActionEvent ae)
    		      {
    		    	  String name=t.getText();
    		    	  msg.setText("Hello "+name);
				  }
    			}
    	);
    	msg=new JLabel("");
    	msg.setBounds(50,150,400,60);
    	msg.setFont(new Font("Serif",Font.BOLD,40));
    	add(msg);
    }
	public static void main(String[] args) 
	{
		new FrameButton();

	}

}
