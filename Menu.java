// import java.io.InputStream;
// import java.lang.runtime.SwitchBootstraps;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

// import javax.swing.text.html.StyleSheet;

public class Menu {
	public static void printMainMenu() {
		System.out.println("Choose from the Menu Below");
		System.out.println("========Main Menu========");
		System.out.println("1) Manage Student");
		System.out.println("2) Manage Dorm");
		System.out.println("3) Manage Block");
		System.out.println("4) Manage Attendance");
		System.out.println("5) Manage cleaners ");
		System.out.println("6) Exit");
	}
	
	public static void printBlockMenu() {
	      System.out.println("Choose from the Menu Below");
	      System.out.println("======== Block Menu ========");
	      System.out.println("1) Add New Block");
	      System.out.println("2) Update Block detail");
	      System.out.println("3) Display Blocks");
	      System.out.println("4) Remove Block");
	      System.out.println("5) Back ");
	      System.out.println("6) Exit ");
	     
    }
	
	public static void printAttendanceMenu() {
	      System.out.println("Choose from the Menu Below");
	      System.out.println("======== Attenandce Menu ========");
	      System.out.println("1) Take new attendance");
	      System.out.println("2) Update attendance detail");
		  System.out.println("3) Display attendance");
	      System.out.println("4) Report the taken attendance with evaluation");
	      System.out.println("5) Back ");
		  System.out.println("6) EXIT ");
	     
	}
	
	public static void printDormMenu() {
		System.out.println("Choose from the Menu Below");
		System.out.println("======== Dorm Menu ========");
	      System.out.println("1) Add new dorm");
	      System.out.println("2) Update dorm details");
	      System.out.println("3) Display dorms");
	      System.out.println("4) Remove dorms");
	      System.out.println("5) Back ");
		  System.out.println("6) Exit ");

	}
	
	public static void printStudentMenu() {
		System.out.println("Choose from the Menu Below");
	      System.out.println("======== Student Menu ========");
	      System.out.println("1) Register New Student");
	      System.out.println("2) Update students Details");
	      System.out.println("3) Display Students");
	      System.out.println("4) Remove Student");
	      System.out.println("5) Back ");
		  System.out.println("6) Exit ");
	     
	}

	public static void printCleanerMenu() {
		System.out.println("Choose from the Menu Below");
		System.out.println("======== Proctor switching Menu ========");
		System.out.println("1) Add new cleaner");
		System.out.println("2) Update Cleaners");
		System.out.println("3) Display the cleaners' list");
		System.out.println("4) Back ");
		System.out.println("5) Exit ");
	}

}






