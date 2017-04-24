
public class oven {

	public static void main(String[] args) {
		int ovenOption = Integer.parseInt(JOptionPane.showInputDialog(null, "What would you like to do?\n" 
						+ "1.Turn oven on\n" + "2.Turn oven off\n" + "3.Return to main menu\n"));
		
		if (ovenOption == 1) {
			ovenOn=true
		}
		else {
			ovenOn=false
		}
		
	}
	
	public static boolean ovenOn; {
		if (boolean ovenOn = true) {
			System.out.println("The oven is on");
		}
	}

}
