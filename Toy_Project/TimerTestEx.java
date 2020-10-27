import java.awt.*;

import javax.swing.*;

public class TimerTestEx extends JFrame {

	JLabel timerLabel = null;
	JLabel firstNumberLabel = null;
	JLabel secondNumberLabel = null;

	public TimerTestEx() {
		this.setTitle("Timer Test");
		Container c = this.getContentPane();
		c.setLayout(new FlowLayout());
		timerLabel = new JLabel("0");
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 55));

		c.add(timerLabel);

		this.setSize(450, 300);
		this.setVisible(true);
		double k = 5;

		while (k > 0) {
			timerLabel.setText("Time : " + k);
	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			k -= 1;
		}
		if (k == 0)
			timerLabel.setText("Time Over");
	}

	public static void main(String[] args) {
			new TimerTestEx();		
	}
}

























