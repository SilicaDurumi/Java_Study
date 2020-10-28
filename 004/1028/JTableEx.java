import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.Arrays;
import java.util.Comparator;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.GridLayout;

public class JTableEx extends JFrame {
	private JPanel contentPane;
	private JTable table;
	private JScrollPane scrollPane;
	private JTextField name;
	private JLabel telLabel;
	private JTextField telephone;
	private JLabel idnumberLabel;
	private JTextField idnumber;
	private JPanel panel;
	
	private  Object[][] userdata= { { "06", "Male", "ZSA", "12345" }, { "03", "Female", "ACD", "23456" },
			{ "04", "Female", "CDE", "34567" }, { "02", "Female", "DEF", "45678" }, { "05", "Female", "EFG", "56789" },
			{ "01", "Male", "FGH", "67890" },{ "12", "Female", "SSS", "12341" } ,{ "10", "Male", "KLM", "51201" } ,{ "09", "Female", "IKL", "10901" },
			{ "07", "Female", "GHI", "78901" },{ "11", "Female", "GGG", "71231" }};
	private String[][] userstr = new String[userdata.length][];
	private String[] title = { "NUM", "GENDER", "NAME", "IDNUMBER" };

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JTableEx frame = new JTableEx();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public JTableEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 264);
		setTitle("JTable Test");
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu filemenu = new JMenu("File");
		JMenu helpmenu = new JMenu("Help");

		menuBar.add(filemenu);
		menuBar.add(helpmenu);
		
		SortUser(userdata); //Sort
		
		JPanel panel = new JPanel();
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
				
		table = new JTable(userdata, title);
		table.setCellSelectionEnabled(true);
		table.setRowSelectionAllowed(false);
		table.setColumnSelectionAllowed(true);
		table.setModel(new DefaultTableModel(userdata, title));
		
		scrollPane = new JScrollPane(table);
		
		contentPane.add(scrollPane);
		
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			System.out.println(table.getSelectedRow()); //getSelectedRow return integer value
//			If user Click the Title Column Sort Execute
//			SortUser(user)
			
			}
		});
	}

	
	
	
	
	
	
	
	
	
	public void SortUser(Object[][] arr) {
		Arrays.sort(arr,  new Comparator<Object[]>() {
			@Override
			public int compare(Object[] o1, Object[] o2) {//	 If user Click the Title; Column Sort Execute : change o1 [0], o2[0] => o1 [i], o2[i]
				if (((Comparable)o1[0]).compareTo(o2[0])>0)
					return 1;
				else
					return -1;
			}
		});
	
}	
}
































