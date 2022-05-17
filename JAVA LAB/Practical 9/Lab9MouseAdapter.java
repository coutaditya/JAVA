import java.awt.*;    
import java.awt.event.*;    

public class Lab9MouseAdapter {
    public class MouseAdapterProg extends MouseAdapter{
        Frame f;
    
        MouseAdapterProg(){
            f = new Frame ("Mouse Adapter");
            f.addMouseListener(this);
    
            f.setSize (300, 300);    
            f.setLayout (null);    
            f.setVisible (true);
        }
    
        public void mouseClicked (MouseEvent e) {    
            Graphics g = f.getGraphics();      
            g.setColor (Color.BLUE);    
            g.fillRect (e.getX(), e.getY(), 30, 30);    
        }    
    }

    public static void main(String[] args) {
        Lab9MouseAdapter l = new Lab9MouseAdapter();
        
        MouseAdapterProg m = l.new MouseAdapterProg();    
    }
}
