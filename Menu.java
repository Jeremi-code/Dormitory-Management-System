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
		System.out.println("5) Manage proctor's switching schedule");
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
	      System.out.println("4) Remove attendance");
	      System.out.println("5) Back ");
	     
	}
	
	public static void printDormMenu() {
		System.out.println("Choose from the Menu Below");
		System.out.println("======== Dorm Menu ========");
	      System.out.println("1) Add new dorm");
	      System.out.println("2) Update dorm details");
	      System.out.println("3) Display dorms");
	      System.out.println("4) Remove dorms");
	      System.out.println("5) Back ");
	     
	}
	
	public static void printStudentMenu() {
		System.out.println("Choose from the Menu Below");
	      System.out.println("======== Student Menu ========");
	      System.out.println("1) Register New Student");
	      System.out.println("2) Update students Details");
	      System.out.println("3) Display Students");
	      System.out.println("4) Remove Student");
	      System.out.println("5) Back ");
	     
	}

	public static void printSwitchingMenu() {
		System.out.println("Choose from the Menu Below");
		System.out.println("======== Proctor switching Menu ========");
		System.out.println("1) Set new switching schedule");
		System.out.println("2) Update the current switching schedule");
		System.out.println("3) Display proctor's switching schedule");
		System.out.println("4) Back ");

	}
	
	public static void removeBlockHandler() {
		System.out.println("Choose the block you want to delete: ");
		displayBlockHandler();
		Scanner S = new Scanner(System.in);
		int index;
		index = S.nextInt() - 1;
		Store.BlockList.remove(index);
		System.out.println("Delete Successful!");
	}

    public static void displayBlockHandler() {
		System.out.println("List of Blocks");

		for(int i = 0; i < Store.BlockList.size(); i++){
			System.out.println(String.format("%d)\tName: %s ", i+1, Store.BlockList.get(i).getName()));
			System.out.println(String.format(" \tNumber: %d ", Store.BlockList.get(i).getNumber()));
			System.out.println(String.format(" \tNumber of dorms: %d ", Store.BlockList.get(i).getNumberOfDorms()));
			System.out.println(String.format(" \tNumber of Proctors: %d ", Store.BlockList.get(i).getNumberOfProctors()));
			ArrayList<Proctor> proctorsList= new ArrayList<>();
			
			proctorsList.addAll(Store.BlockList.get(i).getProctorsList());
			System.out.println(String.format(" Proctors of %s Block ", Store.BlockList.get(i).getName()));
			// System.out.println(Arrays.toString(proctorsList.toArray()));
			for(int j = 0; j < proctorsList.size(); j++){
				System.out.println(String.format("%d)\tName: %s ", j+1, proctorsList.get(j).getName()));
				System.out.println(String.format("Phone number: %s", proctorsList.get(j).getPhoneNumber()));
			}
		}
    }
	
	public static void displayBlockDetails(Block block){
		System.out.println("Block details here...");
		
		System.out.println(String.format("1) Name: %s", block.getName()));
		System.out.println(String.format("2) Number: %s", block.getNumber()));
		System.out.println(String.format("3) Number of dorms: %d", block.getNumberOfDorms()));
	}
	
    public static void updateBlockHander() {
		System.out.println("Choose the block you want to update the details of: ");
		displayBlockHandler();
		Scanner S = new Scanner(System.in);
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int index, num;
		String str;
		index = S.nextInt() - 1;
		System.out.println("Which of the block's details do you want to update?");
		displayBlockDetails(Store.BlockList.get(index));
		int ch = S.nextInt();
		switch (ch) {
			case 1:
				try {
					System.out.println("What should the new name be?");
					str = reader.readLine();
					Store.BlockList.get(index).setBlockName(str);
					break;
					
				} catch (IOException e) {
					//TODO: handle exception
					System.out.println("Menu.Error()");
				}
			case 2:
				System.out.println("What should the new number be?");
				num = S.nextInt();
				Store.BlockList.get(index).setBlockNumber(num);
				break;
			case 3:
				System.out.println("What should the new number of dorms be?");
				num = S.nextInt();
				Store.BlockList.get(index).setNumberOfDorms(num);
				break;
		
			default:
				break;
		}


    }

    public static void addBlockHandler() {
		Scanner S = new Scanner(System.in);
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		String blockName;
		int blockNumber, numberOfFloors, dormPerFloor, numberOfProctors;
		ArrayList<Proctor> proctorsList = new ArrayList<>();
		System.out.println("Enter block name: ");
		blockName = S.nextLine();
		System.out.println("Enter block number: ");
		blockNumber = S.nextInt();
		System.out.println("Enter number of floors for the block: ");
		numberOfFloors = S.nextInt();
		System.out.println("Enter dorm per floor for the block: ");
		dormPerFloor = S.nextInt();
		System.out.println("Enter number of proctors for the block: ");
		numberOfProctors = S.nextInt();
		String name, phoneNumber;
		for(int i = 0; i < numberOfProctors; i++){
			System.out.println(String.format("Enter the name of proctor No %d", i+1));
			// S.next();
			// name = S.nextLine();
			try{
				name = reader.readLine();
				System.out.println(String.format("Name %s", name));
				// StringBufferInputStream.skip(256);
				System.out.println(String.format("Enter the phoneNumber of proctor No %d", i+1));
				// S.next();
				// phoneNumber = S.nextLine();
				phoneNumber = reader.readLine();
	
				System.out.println(String.format("Phone No %s", phoneNumber));
				Proctor newProctor = new Proctor(name, phoneNumber, blockNumber);
				proctorsList.add(newProctor);
		
			}catch(IOException exception){
				System.out.println(exception.toString());
			}
			
		}
		Block newBlock = new Block(blockNumber, blockName, dormPerFloor, numberOfFloors);
		newBlock.addProctor(proctorsList);
		Store.BlockList.add(newBlock);
		System.out.println("Block Added Successfully!");
    }
	
}
