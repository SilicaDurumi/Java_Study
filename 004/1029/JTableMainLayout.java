
import java.awt.BorderLayout;
import java.awt.EventQueue;
import Functions.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.GridLayout;
import javax.swing.table.DefaultTableModel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.FlowLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class JTableMainLayout extends JFrame {
	private Object[] columnname = { "Name", "Age", "Gender" };
	private Object[][] userInfo = {};
	private JPanel contentPane;
	private JTable table;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JTextField nameTextField;
	private JLabel lblNewLabel_1;
	private JTextField ageTextField;
	private JLabel lblNewLabel_2;
	private JTextField genderTextField;
	private JPanel panel_2;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JMenuBar menuBar;
	private JMenu filemenu;
	private JMenu helpmenu; 
	private JMenu Align;
	private ButtonGroup group;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTableMainLayout frame = new JTableMainLayout();
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
	public JTableMainLayout() {
		setTitle("JTable Add, Remove");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 604, 323);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		filemenu = new JMenu("File");
		helpmenu = new JMenu("Help");

		menuBar.add(filemenu);
		menuBar.add(helpmenu);

		JMenuItem save = new JMenuItem("SAVE");
		JMenuItem open = new JMenuItem("OPEN");
		JMenuItem close = new JMenuItem("CLOSE");

		JMenuItem printinfo = new JMenuItem("INFO");

		filemenu.add(open); filemenu.add(save);filemenu.add(close);
		helpmenu.add(printinfo);

		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);

		table = new JTable();

		table.setModel(new DefaultTableModel(userInfo, columnname));

		scrollPane.setViewportView(table);

		panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 255), 3), "Input", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(3, 2, 5, 10));

		lblNewLabel = new JLabel("name");
		panel.add(lblNewLabel);

		nameTextField = new JTextField();
		panel.add(nameTextField);
		nameTextField.setColumns(10);

		lblNewLabel_1 = new JLabel("age");
		panel.add(lblNewLabel_1);

		ageTextField = new JTextField();
		panel.add(ageTextField);
		ageTextField.setColumns(3);

		lblNewLabel_2 = new JLabel("gender");
		panel.add(lblNewLabel_2);

		genderTextField = new JTextField();
		panel.add(genderTextField);
		genderTextField.setColumns(3);

		panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);

		btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new CreateFunction(table, nameTextField, ageTextField, genderTextField) {});
		panel_2.add(btnNewButton);

		btnNewButton_1 = new JButton("EDIT");
		panel_2.add(btnNewButton_1);

		btnNewButton_2 = new JButton("DELETE");
		btnNewButton_2.addActionListener(new RemoveFunction(table) {});
		panel_2.add(btnNewButton_2);
	}

}
