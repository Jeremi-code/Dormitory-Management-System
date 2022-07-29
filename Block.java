
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Block extends Operations implements Identifiers {
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
            System.out.println("Input Mismatch");
        }

    }

    public void setBlockNumber(int blockNumber) {
        try {
            this.blockNumber = blockNumber;
        } catch (Exception e) {

            System.out.println("invalid try");
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

    public static void delete() {
        System.out.println("Choose the block you want to delete: ");
        displayAll();
        Scanner S = new Scanner(System.in);
        int index;
        try {
            index = S.nextInt() - 1;
            Store.BlockList.remove(index);
            System.out.println("Delete Successful!");
        } catch (Exception e) {
            System.out.println("input Mismatch");

        }
    }

    public static void displayAll() {
        System.out.println("List of Blocks");
        if(Store.BlockList.size() == 0){
            System.out.println("There is no Block added, Please add Blocks  first in the Block menu!");
            return;
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

    
    public static void displayOne(Block block){
        System.out.println("Block details here...");

        System.out.println(String.format("1) Name: %s", block.getName()));
        System.out.println(String.format("2) Number: %s", block.getNumber()));
        System.out.println(String.format("3) Number of dorms: %d", block.getNumberOfDorms()));
        System.out.println(String.format("4) Number of dorms: %d", block.getNumberOfProctors()));
        ArrayList<Proctor> proctorsList= new ArrayList<>();

        proctorsList.addAll(block.getProctorsList());
        System.out.println(String.format(" Proctors of %s Block ", block.getName()));

        for(int j = 0; j < proctorsList.size(); j++){
            System.out.println(String.format("=======%d========", j+1));
            System.out.println(String.format("Name: %s ", j+1, proctorsList.get(j).getName()));
            System.out.println(String.format("Phone number: %s", proctorsList.get(j).getPhoneNumber()));
        }
        
    }

    public static void update() {
        System.out.println("Choose the block you want to update the details of: ");
        displayAll();
        Scanner S = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int index, num;
        String str;
<<<<<<< HEAD

        
=======
        index = S.nextInt() - 1;
        System.out.println("Which of the block's details do you want to update?");
        displayOne(Store.BlockList.get(index));
        int ch = S.nextInt();
        switch (ch) {
            case 1:
>>>>>>> c193e00706ed714bb3d18b7d7cb3a0392cab300b
                try {
                    index = S.nextInt() - 1;
                    System.out.println("Which of the block's details do you want to update?");
                    displayBlockDetails(Store.BlockList.get(index));
                    int ch = S.nextInt();
                    switch (ch) {
                        case 1:
                    System.out.println("What should the new name be?");
                    str = reader.readLine();
                    Store.BlockList.get(index).setBlockName(str);
                    break;

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
<<<<<<< HEAD
    catch(Exception e){
        System.out.println("type incompatible");
        }
    
    }

    public static void addBlockHandler() {
      try{    
=======
    public void read(){
        System.out.println(String.format("Name %s", this.blockName));
        System.out.println(String.format("Number %s", this.blockNumber));
        System.out.println(String.format("Number of dorms %d", this.numberOfDorms));
        System.out.println(String.format("Number of floors %s", this.blockName));
        System.out.println(String.format("Number of dorms per floor %s", this.blockName));
        System.out.println(String.format("Number of proctors %d", this.numberOfProctors));
        for(int j = 0; j < this.proctorsList.size(); j++){
            System.out.println(String.format("=======%d========", j+1));
            System.out.println(String.format("Name: %s ", j+1, this.proctorsList.get(j).getName()));
            System.out.println(String.format("Phone number: %s", this.proctorsList.get(j).getPhoneNumber()));
        }
    }
    
    public static void create() {
>>>>>>> c193e00706ed714bb3d18b7d7cb3a0392cab300b
        Scanner S = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
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
<<<<<<< HEAD
            System.out.println(String.format("Enter the name of proctor No %d", i+1));

            try {
                name = reader.readLine();
                
                
                System.out.println(String.format("Enter the phoneNumber of proctor No %d", i+1));
               
                phoneNumber = reader.readLine();

              
=======
            
            try{
                System.out.println(String.format("Enter the name of proctor No %d", i+1));
                name = reader.readLine();

                System.out.println(String.format("Enter the phoneNumber of proctor No %d", i+1));
                phoneNumber = reader.readLine();

>>>>>>> c193e00706ed714bb3d18b7d7cb3a0392cab300b
                Proctor newProctor = new Proctor(name, phoneNumber, blockNumber);
                proctorsList.add(newProctor);
            } 
           
            catch(Exception exception){
                System.out.println("type incompatible"); 
                       }

        
        Block newBlock = new Block(blockNumber, blockName, dormPerFloor, numberOfFloors);
        newBlock.addProctor(proctorsList);
        Store.BlockList.add(newBlock);
        System.out.println("Block Added Successfully!");
    }


}
catch(Exception e){
    System.out.println("incompatible type");
}

    }
    }