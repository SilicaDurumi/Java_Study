import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JToggleButton;
import javax.swing.JDesktopPane;

public class JpaneEx extends JFrame {

	private JPanel contentPane;
	private JTextField name;
	private JLabel telLabel;
	private JTextField telephone;
	private JLabel idnumberLabel;
	private JTextField idnumber;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JpaneEx frame = new JpaneEx();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JpaneEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 393);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 251, 285);
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 255), 3), "INPUT", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel);
		panel.setLayout(new GridLayout(3, 2, 5, 10));
		
		JLabel namelabel = new JLabel("Name");
		namelabel.setHorizontalAlignment(SwingConstants.CENTER);
		namelabel.setFont(new Font("나눔바른고딕", Font.PLAIN, 12));
		panel.add(namelabel);
		
		name = new JTextField();
		panel.add(name);
		name.setColumns(10);
		
		telLabel = new JLabel("Tel");
		telLabel.setHorizontalAlignment(SwingConstants.CENTER);
		telLabel.setFont(new Font("나눔바른고딕", Font.PLAIN, 12));
		panel.add(telLabel);
		
		telephone = new JTextField();
		telephone.setColumns(10);
		panel.add(telephone);
		
		idnumberLabel = new JLabel("ID_Number");
		idnumberLabel.setHorizontalAlignment(SwingConstants.CENTER);
		idnumberLabel.setFont(new Font("나눔바른고딕", Font.PLAIN, 12));
		panel.add(idnumberLabel);
		
		idnumber = new JTextField();
		idnumber.setColumns(10);
		panel.add(idnumber);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(275, 10, 309, 285);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 306, 572, 38);
		contentPane.add(panel_1);
		
		JButton btnNewButton = new JButton("New button");
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		panel_1.add(btnNewButton_2);
	}
}
