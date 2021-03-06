
package smell05;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author Stephen
 */
public class Company {
    String name;
    Color color;
    int [] dailyTradeHistory = new int [420];
    
    public static String [] names = {"Amazon", "Sthil", "Apple", "Toshiba", "Torrent",
                                "Mozilla", "Hulu", "GitHub", "Google", "GE"};
    
    public static Color [] colors = {Color.cyan, Color.red, Color.blue, Color.BLACK,
                                     Color.green, Color.magenta, Color.yellow, 
                                     Color.white, Color.gray, Color.PINK}; 

    Company(String name, Color color){
        this.name = name;
        this.color = color;
        generatePrices();
        Integer i;
    }
    
    public void generatePrices(){
        Random random = new Random();
        int variance = random.nextInt(20)+1;
        int start = random.nextInt(400)+100;
        this.dailyTradeHistory = RandomStockGenerator.generate((double)variance,start);
    }
    
    public int [] trades(){
        return this.dailyTradeHistory;
    }
    
    public Color color(){
        return this.color;
    }

}
