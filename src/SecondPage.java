import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class SecondPage extends JFrame {
    JButton bun, lettuce, tomato, cheeze, beef, onion, coke, sprite, pan;
    ImageIcon back;

    public SecondPage(String msg){
        JFrame jf = new JFrame();
        jf.setSize(1100, 800);
        jf.getContentPane().setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //메뉴 이미지
        JLabel menu = new JLabel();
        menu.setIcon(new ImageIcon("menu.jpg"));

        //생명 1~5개
        JLabel life1  = new JLabel();
        life1.setIcon(new ImageIcon("apple.jpg"));
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
        dish.setIcon(new ImageIcon("menu.jpg"));

        //햄버거 재료 버튼
        bun = new JButton(new ImageIcon("")); //안에 이미지 파일 추가하기.
        lettuce = new JButton("양배추");
        tomato = new JButton("토마토");
        cheeze = new JButton("치즈");
        beef = new JButton("패티");
        onion = new JButton("양파");
        coke = new JButton("콜라");
        sprite = new JButton("사이다");
        pan = new JButton("팬");

        jf.add(bun);
        jf.add(lettuce);
        jf.add(tomato);
        jf.add(cheeze);
        jf.add(beef);
        jf.add(onion);
        jf.add(coke);
        jf.add(sprite);
        jf.add(pan);

        jf.getContentPane().add(menu);
        jf.getContentPane().add(pan);
        jf.getContentPane().add(dish);
        jf.getContentPane().add(life1);
        jf.getContentPane().add(life2);
        jf.getContentPane().add(life3);
        jf.getContentPane().add(life4);
        jf.getContentPane().add(life5);
        

        jf.getContentPane().add(bun);
        jf.getContentPane().add(lettuce);
        jf.getContentPane().add(tomato);
        jf.getContentPane().add(cheeze);
        jf.getContentPane().add(beef);
        jf.getContentPane().add(onion);
        jf.getContentPane().add(coke);
        jf.getContentPane().add(sprite);

        menu.setBounds(30, 30, 300, 300);   //(x, y, 가로, 세로)
		bun.setBounds(370, 30, 135, 135);
		lettuce.setBounds(535, 30, 135, 135);
		tomato.setBounds(700, 30, 135, 135);
		cheeze.setBounds(865, 30, 135, 135);
		beef.setBounds(370, 195, 135, 135);
		onion.setBounds(535, 195, 135, 135);
		coke.setBounds(700, 195, 135, 135);
        sprite.setBounds(865, 195, 135, 135);
        pan.setBounds(30, 450, 300, 270);
        dish.setBounds(370, 645, 300, 75);

        life1.setBounds(700, 370, 50, 50);
        life2.setBounds(764, 370, 50, 50);
        life3.setBounds(828, 370, 50, 50);
        life4.setBounds(894, 370, 50, 50);
        life5.setBounds(958, 370, 50, 50);


        jf.setVisible(true);
    }

    public void paint(Graphics g){
        back = new ImageIcon("back.png");
        g.drawImage(back.getImage(), 0, 30, null);
    }
}
