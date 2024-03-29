import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.*;

public class SecondPage extends JPanel implements ActionListener {
    JButton b_topbun, b_bottombun, b_lettuce, b_tomato, b_cheese, b_patty, b_onion, b_coke, b_sprite;
    ImageIcon patty_img;
	ImageIcon patty_ing;
    Image back;
    JLabel pan;
    static JButton patty_pan;
    static TotalTimer tt;
    static MenuTimerTest[] mt;
    static Random_ordersheet rp;
	
    boolean patty_finish = false;
	int level;
	static int i=0;
	static int j=4;
	static int score=0;
	static int goal;
	public static int k=0;
	boolean b= false;
	
	Label j1;
	Label g1;
	
	ImageIcon [] making=new ImageIcon[7];
	static JLabel one;
	static JLabel two;
	static JLabel three;
	static JLabel four;
	static JLabel five;
	static JLabel six;
	static JLabel seven;
	static JLabel eight;
	static JLabel [] life= new JLabel[5]; //life 부분 배열로 만듬
	Image []drink=new Image[1];

   
    public SecondPage(int level_num){  
    
    mt = new MenuTimerTest[1000];
  	tt=new TotalTimer();
	level=level_num;				//레벨 추가
	rp=new Random_ordersheet(level);//랜덤주문서 매개변수 레벨 추가   
	
    back = new ImageIcon("back.png").getImage();	
    setLayout(null);

	j1 = new Label();
	j1.setText("    Money: " + score);
	j1.setBounds(160, 35, 170, 40);
	j1.setFont(new Font("맑은 고딕", Font.BOLD, 18));
	j1.setBackground(Color.WHITE);
	add(j1);

        //생명 1~5개
        for(int a=0;a<5;a++){ //for문으로 라이프 이미지
			life[a]=new JLabel();
			life[a].setIcon(new ImageIcon("life.png"));
			add(life[a]);
        }
		if (level==1)
		{
			goal=15000;
		}
		
		if (level==2)
		{
			goal=20000;
		}
		
		if (level==3)
		{
			goal=25000;
		}
       
		g1 = new Label();
		g1.setText("    Goal: "+ goal);
		g1.setBounds(30,35,170,40);
		g1.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		g1.setBackground(Color.white);
		add(g1);
		
        //접시 이미지
        JLabel dish = new JLabel();
        dish.setIcon(new ImageIcon("dish.png"));
        JLabel ordersheet = new JLabel();
        ordersheet.setIcon(new ImageIcon("order.png"));
		one  = new JLabel();//접시에 올라갈 라벨
		two  = new JLabel();
		three  = new JLabel();
		four  = new JLabel();
		five  = new JLabel();
		six  = new JLabel();	
		seven  = new JLabel();
		eight  = new JLabel();
        
        //햄버거 재료 버튼 //안에 이미지 파일 추가하기.
        b_topbun = new JButton(new ImageIcon("topbun.png")); 
        b_bottombun = new JButton(new ImageIcon("bottombun.png"));
        b_lettuce = new JButton(new ImageIcon("lettuce.png"));
        b_tomato = new JButton(new ImageIcon("tomato.png"));
        b_cheese = new JButton(new ImageIcon("cheese.png"));
        b_patty = new JButton(new ImageIcon("patty1.png"));
        
        b_onion = new JButton(new ImageIcon("onion.png"));
        b_coke = new JButton(new ImageIcon("coke.png"));
        b_sprite = new JButton(new ImageIcon("sprite.png"));
        pan = new JLabel(new ImageIcon("pan.png"));
        patty_pan = new JButton();
		
		b_patty.addActionListener((ActionListener) this);
	    patty_pan.addActionListener((ActionListener) this);
		b_topbun.addActionListener((ActionListener) this);
		b_bottombun.addActionListener((ActionListener) this);
		b_lettuce.addActionListener((ActionListener) this);
		b_tomato.addActionListener((ActionListener) this);
		b_cheese.addActionListener((ActionListener) this);
		b_onion.addActionListener((ActionListener) this);
		b_coke.addActionListener((ActionListener) this);
		b_sprite.addActionListener((ActionListener) this);

        //patty_pan = new JLabel();
    	//patty_pan.setBounds(140,570,200,100);
 
        add(tt.totaltimer);
        tt.start();
        add(rp);
        reTime();
		
    	add(ordersheet);
    	add(patty_pan);
        add(b_topbun);
        add(b_bottombun);
        add(b_lettuce);
        add(b_tomato);
        add(b_cheese);
        add(b_patty);
        add(b_onion);
        add(b_coke);
        add(b_sprite);
        add(pan);
		
		add(eight);
		add(seven);
		add(six);
		add(five); 
		add(four);
		add(three);
		add(two);
		add(one);
		add(dish);

        rp.setBounds(0, -10, 300, 300);
        tt.totaltimer.setBounds(700, 615, 300, 135);
        
        //(x, y, 가로, 세로)
		b_topbun.setBounds(370, 30, 135, 65);
		b_topbun.setBorderPainted(false);
		b_topbun.setBackground(Color.white);

		b_bottombun.setBounds(370, 100, 135, 65);
		b_bottombun.setBorderPainted(false);
		b_bottombun.setBackground(Color.white);
		
		b_lettuce.setBounds(535, 30, 135, 135);
		b_lettuce.setBorderPainted(false);
		b_lettuce.setBackground(Color.white);
		
		b_tomato.setBounds(700, 30, 135, 135);
		b_tomato.setBorderPainted(false);
		b_tomato.setBackground(Color.white);
		
		b_cheese.setBounds(865, 30, 135, 135);
		b_cheese.setBorderPainted(false);
		b_cheese.setBackground(Color.white);
		
		b_patty.setBounds(370, 195, 135, 135);
		b_patty.setBorderPainted(false);
		b_patty.setBackground(Color.white);
		
		b_onion.setBounds(535, 195, 135, 135);
		b_onion.setBorderPainted(false);
		b_onion.setBackground(Color.white);
		
		b_coke.setBounds(700, 195, 135, 135);
		b_coke.setBorderPainted(false);
		b_coke.setBackground(Color.white);
        
		b_sprite.setBounds(865, 195, 135, 135);
		b_sprite.setBorderPainted(false);
		b_sprite.setBackground(Color.white);
        
		pan.setBounds(30, 450, 320, 270);
		pan.setOpaque(false);
	    
	    patty_pan.setBounds(140,570,200,100);
		patty_pan.setOpaque(false);
		patty_pan.setContentAreaFilled(false);
		patty_pan.setBorderPainted(false); 

        life[0].setBounds(700, 370, 60, 50);
        life[1].setBounds(764, 370, 60, 50);
        life[2].setBounds(828, 370, 60, 50);
        life[3].setBounds(894, 370, 60, 50);
        life[4].setBounds(958, 370, 60, 50);
        
        ordersheet.setBounds(-275, 20, 700, 300);
        patty_img = new ImageIcon("patty1.png");
		
		one.setBounds(410, 570, 170, 135); // 클릭한 재료가 접시위에 쌓임
		two.setBounds(410, 555, 170, 135);
		three.setBounds(410, 540, 170, 135);
		four.setBounds(410, 525, 170, 135);
		five.setBounds(410, 510, 170, 135);
		six.setBounds(410, 495, 170, 135);
		seven.setBounds(410, 480, 170, 135);
		dish.setBounds(150, 410, 600, 500);
		eight.setBounds(545, 560, 170, 135);


    }
    
