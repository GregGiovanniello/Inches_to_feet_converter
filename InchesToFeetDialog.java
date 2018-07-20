import javax.swing.JOptionPane;


public class InchesToFeetDialog
{
		public static void main(String[] args)
		{
			//declares variables
			final int INCHES_IN_FOOT = 12;
			int inches;
			int feet;
			int extraInches;
			String name;
			
			
			//prompts user to give the value to inches
			name = JOptionPane.showInputDialog(null, "Enter Inches: ");
			inches = Integer.parseInt(name);
		
		
			
			//calculations
			feet = inches / INCHES_IN_FOOT;
			extraInches = inches % INCHES_IN_FOOT;
			
			//output statement / statements to change grammer
			
				if (feet == 1 && extraInches == 0) {
					JOptionPane.showMessageDialog(null, inches + " inches = " + feet + " foot");
					
				} else if (feet == 1 && extraInches == 1) {
				JOptionPane.showMessageDialog(null, inches + " inches = " + feet + " foot and " + extraInches + " inch" );
					
			    } else if (extraInches == 0) {
				JOptionPane.showMessageDialog(null, inches + " inches = " + feet + " feet");
				
				} else if (extraInches == 1) {
				JOptionPane.showMessageDialog(null, inches + " inches = " + feet + " feet and " + extraInches + " inch" );
				
				} else if (feet == 0) {
				JOptionPane.showMessageDialog(null, inches + " inches = " + extraInches + " inches" );
				
				} else {
				JOptionPane.showMessageDialog(null, inches + " inches = " + feet + " feet and " + extraInches + " inches" );
				}
			
		}
}