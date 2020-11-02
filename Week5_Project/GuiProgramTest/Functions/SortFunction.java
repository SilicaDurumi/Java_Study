package Functions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;


public class SortFunction implements ActionListener {
	Object userarr[][];
	int sortby;
	
	public SortFunction(Object[][] userdata, int i) {
		this.userarr = userdata;
		sortby = i;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Arrays.sort(userarr,  new Comparator<Object[]>() {
			@Override
			public int compare(Object[] o1, Object[] o2) {//	 If user Click the Title; Column Sort Execute : change o1 [0], o2[0] => o1 [i], o2[i]
				if (((Comparable)o1[sortby]).compareTo(o2[sortby])>0)
					return 1;
				else
					return -1;
			}
		
		});
	}
//	showClass.table.getmodel();
	
}


























