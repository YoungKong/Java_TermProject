package src;
import java.awt.*;
import javax.swing.*;
//import jdk.internal.org.jline.terminal.impl.jna.win.Kernel32.KEY_EVENT_RECORD;
//import jdk.tools.jlink.internal.Jlink;

import java.awt.event.*;

class MenuTimer extends JPanel{
    
    JLabel la, la1, la2;
    int min, sec, min_m, sec_m;
    //int menu=1; 
    int n = 0;

    public static void main(String[] args) { 
        new MenuTimer();
    }

    public MenuTimer(){
        this.setLayout(new BorderLayout(10,10));

        MyThread th = new MyThread();
        la=new JLabel();
        la1=new JLabel();
        la2=new JLabel();

        la.setFont(new Font("Gothic", Font.PLAIN, 40));
        la1.setFont(new Font("Gothic", Font.ITALIC, 20));
        la1.setOpaque(true);// 색 설정
        Color color = new Color(255,0,0);
        la1.setForeground(color);
        la2.setFont(new Font("Gothic", Font.ITALIC, 20));

        this.add("Center",la);
        this.add("North",la1);
        //this.add("West",la2);
        this.setVisible(true);
        th.start();
    }

    public int time() {
        return min;
    }
        
    //메뉴당 10초로 제한
    // public int menu() {
    //     return menu;
    // }

    class MyThread extends Thread{
        public void run(){
            int n = 0;
            //int m = 0; // 게임 시작 후 total 초 저장. 게임 시작후 60초 지나면 타이머 종료를 위함.

            while(true){
                n++; //루프 돌때마다 1씩 증가
                //m++;
            
                //min_m = m / 60 % 60; //total 분
                sec  = n % 60; 
                //min  = n / 60 % 60;
                la1.setText(String.format(" ※ 주문당 제한시간: 10초"));
                
                if(sec==10) {
                    //n=0; //시간 초기화
                    la.setText(String.format("  %02d:%02d", 0, 0));
                    break;
                    //menu++;
                }
                
                // if(min_m==1){   //게임시작후 1분이 되면 게임 종료
                //     la1.setText(String.format(" ※ 게임종료. "));
                //     la.setText(String.format("  %02d:%02d", 0, 0));
                //     break;
                // }
                
                //la2.setText(String.format("   " + menu +" 번째 주문"));
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