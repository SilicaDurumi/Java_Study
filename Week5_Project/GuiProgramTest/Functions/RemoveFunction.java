package Functions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class RemoveFunction implements ActionListener{
	JTable table;
	
	public RemoveFunction(JTable table) {
		this.table = table;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		int selectedRowNum = table.getSelectedRow();
		if (selectedRowNum == -1) {
			JOptionPane.showMessageDialog(null, "Please Select The Data", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		int confirmcheck = JOptionPane.showConfirmDialog(null, "Delete this Data?","Confirm",JOptionPane.YES_NO_OPTION);
		if (confirmcheck == JOptionPane.YES_OPTION) {
			model.removeRow(selectedRowNum);
			JOptionPane.showMessageDialog(null, "Delete Complete");
		}
		else
			return;
	}
}






























