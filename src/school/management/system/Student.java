package school.management.system;

/**
 * Created by Echohub
 * This class is responsible for keeping the
 * track of students fees, name ,grade & fees
 * paid.
 **/
public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * To create a new student by initializing.
     * Fees for every student is 30,000gh.
     * Fees paid initially is 0.
     * @param id id for the student: unique.
     * @param name name of the student.
     * @param grade grade of the student.
     */
    public Student(int id, String name,int grade){
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;

    }

    //Not going to alter/affect student's name, student's id.




    
    public void setGrade(int grade){
        this.grade=grade;
    }


    
    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }


    public int getId() {
        return id;
    }

   
    public String getName() {
        return name;
    }

   
    public int getGrade() {
        return grade;
    }


    public int getFeesPaid() {
        return feesPaid;
    }

  
    public int getFeesTotal() {
        return feesTotal;
    }

    
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name :"+name+
                " Total fees paid so far"+ feesPaid +"gh";
    }
}
