package be.abis.courseadmin.model;

import java.util.ArrayList;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Course {         
    private String courseTitle;
    private int courseDays;
    private double courseDayPrice;
    private boolean coursePriorKnowledge;
    //private ArrayList<String> instructors = new ArrayList<String>();
    private ArrayList<Instructor> instructors = new ArrayList<>();
    
    // insert van het course-object
    public Course (String courseTitle, int courseDays, double courseDayPrice, boolean coursePriorKnowledge) {
        this.courseTitle = courseTitle;
        this.courseDays = courseDays;
        this.courseDayPrice = courseDayPrice;
        this.coursePriorKnowledge = coursePriorKnowledge;
    }

    // getters (reads) & setters (updates)
    public String getCourseTitle() {
        return courseTitle;
    } 

    public int getCourseDays() {
        return courseDays;        
    }

    public double getCourseDayPrice() {
        return courseDayPrice;
    }

    public boolean getCoursePriorKnowledge() {
        return coursePriorKnowledge;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public void setCourseDays(int courseDays) {
        this.courseDays = courseDays;
    }

    public void setCourseDayPrice(double courseDayPrice) {
        this.courseDayPrice = courseDayPrice;
    }

    public void setCoursePriorKnowledge(boolean coursePriorKnowledge) {
        this.coursePriorKnowledge = coursePriorKnowledge;
    }

     
    /*
    public void addInstructor(String instructorName) {
        this.instructors.add(instructorName);
    }*/
    
    public void setInstructors(ArrayList<Instructor> instructors){
		this.instructors=instructors;
	}
	
	public ArrayList<Instructor> getInstructors(){
		return instructors;
	}
	
	public void addInstructor(Instructor instructor){
		instructors.add(instructor);
	}
    
     
 
    public void printCourseData() {
        double printTotalPrice=0;
        printTotalPrice = calculateTotalPrice();
        System.out.println("============COURSE-DATA===========");
        System.out.println("Title : " + courseTitle);
        System.out.println("#Days : " + courseDays);
        System.out.println("Price/Day : " + courseDayPrice);
        System.out.println("Prior Know: " + coursePriorKnowledge);
        System.out.println("Total Price: " + printTotalPrice + " EUR");
        if (printTotalPrice < 500) {
            System.out.println("Wow this is CHEAP < 500");
        } else if ((printTotalPrice > 499) && (printTotalPrice < 1501 )) {
            System.out.println("OK between 500-1500");
        } else {
            System.out.println("OMG so EXPENSIVE > 1500");
        }
        System.out.println("Assigned instructors: ");
        for (Instructor i: instructors){
        	System.out.println(i.getInstructorFirstName() + " " + i.getInstructorLastName());
 	    }		
               
    }

    public double calculateTotalPrice() {
        double totalPriceReturn = courseDays * courseDayPrice;
        if (!(courseDays > 3) && (coursePriorKnowledge)) {
            totalPriceReturn*=1.21;
        }
        return totalPriceReturn;
    }

    public void createTextFileWithCourseData() {
        String data = courseTitle+ ";" + courseDays + ";" + courseDayPrice + ";" + coursePriorKnowledge + ";" + calculateTotalPrice()  ;

        try {
            FileWriter file = new FileWriter("courseinfo.txt");
            BufferedWriter output = new BufferedWriter(file);
            output.write(data);
            output.close();
            }

        catch (Exception e) {
            e.getStackTrace(); }
    }
}    
