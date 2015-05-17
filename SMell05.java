
package smell05;

import java.util.Scanner;
import javax.swing.JFrame;

public class SMell05{
    
    public static void main(String[] args) {
        StockCanvas sc = new StockCanvas();
        OilCanvas oc = new  OilCanvas();
        JFrame f = new JFrame();
        System.out.print("type \"o\" for Oil Wells or \"s\" for Stocks: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if(input.equals("o")){
          f.add(oc);
        } else {
          f.add(sc);
            
        }
        f.setSize(600,800);
        Thread [] threads = new Thread [10];
        for(int i =0; i<10; i++){
            final int p = i;
            threads[i] = new Thread(){
                
                public void run(){
                    StockCanvas.companies[p] = new Company(Company.names[p], Company.colors[p]);
                }
            };
            threads[i].start();
        }
        for(Thread thread: threads){
            try{
                thread.join();
            }catch(InterruptedException e){
                System.out.println(e.getStackTrace());
            }
        }
        f.setVisible(true);
        while(true){
            try{
                Thread.sleep(35);
            }catch(InterruptedException e){
                System.out.println(e.getStackTrace());
            }
            oc.repaint();
        }
    }
}