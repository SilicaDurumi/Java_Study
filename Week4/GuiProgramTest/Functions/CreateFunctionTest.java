package Functions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CreateFunctionTest implements ActionListener{
	JTable table;
	JTextField txt1, txt2, txt3;
	
	public CreateFunctionTest(JTable table, JTextField text1, JTextField text2, JTextField text3) {
		this.table = table;
		txt1 = text1;
		txt2 = text2;
		txt3 = text3;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String [] userinfo = new String[3];
		String inputname = txt1.getText();
		String inputage = txt2.getText();
		String inputgender = txt2.getText();
		
		
		if (inputname.length() == 0 || inputage.length() == 0|| inputgender.length() == 0) {
			JOptionPane.showMessageDialog(null, "Please Fill all Information of the TextField", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		userinfo[0] = inputname;
		userinfo[1] = inputage;
		userinfo[2] = inputgender;
				
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.addRow(userinfo);
		
		txt1.setText(null);
		txt2.setText(null);
		txt3.setText(null);
		
		txt1.requestFocus();
		
	}
}

































