package co.edu.uptc.model;

import javax.swing.JLabel;
import javax.swing.JProgressBar;


public class Hilo extends Thread {
    Source source;
    JLabel percentage;
    JLabel text;
    JProgressBar progress;

    public Hilo(Source source, JLabel percentage, JLabel text, JProgressBar bar) {
        this.source = source;
        this.percentage = percentage;
        this.text = text;
        this.progress = bar;
    }

  
    
    
    
    
    @Override
    public void run()
    {
        
        text.setText(source.getSource());
        int rangeA = 0;
        int rangeB = 10;
        sleep( rangeA, rangeB);
        
        for(Routes target : source.getTargets())
        {
            try{
            rangeA = rangeB;
            rangeB+=5;
            sleep( rangeA, rangeB);
            text.setText(target.getTarget());
            rangeA = rangeB;
            rangeB+=5;
            sleep( rangeA, rangeB);
            text.setText(""+target.getDistance());
            rangeA = rangeB;
            rangeB+=5;
            sleep( rangeA, rangeB);
            text.setText(""+target.getValue());
            }catch(Exception e)
            {}
        }
        rangeA = rangeB;
        
       sleep( rangeA, 100);
        
    }
    
    
    public void sleep(int num1 , int num2)
    {
         try{
            for(int i=num1; i<=num2; i++){
                Thread.sleep(3);
                percentage.setText(Integer.toString(i)+"%");
                progress.setValue(i);
                               
            }
        }catch (Exception e){
        }
    }
    
}
