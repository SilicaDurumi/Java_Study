import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EmployeeInsertEx extends JFrame {
	
	private JPanel contentPane;

	String driver = "oracle.jdbc.driver.OracleDriver"; 	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	
	Connection connection = null;
	PreparedStatement preparedStatement = null;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmployeeInsertEx frame = new EmployeeInsertEx();
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
	public EmployeeInsertEx() {
		String[] title = {"Number","Name","JOB","DEPTNO","EMAIL"};
		JTextField[] textFields = new JTextField[5];
		for (int i = 0; i < textFields.length; i++) 
			textFields[i] = new JTextField(title[i]);
		
		setTitle("Table Data Insert");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 260, 230);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JPanel textfieldpanel = new JPanel();
		contentPane.add(textfieldpanel);
		textfieldpanel.setLayout(new GridLayout(0, 1, 0, 0));
		
		for (int i = 0; i < textFields.length; i++) {
			textfieldpanel.add(textFields[i]);
			textFields[i].setColumns(10);
		}
		
		JPanel buttonpanel = new JPanel();
		contentPane.add(buttonpanel);
		
		JButton addButton = new JButton("Add");
		buttonpanel.add(addButton);
	
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName(driver);
					connection = DriverManager.getConnection(url,"USERID","USERPW");
					String insert_sql = "insert into employee values(?,?,?,?,?)";
					preparedStatement = connection.prepareStatement(insert_sql);
					
					preparedStatement.setInt(1, Integer.parseInt(textFields[0].getText()));
					preparedStatement.setString(2, textFields[1].getText());
					preparedStatement.setString(3, textFields[2].getText());
					preparedStatement.setInt(4, Integer.parseInt(textFields[3].getText()));
					preparedStatement.setString(5, textFields[4].getText());
					
					preparedStatement.executeUpdate();
					
					for (int i = 0; i < textFields.length; i++) 
						textFields[i].setText(null);
					textFields[0].requestFocus();
					
				} catch (Exception e2) {
					System.out.println(e2);
				}finally {
					try {
							if(preparedStatement != null) preparedStatement.close();
							if (connection != null) connection.close();
					} catch (Exception e3) {
						System.out.println(e3);
					}
				}
				
			}
		});
	
	
	}
	

}























