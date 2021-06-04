import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.border.*;

public class SecondPage extends JPanel implements ActionListener {
    JButton b_topbun, b_bottombun, b_lettuce, b_tomato, b_cheese, b_patty, b_onion, b_coke, b_sprite;
    ImageIcon patty_img;
    Image back;
    JLabel patty_pan, pan;
    TotalTimer tt = new TotalTimer();
    MenuTimer mt = new MenuTimer();
    Random_ordersheet rp=new Random_ordersheet();
	
	int i=0;

	
    final Image topbun = new ImageIcon("topbun.png").getImage();
	final Image bottombun = new ImageIcon("bottombun.png").getImage();
	final Image cheese = new ImageIcon("cheese.png").getImage();
	final Image lettuce = new ImageIcon("lettuce.png").getImage();
	final Image onion = new ImageIcon("onion.png").getImage();
	final Image patty = new ImageIcon("patty2.png").getImage();
	final Image tomato = new ImageIcon("tomato.png").getImage();
	Image random1,random2,random3,random4, random5;
	int r1,r2,r3,r4,r5;
	int level=1;
	Image [] recipe= new Image[7];
	ImageIcon [] making=new ImageIcon[7];
	JLabel one,two,three,four,five,six,seven;
   
    public SecondPage(int level){    
  		
    	back = new ImageIcon("back.png").getImage();
    	setLayout(null);

        //���� 1~5��
        JLabel life1  = new JLabel();
        life1.setIcon(new ImageIcon("life.png"));
        JLabel life2  = new JLabel();
        life2.setIcon(new ImageIcon("life.png"));
        JLabel life3  = new JLabel();
        life3.setIcon(new ImageIcon("life.png"));
        JLabel life4  = new JLabel();
        life4.setIcon(new ImageIcon("life.png"));
        JLabel life5  = new JLabel();
        life5.setIcon(new ImageIcon("life.png"));

        //���� �̹���
        JLabel dish = new JLabel();
        dish.setIcon(new ImageIcon("dish.png"));
        JLabel ordersheet = new JLabel();
        ordersheet.setIcon(new ImageIcon("order.png"));
		one  = new JLabel();//���ÿ� �ö� ��
		two  = new JLabel();
		three  = new JLabel();
		four  = new JLabel();
		five  = new JLabel();
		six  = new JLabel();	
		seven  = new JLabel();
        
        //�ܹ��� ��� ��ư //�ȿ� �̹��� ���� �߰��ϱ�.
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
		
		b_patty.addActionListener((ActionListener) this);

		b_topbun.addActionListener((ActionListener) this);
		b_bottombun.addActionListener((ActionListener) this);
		b_lettuce.addActionListener((ActionListener) this);
		b_tomato.addActionListener((ActionListener) this);
		b_cheese.addActionListener((ActionListener) this);
		b_onion.addActionListener((ActionListener) this);
		b_coke.addActionListener((ActionListener) this);
		b_sprite.addActionListener((ActionListener) this);

     	
        patty_pan = new JLabel();
    	patty_pan.setBounds(140,570,200,100);
 
        add(tt);
        add(mt);
    	//if(mt.menu==1){
		//	add(rp);
		//}
		add(rp);
		
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
       
        add(life1);
        add(life2);
        add(life3);
        add(life4);
        add(life5);
		
		add(seven);
		add(six);
		add(five); 
		add(four);
		add(three);
		add(two);
		add(one);
		add(dish);

        
        rp.setBounds(0, -10, 300, 300);
        mt.setBounds(700, 450, 300, 135);
        tt.setBounds(700, 615, 300, 135);
        
        //(x, y, ����, ����)
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

        life1.setBounds(700, 370, 60, 50);
        life2.setBounds(764, 370, 60, 50);
        life3.setBounds(828, 370, 60, 50);
        life4.setBounds(894, 370, 60, 50);
        life5.setBounds(958, 370, 60, 50);
        
        ordersheet.setBounds(-275, 20, 700, 300);
        patty_img = new ImageIcon("patty1.png");
		
		one.setBounds(410,570, 170, 135);//Ŭ���� ��ᰡ �������� ����
		two.setBounds(410,550, 170, 135);
		three.setBounds(410,530, 170, 135);
		four.setBounds(410,510, 170, 135);
		five.setBounds(410,490, 170, 135);
		six.setBounds(410,470, 170, 135);
		seven.setBounds(410,450, 170, 135);
		dish.setBounds(150,410, 600, 500);
		
		

    }
    
    public void paint(Graphics g) {
    	g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
    	setOpaque(false);
    	super.paint(g);
    }
    
