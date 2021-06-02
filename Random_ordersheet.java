import javax.swing.*;
import java.awt.*;

public class Random_ordersheet extends JFrame{
	
	final Image topbun = new ImageIcon("빵_위.png").getImage();
	final Image bottombun = new ImageIcon("빵_아래.png").getImage();
	final Image cheese = new ImageIcon("치즈.png").getImage();
	final Image lettuce = new ImageIcon("양상추.png").getImage();
	final Image onion = new ImageIcon("양파.png").getImage();
	final Image patty = new ImageIcon("패티.png").getImage();
	final Image tomato = new ImageIcon("토마토.png").getImage();
	Image random1,random2,random3,random4, random5;
	int r1,r2,r3,r4,r5;
	int level=1;
	Image [] recipe= new Image[7];
	
	public Random_ordersheet() {
		setTitle("ordersheet");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);

	}
	
	public void paint(Graphics g) {
		
		
		Image ingredient[] = {cheese, lettuce, onion, patty, tomato};
		
		r1=(int)((Math.random()*5));	//0~4 랜덤 생성
		r2=(int)((Math.random()*5));
		r3=(int)((Math.random()*5));
		r4=(int)((Math.random()*5));
		r5=(int)((Math.random()*5));
		
		random1=ingredient[r1];
		random2=ingredient[r2];
		random3=ingredient[r3];
		random4=ingredient[r4];
		random5=ingredient[r5];
		

		if(level==3) {
			g.drawImage(random1,30,90,this);
			g.drawImage(random2,30,130,this);
			g.drawImage(random3,30,170,this);
			g.drawImage(random4,30,210,this);
			g.drawImage(random5,30,250,this);
			g.drawImage(bottombun,30,290,this);
		}
		else if(level==2) {
			g.drawImage(random1,30,90,this);
			g.drawImage(random2,30,130,this);
			g.drawImage(random3,30,170,this);
			g.drawImage(random4,30,210,this);
			g.drawImage(bottombun,30,250,this);
		}
		else {
			g.drawImage(random1,30,90,this);
			g.drawImage(random2,30,130,this);
			g.drawImage(random3,30,170,this);
			g.drawImage(bottombun,30,210,this);
			recipe[0]=bottombun;
			recipe[1]=random1;
			recipe[2]=random2;
			recipe[3]=random3;
			recipe[4]=topbun;
			for(int i=0;i<recipe.length;i++){
				System.out.println(recipe[i]);
			}
		}

		g.drawImage(topbun,30,30,this);
		

	}
}
