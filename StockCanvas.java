

package smell05;

import java.awt.Canvas;
import java.awt.Graphics;

/**
 *
 * @author Stephen
 */
public class StockCanvas extends Canvas {
    
    public static Company[] companies = new Company[10];

    public void paint(Graphics g) {
        for(Company company: companies){
            int [] prices = company.trades();
            for(int i=0; i<company.trades().length-1; i++){
                g.setColor(company.color());
                double scaleY = 0.5;
                double scaleX = 1.0;
                g.drawLine(
                        (int)(scaleX*i), (int)(prices[i]*scaleY),
                        (int)(scaleX*i), (int)(prices[i+1]*scaleY)
                );
            }
        }
    }
}
