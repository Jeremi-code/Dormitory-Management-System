
import java.util.ArrayList;

public class Block {
    private int blockNumber;
    private String blockName;
    private int numberOfProctors;
    private int numberOfDorms;
    private ArrayList<Proctor> proctorsList = new ArrayList<>();

    public Block(int blockNumber, String blockName, int numberOfDorms, ArrayList<Proctor> proctorsList) {
        this.blockNumber = blockNumber;
        this.blockName = blockName;
        this.numberOfDorms = numberOfDorms;
        this.numberOfProctors = proctorsList.size();
        this.proctorsList = proctorsList;
    }

    public void addProctor(Proctor proctor) {
    	try {
    		this.proctorsList.add(proctor);
    		this.numberOfProctors++;
    		proctor.setBlockNumber(this.blockNumber);
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
}