import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.FlowLayout;
import javax.swing.JLabel;

public class FrameEx extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
					try {
					FrameEx frame = new FrameEx();
					frame.setVisible(true);
				} catch (Exception e) {e.printStackTrace();}
	}

	/**
	 * Create the frame.
	 */
	public FrameEx() {
		double k = 30;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel timerLabel = new JLabel("0");
		contentPane.add(timerLabel);
		
		while(k>0)
        {
            timerLabel.setText("Time : "+k);
            
            try {Thread.sleep(1000);} 
            catch (InterruptedException e) {e.printStackTrace();}
            k-=1;
        }
        if (k == 0)
        	timerLabel.setText("Time Over");	
		
		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(3);
		
		JTextPane txtpnX = new JTextPane();
		txtpnX.setText("X");
		contentPane.add(txtpnX);
		
		textField_1 = new JTextField();
		textField_1.setColumns(3);
		contentPane.add(textField_1);
		
		JTextPane textPane_1 = new JTextPane();
		contentPane.add(textPane_1);
	
	}
}
