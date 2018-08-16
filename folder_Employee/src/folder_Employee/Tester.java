package folder_Employee;
import java.util.Scanner;
import javax.swing.*; 

public class Tester extends Employee{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame theGUI = new JFrame("test");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("What is your first name? ");
		
		String fname = scanner.nextLine();
		
		System.out.print("What is your last name? ");
		
		String lname = scanner.nextLine();
		
		Employee emp1 = new Employee(fname, lname);
		
		System.out.print(emp1.tostring());
		
		theGUI.setTitle("FirstGUIProgram");
		theGUI.setSize(300, 200);
		theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		theGUI.setVisible(true);
	}

}