    public void paint(Graphics g) {
    	g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
    	setOpaque(false);
    	super.paint(g);
    }
    
	Timer t=new Timer();

	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b_patty) {
			t = new Timer();
			patty_finish=false;
			patty_ing=new ImageIcon("patty1.png");
			patty_pan.setIcon(patty_ing);
			
			
			TimerTask task1 = new TimerTask() {
	            public void run() {
	            	if(patty_finish == false) {
	                  patty_ing=new ImageIcon("patty2.png");
	                  patty_pan.setIcon(patty_ing);
	               } 
	            }
	         }; t.schedule(task1,2000);
		
			
			TimerTask task2 = new TimerTask() {
	            public void run() {
	               if(patty_finish == false) {
	               patty_ing=new ImageIcon("patty3.png");
	               patty_pan.setIcon(patty_ing);
	                  }
	               }
	            }; t.schedule(task2,4000);
			}
		if(e.getSource()==b_topbun) {
			making[i]=new ImageIcon("topbun.png");
			makelabel(i);
			rule();
			if_finish();
		}
		if(e.getSource()==b_bottombun) {
			making[i]=new ImageIcon("bottombun.png");
			makelabel(i);
			rule();	
			if_finish();
		}
		if(e.getSource()==patty_pan) {
		
				making[i]=new ImageIcon(patty_ing.getImage());
				patty_finish = true;
				patty_pan.setIcon(null);
				makelabel(i);
				rule();	
				if_finish();
				t.cancel();
			}

		
		if(e.getSource()==b_lettuce) {
			making[i]=new ImageIcon("lettuce.png");
			makelabel(i);
			rule();
			if_finish();
		}
		if(e.getSource()==b_cheese) {
			making[i]=new ImageIcon("cheese.png");
			makelabel(i);
			rule();
			if_finish();
		}
		if(e.getSource()==b_onion) {
			making[i]=new ImageIcon("onion.png");
			makelabel(i);
			rule();
			if_finish();
		}
		if(e.getSource()==b_tomato) {
			making[i]=new ImageIcon("tomato.png");
			makelabel(i);
			rule();
			if_finish();
		}
		if(e.getSource()==b_coke) {
			drink[0]=new ImageIcon("coke.png").getImage();
			eight.setIcon(new ImageIcon(drink[0]));
			rule_drink();
			if_finish();
		}
		if(e.getSource()==b_sprite) {
			drink[0]=new ImageIcon("sprite.png").getImage();
			eight.setIcon(new ImageIcon(drink[0]));
			rule_drink();
			if_finish();
		}
	}
	public void makelabel(int i){
			if (i==0){
				one.setIcon(making[i]);
			}
			if (i==1){
				two.setIcon(making[i]);
			}
			if (i==2){
				three.setIcon(making[i]);
			}
			if (i==3){
				four.setIcon(making[i]);
			}
			if (i==4){
				five.setIcon(making[i]);
			}
			if (i==5){
				six.setIcon(making[i]);
			}
			if (i==6){
				seven.setIcon(making[i]);
			}
	}

	public void rule(){

		if(rp.recipe[i]==making[i].getImage()){
				System.out.println("맞는 재료입니다.");
				i++;
		}
		else if (rp.recipe[i]!=making[i].getImage())
		{		
				System.out.println("틀렸습니다.");
				i=0;
				clear();
				reTime();
				rp.repaint();
				life();
		}
	}	
	public void rule_drink(){
		if(rp.drink_recipe==drink[0]){
			System.out.println("맞는 음료입니다.");
		}
		else if(rp.drink_recipe!=drink[0]){
			i=0;
			drink[0]=null;
			clear();
			reTime();
			rp.repaint();
			life();
			System.out.println("음료 틀렸습니다.");
		}
	}
	public void if_finish(){
		if(rp.drink_recipe==null){
			if(level==1){//level1의 경우 인덱스가 4이상까지 맞게 했다면 배열을 초기화하고 다시 주문서룰 불러옴
					if(i>4){
							i=0;
							drink[0]=null;
							clear();
							reTime();
							rp.repaint();
							score+=2000;
							j1.setText("    Money: " + score);
							
						}
					}
			if(level==2){
						if(i>5){
							i=0;
							drink[0]=null;
							clear();
							reTime();
							rp.repaint();
							score+=2000;
							j1.setText("    Money: " + score);
							
						}
					}
			if(level==3){
						if(i>6){
							i=0;
							drink[0]=null;
							clear();
							reTime();
							rp.repaint();
							score+=2000;
							j1.setText("    Money: " + score);
							
						}
					}
		}	
		else{
			if(level==1){//level1의 경우 인덱스가 4이상까지 맞게 했다면 배열을 초기화하고 다시 주문서룰 불러옴
					if(i>4&&rp.drink_recipe==drink[0]){
							i=0;
							drink[0]=null;
							clear();
							reTime();
							rp.repaint();
							score+=2000;
							j1.setText("    Money: " + score);
							
						}
					}
			if(level==2){
						if(i>5&&rp.drink_recipe==drink[0]){
							i=0;
							drink[0]=null;
							clear();
							reTime();
							rp.repaint();
							score+=2000;
							j1.setText("    Money: " + score);
							
						}
					}
			if(level==3){
						if(i>6&&rp.drink_recipe==drink[0]){
							i=0;
							drink[0]=null;
							clear();
							reTime();
							rp.repaint();
							score+=2000;
							j1.setText("    Money: " + score);
							
						}
					}
		}
		
	}

		
	public static void clear(){
		one.setIcon(null);
		two.setIcon(null);
		three.setIcon(null);
		four.setIcon(null);
		five.setIcon(null);
		six.setIcon(null);
		seven.setIcon(null);
		eight.setIcon(null);
		patty_pan.setIcon(null);
	}   
	
	public static void life(){
		life[j].setIcon(null);
		j--;
		if (j<0)
		{
			mt[k-1].stop();
			j=0;
			tt.stop();
			GameOver gameover =new GameOver();
		}
	}
	public void reTime() {
		mt[k] = new MenuTimerTest();
		if (k!=0)
			mt[k-1].stop();
		add(mt[k].timer);
		mt[k].timer.setBounds(700, 450, 300, 135);
		mt[k].timer.repaint();
		mt[k++].start();
	}
}

class MenuTimerTest extends Thread{
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
        int n = 0;
        
        while(true){
            n++; //루프 돌때마다 1씩 증가
            sec  = n % 60; 
            la1.setText(String.format(" ※ 주문당 제한시간: 12초"));
            if(sec==12) {
                n=0; //시간 초기화
                la.setText(String.format("  %02d:%02d", 0, 0)); 
                SecondPage.life();
                SecondPage.clear();
                SecondPage.rp.repaint();
                SecondPage.i=0;
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