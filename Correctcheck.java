import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  
import java.util.Arrays;


public class  Correctcheck extends JFrame
{
	Image [] making=new Image[7];
	SecondPage sp=new SecondPage();
	Random_ordersheet rp=new Random_ordersheet();
	public int i;
	
	Correctcheck() {
		
		i=0;

				sp.b_topbun.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						making[i]=new ImageIcon("빵_위.png").getImage();
						if(rp.recipe[i]==making[i]){
						System.out.println("맞는 재료입니다.");
						i++;
						}
				
						else if (rp.recipe[i]!=making[i])
						{
						System.out.println("틀렸습니다.");
						
						}
			
					}
				});

				sp.b_bottombun.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						making[i]=new ImageIcon("빵_아래.png").getImage();
						if(rp.recipe[i]==making[i]){
						System.out.println("맞는 재료입니다.");
						i++;
						
						}
				
						else if (rp.recipe[i]!=making[i])
						{
						System.out.println("틀렸습니다.");
						
						}
					}
				});

				sp.b_cheese.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						making[i]=new ImageIcon("치즈.png").getImage();
						if(rp.recipe[i]==making[i]){
						System.out.println("맞는 재료입니다.");
						i++;
						}
				
						else if (rp.recipe[i]!=making[i])
						{
						System.out.println("틀렸습니다.");
						
						}
					}
				});

				sp.b_lettuce.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						making[i]=rp.lettuce;
						if(rp.recipe[i]==making[i]){
						System.out.println("맞는 재료입니다.");
						i++;
						
						}
				
						else if (rp.recipe[i]!=making[i])
						{
						System.out.println("틀렸습니다.");
						
						}
					}
				});

				sp.b_onion.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						making[i]=rp.onion;
						if(rp.recipe[i]==making[i]){
						System.out.println("맞는 재료입니다.");
						i++;
						
						}
				
						else if (rp.recipe[i]!=making[i])
						{
						System.out.println("틀렸습니다.");
						
						}
					}
				});
				sp.b_patty.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						making[i]=rp.patty;
						if(rp.recipe[i]==making[i]){
						System.out.println("맞는 재료입니다.");
						i++;
						
						}
				
						else if (rp.recipe[i]!=making[i])
						{
						System.out.println("틀렸습니다.");
						
						}
					}
				});
				sp.b_tomato.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						making[i]=rp.tomato;
						if(rp.recipe[i]==making[i]){
						System.out.println("맞는 재료입니다.");
						i++;
						
						}
				
						else if (rp.recipe[i]!=making[i])
						{
						System.out.println("틀렸습니다.");
						
						}
					}
				});


				
		

	}


}
