package src; 
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Color;
import java.util.Timer;
import java.util.TimerTask;

public class BeefTimer extends JPanel{ 
   
    public static int count;
    JLabel beef;
    
    public BeefTimer(){
        count = 0;
        beef=new JLabel();
        this.setBounds(140,570,200,100);
        this.setBackground(new Color(0, 0, 0, 0));
        this.add(beef);
        this.setVisible(true);
        
        Timer cook_timer = new Timer();
        TimerTask cook_task = new TimerTask(){

            @Override
            public void run(){
                    if(count < 2){  //0~2초: 패티 안익음
                        beef.setIcon(new ImageIcon("patty1.png"));
                        count++;
                    }
                    else if (count < 4){ //2~4초: 패티 익음
                        beef.setIcon(new ImageIcon("patty2.png"));
                        count++;
                    }
                    else{ 
                        beef.setIcon(new ImageIcon("patty3.png"));
                        cook_timer.cancel();
                    }
                }
            };
            cook_timer.schedule(cook_task, 6000, 1000); //카운터 5이상이면 타이머 종료, 반복주기 1초
    }
//    public static void main(String[] args) {        
//        BeefTimer bf = new BeefTimer();
//    }
}