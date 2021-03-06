import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

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
import javax.swing.JTextArea;
import javax.swing.JMenu;
import javax.swing.DefaultComboBoxModel;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;

public class CardLayoutEx extends JFrame {
	private Object[][] userdata = {};
	private String [] columnName = {"Number","Name","Tel", "E-mail", "ID_Number","Age","Gender","Location","Birth","job"};
	private String [] job = {"ABC","BCD","CDE","DEF","EFG","FGH"};
	private JPanel contentPane;
	private JTextField numberTextField;
	private JTextField NameTextField;
	private JTextField telTextField;
	private JTextField emailTextField;
	private JTextField idNumberTextField;
	private JMenuBar menuBar;
	private JMenu filemenu;
	private JMenu helpmenu;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTable table;
	private JTextField searchtext;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardLayoutEx frame = new CardLayoutEx();
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
	public CardLayoutEx() {
		
		setFont(new Font("나눔바른고딕 UltraLight", Font.PLAIN, 12));
		setTitle("CardLayoutExample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 984, 605);
//		contentPane = getContentPane();
//		contentPane.add(new West(), BorderLayout.WEST);
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		filemenu = new JMenu("File");
		helpmenu = new JMenu("Help");

		menuBar.add(filemenu);
		
		JMenu alignmenu = new JMenu("Align");
		menuBar.add(alignmenu);
		menuBar.add(helpmenu);

		JMenuItem save = new JMenuItem("SAVE");
		JMenuItem open = new JMenuItem("OPEN");
		JMenuItem close = new JMenuItem("CLOSE");

		JMenuItem printinfo = new JMenuItem("INFO");

		filemenu.add(open); filemenu.add(save);filemenu.add(close);
		helpmenu.add(printinfo);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
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
		
		NameTextField = new JTextField();
		NameTextField.setColumns(10);
		inputpanel.add(NameTextField);
		
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
		
		JTextArea ageTextarea = new JTextArea();
		personinfo.add(ageTextarea);
		
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
		buttonGroup.add(nameRadioBtn);
		radiopanel.add(nameRadioBtn);
		
		JRadioButton jobRadioBtn = new JRadioButton("Job");
		buttonGroup.add(jobRadioBtn);
		radiopanel.add(jobRadioBtn);
		
		JRadioButton locationRadioBtn = new JRadioButton("Location");
		buttonGroup.add(locationRadioBtn);
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
		exitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout)(card.getLayout());
		        cl.next(card);
			}
		});
		searchbtnpanel.add(exitbtn);
		
		JScrollPane tablescrollpanel = new JScrollPane();
		contentPane.add(tablescrollpanel, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(userdata,columnName));
		tablescrollpanel.setViewportView(table);
		
		JPanel btnpanel = new JPanel();
		contentPane.add(btnpanel, BorderLayout.SOUTH);
		btnpanel.setLayout(new GridLayout(0, 6, 0, 0));
		
		JButton addBtn = new JButton("ADD");
		btnpanel.add(addBtn);
		
		JButton deleteBtn = new JButton("DELETE");
		btnpanel.add(deleteBtn);
		
		JButton previousBtn = new JButton("PREVIOUS");
		btnpanel.add(previousBtn);
		
		JButton nextBtn = new JButton("NEXT");
		btnpanel.add(nextBtn);
		
		JButton editBtn = new JButton("EDIT");
		btnpanel.add(editBtn);
		
		JButton searchBtn = new JButton("SEARCH");
		searchBtn.addActionListener(new ActionListener() {//need to research this
		public void actionPerformed(ActionEvent e) {
				CardLayout cl = (CardLayout)(card.getLayout());
		        cl.next(card);}});
		btnpanel.add(searchBtn);
	}
	
	
	class West extends JPanel implements ActionListener{
		JPanel personinfo = new JPanel();
		JPanel serach = new JPanel();
		
		public West() {
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
//		 next(this);	
		}
		
	}
	
	
}
