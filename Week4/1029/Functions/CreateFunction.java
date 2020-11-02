package Functions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CreateFunction implements ActionListener{
	JTable table;
	JTextField txt1, txt2, txt3;
	
	public CreateFunction(JTable table, JTextField text1, JTextField text2, JTextField text3 ) {
		this.table = table;
		txt1 = text1;
		txt2 = text2;
		txt3 = text3;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String inputName = txt1.getText();
		String inputAge = txt2.getText();
		String inputGender = txt3.getText();
		
		if (inputName.length() == 0 || inputAge.length() ==0 || inputGender.length() ==0) {
			JOptionPane.showMessageDialog(null, "Please Write all information of the TextField", "Error", JOptionPane.ERROR_MESSAGE );
			return ;
		}
		String[]	userinfoarr = new String[3];
		userinfoarr[0] = inputName;
		userinfoarr[1] = inputAge;
		userinfoarr[2] = inputGender;
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.addRow(userinfoarr);
	
		txt1.setText("");
		txt2.setText("");
		txt3.setText("");
		txt1.requestFocus();
		
	}
}






















