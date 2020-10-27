import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.TextField;

public class FrameEx extends JFrame {

	private JPanel contentPane;

	public FrameEx() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel timerLabel = new JLabel("0");
		timerLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(timerLabel);
		
		JTextPane textPane = new JTextPane();
		contentPane.add(textPane);
		
		JTextPane txtpnX = new JTextPane();
		txtpnX.setFont(new Font("나눔바른고딕", Font.PLAIN, 16));
		txtpnX.setText("X");
		contentPane.add(txtpnX);
		
		JTextPane textPane_1 = new JTextPane();
		contentPane.add(textPane_1);
		
		TextField textField = new TextField();
		contentPane.add(textField);
		
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 55));
		
		this.setSize(450, 300);
		this.setVisible(true);
		double k = 30;
		
		while(k>0)
        {
            timerLabel.setText("Time : "+k);
            
            try {Thread.sleep(1000);} 
            catch (InterruptedException e) {e.printStackTrace();}
            k-=1;
        }
        if (k == 0)
        	timerLabel.setText("Time Over");	
	}
	public static void main(String[] args) {
		new FrameEx().setVisible(true);
		
	}
}























