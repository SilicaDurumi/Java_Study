package Functions;

import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class OpenFileFunction {
	public static void OpenFile(JFrame frame, JTable table) {//use vector
		FileDialog openFile;
		openFile = new FileDialog(frame, "OPEN", FileDialog.LOAD);
	    openFile.setVisible(true); 
	    
	    String path = openFile.getDirectory()+ openFile.getFile();
	    try{
	        BufferedReader buffread = new BufferedReader(new FileReader(path));
	        Vector<String> userinfo = new Vector<String>();
	        DefaultTableModel model = (DefaultTableModel) table.getModel();	      
	        
	        for (int i = 0; i < table.getModel().getRowCount(); i++) {
		    	   for (int j = 0; j < table.getModel().getColumnCount(); j++)
		    		   table.getModel().setValueAt(null, i, j);
		    model.removeRow(i);
	        }
	      
	        
//	      	userinfo.add(buffread.readLine().split(" ### "));
	       	model.addRow(userinfo);
	        buffread.close();
	        String Filename = openFile.getFile();
	        frame.setTitle(Filename);
	       } catch(Exception e1){System.out.println(e1.toString());}
	}
}






























