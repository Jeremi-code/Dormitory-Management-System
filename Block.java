
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Block {
    // public static final String ANSI_RESET = "\u001B[0m";
    // public static final String ANSI_YELLOW = "\u001B[33m";
    private int blockNumber;
    private String blockName;
    private int numberOfProctors;
    //replace with numberOfDorms
    private int numberOfFloors;
    private int dormPerFloor;
    private int numberOfDorms;
    private ArrayList<Proctor> proctorsList = new ArrayList<>();

    public Block(int blockNumber, String blockName, int dormPerFloor,int numberOfFloors/* , ArrayList<Proctor> proctorsList*/) {
        this.blockNumber = blockNumber;
        this.blockName = blockName;
        this.dormPerFloor = dormPerFloor;
        this.numberOfFloors = numberOfFloors;
        this.numberOfDorms = numberOfFloors*dormPerFloor;
        this.numberOfProctors = 0;//proctorsList.size();
        // this.proctorsList = proctorsList;
    }

    public void addProctor(ArrayList<Proctor> proctorList) {
    	try {
    		this.proctorsList.addAll(proctorList);
    		this.numberOfProctors += proctorList.size();
    		// proctor.setBlockNumber(this.blockNumber);
    	} catch (Exception e) {
    		System.out.print("Error: ");
    		System.out.println(e);
    	}
    }
    
    public void setBlockNumber(int blockNumber) {
    	try {
    		this.blockNumber = blockNumber;
    	} catch (Exception e) {
    		System.out.print("Error: ");
    		System.out.println(e);
    	}
    }
    public int getNumber() {
        return this.blockNumber;
    }
    public String getName(){return this.blockName;}
	public int getNumberOfDorms() { return this.numberOfDorms; }
	public int getNumberOfProctors() { return this.numberOfProctors; }
	public ArrayList getProctorsList() { return this.proctorsList; }
	public void addToProctorsList(ArrayList<Proctor> newProctorList) {
		this.proctorsList.addAll(newProctorList);
	}
	public void setBlockName(String blockName) { this.blockName = blockName; }
    public void setNumberOfDorms(int numberOfDorms) { this.numberOfDorms = numberOfDorms; }

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
        if(Store.BlockList.size() == 0){
            System.out.println("There is no Block added, Please add Blocks  first in the Block menu!");
        }
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

    public static void updateBlockHandler() {
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
      
            try{
                name = reader.readLine();
                
                
                System.out.println(String.format("Enter the phoneNumber of proctor No %d", i+1));
               
                phoneNumber = reader.readLine();

              
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