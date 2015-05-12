
package smell05;

import java.util.Random;

/**
 *
 * @author Stephen
 */

public class RandomStockGenerator {
   
    
    public static int [] generate(){
        return RandomStockGenerator.generate(20, 200);
    }
    
    public static int [] generate(double variance){
        return RandomStockGenerator.generate(variance, 200);
    }
    
    public static int [] generate(double variance, int start){
        int [] output = new int [420];
        output[0] = (int) (Math.random()*100) + start;
        for(int i=1; i<420; i++){
            
            double random = (double)(Math.random()*2-1)*variance;
            output[i] = (int)(output[i-1] + random + 0.5);
        }
        return output;
    }
    

}
