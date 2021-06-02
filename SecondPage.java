import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.border.*;

public class SecondPage extends JPanel implements ActionListener {
    JButton bun_top, bun_bot, lettuce, tomato, cheeze, beef, onion, coke, sprite, pan;
    ImageIcon patty;
    Image back, bun;
    JLabel img;
   
    public SecondPage(){    
  		
    	back = new ImageIcon("배경.png").getImage();
    	setLayout(null);
    	//add(background);
    	//getContentPane();
        //setSize(1100, 800);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
        bun_top = new JButton(new ImageIcon("빵_위.png")); 
		
        bun_bot = new JButton(new ImageIcon("빵_아래.png"));
        lettuce = new JButton(new ImageIcon("양상추.png"));
        tomato = new JButton(new ImageIcon("토마토.png"));
        cheeze = new JButton(new ImageIcon("치즈.png"));
        beef = new JButton(new ImageIcon("패티1.png"));
        beef.addActionListener((ActionListener) this);
        onion = new JButton(new ImageIcon("양파.png"));
        coke = new JButton(new ImageIcon("콜라.png"));
        sprite = new JButton(new ImageIcon("사이다.png"));
        pan = new JButton(new ImageIcon("프라이팬.png"));
     	
        img = new JLabel();
    	img.setBounds(140,570,200,100);
    	
        add(img);
        add(bun_top);
        add(bun_bot);
        add(lettuce);
        add(tomato);
        add(cheeze);
        add(beef);
        add(onion);
        add(coke);
        add(sprite);
        add(pan);
        add(dish);
        add(life1);
        add(life2);
        add(life3);
        add(life4);
        add(life5);

        menu.setBounds(30, 30, 300, 300);   //(x, y, 가로, 세로)
		bun_top.setBounds(370, 30, 135, 65);
		bun_top.setBorderPainted(false);
		bun_top.setBackground(Color.white);

		bun_bot.setBounds(370, 100, 135, 65);
		bun_bot.setBorderPainted(false);
		bun_bot.setBackground(Color.white);
		
		lettuce.setBounds(535, 30, 135, 135);
		lettuce.setBorderPainted(false);
		lettuce.setBackground(Color.white);
		
		tomato.setBounds(700, 30, 135, 135);
		tomato.setBorderPainted(false);
		tomato.setBackground(Color.white);
		
		cheeze.setBounds(865, 30, 135, 135);
		cheeze.setBorderPainted(false);
		cheeze.setBackground(Color.white);
		
		beef.setBounds(370, 195, 135, 135);
		beef.setBorderPainted(false);
		beef.setBackground(Color.white);
		
		onion.setBounds(535, 195, 135, 135);
		onion.setBorderPainted(false);
		onion.setBackground(Color.white);
		
		coke.setBounds(700, 195, 135, 135);
		coke.setBorderPainted(false);
        coke.setBackground(Color.white);
        
		sprite.setBounds(865, 195, 135, 135);
		sprite.setBorderPainted(false);
        sprite.setBackground(Color.white);
        
		pan.setBounds(30, 450, 320, 270);
		pan.setBorderPainted(false);
		pan.setOpaque(false);
		pan.setBackground(Color.white);
		
		dish.setBounds(370, 645, 300, 75);

        life1.setBounds(700, 370, 50, 50);
        life2.setBounds(764, 370, 50, 50);
        life3.setBounds(828, 370, 50, 50);
        life4.setBounds(894, 370, 50, 50);
        life5.setBounds(958, 370, 50, 50);
        
        patty = new ImageIcon("패티1.png");
    }
    
    public void paint(Graphics g) {
    	g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
    	setOpaque(false);
    	super.paint(g);
    }
    
    public void actionPerformed(ActionEvent e) {
    	img.setIcon(patty);
    }
}
