package be.abis.courseadmin.test;

import be.abis.courseadmin.model.Course;
import be.abis.courseadmin.model.Instructor;

public class ExF4 {
    public static void main(String[] args) {

        Instructor ins1 = new Instructor ("Joey","Tribbiani",42,20,2000);
        ins1.printInstructorData();
        Instructor ins2 = new Instructor ("Phoebe","Buffay",65,25,5000);
        ins2.printInstructorData();
        Instructor ins3 = new Instructor ("Ursula","Buffay",65,60,5000);
        ins3.printInstructorData();
        ins3.printInstructorSalaryIncrease();
        ins3.setInstructorStartAge(21);
        ins3.printInstructorData();
        ins3.printInstructorSalaryIncrease();
        
        Course courseJava = new Course ("Java",5,500,false);
        courseJava.addInstructor(ins1);
        courseJava.addInstructor(ins2);
        courseJava.printCourseData();

        Course courseCobol = new Course ("Cobol",1,1000,true);
        courseCobol.addInstructor(ins3);
        courseCobol.printCourseData();
        courseCobol.setCourseDayPrice(2000);
        courseCobol.printCourseData();

        Course courseSQL = new Course ("SQL",3,250,false);
        courseSQL.addInstructor(ins2);
        courseSQL.printCourseData();

    
        
    }
}
