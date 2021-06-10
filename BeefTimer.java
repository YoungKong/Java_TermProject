import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Timer;
import java.util.TimerTask;

public class BeefTimer extends Thread { 
    public int count;
    
    public BeefTimer(){       
        count = 0;
        Timer cook_timer = new Timer();
        TimerTask cook_task = new TimerTask(){

            @Override
            public void run(){
                if (count ==0 || count ==1 ){
                   // System.out.println(count);
                    //la.setIcon(new ImageIcon("patty1.png"));
                    count++;
                    }
                else if(count == 2 || count ==3){
                    //System.out.println(count);
                    //la.setIcon(new ImageIcon("patty1.png"));
                    count++;
                    }
                else if(count==4){
                    //System.out.println(count);
                    //la.setIcon(new ImageIcon("patty3.png"));
                    cook_timer.cancel();
                }
                }
            };
            cook_timer.schedule(cook_task, 1000, 1000); 
    }

}
