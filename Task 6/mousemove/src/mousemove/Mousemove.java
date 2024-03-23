package mousemove;
import java.awt.Color; 
import java.awt.Dimension;
import java.awt.Graphics; 
import java.awt.event.MouseAdapter; 
import java.awt.event.MouseEvent; 
import javax.swing.JPanel; 

import javax.swing.JPanel;

public class Mousemove extends JPanel
{ 
private int Circle_Size=20; 
private int xm,ym; 
public int getCircle_Size() { 
return Circle_Size; 
}
public void setCircle_Size(int Circle_Size) { 
this.Circle_Size = Circle_Size; 
} 
private Color randomcolor() 
{ 
int r=(int)(255*Math.random()); 
int g=(int)(255*Math.random()); 
int b=(int)(255*Math.random()); 
return new Color(r,g,b); 
} 
@Override 
public void paintComponent(Graphics g) 
{ super.paintComponent(g); 
g.setColor(randomcolor()); 
g.fillOval(xm - Circle_Size/2, ym - Circle_Size/2, Circle_Size, Circle_Size); 
} 
public Mousemove() 
{ 
setBackground(Color.CYAN); 
addMouseMotionListener(new MouseAdapter() 
{ 
@Override 
public void mouseMoved(MouseEvent me) 
{ 
xm = me.getX(); 
ym = me.getY(); 
repaint(); 
} 
}); 
} 
@Override 
public Dimension getPreferredSize() 
{ 
return new Dimension(200, 200); 
} 
} 