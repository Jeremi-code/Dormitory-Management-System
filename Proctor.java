public class Proctor {
    private String name, phoneNumber;
    private int blockNumber;

    public Proctor(String name, String phoneNumber, int blockNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.blockNumber = blockNumber;

    }
    
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }
    
    public void setName(String name)
    {
        this.name=name;
    }

    public void setBlockNumber(int blockNumber)
    {
        // this.block.setBlockNumber(blockNumber);
        this.blockNumber = blockNumber;
    }
    
    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    


}