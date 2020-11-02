package Functions;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class DisplayUserInfo {
	
	public static void DisplayUser(JTable table, JTextField numberTextField, JTextField idNumberTextField,
			JTextArea ageTextArea, JTextArea genderTextArea, JTextArea locationTextArea ,JTextArea birthTextArea, int SelectedRow) {
		SelectedRow = table.getSelectedRow();
		if (SelectedRow == -1) {
			JOptionPane.showMessageDialog(null, "Please Select The Data", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		
		numberTextField.setEnabled(false);
		idNumberTextField.setEnabled(false);
		ageTextArea.setText((String) model.getValueAt(SelectedRow, 6)); 
		genderTextArea.setText((String) model.getValueAt(SelectedRow,7));
		locationTextArea.setText((String) model.getValueAt(SelectedRow,8));
		birthTextArea.setText((String) model.getValueAt(SelectedRow,9));
	}
}
