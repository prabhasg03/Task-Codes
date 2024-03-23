package colorsproject;
import java.awt.*;
import java.awt.event.*;
public class ColorsProject extends Canvas
{
transient private Color color;
private boolean rectangular;
public ColorsProject()
{
addMouseListener(new MouseAdapter(){
@Override
public void mousePressed(MouseEvent me){
change(); }
});
rectangular=false;
setSize(100,100);
change();
}
public boolean getRectangular()
{
return rectangular;
}
public void setRectangular(boolean flag)
{
this.rectangular=flag;
repaint();
}
public void change()
{
color=randomColor();
repaint();
}
private Color randomColor()
{
int r=(int)(255*Math.random());
int g=(int)(255*Math.random());
int b=(int)(255*Math.random());
return new Color(r,g,b);
}
@Override
public void paint(Graphics g)
{
Dimension d=getSize();
int h=d.height;
int w=d.width;
g.setColor(color);
if(rectangular)
{
g.fillRect(0,0,w-1,h-1);
}
else
{
g.fillOval(0,0,w-1,h-1);
}
}
}