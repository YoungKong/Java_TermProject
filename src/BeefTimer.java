import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.util.Timer;
import java.util.TimerTask;

public class BeefTimer extends JFrame{ 
    public static int count;

    public BeefTimer(){
        JFrame jf = new JFrame();
        jf.setTitle("beeftimer");
        jf.setSize(800, 600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel la= new JLabel();
        count = 0;
        
        Timer cook_timer = new Timer();
        TimerTask cook_task = new TimerTask(){

            @Override
            public void run(){
                    if(count < 1){  //0~1초: 패티 안익음
                        la.setIcon(new ImageIcon("beef1.png"));
                        jf.getContentPane().add("North", la);
                        jf.setVisible(true);
                        count++;
                    }
                    else if (count < 2){ //1~2초: 패티 익음
                        la.setIcon(new ImageIcon("beef2.png"));
                        jf.getContentPane().add("North", la);
                        jf.setVisible(true);
                        count++;
                    }
                    else{ //2~3초: 패티 탐
                        la.setIcon(new ImageIcon("beef3.png"));
                        jf.getContentPane().add("North", la);
                        jf.setVisible(true);
                        cook_timer.cancel();
                    }
                }
            };
            cook_timer.schedule(cook_task, 3000, 1000); //카운터 3이상이면 타이머 종료, 반복주기 1초
    }
    public static void main(String[] args) {        
        BeefTimer bf = new BeefTimer();
    }
}

