
package smell05;

import java.awt.*;  
import javax.swing.JFrame;  
  
public class SMell05 extends Canvas{ 
    static Company[] companies = new Company[10];

    public void paint(Graphics g) {
        for(Company c: companies){
            int [] prices = c.trades();
            for(int i=0; i<c.trades().length-1; i++){
                g.setColor(c.color());
                g.drawLine(i, prices[i]/2, i, prices[i+1]/2);
            }
        }
    }
    
    public static void main(String[] args) {  
        SMell05 m = new SMell05();  
        JFrame f = new JFrame();  
        f.add(m);  
        f.setSize(400,400);  
        for(int i =0; i<10; i++){
            companies[i] = new Company(Company.names[i], Company.colors[i]);
        }
        f.setVisible(true);
    }  
  
}  