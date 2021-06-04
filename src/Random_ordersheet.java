import javax.swing.*;
import java.awt.*;

public class Random_ordersheet extends JPanel{
	
	final Image topbun = new ImageIcon("topbun.png").getImage();
	final Image bottombun = new ImageIcon("bottombun.png").getImage();
	final Image cheese = new ImageIcon("cheese.png").getImage();
	final Image lettuce = new ImageIcon("lettuce.png").getImage();
	final Image onion = new ImageIcon("onion.png").getImage();
	final Image patty = new ImageIcon("patty2.png").getImage();
	final Image tomato = new ImageIcon("tomato.png").getImage();
	final Image coke = new ImageIcon("coke.png").getImage();
	final Image sprite = new ImageIcon("sprite.png").getImage();
	
	Image random1,random2,random3,random4, random5;
	int r1,r2,r3,r4,r5;
	//int level=1;									//레벨 지정
	int level;											//
	Image [] recipe= new Image[7];
	
	public Random_ordersheet(int level_num) {			//
		level=level_num;
	}
	
	public void paint(Graphics g) {
		
		Image ingredient[] = {cheese, lettuce, onion, patty, tomato};
		Image drink[]= {coke, sprite};
		
		r1=(int)((Math.random()*5));	
		r2=(int)((Math.random()*5));
		r3=(int)((Math.random()*5));
		r4=(int)((Math.random()*5));
		r5=(int)((Math.random()*5));
		
		random1=ingredient[r1];
		random2=ingredient[r2];
		random3=ingredient[r3];
		random4=ingredient[r4];
		random5=ingredient[r5];
		
		int random_drink=(int)((Math.random()*3));
		
		if(random_drink==0) {					//콜라
			g.drawImage(drink[0],170,90,this);
		}
		else if(random_drink==1) {				//스프라이트
			g.drawImage(drink[1],170,90,this);
		}
//		else if(random_drink==2) {
//			
//		}
		if(level==3) {
			g.drawImage(random1,70,90,this);
			g.drawImage(random2,70,130,this);
			g.drawImage(random3,70,170,this);
			g.drawImage(random4,70,210,this);
			g.drawImage(random5,70,250,this);
			g.drawImage(bottombun,70,290,this);
			
			recipe[0]=bottombun;
			recipe[1]=random1;
			recipe[2]=random2;
			recipe[3]=random3;
			recipe[4]=random4;
			recipe[5]=random5;
			recipe[6]=topbun;
		}
		else if(level==2) {
			g.drawImage(random1,70,90,this);
			g.drawImage(random2,70,130,this);
			g.drawImage(random3,70,170,this);
			g.drawImage(random4,70,210,this);
			g.drawImage(bottombun,70,250,this);
			recipe[0]=bottombun;
			recipe[1]=random1;
			recipe[2]=random2;
			recipe[3]=random3;
			recipe[4]=random4;
			recipe[5]=topbun;
		}
		else {
			g.drawImage(bottombun,70,180,this);
			g.drawImage(random3,70,60,this);
			g.drawImage(random2,70,100,this);
			g.drawImage(random1,70,140,this);

			recipe[0]=bottombun;
			recipe[1]=random1;
			recipe[2]=random2;
			recipe[3]=random3;
			recipe[4]=topbun;
			for(int i=0;i<5;i++){
				System.out.println(recipe[i]);
			}
		}

		g.drawImage(topbun,70,20,this);
		setOpaque(false);
		super.paint(g);
	}
}