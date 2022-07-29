import java.util.Formatter;
import java.util.Scanner;
 public class Attendance implements Identifiers {
     public static void makeAllAbsent(int day){
        int index=day-1;
        for(int i=0; i < Store.DormList.size(); i++){
            for(int j=0; j < Store.DormList.get(i).studentsList.size(); j++) {
                Store.DormList.get(i).studentsList.get(j).attendance[index] = 0;
            }
        }
    }
    public static void makeAttendance(int dormNum, int dayNumber, int idNum){
        int index=dayNumber-1;
        for(int i=0; i < Store.DormList.size(); i++){
           if( Store.DormList.get(i).getDormNumber()==dormNum){
               for(int j=0;i< Store.DormList.get(i).studentsList.size(); j++){
                   if(Store.DormList.get(i).studentsList.get(j).getId()==idNum){
                    Store.DormList.get(i).studentsList.get(j).attendance[index]=1;
                   }
                   else
                    System.out.println(" You entered wrong id Number, please try again.");
               }
           }
           else
               System.out.println(" You entered wrong Dorm Number, please try again.");
        }
    }
    public static void takeNewAttendance(){
        int sizeCounter=0;
        for (int i = 0; i < Store.DormList.size(); i++) {
            for (int j = 0; j < Store.DormList.get(i).studentsList.size(); j++){
                sizeCounter++;
            } 
        }
        if(sizeCounter == 0){
            System.out.println("There is no student to take attendance, please Add Studens first.");
            return;
        }
        else{
          int dormNumber,dayNumber, id, number;
          Scanner sgc=new Scanner(System.in);
          System.out.println(" For how many students do you want to take an attendance? ");
          number=sgc.nextInt();
          for(int i=0; i<number; i++){
              System.out.println(" Choose the name of the day: ");
              System.out.println(" 1). Monday ");
              System.out.println(" 2). Tuesday: ");
              System.out.println(" 3). Wednesday: ");
              System.out.println(" 4). Thursday: ");
              System.out.println(" 5). Friday: ");
              System.out.println(" 6). Saturday: ");
              System.out.println(" 7). Sunday: ");
              dayNumber=sgc.nextInt();
              makeAllAbsent(dayNumber);
              System.out.println(" Enter the Dorm number of the Student: "+ (i+1));
              dormNumber=sgc.nextInt();
              System.out.println(" Enter the Id number of the Student: "+ (i+1));
              id=sgc.nextInt();
              makeAttendance(dormNumber, dayNumber, id);
          }
              System.out.println(" Attendance is taken su   ");
    }
    }
    public static void displayAll(){
        int sizeCounter=0;
        for (int i = 0; i < Store.DormList.size(); i++) {
            for (int j = 0; j < Store.DormList.get(i).studentsList.size(); j++){
                sizeCounter++;
            } 
        }
        if( sizeCounter == 0){
            System.out.println("There is no student to take attendance, please Add Studens first.");
            return;
        }
        else{
       Formatter sgc=new Formatter();
       sgc.format("%10s%10s%10s%10s%10s%10s","Name","Id","Dorm_Number","monday","tuesday","wednesday","thursday","friday","saturday","sunday");

       for(int i=0;i<Store.DormList.size();i++){
           for(int j=0;j<Store.DormList.get(i).studentsList.size();j++){
               sgc.format("%10s%10s%10s%10s%10s%10s", Store.DormList.get(i).studentsList.get(j).getStudentName(), Store.DormList.get(i).studentsList.get(j).getId(), Store.DormList.get(i).studentsList.get(j).getDormNumber(),  Store.DormList.get(i).studentsList.get(j).attendance[0],Store.DormList.get(i).studentsList.get(i).attendance[1] ,Store.DormList.get(i).studentsList.get(j).attendance[2],Store.DormList.get(i).studentsList.get(i).attendance[3],Store.DormList.get(i).studentsList.get(i).attendance[4],Store.DormList.get(i).studentsList.get(j).attendance[5],Store.DormList.get(i).studentsList.get(j).attendance[6]);
               System.out.println(sgc);
           }
       }
    }
    }
    public static void reportAttendance(){
        int sizeCounter=0;
        for (int i = 0; i < Store.DormList.size(); i++) {
            for (int j = 0; j < Store.DormList.get(i).studentsList.size(); j++){
                sizeCounter++;
            } 
        }
        if(sizeCounter == 0){
            System.out.println("There is no student to take attendance, please Add Studens first.");
            return;
        }
        else{
        Formatter gcs=new Formatter();
        String evaluation;
        int absentCounter=0, presentCounter =0, unSignedDateCounter=0;
        for (int i = 0; i < Store.DormList.size(); i++) {
            for (int j = 0; j < Store.DormList.get(i).studentsList.size(); j++) {
                for(int k=0; k<7 ;k++){
                    // evaluation
                    if(Store.DormList.get(i).studentsList.get(j).attendance[k]==1)
                        presentCounter++;
                    else if(Store.DormList.get(i).studentsList.get(j).attendance[k]==0)
                        absentCounter++;
                    else
                        unSignedDateCounter++;
                }
                if(presentCounter >= 3 && presentCounter <= 7)
                    evaluation=" Good Attending.";
                else if(absentCounter == 7)
                    evaluation="This student should contact the procter.";
                else
                    evaluation="Warning.";
                if( unSignedDateCounter != 0 )
                    evaluation="There are day(s) Beyond Current Date";
                gcs.format("%10s%10s%10s%10s%10s%1s","Name","Id","Dorm Number","OneWeekEvaluation");
                gcs.format("%10s%10s%10s%10s%10s%1s",Store.DormList.get(i).studentsList.get(i).getStudentName(), Store.DormList.get(i).studentsList.get(i).getId(), Store.DormList.get(i).studentsList.get(i).getDormNumber(),evaluation);
                System.out.println(gcs);
            }
        }
    }
    }
}