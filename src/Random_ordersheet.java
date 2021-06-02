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
	Image random1,random2,random3,random4, random5;
	int r1,r2,r3,r4,r5;
	int level=1;
	Image [] recipe= new Image[7];
	
	public Random_ordersheet() {

	}
	
	public void paint(Graphics g) {
		
		
		Image ingredient[] = {cheese, lettuce, onion, patty, tomato};
		
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
			g.drawImage(bottombun,80,120,this);
			g.drawImage(random3,80,150,this);
			g.drawImage(random2,80,120,this);
			g.drawImage(random1,80,100,this);

			recipe[0]=bottombun;
			recipe[1]=random1;
			recipe[2]=random2;
			recipe[3]=random3;
			recipe[4]=topbun;
			for(int i=0;i<recipe.length;i++){
				System.out.println(recipe[i]);
			}
		}

		g.drawImage(topbun,80,30,this);
		setOpaque(false);
		super.paint(g);
	}
}