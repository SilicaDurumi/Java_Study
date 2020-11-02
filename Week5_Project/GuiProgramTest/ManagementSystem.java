import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import Functions.*;

import javax.swing.JTextArea;
import javax.swing.JMenu;
import javax.swing.DefaultComboBoxModel;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JCheckBoxMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ManagementSystem extends JFrame {

	private JFrame jFrame = new JFrame();
	private Vector<Vector<Object>> userinfo;
	private String[][] userdata = {}; //vector
	private Vector<String> columnNameVector = new Vector<String>() ;
	private String [] columnNameStr = {"Number", "Name", "Tel", "E-mail", "ID_Number", "Job"
			, "Age", "Gender", "Location","Birth"};
	private String[] job = { "ABC", "BCD", "CDE", "DEF", "EFG", "FGH" };
	private JPanel contentPane;
	private JTextField numberTextField, nameTextField, telTextField, emailTextField, idNumberTextField, jobTextField, searchtext;
	private JMenuBar menuBar;
	private JMenu filemenu, alignmenu, helpmenu;
	private JMenuItem save = new JMenuItem("SAVE");
	private JMenuItem open = new JMenuItem("OPEN");
	private JMenuItem close = new JMenuItem("CLOSE");
	private JMenuItem printinfo = new JMenuItem("INFO");
	private final ButtonGroup buttonGroupForRadio = new ButtonGroup();
	private final ButtonGroup buttonGroupForAlignMenu = new ButtonGroup();
	private JTable table;
	private JScrollPane tablescrollpanel;
	private int i, sortby;
	private int SelectedRow; // for loop variable
	private DefaultTableModel model;
	private JCheckBoxMenuItem[] alignCheckItem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagementSystem frame = new ManagementSystem();
					frame.jFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ManagementSystem() {
		
		jFrame.setFont(new Font("나눔바른고딕 UltraLight", Font.PLAIN, 12));
		jFrame.setTitle("CardLayoutExample");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setBounds(100, 100, 984, 605);

		menuBar = new JMenuBar();
		jFrame.setJMenuBar(menuBar);

		filemenu = new JMenu("File");
		alignmenu = new JMenu("Align");
		helpmenu = new JMenu("Help");

		menuBar.add(filemenu);
		menuBar.add(alignmenu);
		
		JCheckBoxMenuItem numberChkMenuItem = new JCheckBoxMenuItem("Number");
		numberChkMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SortUser(userdata, 0);
				table.repaint();
			}
		});
		buttonGroupForAlignMenu.add(numberChkMenuItem);
		alignmenu.add(numberChkMenuItem);
		
		JCheckBoxMenuItem nameChkMenuItem = new JCheckBoxMenuItem("Name");
		nameChkMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SortUser(userdata, 1);
				table.repaint();
			}
		});
		buttonGroupForAlignMenu.add(nameChkMenuItem);
		alignmenu.add(nameChkMenuItem);
		
		JCheckBoxMenuItem jobChkMenuItem = new JCheckBoxMenuItem("Job");
		jobChkMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SortUser(userdata, 5);
				table.repaint();
			}
		});
		buttonGroupForAlignMenu.add(jobChkMenuItem);
		alignmenu.add(jobChkMenuItem);
		
		JCheckBoxMenuItem locationChkItem = new JCheckBoxMenuItem("Location");
		locationChkItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SortUser(userdata, 8);
				table.repaint();
			}
		});
		buttonGroupForAlignMenu.add(locationChkItem);
		alignmenu.add(locationChkItem);
		
		for (int i = 0; i < columnNameStr.length; i++) {
			columnNameVector.add(columnNameStr[i]);
		}
		
		alignCheckItem= new JCheckBoxMenuItem[columnNameStr.length];
		model = new DefaultTableModel(userdata, columnNameStr);
		table = new JTable(userdata, columnNameStr);
		
		menuBar.add(helpmenu);
		
		filemenu.add(save);filemenu.add(open); filemenu.add(close);
		helpmenu.add(printinfo);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		jFrame.setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel westpanel = new JPanel();
		contentPane.add(westpanel, BorderLayout.WEST);
		westpanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel inputpanel = new JPanel();
		inputpanel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 255), 4), "INPUT", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		westpanel.add(inputpanel);
		inputpanel.setLayout(new GridLayout(0, 2, 0, 20));
		
		JLabel lblNumber = new JLabel("Number");
		lblNumber.setFont(new Font("나눔바른고딕", Font.BOLD, 12));
		lblNumber.setHorizontalAlignment(SwingConstants.CENTER);
		inputpanel.add(lblNumber);
		
		numberTextField = new JTextField();
		inputpanel.add(numberTextField);
		numberTextField.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("나눔바른고딕", Font.BOLD, 12));
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		inputpanel.add(lblName);
		
		nameTextField = new JTextField();
		nameTextField.setColumns(10);
		inputpanel.add(nameTextField);
		
		JLabel lblTel = new JLabel("Tel");
		lblTel.setFont(new Font("나눔바른고딕", Font.BOLD, 12));
		lblTel.setHorizontalAlignment(SwingConstants.CENTER);
		inputpanel.add(lblTel);
		
		telTextField = new JTextField();
		telTextField.setColumns(10);
		inputpanel.add(telTextField);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("나눔바른고딕", Font.BOLD, 12));
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		inputpanel.add(lblEmail);
		
		emailTextField = new JTextField();
		emailTextField.setColumns(10);
		inputpanel.add(emailTextField);
		
		JLabel lblIdnumber = new JLabel("ID_Number");
		lblIdnumber.setFont(new Font("나눔바른고딕", Font.BOLD, 12));
		lblIdnumber.setHorizontalAlignment(SwingConstants.CENTER);
		inputpanel.add(lblIdnumber);
		
		idNumberTextField = new JTextField();
		idNumberTextField.setColumns(10);
		inputpanel.add(idNumberTextField);
		
		JLabel lblNewLabel_1 = new JLabel("Job");
		lblNewLabel_1.setFont(new Font("나눔바른고딕", Font.BOLD, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		inputpanel.add(lblNewLabel_1);
		
		JComboBox jobComboBox = new JComboBox();
		jobComboBox.setModel(new DefaultComboBoxModel(job));
		inputpanel.add(jobComboBox);
		
		JPanel card = new JPanel();
		card.setBorder(new EmptyBorder(5, 5, 5, 5));
		westpanel.add(card);
		card.setLayout(new CardLayout(0, 0));
		
		JPanel personinfo = new JPanel();
		personinfo.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 255), 3), "INFO", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		card.add(personinfo, "name_26959101905600");
		personinfo.setLayout(new GridLayout(0, 2, 0, 25));
		
		JLabel ageLabel = new JLabel("Age : ");
		personinfo.add(ageLabel);
		
		JTextArea ageTextArea = new JTextArea();
		personinfo.add(ageTextArea);
		
		JLabel genderLabel = new JLabel("Gender : ");
		personinfo.add(genderLabel);
		
		JTextArea genderTextArea = new JTextArea();
		personinfo.add(genderTextArea);
		
		JLabel locationLabel = new JLabel("Location : ");
		personinfo.add(locationLabel);
		
		JTextArea locationTextArea = new JTextArea();
		personinfo.add(locationTextArea);
		
		JLabel birthLabel = new JLabel("Birth : ");
		personinfo.add(birthLabel);
		
		JTextArea birthTextArea = new JTextArea();
		personinfo.add(birthTextArea);
		
		JPanel searchpanel = new JPanel();
		searchpanel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 255), 3), "Search", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		card.add(searchpanel, "name_26984514044300");
		searchpanel.setLayout(new BorderLayout(0, 0));
		
		JPanel radiopanel = new JPanel();
		radiopanel.setBorder(null);
		searchpanel.add(radiopanel, BorderLayout.NORTH);
		
		JRadioButton nameRadioBtn = new JRadioButton("Name");
		buttonGroupForRadio.add(nameRadioBtn);
		radiopanel.add(nameRadioBtn);
		
		JRadioButton jobRadioBtn = new JRadioButton("Job");
		buttonGroupForRadio.add(jobRadioBtn);
		radiopanel.add(jobRadioBtn);
		
		JRadioButton locationRadioBtn = new JRadioButton("Location");
		buttonGroupForRadio.add(locationRadioBtn);
		radiopanel.add(locationRadioBtn);
		
		JPanel searchtextpanel = new JPanel();
		searchpanel.add(searchtextpanel);
		searchtextpanel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		searchtextpanel.add(panel, BorderLayout.NORTH);
		
		searchtext = new JTextField();
		panel.add(searchtext);
		searchtext.setColumns(15);
		
		JPanel searchbtnpanel = new JPanel();
		searchtextpanel.add(searchbtnpanel, BorderLayout.CENTER);
		
		JButton searchbtn = new JButton("Search");
		searchbtnpanel.add(searchbtn);
		
		JButton exitbtn = new JButton("Exit");
		
		searchbtnpanel.add(exitbtn);
		
		tablescrollpanel = new JScrollPane();
		contentPane.add(tablescrollpanel, BorderLayout.CENTER);
		
		table.setModel(model);
		tablescrollpanel.setViewportView(table);
		
		JPanel btnpanel = new JPanel();
		contentPane.add(btnpanel, BorderLayout.SOUTH);
		btnpanel.setLayout(new GridLayout(0, 6, 0, 0));
		
		
		jobTextField = new JTextField();
		jobTextField.setText(jobComboBox.getSelectedItem().toString());
		JButton addBtn = new JButton("ADD");
		addBtn.addActionListener(new CreateFunction(table, numberTextField, nameTextField, telTextField, 
				emailTextField, idNumberTextField, jobTextField) {}); 
		btnpanel.add(addBtn);
		
		JButton deleteBtn = new JButton("DELETE");
		deleteBtn.addActionListener(new RemoveFunction(table) {});
		btnpanel.add(deleteBtn);
		
		JButton previousBtn = new JButton("PREVIOUS");
		btnpanel.add(previousBtn);
		
		JButton nextBtn = new JButton("NEXT");
		btnpanel.add(nextBtn);
		
		JButton editBtn = new JButton("EDIT");
		btnpanel.add(editBtn);
		
		JButton searchBtn = new JButton("SEARCH");
		btnpanel.add(searchBtn);
		
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {System.exit(0);} });
		
		editBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SelectedRow = table.getSelectedRow();
				EditFunction.UpdateData(table,nameTextField.getText(), telTextField.getText(), emailTextField.getText(), SelectedRow);
				numberTextField.setEnabled(true);
				idNumberTextField.setEnabled(true);
				nameTextField.setText("");
				telTextField.setText("");
				emailTextField.setText("");
			}
		});
		
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SaveFileFunction.saveFile(jFrame, table);
			}
		});
		
		open.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OpenFileFunction.OpenFile(jFrame, table);
			}
		});
		
		exitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout)(card.getLayout());
		        cl.next(card);
			}
		});
		searchBtn.addActionListener(new ActionListener() {//need to research this
		public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout)(card.getLayout());
		        cl.next(card);}});
		
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				SelectedRow = table.getSelectedRow();
				DisplayUserInfo.DisplayUser(table, numberTextField, idNumberTextField, ageTextArea, genderTextArea, locationTextArea, birthTextArea, SelectedRow);
			}
		});
	}

	public void SortUser(Object[][] arr, int sortby) {
		Arrays.sort(arr, new Comparator<Object[]>() {
			@Override
			public int compare(Object[] o1, Object[] o2) {// If user Click the Title; Column Sort Execute : change o1
															// [0], o2[0] => o1 [i], o2[i]
				if (((Comparable) o1[sortby]).compareTo(o2[sortby]) > 0)
					return 1;
				else
					return -1;
			}
		});
	}

}
