import java.awt.*;
import javax.swing.*;

class TotalTimer extends JFrame{
    JLabel la;
    JLabel la1;
    int min, sec;
     
    public static void main(String[] args) { //main
        new TotalTimer();
    }

    TotalTimer(){
        //Dimension dim = new Dimension(270, 135);
        this.setTitle("게임 타이머");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(10,10));

        //Dimension dim = new Dimension(270, 135);
        //this.setPreferredSize(dim);

        MyThread th = new MyThread();
        la=new JLabel();
        la1=new JLabel();
        
        la.setFont(new Font("Gothic", Font.PLAIN, 40));        
        la1.setFont(new Font("Gothic", Font.ITALIC, 20));
        la1.setOpaque(true);// 색 설정
        Color color = new Color(255,0,0);
        la1.setForeground(color);
        
        this.add("Center",la);
        this.add("North",la1);
        
        this.setLocationRelativeTo(null);
        this.setSize(300, 135);
        this.setLocation(700, 615); //JFrame 좌표
        this.setVisible(true);
        this.setAlwaysOnTop(true); // 프레임 항상 위에 있게
        th.start();
    }
    
    public int time() {
    	return min;
    }
    
    
    class MyThread extends Thread{
        public void run(){
            int n=0;

            while(true){
            	n++;
            	sec  = n % 60;
                min  = n / 60 % 60;
                
                if(min==0) {
                	la1.setText(String.format(" ※ 게임 제한시간은 1분 입니다."));
                }
                if(min==1) {
                	la1.setText(String.format(" ※ 제한시간이 끝났습니다.. ")); 
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
}
