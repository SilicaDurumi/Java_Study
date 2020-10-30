package Functions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class CreateFunction implements ActionListener{
	JTable table;
	JTextField[] txt = new JTextField[6];
	
	public CreateFunction(JTable table, JTextField text1, JTextField text2, JTextField text3 , JTextField text4, JTextField text5) {
		this.table = table;
		this.txt[0] = text1;
		this.txt[1] = text2;
		this.txt[2] = text3;
		this.txt[3] = text4;
		this.txt[4] = text5;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		boolean FLAG = false;
		String[] userinfo = new String[5] ;
		
		for (int i = 0; i < userinfo.length; i++) 
			userinfo[i] = this.txt[i].getText();
		
		for (int i = 0; i < userinfo.length; i++) {
			if (userinfo[i].length()==0) 			
				FLAG = true;
		}
		if (FLAG) {
			JOptionPane.showMessageDialog(null, "Please Write all information of the TextField", "Error", JOptionPane.ERROR_MESSAGE );
			return ;
		}
		
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.addRow(userinfo);
		
		for (int j = 0; j < userinfo.length; j++) 
			txt[j].setText("");
		txt[0].requestFocus();
	}
}






















