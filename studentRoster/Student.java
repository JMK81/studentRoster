
/**
 * WGU Java applications project!!
 * @author (Jonathan Koerber) 
 * @version (version 1 )
 */
import java.util.ArrayList;
public class Student
{
    // instance variables for student class
    private String studentID;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private int[] grades;
    

    /**
     * Constructor for objects of class Student
     */
    public Student(String studentID, String firstName,String lastName,
        String email, int age, int[] grades)
    {
        // initialise Student object
        setId(studentID);
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setEmail(email);
        setGrades(grades);
    }
   
    /**
     * sets the studentID
     */
    public void setId(String studentID)
    {
        this.studentID = studentID;
    }
    /** 
     * gets student id
     * @return returns the studentID
     */
    public String getId()
    {
        return this.studentID;
    }
    /**
     * Sets student firstName
     * @param student name
     */
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    /** 
     * gets student firstName
     */
    public String getFirstName()
    {
        return this.firstName;
    }/**
     * Sets student lastName
     * @param student name
     */
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    /** 
     * gets student lastName
     */
    public String getLastName()
    {
        return lastName;   
    }/**
     * Sets student 
     * @param student name
     */
    public void setEmail(String email)
    {
        this.email = email;
    }
    /** 
     * gets student name
     */
    public String getEmail()
    {
        return email;
    }
    /**
     * Sets student name
     * @param student name
     */
    public void setAge(int age)
    {
        this.age = age;
    }
    /** 
     * gets student name
     */
    public int getAge()
    {
        return age;
    }/**
     * Sets student name
     * @param student name
     */
    public void setGrades(int[] grades)
    {
        this.grades = grades;
    }
    /** 
     * gets student name
     */
    public int[] getGrades()
    {
        return grades;
    }
    // print statement
    /**
     * prints the students last name first name array and avarage of grades.
     * @param studentID @return returs string printed seporated by tabs.
     */
    public void print()
    {
        System.out.printf("%-5s\t%-10s\t%-10s\t%-20s\t%-10s\t%-15s\n", this.getId(), this.getFirstName(), this.getLastName(), this.getEmail() ,this.getAge() ,this.getGrades()[0]+", " +this.getGrades()[1]+", "+ this.getGrades()[2]);
    }
    
 
}
