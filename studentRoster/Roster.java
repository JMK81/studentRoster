import java.util.ArrayList;
/**
 * Roster holds them course and student objects.
 * add, remove, print and validate email contained with in the 
 * student object.
 */
public class Roster


{
    
     private static ArrayList<Student> students = 
        new ArrayList<>();
        String [] students = {"1,John,Smith,John1989@gmail.com,20,88,79,59", 
             "2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
             "3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87",
             "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
             "5,[firstname],[lastname],[emailaddress],[age],[3testscores]"};
   public static void main(String[] args) 
   {
       addStudent("1", "John", "Smith", "John1989@gmail.com", 20, 88, 79, 59);
       addStudent("2", "Suzan", "Erickson", "Erickson_1990@gmailcom", 19, 91, 72, 85);
       addStudent("3", "Jack", "Napoli", "The_lawyer99yahoo.com", 19, 85, 84, 87);
       addStudent("4", "Erin", "Black", "Erin.black@comcast.net", 20, 91, 98, 82);
       addStudent("5", "Jonathan", "Koerber", "jkoerbe@wgu.edu", 35, 49, 39, 55);
       printAll();
       printInvalidEmail();
       //print average loop:
       for(Student s : students)
       {
          printAverage(s.getId());
        }             
       removeStudent("3");
       removeStudent("3");
       System.out.println("-----end of program-----");

    }
    /**
     * creates a new student object adds it to the student arrayList
     * @peram take in first and last name email age and grades an araylist of student objects.
     */
    public static void addStudent(String studentID, String firstName, String lastName, String email, int age, 
                                    int score1, int score2, int score3)
    {
       int[] grades = {score1, score2, score3};
       Student newStudent = new Student(studentID, firstName, lastName, email, age, grades);
       students.add(newStudent);
    }
     /**
     * Takes a studentID as input and returs the index for the student object
     * @param studentID
     * @return student object index
     */
    //Accessor Methods (get methods) and Mutator methods (set methods)
    public static ArrayList<Integer>  getAll()
    {
        ArrayList<Integer>allIndex =new ArrayList<>();
        for(Student s : students)
        {
           allIndex.add(students.indexOf(s));
            
        }
        return allIndex;
    }
    /**
     * loop through all returns all students using the getStudent method
     * @returns all student with positive indexes
     */
     /**
     * takes a studentID searches the student arrayList and removes it.
     * @param  studentID 
     */
     public static void removeStudent(String studentID)  
    {
        // todo 
        //implament exception handaling
            int studentIndex = getIndex(studentID);
                if(studentIndex < 0)
                {
                    System.out.println("There is no student with a Student id of " + studentID + " in course");
                }
                else
                {
                   students.remove(studentIndex); 
                }
    }
      /**
     * finds a student index of an object for a given studentID in the students arrayList
     * @peram studentID
     */
    public static int getIndex(String studentID)
    {
        for(Student s : students)
            {        
                int index = 0;
                if(s.getId().equals(studentID))
                {
                  index = students.indexOf(s);  
                  return index;
                }
             }
        return -1;
    }
    /**
     * prints average by student id
     * @peram studentID
     */
    public static void printAverage(String studentID)
    {   
        int index = getIndex(studentID);
        if(index<0)
        {
            System.out.println("There is no student enrolled with an id of "+studentID+".");
        }
        else{
            Student s = students.get(index);
        int [] studentGrades = s.getGrades();
        double average = 0.0;
                    for(int grade : studentGrades)
                    {
                        average = grade + average;
                        average = average/(studentGrades.length-1);
                    }
                System.out.printf("%-30s%-10.2f\n",s.getFirstName() + "'s average grade is: ", average);
            }
    }
     /**
     * Loops throught the students arrayList and prints each indivitual 
     * student 
     */
    public static void printAll()
    {
        for(Student s : students)
        {
             s.print();
        }
    }
    public static void printInvalidEmail()
    {
       String errorSpace = "";
       String errorAt = "";
       String errorPeriod ="";
        for(Student s : students)
        {
            if(!(s.getEmail().contains("@")) ||  !(s.getEmail().contains(".")) || s.getEmail().contains(" "))
            {
                
               System.out.println(s.getFirstName() + " " + s.getLastName() + " has enterd an ivalid email " + s.getFirstName() + " email is not in the corect format " +s.getEmail()+"."); 
            }
        }
        
    }
}
