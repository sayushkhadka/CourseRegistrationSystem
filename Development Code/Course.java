//This is a program that includes class "Course".
public class Course
{
    private String courseID;        
    private String courseName;      
    private String courseLeader;    
    private int duration;
    //attributes used,instance variables

    public Course(String courseID,String courseName,int duration)  
    //parameterized constructor,formal arguments or parameter
    {                                                       
        this.courseID=courseID;                 
        this.courseName=courseName;             
        this.duration=duration;                 
        this.courseLeader=courseLeader;
        //(this.variable) refers to the instance variables
        
        courseLeader="";  
        //initialized with empty string
    }
    
    public String getcourseID()                        
    {
        return courseID;
    }
    //accessor method
    
    public String getcourseName()                      
    {
        return courseName;                       
    }
    //accessor method
    
    public int getduration()                            
    {
        return duration;
    }
    //accessor method
    
    public String getcourseLeader()
    {
        return courseLeader;                      
    }
    //accessor method
    
    public void setcourseLeader(String newcourseLeader)   
    {
        this.courseLeader=newcourseLeader;
    }
    //setter for courseLeader(method to set the courseLeader to a new name by accepting the newname of the course leader as a parameter.)
    
    public void display() 
    //display method
    {                                              
        System.out.println("The course ID is " + courseID);                              
        System.out.println("The course name is " + courseName);
        System.out.println("The duration of the course is " + duration + " years");
        
        if(courseLeader!= ""){                                                  
        System.out.println("The course leader is " + courseLeader);
        }
        //condition checking for courseLeader is not an empty string
        
    }
    
}

