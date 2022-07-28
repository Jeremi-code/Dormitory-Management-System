import java.util.Scanner;
public class Main {
	
	public static void main(String[] args){
		Scanner S = new Scanner(System.in);
		int choice;
        do {
            Menu.printMainMenu();
            choice = S.nextInt();
            MainMenu:
            switch (choice) {
                case 1:
                    Menu.printStudentMenu();
                    break;
                case 2:
                    do {
                        Menu.printDormMenu();;
                        // again:
                        choice = S.nextInt();
                        switch (choice) {
                            case 1:
                                Dorm.addDormHandler();
                                break;
                            case 2:
                                Dorm.updateDormHandler();
                                break;
                            case 3:
                                Dorm.displayDormHandler();
                                break;
                            case 4:
                                Dorm.removeDormHandler();
                                break;
                            case 5:
                                break MainMenu;
                            case 6:
                                break;
                            default:
                                System.out.println("Chocie not recognised! Please, try again\n");
                                // break again;
                        }
                    } while (choice != 6);
                    break;
                case 3:
                    do {
                        Menu.printBlockMenu();
                        choice = S.nextInt();
                        switch (choice) {
                            case 1:
                                Block.addBlockHandler();
                                break;
                            case 2:
                                Block.updateBlockHandler();
                                break;
                            case 3:
                                Block.displayBlockHandler();
                                break;
                            case 4:
                                Block.removeBlockHandler();
                                break;
                            case 5:
                                break MainMenu;
                            case 6:
                                break;
                            default:
                                System.out.println("Chocie not recognised! Please, try again\n");
                        }
                    } while (choice != 6);
                    break;
                case 4:
                    do {
                        Menu.printAttendanceMenu();
                        choice = S.nextInt();
                        switch (choice) {
                            case 1:
                                Attendance.takeNewAttendance();
                                break;
                            case 2:
                                Attendance.updateAttendance();
                                break;
                            case 3:
                                Attendance.displayAttendance();
                                break;
                            case 4:
                                Attendance.reportAttendance();
                                break;
                            case 5:
                                break MainMenu;
                            case 6:
                                break;
                            default:
                                System.out.println("Chocie not recognised! Please, try again\n");
                        }
                    } while (choice != 6);

                    break;
                case 5:
                    Menu.printSwitchingMenu();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Chocie not recognised! Please, try again\n");
            }
        } while (choice != 6);
  }
}