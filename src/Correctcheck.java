import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  
import java.util.Arrays;


public class  Correctcheck extends JFrame
{	
	int level;
	Image [] making=new Image[7];
	SecondPage sp=new SecondPage(level);
	Random_ordersheet rp=new Random_ordersheet();
	public int i;
	
	Correctcheck() {
		
		i=0;

				sp.b_topbun.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						making[i]=new ImageIcon("鍮�_�쐞.png").getImage();
						if(rp.recipe[i]==making[i]){
						System.out.println("留욌뒗 �옱猷뚯엯�땲�떎.");
						i++;
						}
				
						else if (rp.recipe[i]!=making[i])
						{
						System.out.println("���졇�뒿�땲�떎.");
						
						}
			
					}
				});

				sp.b_bottombun.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						making[i]=new ImageIcon("鍮�_�븘�옒.png").getImage();
						if(rp.recipe[i]==making[i]){
						System.out.println("留욌뒗 �옱猷뚯엯�땲�떎.");
						i++;
						
						}
				
						else if (rp.recipe[i]!=making[i])
						{
						System.out.println("���졇�뒿�땲�떎.");
						
						}
					}
				});

				sp.b_cheese.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						making[i]=new ImageIcon("移섏쫰.png").getImage();
						if(rp.recipe[i]==making[i]){
						System.out.println("留욌뒗 �옱猷뚯엯�땲�떎.");
						i++;
						}
				
						else if (rp.recipe[i]!=making[i])
						{
						System.out.println("���졇�뒿�땲�떎.");
						
						}
					}
				});

				sp.b_lettuce.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						making[i]=rp.lettuce;
						if(rp.recipe[i]==making[i]){
						System.out.println("留욌뒗 �옱猷뚯엯�땲�떎.");
						i++;
						
						}
				
						else if (rp.recipe[i]!=making[i])
						{
						System.out.println("���졇�뒿�땲�떎.");
						
						}
					}
				});

				sp.b_onion.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						making[i]=rp.onion;
						if(rp.recipe[i]==making[i]){
						System.out.println("留욌뒗 �옱猷뚯엯�땲�떎.");
						i++;
						
						}
				
						else if (rp.recipe[i]!=making[i])
						{
						System.out.println("���졇�뒿�땲�떎.");
						
						}
					}
				});
				sp.b_patty.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						making[i]=rp.patty;
						if(rp.recipe[i]==making[i]){
						System.out.println("留욌뒗 �옱猷뚯엯�땲�떎.");
						i++;
						
						}
				
						else if (rp.recipe[i]!=making[i])
						{
						System.out.println("���졇�뒿�땲�떎.");
						
						}
					}
				});
				sp.b_tomato.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e){
						making[i]=rp.tomato;
						if(rp.recipe[i]==making[i]){
						System.out.println("留욌뒗 �옱猷뚯엯�땲�떎.");
						i++;
						
						}
				
						else if (rp.recipe[i]!=making[i])
						{
						System.out.println("���졇�뒿�땲�떎.");
						
						}
					}
				});


				
		

	}


}