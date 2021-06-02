import javax.swing.*;
import java.awt.*;

public class Random_ordersheet extends JFrame{
	Image topbun, bottombun, cheese, lettuce, onion, patty, tomato, random1,random2,random3,random4, random5;
	int r1,r2,r3,r4,r5;
	int level=1;
	
	public Random_ordersheet() {
		setTitle("ordersheet");
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);

	}
	
	public void paint(Graphics g) {
		topbun = new ImageIcon("bun1.JPG").getImage();
		bottombun = new ImageIcon("bun2.JPG").getImage();
		cheese = new ImageIcon("cheese.JPG").getImage();
		lettuce = new ImageIcon("lettuce.JPG").getImage();
		onion = new ImageIcon("onion.JPG").getImage();
		patty = new ImageIcon("patty.JPG").getImage();
		tomato = new ImageIcon("tomato.JPG").getImage();
		
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
			g.drawImage(random1,50,90,this);
			g.drawImage(random2,50,130,this);
			g.drawImage(random3,50,170,this);
			g.drawImage(random4,50,210,this);
			g.drawImage(random5,50,250,this);
			g.drawImage(bottombun,50,290,this);
		}
		else if(level==2) {
			g.drawImage(random1,50,90,this);
			g.drawImage(random2,50,130,this);
			g.drawImage(random3,50,170,this);
			g.drawImage(random4,50,210,this);
			g.drawImage(bottombun,50,250,this);
		}
		else {
			g.drawImage(random1,50,90,this);
			g.drawImage(random2,50,130,this);
			g.drawImage(random3,50,170,this);
			g.drawImage(bottombun,50,210,this);
		}

		g.drawImage(topbun,50,50,this);
		

	}
}
