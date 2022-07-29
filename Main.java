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
                                Dorm.create();
                                break;
                            case 2:
                                Dorm.update();
                                break;
                            case 3:
                                Dorm.displayAll();
                                break;
                            case 4:
                                Dorm.delete();
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
                                Block.create();
                                break;
                            case 2:
                                Block.update();
                                break;
                            case 3:
                                Block.displayAll();
                                break;
                            case 4:
                                Block.delete();
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
                                Attendance.displayAll();
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
                    Menu.printCleanerMenu();
                    do {
                        Menu.printAttendanceMenu();
                        choice = S.nextInt();
                        switch (choice) {
                            case 1:
                                Cleaner.addNewCleaner();
                                break;
                            case 2:
                                Cleaner.updateCleaner();
                                break;
                            case 3:
                                Cleaner.displayCleanerList();
                                break;
                            case 4:
                                break MainMenu;
                            case 5:
                                break;
                            default:
                                System.out.println("Chocie not recognised! Please, try again\n");
                        }
                    } while (choice != 6);
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Chocie not recognised! Please, try again\n");
            }
        } while (choice != 6);
  }
}