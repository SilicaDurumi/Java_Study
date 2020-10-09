import javax.swing.JOptionPane;

class Accounting{
	public double Valsup;
	public double VatRate = 0.1;
	public double expenseRate = 0.3;
	public double[] Div = new double[3];
	public void print() {
		System.out.println("Value of supply : "+Valsup);
		System.out.println("VAT : "+getVAT());
		System.out.println("Total : "+getTotal());
		System.out.println("Expense : "+getExpense());
		System.out.println("Income : "+ getIncome());
		
		for (int j = 0; j < Div.length; j++) 
			System.out.println("Dividend "+(j+1)+" : "+getIncome() * Div[j]);
	}
	public double getIncome() {
		return Valsup - getExpense();
	}
	public double getExpense() {
		return Valsup * expenseRate;
	}
	public double getTotal() {
		return Valsup + getVAT();
	}
	public double getVAT() {
		return Valsup*VatRate;
	}
}


public class AccountingApp {

	public static void main(String[] args) {
			Accounting a1 = new Accounting();
//			Accounting a2 = new Accounting();  Instance
			int i = 0;
			a1.Valsup = Double.parseDouble(JOptionPane.showInputDialog("Enter a Value of Supply"));
			
			if (a1.Valsup>10000) {
				while(i < a1.Div.length) {
					a1.Div[i] = Double.parseDouble(JOptionPane.showInputDialog("Enter Div"+(i+1)+"'s income rate"));
					i++;
				}
			}
			else {
				a1.Div[0] = 0.5;
				a1.Div[1] = 0.3;
				a1.Div[2] = 0.2;
			}
			a1.print();
		}
}