    public void actionPerformed(ActionEvent e) {
    	
		if(e.getSource()==b_patty) { //��Ƽ�� �Ķ����ҿ� ���� ��Ƽ Ÿ�̸� �����ϱ�(�̿�), �ҿ� �ִ� ��Ƽ�� ������ ���ÿ� ����(�̿�)
			patty_pan.setIcon(patty_img);
		}
		if(e.getSource()==b_topbun) {
			making[i]=new ImageIcon("topbun.png");
			makelabel(i);
			if(rp.recipe[i]==making[i].getImage()){//���� if���� �Լ��� ����ϱ� i++������ �ε���1������ Ŭ���ݿ��� �ȵ�.
				System.out.println("�´� ����Դϴ�.");
				i++;	
			}
		
			else if (rp.recipe[i]!=making[i].getImage())
			{
				System.out.println("Ʋ�Ƚ��ϴ�.");
				//clear(); Ʋ����� �ֹ����� �ٽ� �׷������� ������ ���� ������������. clear()�� �������� �ٽ� �׷���������
				i=0;
				rp.repaint();//Ʋ����� �ֹ��� �ٽñ׸�

			}
			//rule(i);
			
		}
		if(e.getSource()==b_bottombun) {
			making[i]=new ImageIcon("bottombun.png");
			makelabel(i);
			if(rp.recipe[i]==making[i].getImage()){
				System.out.println("�´� ����Դϴ�.");
				i++;	
			}
		
			else if (rp.recipe[i]!=making[i].getImage())
			{
				System.out.println("Ʋ�Ƚ��ϴ�.");
				//clear();
				i=0;
				rp.repaint();

			}
			//rule(i);
		}
		if(e.getSource()==patty_pan) {
			making[i]=new ImageIcon("patty2.png");
			makelabel(i);
			if(rp.recipe[i]==making[i].getImage()){//���� if���� �Լ��� ����ϱ� i++������ �ε���1������ Ŭ���ݿ��� �ȵ�.
				System.out.println("�´� ����Դϴ�.");
				i++;	
			}
		
			else if (rp.recipe[i]!=making[i].getImage())
			{
				System.out.println("Ʋ�Ƚ��ϴ�.");
				//clear();
				i=0;
				rp.repaint();

			}
			//rule(i);
			
		}
		if(e.getSource()==b_lettuce) {
			making[i]=new ImageIcon("lettuce.png");
			makelabel(i);
			if(rp.recipe[i]==making[i].getImage()){
				System.out.println("�´� ����Դϴ�.");
				i++;	
			}
		
			else if (rp.recipe[i]!=making[i].getImage())
			{
				System.out.println("Ʋ�Ƚ��ϴ�.");
				//clear();
				i=0;
				rp.repaint();

			}
			//rule(i);
		
		}
		if(e.getSource()==b_cheese) {
			making[i]=new ImageIcon("cheese.png");
			makelabel(i);
			if(rp.recipe[i]==making[i].getImage()){
				System.out.println("�´� ����Դϴ�.");
				i++;	
			}
		
			else if (rp.recipe[i]!=making[i].getImage())
			{
				System.out.println("Ʋ�Ƚ��ϴ�.");
				//clear();
				i=0;
				rp.repaint(); 

			}
			//rule(i);
		
		}
		if(e.getSource()==b_onion) {
			making[i]=new ImageIcon("onion.png");
			makelabel(i);
			if(rp.recipe[i]==making[i].getImage()){
				System.out.println("�´� ����Դϴ�.");
				i++;	
			}
		
			else if (rp.recipe[i]!=making[i].getImage())
			{
				System.out.println("Ʋ�Ƚ��ϴ�.");
				//clear();
				i=0;
				rp.repaint();

			}
			//rule(i);
		}
		if(e.getSource()==b_tomato) {
			making[i]=new ImageIcon("tomato.png");
			makelabel(i);
			if(rp.recipe[i]==making[i].getImage()){
				System.out.println("�´� ����Դϴ�.");
				i++;	
			}
		
			else if (rp.recipe[i]!=making[i].getImage())
			{
				System.out.println("Ʋ�Ƚ��ϴ�.");
				i=0;
				//clear();
				rp.repaint();

			}
			//rule(i);
		
		}
		if(e.getSource()==b_coke) {
			
		}
		if(e.getSource()==b_sprite) {
			
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

	public int rule(int i){
		if(rp.recipe[i]==making[i].getImage()){
				System.out.println("�´� ����Դϴ�.");
				i++;	
				if(level==1){//level1�� ��� �ε����� 4�̻���� �°� �ߴٸ� �迭�� �ʱ�ȭ�ϰ� �ٽ� �ֹ����� �ҷ���
					if(i>4){
						i=0;
						clear();
						add(rp);
						
					}
				}
				if(level==2){
					if(i>5){
						i=0;
						clear();
						add(rp);
						
					}
				}
				if(level==3){
					if(i>6){
						i=0;
						clear();
						add(rp);
						
					}
				}
		}
		else if (rp.recipe[i]!=making[i].getImage())
		{
				System.out.println("Ʋ�Ƚ��ϴ�.");
				i=0;
				clear();
				add(rp);
		}

		return i;
	}

	public void clear(){
		remove(one);
		remove(two);
		remove(three);
		remove(four);
		remove(five);
		remove(six);
		remove(seven);
	}

}
