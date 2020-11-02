package Functions;


import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class EditFunction {
	public static void UpdateData(JTable table, String name , String tel, String email, int selectedrow) {
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		
		model.setValueAt(name, selectedrow,1);
		model.setValueAt(tel, selectedrow, 2);
		model.setValueAt(email, selectedrow, 3);
		
	}
}