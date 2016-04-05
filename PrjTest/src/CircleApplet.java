import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Label;

public class CircleApplet extends JApplet {

    @Override
    public void init() {
        add(new Circle());
    }

    public class Circle extends JPanel {

        private static final int D_W = 500;
        private static final int D_H = 500;

        int x = 0;
        int y = 50;
        int watch = 0;
        
        Label disp_watch = new Label("0000");
        
        public Circle() {
            setBackground(Color.white);
            
            Timer timer = new Timer(500, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if(x+5 < getSize().width/4){
                	 x += 5;
                    }
                    //y += 5;
                    watch++;
                    repaint();
                }
            });
            timer.start(); 
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.black);
            g.fillOval(x, y, 20, 20);
            disp_watch.setText(watch+"");
            add(disp_watch);
            disp_watch.setLocation(getSize().width-10, 2);
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(D_W, D_H);
        }

    }
}