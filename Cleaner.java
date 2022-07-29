import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;
public class Cleaner {
    static String cleanerName;
    static String cleanerGender;
    static int cleanerAge ;
    static String cleanerBlockNumber;
    private String cleanerPhoneNumber;
    int totalNumberOfCleaners;

    public Cleaner(String cleanerPhoneNumber) {
        this.cleanerPhoneNumber = cleanerPhoneNumber;
    }

    public Cleaner(String cleanerBlockNumber, String cleanerName, String cleanerGender, int cleanerAge) {
        totalNumberOfCleaners++;
    }
    public void setCleanerPhoneNumber(String cleanerPhoneNumber){
        this.cleanerPhoneNumber = cleanerPhoneNumber;
    }
    public String getCleanerPhoneNumber(){
        return this.cleanerPhoneNumber;
    }

    public static void displayCleanerList(){
       Formatter display=new Formatter();
       for(int i=0; i<Store.BlockList.CleanerList.size() ; i++) {
           for(int j=0; j< Store.BlockList.CleanerList.sizeOf() ; j++){
               display.format("%12s%12s%12s%12s", "Cleaner's Name", "Cleaner's Gender", "Cleaner's Age", "Cleaner's PhoneNumber");
               display.format("%12s%12s%12s%12s",Store.BlockList.get(i).CleanerList.get(j).cleanerName,Store.BlockList.get(i).CleanerList.get(j).cleanerGender,Store.BlockList.get(i).CleanerList.get(j).cleanerAge,Store.BlockList.get(i).CleanerList.get(j).getCleanerPhoneNumber());
           }
       }
    }

    public static void addNewCleaner() {
        ArrayList<Cleaner> CleanerList=new ArrayList<>();
        Scanner choice=new Scanner;
        System.out.println("How Many Cleaners Do You want to Add?");
        int choice1=choice.nextInt();
        for(int i=0; i<choice1; i++){
            Cleaner newCleaner=new Cleaner();
            System.out.println(" Enter the number of Cleaner you want to add ");
            int choice2=choice.nextInt();
            if(Store.BlockList.size() == 0){
                System.out.println("There are no blocks at all, Please add block.");
                return;
            }
            else{
                System.out.println("Choose the Block Number : ");
                Block.displayBlockHandler();
                cleanerBlockNumber = choice.nextLine();
            }
            System.out.print("Enter Cleaner's Name :\n");
            cleanerName=choice.nextLine();
            System.out.print("Enter Cleaner's Gender :\n");
            cleanerGender=choice.next();
            System.out.print("Enter Cleaner's Age :\n");
            cleanerAge=choice.nextInt();
            newCleaner = new Cleaner(cleanerBlockNumber, cleanerName, cleanerGender, cleanerAge);
            CleanerList.add(newCleaner);
        }
    }
    public static void updateCleaner(){
        if(Store.BlockList.CleanerList.size() == 0){
            System.out.println("There is no cleaner to update, please add a cleaner first.");
            return;
        }
        else {
            System.out.println("Select the Cleaner to Update");

        }
   public void updateHelperDisplay(){
            Formatter display=new Formatter();
   }
    }
}
