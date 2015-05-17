

package smell05;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Stephen
 */
public class OilCanvas extends Canvas{
    
    int width = 20;
    int lateral = 0;
    double lineX = 1.0;
    double lineY = 1.0;
    public void paint(Graphics context){
        
        context.drawOval(0, 0, this.width, 200);
        context.setColor(Color.red);
        context.fillRect(50, 250, this.lateral, 100);
        context.setColor(Color.blue);
        context.drawLine(250, 50, 400-(int)(150*this.lineX), 120-(int)(70*this.lineY));
        
        context.fillOval(this.lateral, this.width , 75, 75);
        int [] xPoints = {10,20,30,40,this.lateral,80,10};
        int [] yPoints = {30,40,80,70,(int)this.lineX,40,30};
        context.fillRoundRect(300, 400, 100, 200, 75, 150);
        context.drawPolyline(xPoints, yPoints, xPoints.length);
        context.setColor(Color.black);
        char [] chars = {'L','A','S','E','R','S'};
        context.drawChars(chars,0, (int)(this.lineY*chars.length), 50, 400);
        context.setColor(Color.DARK_GRAY);
        context.drawArc(420, 400, width, lateral, 45, 180);
        context.setColor(Color.CYAN);
        context.fillArc(2, 450, width, width, lateral, ABORT);
        int [] xPoints2 = {40,50,40,70,this.lateral,80,10};
        int [] yPoints2 = {500,750,620,700,(int)this.lineX+502,700,630};
        context.setColor(Color.pink);
        context.fillPolygon(xPoints2, yPoints2, xPoints2.length);
        
    }
    public void update(Graphics context){
        super.update(context);
        double ms = Math.sin((double)(System.currentTimeMillis())/200)+ 1;
        double ms2 = Math.cos((double)(System.currentTimeMillis())/200)+ 1;
        this.width = (int)(ms*100);
        this.lateral = (int)(ms2*100);
        double lineMs = (double)(System.currentTimeMillis()%1000);
        this.lineX = lineMs/1000.0;
        this.lineY = lineMs/1000.0;
    }
}
