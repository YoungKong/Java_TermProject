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
						making[i]=new ImageIcon("��_��.png").getImage();
						if(rp.recipe[i]==making[i]){
						System.out.println("�´� ����Դϴ�.");
						i++;
						}
				
						else if (rp.recipe[i]!=making[i])
						{
						System.out.println("Ʋ�Ƚ��ϴ�.");
						
						}
			
					}
				});

				sp.b_bottombun.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						making[i]=new ImageIcon("��_�Ʒ�.png").getImage();
						if(rp.recipe[i]==making[i]){
						System.out.println("�´� ����Դϴ�.");
						i++;
						
						}
				
						else if (rp.recipe[i]!=making[i])
						{
						System.out.println("Ʋ�Ƚ��ϴ�.");
						
						}
					}
				});

				sp.b_cheese.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						making[i]=new ImageIcon("ġ��.png").getImage();
						if(rp.recipe[i]==making[i]){
						System.out.println("�´� ����Դϴ�.");
						i++;
						}
				
						else if (rp.recipe[i]!=making[i])
						{
						System.out.println("Ʋ�Ƚ��ϴ�.");
						
						}
					}
				});

				sp.b_lettuce.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						making[i]=rp.lettuce;
						if(rp.recipe[i]==making[i]){
						System.out.println("�´� ����Դϴ�.");
						i++;
						
						}
				
						else if (rp.recipe[i]!=making[i])
						{
						System.out.println("Ʋ�Ƚ��ϴ�.");
						
						}
					}
				});

				sp.b_onion.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						making[i]=rp.onion;
						if(rp.recipe[i]==making[i]){
						System.out.println("�´� ����Դϴ�.");
						i++;
						
						}
				
						else if (rp.recipe[i]!=making[i])
						{
						System.out.println("Ʋ�Ƚ��ϴ�.");
						
						}
					}
				});
				sp.b_patty.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						making[i]=rp.patty;
						if(rp.recipe[i]==making[i]){
						System.out.println("�´� ����Դϴ�.");
						i++;
						
						}
				
						else if (rp.recipe[i]!=making[i])
						{
						System.out.println("Ʋ�Ƚ��ϴ�.");
						
						}
					}
				});
				sp.b_tomato.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						making[i]=rp.tomato;
						if(rp.recipe[i]==making[i]){
						System.out.println("�´� ����Դϴ�.");
						i++;
						
						}
				
						else if (rp.recipe[i]!=making[i])
						{
						System.out.println("Ʋ�Ƚ��ϴ�.");
						
						}
					}
				});


				
		

	}


}
