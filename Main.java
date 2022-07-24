import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int choice;
	 do {
		Menu.printMainMenu();
		choice = S.nextInt();
        switch (choice) {
            case 1:
                Menu.printStudentMenu();
                break;
            case 2:
                Menu.printDormMenu();
                break;
            case 3:
                Menu.printBlockMenu();
                break;
            case 4:
                Menu.printAttendanceMenu();
                break;
            default:
                System.out.println("Chocie not recognised! Please, try again\n");
        }
    } while (choice != 5);
  }
}