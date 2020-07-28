package school.management.system;

import java.util.ArrayList;
import java.util.List;

/**
@Echohub project
 */
public class Main {
    public static void main(String[] args) {
        Teacher Naa = new Teacher(1,"Naa",500);
        Teacher Emmanuel = new Teacher(2,"Emmanuel",700);
        Teacher Kobby = new Teacher(3,"Kobby",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Naa);
        teacherList.add(Emmanuel);
        teacherList.add(Kobby);


        Student Darryl = new Student(1,"Darryl",4);
        Student Angela = new Student(2,"Angela",12);
        Student Dennis = new Student(3,"Dennis",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(Darryl);
        studentList.add(Dennis);
        studentList.add(Angela);




        School ghs = new School(teacherList,studentList);

        Teacher megan = new Teacher(6,"Megan", 900);

        ghs.addTeacher(megan);


        Darryl.payFees(5000);
        Angela.payFees(6000);
        System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        Naa.receiveSalary(Naa.getSalary());
        System.out.println("GHS has spent for salary to " + Naa.getName()
        +" and now has $" + ghs.getTotalMoneyEarned());

        Kobby.receiveSalary(Kobby.getSalary());
        System.out.println("GHS has spent for salary to " + Kobby.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());


        System.out.println(Angela);

        Emmanuel.receiveSalary(Emmanuel.getSalary());

        System.out.println(Emmanuel);


    }
}
