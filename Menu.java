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
		System.out.println("1) Manage Dorm");
		System.out.println("2) Manage Block");
		System.out.println("3) Manage Attendance");
		System.out.println("4) Manage cleaners ");
		System.out.println("5) Exit");
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
		  System.out.println("2) Display attendance");
	      System.out.println("3) Report the taken attendance with evaluation");
	      System.out.println("4) Back ");
		  System.out.println(") EXIT ");
	     
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
	public static void printCleanerMenu() {
		System.out.println("Choose from the Menu Below");
		System.out.println("======== Cleaner Menu ========");
		System.out.println("1) Add new cleaner");
		System.out.println("2) Display the cleaners' list");
		System.out.println("3) Back");
		System.out.println("4) Exit");
	}
}






