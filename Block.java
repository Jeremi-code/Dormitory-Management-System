
import java.util.ArrayList;

public class Block {
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
}