import java.awt.*; 

public class Ball{ 
private int x=0;
private int y=0; 
private double dx=10;
private double dy=10;
private int width=20;
private int height=20;
private int radius=10;

public Ball() {

}

public void update(tennisGame tg){

    if ( x + dx > tg.getWidth()-radius-1){
        x = tg.getWidth()-radius-1;
        dx= -dx;
    }
    else if ( x + dx < 0 + radius ){
        x= 0 + radius;
        dx= -dx;
    }
    else{
        x+=dx;
    }

    if ( y + dy> tg.getHeight()-radius-1){
        y = tg.getHeight()-radius-1;
        dy= -dy;
    }
    else if ( y + dy < 0 + radius ){
        y= 0 + radius;
        dy= -dy;
    }
    else{
        y+=dy;
    }
}

public int getX() {
    return x;
}
public void setX(int x) {
    this.x = x;
}
public int getY() {
    return y;
}
public void setY(int y) {
    this.y = y;
}
public double getDx() {
    return dx;
}
public void setDx(int dx) {
    this.dx = dx;
}
public void setDy(double dy) {
    this.dy = dy;
}
public double getDy() {
    return dy;
}
public int getRadius() {
    return radius;
}

public void paint(Graphics g) { 
    g.setColor(new Color(0,0,150,155));
    g.fillOval(x-radius,y-radius,width, height);
}
}