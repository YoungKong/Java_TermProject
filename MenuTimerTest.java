import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class MenuTimerTest extends Thread {
	JPanel timer = new JPanel();
	JLabel la, la1, la2;
    int min, sec, min_m, sec_m;
    int n = 0;
    public void MenuTimerTest() {
    	
    }
    public void run(){
    	timer.setLayout(new BorderLayout(10,10));
        la=new JLabel();
        la1=new JLabel();
        la2=new JLabel();

        la.setFont(new Font("Gothic", Font.PLAIN, 40));
        la1.setFont(new Font("Gothic", Font.ITALIC, 20));
        la1.setOpaque(true);// 색 설정
        Color color = new Color(255,0,0);
        la1.setForeground(color);
        la2.setFont(new Font("Gothic", Font.ITALIC, 20));

        timer.add("Center",la);
        timer.add("North",la1);
        timer.setVisible(true);
        int n = 1;
        
        while(true){
            n++; //루프 돌때마다 1씩 증가
            sec  = n % 60; 
            la1.setText(String.format(" ※ 주문당 제한시간: 10초"));
            
            if(sec==11) {
                n=1; //시간 초기화
                la.setText(String.format("  %02d:%02d", 0, 0));
                break;
            }

        	la.setText(String.format("  %02d:%02d", min, sec));
            try{
                sleep(1000);
            }
            catch(Exception e){
                return;
            }
        }
    }
}
