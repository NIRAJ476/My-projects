import java.awt.Font;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.ArithmeticException;
public class SimpleCalculator extends JFrame
{
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4,b5,b6,b7;
	SimpleCalculator()
	{
		this.setSize(500,400);
		this.setTitle("Calculator");
		this.setVisible(true);
		this.setLayout(null);
		l1=new JLabel("Calculator");
		l1.setBounds(150,0,500,40);
		l1.setFont(new Font("Times new roman",Font.BOLD,40));
		add(l1);
		l2=new JLabel("Enter NO.1");
		l2.setBounds(10,50,210,40);
		l2.setFont(new Font("Suns Serif",Font.BOLD,40));
		add(l2);
		l3=new JLabel("Enter No.2");
		l3.setBounds(10,100,200,40);
		l3.setFont(new Font("Suns Serif",Font.BOLD,40));
		add(l3);
		l4=new JLabel("Result");
		l4.setBounds(10,150,200,40);
		l4.setFont(new Font("Times new roman",Font.BOLD,40));
		add(l4);
		t1=new JTextField("");
		t1.setBounds(230,50,200,40);
		t1.setFont(new Font("Times new roman",Font.CENTER_BASELINE,40));
		add(t1);
		t2=new JTextField("");
		t2.setBounds(230,100,200,40);
		t2.setFont(new Font("Times new roman",Font.CENTER_BASELINE,40));
		add(t2);
		t3=new JTextField("");
		t3.setBounds(230,150,200,40);
		t3.setFont(new Font("Times new roman",Font.CENTER_BASELINE,40));
		add(t3);
		b1=new JButton("Add");
		b1.setBounds(10,200,110,50);
		b1.setFont(new Font("Times new roman",Font.BOLD,40));
		add(b1);
		b1.addActionListener(new ActionListener()
				{
			      public void actionPerformed(ActionEvent ae)
			      {
			    	  String s1=t1.getText();
			    	  String s2=t2.getText();
			    	  double a=Double.parseDouble(s1);
			    	  double b=Double.parseDouble(s2);
			    	  double c=a+b;
			    	  String s=Double.toString(c);
			    	  t3.setText(s);
			      }
				});
		b2=new JButton("Sub");
		b2.setBounds(130,200,100,50);
		b2.setFont(new Font("Times new roman",Font.BOLD,40));
		add(b2);
		b2.addActionListener(new ActionListener()
				{
			      public void actionPerformed(ActionEvent ae)
			      {
			    	  String s1=t1.getText();
			    	  String s2=t2.getText();
			    	  double a=Double.parseDouble(s1);
			    	  double b=Double.parseDouble(s2);
			    	  double c=a-b;
			    	  String s=Double.toString(c);
			    	  t3.setText(s);
			      }
				});
		b3=new JButton("Mul");
		b3.setBounds(240,200,110,50);
		b3.setFont(new Font("Times new roman",Font.BOLD,40));
		add(b3);
		b3.addActionListener(new ActionListener()
				{
			     public void actionPerformed(ActionEvent ae)
		          {
		    	  String s1=t1.getText();
		    	  String s2=t2.getText();
		    	  double a=Double.parseDouble(s1);
		    	  double b=Double.parseDouble(s2);
		    	  double c=a*b;
		    	  String s=Double.toString(c);
		    	  t3.setText(s);
		        }
				});
		b4=new JButton("Div");
		b4.setBounds(360,200,110,50);
		b4.setFont(new Font("Times new roman",Font.BOLD,40));
		add(b4);
		b4.addActionListener(new ActionListener()
		{
	     public void actionPerformed(ActionEvent ae)
          {
    	  String s1=t1.getText();
    	  String s2=t2.getText();
    	  double a=Double.parseDouble(s1);
    	  double b=Double.parseDouble(s2);
    	  try
    	  {
    	  double c=a/b;
    	  String s=Double.toString(c);
    	  t3.setText(s);
    	  }
    	  catch(ArithmeticException Ae)
    	  {
    		t3.setText("Error");
    	  }
        }
		});
		b5=new JButton("Exit");
		b5.setBounds(240,300,110,50);
		b5.setFont(new Font("Times new roman",Font.BOLD,40));
		add(b5);
		b5.addActionListener(new ActionListener()
				{
			       public void actionPerformed(ActionEvent ae)
			       {
			    	   System.exit(1);
			       }
				});
		b6=new JButton("clear");
		b6.setBounds(100,300,130,50);
		b6.setFont(new Font("Times new roman",Font.BOLD,40));
		add(b6);
		b6.addActionListener(new ActionListener()
				{
			      public void actionPerformed(ActionEvent ae)
			      {
			    	  t1.setText("");
			    	  t2.setText("");
			    	  t3.setText(" ");
			      }
				});
		}
	public static void main(String[] args)
	{
       new SimpleCalculator();
	}

}
