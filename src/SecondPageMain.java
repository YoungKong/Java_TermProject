import java.awt.*;
import javax.swing.*;

public class SecondPageMain extends JFrame{
	Container content;
	SecondPage imgP;
//	public int restart=0;
	
	public SecondPageMain(int level){
		
		super("청파버거");
		imgP = new SecondPage(level);
		content = getContentPane();
		content.add(imgP, BorderLayout.CENTER);
		setSize(1100,800);
		setLocation(200,30);
		setVisible(true);
		//end();
		//System.out.println(restart);

	}

//	reset++;
	
}