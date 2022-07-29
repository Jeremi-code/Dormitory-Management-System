import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
public class Cleaner {
    private String cleanerName;
    private String cleanerGender;
    private int cleanerAge;
    private int cleanerBlockNumber;
    private String cleanerPhoneNumber;
    public Cleaner(String cleanerPhoneNumber, int cleanerBlockNumber, String cleanerName, String cleanerGender, int cleanerAge) {
        this.cleanerBlockNumber = cleanerBlockNumber;
        this.cleanerPhoneNumber = cleanerPhoneNumber;
        this.cleanerName = cleanerName;
        this.cleanerGender = cleanerGender;
        this.cleanerAge = cleanerAge;
    }
    public void setCleanerPhoneNumber(String cleanerPhoneNumber){
        this.cleanerPhoneNumber = cleanerPhoneNumber;
    }
    public void setCleanerBlockNumber(int cleanerBlockNumber){
        this.cleanerBlockNumber = cleanerBlockNumber;
    }
    public void setCleanerName(String cleanerName){
        this.cleanerName = cleanerName;
    }
    public void setCleanerGender(String cleanerGender){
        this.cleanerGender = cleanerGender;
    }
    public void setCleanerAge(int cleanerAge){
        this.cleanerAge = cleanerAge;
    }

    public String getPhoneNumber(){
        return this.cleanerPhoneNumber;
    }
    public int getCleanerblockNumber(){
        return this.cleanerBlockNumber;
    }
    public String getCleanerName(){
        return this.cleanerName;
    }
    public String getCleanerGender(){
        return this.cleanerGender;
    }
    public int getCleanerAge(){
        return this.cleanerAge;
    }
    
    public static void displayCleanerList(){
       Formatter display=new Formatter();
       for(int i=0; i < Store.BlockList.size() ; i++) {
           for(int j=0; j< Store.BlockList.get(i).CleanerList.size() ; j++){
               display.format("%12s%12s%12s%12s", "Cleaner's Name", "Cleaner's Gender", "Cleaner's Age", "Cleaner's PhoneNumber");
               display.format("%12s%12s%12s%12s",Store.BlockList.get(i).CleanerList.get(j).getCleanerName(),Store.BlockList.get(i).CleanerList.get(j).getCleanerGender(),Store.BlockList.get(i).CleanerList.get(j).getCleanerAge(),Store.BlockList.get(i).CleanerList.get(j).getPhoneNumber(),Store.BlockList.get(i).CleanerList.get(j).getCleanerblockNumber());
               System.out.println(display);
           }
       }
    }

    public static void addNewCleaner() {
        int Age, choice1;
        String Name,Gender,PhoneNumber;
        Scanner choice=new Scanner(System.in);
        System.out.println("How Many Cleaners Do You want to Add?");
        choice1=choice.nextInt();
        for(int i=0; i<choice1; i++){
            if(Store.BlockList.size() == 0){ 
                System.out.println("There are no blocks at all, Please add block.");
                return;
            }
            else{
                System.out.println("Enter the Block Number of the Block to which the new Cleaner is assigned : ");
                Block.displayAll();
                int BlockNumber=choice.nextInt();
            ArrayList<Cleaner> CleanerList=new ArrayList<>();
            System.out.print("Enter Cleaner's Name :\n");
            Name=choice.nextLine();
            System.out.print("Enter Cleaner's Gender :\n");
            Gender=choice.nextLine();
            System.out.print("Enter Cleaner's Age :\n");
            Age=choice.nextInt();
            System.out.print("Enter Cleaner's PhoneNumber :\n");
            PhoneNumber=choice.nextLine();
            Cleaner newCleaner = new Cleaner(PhoneNumber, BlockNumber, Name, Gender, Age);
            Store.BlockList.get(BlockNumber).CleanerList.add(newCleaner);
            }
        }
    } 
}


