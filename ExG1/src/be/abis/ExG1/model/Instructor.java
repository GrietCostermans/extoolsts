package be.abis.ExG1.model;

import java.io.FileWriter;
import java.io.BufferedWriter;
public class Instructor {         
    //private int instructorID;
    private String instructorFirstName;
    private String instructorLastName;
    private int instructorAge;
    private int instructorStartAge;
    private double instructorSalary;
    
    public Instructor (String instructorFirstName, String instructorLastName, int instructorAge, int instructorStartAge, double instructorSalary) {
        this.instructorFirstName = instructorFirstName;
        this.instructorLastName = instructorLastName;
        this.instructorAge  = instructorAge;
        this.instructorStartAge = instructorStartAge;
        this.instructorSalary = instructorSalary;
    }

    public String getInstructorFirstName() {
        return instructorFirstName;
    } 

    public String getInstructorLastName() {
        return instructorLastName;
    }

    public int getInstructorAge() {
        return instructorAge;        
    }

    public int getInstructorStartAge() {
        return instructorStartAge;
    }

    public double getInstructorSalary() {
        return instructorSalary;
    }

    public void setInstructorFirstName(String instructorFirstName) {
        this.instructorFirstName = instructorFirstName;
    } 

    public void setInstructorLastName(String instructorLastName) {
        this.instructorLastName = instructorLastName;
    }

    public void setInstructorAge(int instructorAge) {
        this.instructorAge = instructorAge;
    }

    public void setInstructorStartAge(int instructorStartAge) {
        this.instructorStartAge = instructorStartAge;
    }

    public void setInstructorSalary(double instructorSalary) {
        this.instructorSalary = instructorSalary;
    }

    public void printInstructorData() {
        System.out.println("============INSTRUCTOR-DATA===========");
        System.out.println("FN : " + instructorFirstName);
        System.out.println("LN : " + instructorLastName);
        System.out.println("Age : " + instructorAge);
        System.out.println("Start: " + instructorStartAge);
        System.out.println("Salary: " + instructorSalary + " EUR");        
    }

    public void printInstructorSalaryIncrease() {
        double calculSalary = instructorSalary;
            int i=0;
            for (i=instructorStartAge;(i<instructorStartAge+35)&&(i<=instructorAge);i=i+5)
            {   
                System.out.println("Salary of "+instructorFirstName+" "+instructorLastName+" at "+i+ " is "+calculSalary ); 
                calculSalary *= 1.03;
            }    
            if  (i>instructorStartAge+35) {System.out.println("Maximum salary reached");}    
    }

    public void createTextFileWithInstructorData() {
        String data = instructorFirstName+ ";" + instructorLastName + ";" + instructorAge + ";" + instructorStartAge + ";" + instructorSalary;

        try {
            FileWriter file = new FileWriter("instructorinfo.txt");
            BufferedWriter output = new BufferedWriter(file);
            output.write(data);
            output.close();
            }

        catch (Exception e) {
            e.getStackTrace(); }
    }
    
    public void createTextFileWithInstructorData(String filename) {
        String data = instructorFirstName+ ";" + instructorLastName + ";" + instructorAge + ";" + instructorStartAge + ";" + instructorSalary;

        try {
            FileWriter file = new FileWriter(filename);
            BufferedWriter output = new BufferedWriter(file);
            output.write(data);
            output.close();
            }

        catch (Exception e) {
            e.getStackTrace(); }
    }
    
    
    
    
    
    
    
    
    
    
    
    
}    
