package Functions;


import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;

public class EditFunction {
	public static void UpdateData(JTable table, JFrame frame, JTextField nametext, JTextField teltext, JTextField emailtext) {
		
		int updateRow = table.getSelectedRow();
		table.setValueAt(nametext, updateRow, 1);
		table.setValueAt(teltext, updateRow, 2);
		table.setValueAt(emailtext, updateRow, 2);
		frame.setVisible(true);
	}
}
