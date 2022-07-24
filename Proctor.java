public class Proctor {
    private String name, phoneNumber;
    private Block block;

    public Proctor(String name, String phoneNumber, Block block) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.block = block;

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
        this.block.setBlockNumber(blockNumber);
    }
    
    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    


}