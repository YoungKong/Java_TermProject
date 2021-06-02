import java.awt.*;
import javax.swing.*;
import jdk.internal.org.jline.terminal.impl.jna.win.Kernel32.KEY_EVENT_RECORD;
import java.awt.event.*;

class MenuTimer extends JFrame{
    JLabel la;
    JLabel la1;
    JLabel la2;
    int min, sec, min_m, sec_m;
    int menu=1; 
    int n = 0;

    public static void main(String[] args) { //main
        new MenuTimer();
    }

    MenuTimer(){
        //Dimension dim = new Dimension(270, 135); //JFrame size

        this.setTitle("메뉴당 10초 제한");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(10,10));
        //this.setPreferredSize(dim);

        MyThread th = new MyThread();
        la=new JLabel();
        la1=new JLabel();
        la2=new JLabel();
        
        la.setFont(new Font("Gothic", Font.PLAIN, 50));
        
        la1.setFont(new Font("Gothic", Font.ITALIC, 20));
        la1.setOpaque(true);// 색 설정
        Color color = new Color(255,0,0);
        la1.setForeground(color);
        
        la2.setFont(new Font("Gothic", Font.ITALIC, 20));
        
        this.add("Center",la);
        this.add("North",la1);
        this.add("West",la2);
        
        this.setLocationRelativeTo(null);
        this.setSize(300, 135);
        this.setLocation(700, 450); //JFrame 좌표
        this.setVisible(true);
        this.setAlwaysOnTop(true); // 프레임 항상 위에 있게
        th.start();
    }
    
    public int time() {
    	return min;
    }
    
    //메뉴당 10초로 제한
    public int menu() {
    	return menu;
    }
        
    class MyThread extends Thread{
        public void run(){
            int n = 0;
            int m = 0; // 게임 시작 후 total 초 저장

            while(true){
            	n++; //루프 돌때마다 1씩 증가
                m++;
            
                min_m = m / 60 % 60; //total 분
            	sec  = n % 60; 
                min  = n / 60 % 60;
                
                if(sec==0) {
                	la1.setText(String.format(" ※ 주문 한개당 제한시간은 10초 입니다."));
                }
                if(sec==10) {
                	la1.setText(String.format(" ※ 10초 후 다음 메뉴로 넘어갑니다. "));
                    n=0; //시간 초기화
                    menu++;
                }
                if(min_m==1){   //게임시작후 1분이 되면 게임 종료
                    la1.setText(String.format(" ※ 게임종료. "));
                    break;
                }
                
                la2.setText(String.format("        " + menu +" 번째 주문"));
                //la.setText(Integer.toString(n++));

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