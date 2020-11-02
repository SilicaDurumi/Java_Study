package Functions;

import java.awt.FileDialog;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.swing.JFrame;
import javax.swing.JTable;

public class SaveFileFunction {
	public static void saveFile(JFrame frame,JTable table ) {
		
		FileDialog saveFile;
		saveFile = new FileDialog(frame, "SAVE", FileDialog.SAVE);
	    saveFile.setVisible(true);
	    
	    String filename = "";
	    String path = saveFile.getDirectory() + saveFile.getFile();
	    
	    try {
	       BufferedWriter buffwrite = new BufferedWriter(new FileWriter(path));
	       for (int i = 0; i < table.getModel().getRowCount(); i++) {
	    	   for (int j = 0; j < table.getModel().getColumnCount(); j++)
				 filename += table.getModel().getValueAt(i, j)+" ### ";   
			filename += "\n";
	       }
	       
	       buffwrite.write(filename); 
	       buffwrite.close();
	       frame.setTitle(saveFile.getFile());
	    } catch (Exception e2) {System.out.println(e2.toString());}  
	}
	
}
