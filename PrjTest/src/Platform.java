import java.awt.Color;
import java.awt.Graphics;

public class Platform {

	private int x=0;
	private int y=0;
	int dx=0;
	private int width=120;
	private int height=20;
	public int score=0;
	int win_x=0,win_y=0;

	public Platform(int window_x, int window_y){
		x= window_x/2;
		y= window_y*3/4;
		win_x = window_x;
		win_y = window_y;
	}
	public void update(tennisGame tg,Ball b) {
	    if(checkForCollosion(b)==2 ){
	    		//&& b.getY()+b.getRadius()> y ){ 
		    	score=0;
		        b.setX(150);
	    		b.setY(155);
	    		System.out.println("OUT!!  ");
		    	 
		}else if(checkForCollosion(b)==1){
	    		score+=10;
	    		System.out.println(" Score is "+ score);
	    		b.setY(y-b.getRadius()-1);
		        b.setDy(-b.getDy());
	   	}else{
	   		
	   	}
	   
	}

	private int checkForCollosion(Ball b) {

	    int ballX= b.getX();
	    int ballY= b.getY();
	    int radius= b.getRadius();
	    int ret_val =0;
	    
	    if (ballY + radius >= y && ballY + radius <= y+height){
	        if (ballX > x && ballX < x + width){
	            double newDy= b.getDy()* -1 ;
	            b.setDy(newDy);
	            ret_val= 1;
	        }else{
	        	ret_val=2;
	        }
	       
	    }
	    return ret_val;
	}
	
	public void moveRight() {
		System.out.println(" x : " + x);
		if ( dx + 1 < 20 && x+width < win_x){
	    	x+=10;
	    }
	}
	public void moveLeft() {
	    if ( dx -1 > -20 && x > 0){
	        x-=10;
	    }
	}
	
	/*public void moveRight() {
	    if (x < 1000) {     // enable moving to the edge of the screen
	        x += 10;   // move a little faster
	    }
	}
	public void moveLeft() {
	    if (x > 0) {       // enable moving to the edge of the screen
	        x -= 10;   // move a little faster
	    }
	}*/
	public void paint(Graphics g){
	    g.setColor(Color.DARK_GRAY);
	    g.fillRect(x , y, width, height);
	    g.drawString("Hi-score: "+score,60, 20);
	}

	}