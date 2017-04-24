
public class doors {

	public static void main(String[] args)  {
		
		System.out.println("Are the doors open? " + doorStatus) ;
	
		int doorOption = Integer.parseInt(JOptionPane.showInputDialog(null, "What do you want to do?\n" 
					+ "1.Open Door\n" + "2.Close door\n" + "3.Return to main menu\n"));
	
		if (doorOption ==1 ){
			doorAction = true;
		}
	
	}
	
	
	
	public static boolean doorAction; {
		boolean door = true;
		System.out.println("The door is now open");
	}

	public static boolean doorStatus {
		if (doorAction == true) {
			return true;
		}
		else
			return false;
}
