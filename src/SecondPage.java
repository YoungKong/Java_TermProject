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

        //�޴� �̹���
        JLabel menu = new JLabel();
        menu.setIcon(new ImageIcon("menu.jpg"));

        //���� 1~5��
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

        //���� �̹���
        JLabel dish = new JLabel();
        dish.setIcon(new ImageIcon("menu.jpg"));

        //�ܹ��� ��� ��ư
        bun = new JButton(new ImageIcon("")); //�ȿ� �̹��� ���� �߰��ϱ�.
        lettuce = new JButton("�����");
        tomato = new JButton("�丶��");
        cheeze = new JButton("ġ��");
        beef = new JButton("��Ƽ");
        onion = new JButton("����");
        coke = new JButton("�ݶ�");
        sprite = new JButton("���̴�");
        pan = new JButton("��");

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

        menu.setBounds(30, 30, 300, 300);   //(x, y, ����, ����)
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
