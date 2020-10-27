import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JTextPane;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.Canvas;

public class SimpleGame extends TimerTestEx{

	private JFrame frame;
	private JTextField txtAnswer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleGame window = new SimpleGame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SimpleGame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		txtAnswer = new JTextField();
		txtAnswer.setHorizontalAlignment(SwingConstants.CENTER);
		txtAnswer.setText("Answer");
		frame.getContentPane().add(txtAnswer, BorderLayout.SOUTH);
		txtAnswer.setColumns(10);
		
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		frame.getContentPane().add(lblNewLabel_2, BorderLayout.CENTER);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		frame.getContentPane().add(lblNewLabel_3, BorderLayout.EAST);
		
		JTextArea txtrAsdf = new JTextArea();
		frame.getContentPane().add(txtrAsdf, BorderLayout.WEST);
	}

//	private void TimerTestEx() {
//		double k = 5;
//        
//        while(k>0)
//        {
//            timerLabel.setText("Time : "+k);
//            firstNumberLabel.setText("a");
//            secondNumberLabel.setText("B");
//            
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            k-=1;
//        }
//        if (k == 0)
//        	timerLabel.setText("Time Over");
//		
//	}

}



























