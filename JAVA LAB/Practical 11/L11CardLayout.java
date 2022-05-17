import java.awt.*;
import javax.swing.*;
import javax.swing.JButton;
import java.awt.event.*;
public class L11CardLayout extends JFrame implements ActionListener
{
    JButton b1, b2, b3, b4, b5;
    CardLayout cl;
    Container c;
    L11CardLayout ()
    {
        b1 = new JButton ("Button1");
        b2 = new JButton ("Button2");
        b3 = new JButton ("Button3");
        b4 = new JButton ("Button4");
        b5 = new JButton ("Button5");
        c = this.getContentPane ();
        cl = new CardLayout (10, 20);
        c.setLayout (cl);
        c.add ("Card1", b1);
        c.add ("Card2", b2);
        c.add ("Card3", b3);
        b1.addActionListener (this);
        b2.addActionListener (this);
        b3.addActionListener (this);
        setVisible (true);
        setSize (400, 400);
        setTitle ("Card Layout");
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed (ActionEvent ae)
    {
        cl.next (c);
    }
    public static void main (String[]args)
    {
        new L11CardLayout ();
    }
}
