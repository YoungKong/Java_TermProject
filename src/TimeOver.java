import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TimeOver extends JDialog implements ActionListener {
	ImageIcon timeover = new ImageIcon("timeover.png");
	Color btn = new Color(234, 234, 234);
	JButton reset = new JButton("RESTART");
	JButton exit = new JButton("EXIT");
	int score, g_score;														//
	Color b=new Color(255,250,237);								//
	
	public TimeOver(int level_num) {			
		JPanel b_panel=new JPanel();
		b_panel.setLayout(null);
		b_panel.setBackground(b);									//
		
		//SecondPage sp=new SecondPage(level_num);
		//g_score=goal;
		
		JLabel score_l = new JLabel("달성 매출액: ");						//+ score 여기부터 수정(달성)
		score_l.setFont(new Font("맑은 고딕", Font.BOLD, 15));				//글씨체,글씨크기
		score_l.setBounds(230, 220, 200, 100);								//위치
		
		JLabel goalscore=new JLabel("목표 매출액: "+g_score);					//
		goalscore.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		goalscore.setBounds(230, 200, 200, 100);

		setTitle("TIME OVER");
		setSize(600, 400);
		setLocation(500, 250);
		
		
		JLabel j1 = new JLabel();
		j1.setIcon(timeover);
		j1.setBounds(150, 10, 300, 200);

		JLabel pass=new JLabel("게임 클리어 성공!");
		JLabel fail=new JLabel("게임 클리어 실패!");
		pass.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		fail.setFont(new Font("맑은 고딕", Font.BOLD, 20));
		
		if(score>=g_score) {
			b_panel.add(pass);
			pass.setBounds(215, 160, 200, 100);
		}
		else {
			b_panel.add(fail);
			fail.setBounds(215, 160, 200, 100);
		}
		
		reset.setBackground(btn);
		exit.setBackground(btn);

		reset.setFont(new Font("SanSerif", Font.BOLD, 13));
		exit.setFont(new Font("SanSerif", Font.BOLD, 13));

		reset.setBounds(160, 300, 120, 30);
		exit.setBounds(310, 300, 120, 30);

		reset.addActionListener(this);
		exit.addActionListener(this);

		b_panel.add(goalscore);												//
		
		b_panel.add(score_l);
		b_panel.add(j1);
		b_panel.add(reset);
		b_panel.add(exit);
		add(b_panel);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == reset) {
			this.dispose();
			StartMain sm = new StartMain();
		}
		if (e.getSource() == exit) {
			System.exit(0);
		}
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		TimeOver s=new TimeOver(1);
//	}

}