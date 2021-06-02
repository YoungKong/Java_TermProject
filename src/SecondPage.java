import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.border.*;

public class SecondPage extends JPanel implements ActionListener {
    MenuTimer mt = new MenuTimer();
    TotalTimer tt = new TotalTimer();
    JButton b_topbun, b_bottombun, b_lettuce, b_tomato, b_cheese, b_patty, b_onion, b_coke, b_sprite;
    ImageIcon patty;
    Image back;
    JLabel patty_pan, pan;
   
    public SecondPage(){    
  		
    	back = new ImageIcon("back.png").getImage();
    	setLayout(null);

        //메뉴 이미지
        JLabel menu = new JLabel();
        menu.setIcon(new ImageIcon("menu.jpg"));

        //생명 1~5개
        JLabel life1  = new JLabel();
        life1.setIcon(new ImageIcon("패티1.png"));
        JLabel life2  = new JLabel();
        life2.setIcon(new ImageIcon("apple.jpg"));
        JLabel life3  = new JLabel();
        life3.setIcon(new ImageIcon("apple.jpg"));
        JLabel life4  = new JLabel();
        life4.setIcon(new ImageIcon("apple.jpg"));
        JLabel life5  = new JLabel();
        life5.setIcon(new ImageIcon("apple.jpg"));

        //접시 이미지
        JLabel dish = new JLabel();
        dish.setIcon(new ImageIcon("쟁반.png"));

        //햄버거 재료 버튼 //안에 이미지 파일 추가하기.
        b_topbun = new JButton(new ImageIcon("topbun.png")); 
        b_bottombun = new JButton(new ImageIcon("bottombun.png"));
        b_lettuce = new JButton(new ImageIcon("lettuce.png"));
        b_tomato = new JButton(new ImageIcon("tomato.png"));
        b_cheese = new JButton(new ImageIcon("cheese.png"));
        b_patty = new JButton(new ImageIcon("patty1.png"));
        b_patty.addActionListener((ActionListener) this);
        b_onion = new JButton(new ImageIcon("onion.png"));
        b_coke = new JButton(new ImageIcon("coke.png"));
        b_sprite = new JButton(new ImageIcon("sprite.png"));
        pan = new JLabel(new ImageIcon("pan.png"));
     	
        patty_pan = new JLabel();
    	patty_pan.setBounds(140,570,200,100);
    	
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
        add(dish);
        add(life1);
        add(life2);
        add(life3);
        add(life4);
        add(life5);

        menu.setBounds(30, 30, 300, 300);   //(x, y, 가로, 세로)
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
		
		dish.setBounds(370, 645, 300, 75);

        life1.setBounds(700, 370, 50, 50);
        life2.setBounds(764, 370, 50, 50);
        life3.setBounds(828, 370, 50, 50);
        life4.setBounds(894, 370, 50, 50);
        life5.setBounds(958, 370, 50, 50);
        
        patty = new ImageIcon("patty1.png");
    }
    
    public void paint(Graphics g) {
    	g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
    	setOpaque(false);
    	super.paint(g);
    }
    
    public void actionPerformed(ActionEvent e) {
    	patty_pan.setIcon(patty);
    }
}