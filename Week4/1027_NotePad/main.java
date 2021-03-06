import javax.swing.JFrame; 
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.FileDialog;
import java.awt.CardLayout;
import javax.swing.JScrollPane;

/*
Must use try_catch Exception process when save file and open file
*/
	public class main extends JFrame  {
	JFrame frame = new JFrame("NotePad");
	FileDialog saveFile, openFile;
	JTextArea textArea;
	JScrollPane scrollPane;
	
	public static void main(String[] args) {
		main window = new main();
		window.frame.setVisible(true);
	}
	
	public main() {initialize();}
	private void initialize() {
		frame.setBounds(100, 100, 600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu filemenu = new JMenu("File");
		JMenu helpmenu = new JMenu("Help");

		menuBar.add(filemenu);
		menuBar.add(helpmenu);


            public void actionPerformed(ActionEvent e) {try {
				SaveFile();
			} catch (IOException e1) {
				e1.printStackTrace();
			}}
            });
       open.addActionListener(new ActionListener() {
    	   public void actionPerformed(ActionEvent e) {try {
			LoadFile();
		} catch (IOException e1) {
			e1.printStackTrace();
		}}
    	   });
       close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {System.exit(0);}
			});
       printinfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "NotePad Can Write&Read Text based file","INFO", JOptionPane.INFORMATION_MESSAGE);
				}
		});
	}
	public void SaveFile() throws IOException {
		saveFile = new FileDialog(frame, "SAVE", FileDialog.SAVE);
        saveFile.setVisible(true);        
        
        String path = saveFile.getDirectory() + saveFile.getFile();          
        try {
           FileWriter writer;
           BufferedWriter buffwrite = new BufferedWriter(new FileWriter(path));
           
           String filename = textArea.getText();                 
           
           buffwrite.write(filename); 
           buffwrite.close();
           
           frame.setTitle(saveFile.getFile());
        } catch (Exception e2) {System.out.println(e2.toString());}  
	}
	public void LoadFile() throws IOException {
		   openFile = new FileDialog(frame, "OPEN", FileDialog.LOAD);
           openFile.setVisible(true); 
           
           String path = openFile.getDirectory()+ openFile.getFile();
           try{
               String str="";
               FileReader fileread;
               BufferedReader buffread = new BufferedReader(new FileReader(path));
             
               textArea.setText(""); 
               
               while((str=buffread.readLine()) != null){  
                   textArea.append(str); 
                   textArea.append("\r\n"); 
               }
               buffread.close();
               String Filename = openFile.getFile();
               frame.setTitle(Filename);
              } catch(Exception e1){System.out.println(e1.toString());}
	}
	
}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	