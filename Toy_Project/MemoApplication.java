import javax.swing.JFrame; 
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import java.awt.FileDialog;
import java.awt.CardLayout;

public class MemoApplication extends JFrame implements ActionListener {
	JFrame frame = new JFrame("NotePad");
	FileDialog saveFile, openFile;
	JTextArea textArea;
	
	public void actionPerformed(ActionEvent e) {
		
	}	
	
	public static void main(String[] args) {
		MemoApplication window = new MemoApplication();
		window.frame.setVisible(true);
	}
	
	public MemoApplication() {initialize();}
	
	private void initialize() {
		frame.setBounds(100, 100, 600, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);

		JMenu filemenu = new JMenu("File");
		JMenu sortmenu = new JMenu("Align");
		JMenu helpmenu = new JMenu("Help");

		menuBar.add(filemenu);
		menuBar.add(sortmenu);
		menuBar.add(helpmenu);

		ButtonGroup group = new ButtonGroup();

		JMenuItem open = new JMenuItem("OPEN");
		JMenuItem save = new JMenuItem("SAVE");
		JMenuItem saveas = new JMenuItem("SAVE AS");
		JMenuItem close = new JMenuItem("CLOSE");
		JMenuItem exit = new JMenuItem("EXIT");

		JCheckBoxMenuItem name = new JCheckBoxMenuItem("NAME");
		JCheckBoxMenuItem date = new JCheckBoxMenuItem("DATE");
		JCheckBoxMenuItem size = new JCheckBoxMenuItem("SIZE");
		JCheckBoxMenuItem editdate = new JCheckBoxMenuItem("EDIT DATE");

		JMenuItem printinfo = new JMenuItem("PRINT INFO");

		group.add(name);	group.add(date);group.add(size);group.add(editdate);
		filemenu.add(open); filemenu.add(save); filemenu.add(saveas); filemenu.add(close); filemenu.add(exit);
		sortmenu.add(name); sortmenu.add(date); sortmenu.add(size); sortmenu.add(editdate);
		helpmenu.add(printinfo);
		
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		textArea = new JTextArea();
		frame.getContentPane().add(textArea, "name_3367768070300");
		
		save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	saveFile = new FileDialog(frame, "SAVE", FileDialog.SAVE);
                saveFile.setVisible(true);        
                
                String path = saveFile.getDirectory() + saveFile.getFile();          
                try {
                   FileWriter writer = new FileWriter( path );
                   String s = textArea.getText();                 
                   writer.write( s  ); 
                   writer.close();
                } catch (Exception e2) {System.out.println("Save error"+e2);}  
            }            
        }); 
       open.addActionListener(new ActionListener() {
    	   public void actionPerformed(ActionEvent e) {
    		   openFile = new FileDialog(frame, "OPEN", FileDialog.LOAD);
               openFile.setVisible(true); 
               String data = openFile.getDirectory()+ openFile.getFile();
               
               try{
                   String str="";
                   FileReader fr = new FileReader(data);
                   BufferedReader br = new BufferedReader(fr);
                 
                   textArea.setText("");  // 일단 초기화
                   while((str=br.readLine()) != null){   // str에 남아둔 내용이 null 이 아니면..
                       textArea.append(str);  // str의 내용을 추가
                       textArea.append("\r\n"); // readline은 개행을 못하니 개행까지 직접해준다.
                   }
                  
                   br.close();
                   String Filename = openFile.getFile();
                   frame.setTitle(Filename);
                  } catch(Exception e1){}
  
		}
        }); 
		
	}
}

































