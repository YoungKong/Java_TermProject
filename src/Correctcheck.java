import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  
import java.util.Arrays;


public class  Correctcheck extends JFrame
{
	Image [] making=new Image[7];
	JButton b_topbun, b_bottombun, b_cheese, b_lettuce, b_onion, b_patty, b_tomato;
	Random_ordersheet rp=new Random_ordersheet();
	public int i;
	ButtonGroup b_g;

	Correctcheck() {
		
		b_g=new ButtonGroup(); 
		b_topbun=new JButton("����");  
        b_bottombun=new JButton("�Ʒ���");
		b_cheese=new JButton("ġ��"); 
		b_lettuce=new JButton("�����"); 
		b_onion=new JButton("����"); 
		b_patty=new JButton("��Ƽ"); 
		b_tomato=new JButton("�丶��"); 
        add(b_topbun); add(b_bottombun); add(b_cheese);
		add(b_lettuce); add(b_onion); add(b_patty);
		add(b_tomato);
		b_g.add(b_topbun); b_g.add(b_bottombun); b_g.add(b_cheese);
		b_g.add(b_lettuce); b_g.add(b_onion); b_g.add(b_patty);
		b_g.add(b_tomato);
		
		b_topbun.setBounds(90,40,100,30);  
		b_bottombun.setBounds(90,80,103,30);  
	    b_cheese.setBounds(90,120,104,30); 
		b_lettuce.setBounds(90,160,104,30); 
		b_onion.setBounds(90,200,104,30); 
		b_patty.setBounds(90,240,104,30); 
		b_tomato.setBounds(90,280,104,30); 
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setLayout(null);  
        setVisible(true);  
        setSize(600,400);

		i=0;

				

				b_topbun.addActionListener(new ActionListener(){
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

				b_bottombun.addActionListener(new ActionListener(){
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

				b_cheese.addActionListener(new ActionListener(){
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

				b_lettuce.addActionListener(new ActionListener(){
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

				b_onion.addActionListener(new ActionListener(){
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
				b_patty.addActionListener(new ActionListener(){
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
				b_tomato.addActionListener(new ActionListener(){
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
