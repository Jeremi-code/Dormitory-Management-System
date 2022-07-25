import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int choice;
        MainMenu:
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
                    do {
                        Menu.printBlockMenu();
                        choice = S.nextInt();
                        switch (choice) {
                            case 1:
                                Menu.addBlockHandler();
                                break;
                            case 2:
                                Menu.updateBlockHander();
                                break;
                            case 3:
                                Menu.displayBlockHandler();
                                break;
                            case 4:
                                Menu.removeBlockHandler();
                                break;
                            case 5:
                                break;
                            case 6:
                                break MainMenu;
                            default:
                                System.out.println("Chocie not recognised! Please, try again\n");
                        }
                    } while (choice != 6);
                    break;
                case 4:
                    Menu.printAttendanceMenu();
                    break;
                case 5:
                    Menu.printSwitchingMenu();
                    break;
                default:
                    System.out.println("Chocie not recognised! Please, try again\n");
            }
        } while (choice != 6);
  }
}