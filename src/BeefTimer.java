import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Timer;
import java.util.TimerTask;

public class BeefTimer { 
    public static int count;

    public BeefTimer(){
//        JFrame jf = new JFrame();
//        jf.setTitle("beeftimer");
//        jf.setSize(700, 500);
//        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel la= new JLabel();
        la.setBounds(140,570,200,100);
        count = 0;
        
        Timer cook_timer = new Timer();
        TimerTask cook_task = new TimerTask(){

            @Override
            public void run(){
                    if(count < 2){  //0~2초: 패티 안익음
                        la.setIcon(new ImageIcon("패티1.png"));
                        
                        //jf.getContentPane().add("North", la);
                        //jf.setVisible(true);
                        count++;
                    }
                    else if (count < 4){ //2~4초: 패티 익음
                        la.setIcon(new ImageIcon("패티2.png"));
                        //jf.getContentPane().add("North", la);
                        //jf.setVisible(true);
                        count++;
                    }
                    else{ 
                        la.setIcon(new ImageIcon("패티3.png"));
                        //jf.getContentPane().add("North", la);
                        //jf.setVisible(true);
                        cook_timer.cancel();
                    }
                }
            };
            cook_timer.schedule(cook_task, 6000, 1000); //카운터 3이상이면 타이머 종료, 반복주기 1초
    }
//    public static void main(String[] args) {        
//        BeefTimer bf = new BeefTimer();
//    }
}
