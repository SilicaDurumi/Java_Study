import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class LotteryNumber extends JFrame implements ActionListener {
	int i, j, temp;
	JTextField[] lottery = new JTextField[6];
	JButton lotteryButton;
	Random random = new Random();
	
	public LotteryNumber() {
		setTitle("Lottery Number Generator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		for (i = 0; i < lottery.length; i++) lottery[i] = new JTextField(2);
		
		lotteryButton = new JButton("Generate Lottery Number");
		lotteryButton.addActionListener(this);//actionPerform
		
		setLayout(new FlowLayout());
		
		for (i = 0; i < lottery.length; i++) 
			add(lottery[i]);
		add(lotteryButton);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int lotteryNumberArr[] = new int[6];
		int index = 0;
		
		while (index<lotteryNumberArr.length) {
			int randomnumber = random.nextInt(45)+1;
			boolean FLAG = false;
			
			for (i = 0; i < lotteryNumberArr.length; i++) 
				if (randomnumber == lotteryNumberArr[i]) {
					FLAG = true;
					break;
				}
			if (FLAG == false) {
				lotteryNumberArr[index] = randomnumber;
				index++;
			}
		}
		
		for (i = 0; i < lotteryNumberArr.length-1; i++) 
			for (j = i+1; j < lotteryNumberArr.length; j++) 
				if (lotteryNumberArr[i]>lotteryNumberArr[j]) {
					temp = lotteryNumberArr[i];
					lotteryNumberArr[i] = lotteryNumberArr[j];
					lotteryNumberArr[j] = temp;
				}
		for (i = 0; i < lottery.length; i++) 
			lottery[i].setText(String.valueOf(lotteryNumberArr[i]));
	}
	
	public static void main(String[] args) {
		LotteryNumber lotteryNumberwindow = new LotteryNumber();
//		TreeSet<Integer> lotteryNum = new TreeSet<>();
//		ArrayList<Integer> lotteryNumberStorage;
//		
//		for (i = 0; i < 6 ; i++) lotteryNum.add((int)(Math.random() * 45) + 1);	
//		lotteryNumberStorage = new ArrayList<Integer>(lotteryNum);

		lotteryNumberwindow.setSize(300,300);
		lotteryNumberwindow.setLocation(1000,300);
		lotteryNumberwindow.setVisible(true);
	}
}
