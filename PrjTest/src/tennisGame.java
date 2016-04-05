import java.applet.*; 
import java.awt.*; 
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowListener;

public class tennisGame extends Applet implements Runnable, KeyListener{ 

	Ball b;
	Platform p;
	
	public void init() { 
		setSize(500, 500);
		addKeyListener(this);
	} 
	
	public void start () { 
	    b= new Ball();
	    p= new Platform(getSize().width,getSize().height);
	    Thread thread = new Thread (this); 
	    thread.start (); 
	}
	
	public void paint(Graphics g) { 
	    b.paint(g);
	    p.paint(g);
	   
	}
	public void run(){
	    while (true){
	        b.update(this);
	        p.update(this,b);
	        
	        repaint();
	        try {
	            if(p.score<30){
	        	Thread.sleep(100);
	            }else if(p.score<100){
	            	Thread.sleep(50);
	            }
	            else if(p.score<130){
	            	Thread.sleep(30);
	            }
	        }
	        catch (InterruptedException e){
	            //e.printStackTrace();
	        }
	    }
	}
	@Override
	public void keyPressed(KeyEvent e) {
	    if(e.getKeyCode() == e.VK_RIGHT){
	        System.out.println("Pressed RIGHT");
	        p.moveRight();
	    }
	    if(e.getKeyCode() == e.VK_LEFT){
	        System.out.println("Pressed LEFT");
	        p.moveLeft(); 
	    }
	}
	@Override
	public void keyReleased(KeyEvent e) {
	
	}
	@Override
	public void keyTyped(KeyEvent e) {
	
	}
	
	
}