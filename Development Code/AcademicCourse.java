//This program holds the class Academic Course
public class AcademicCourse extends Course
{
    private String lecturerName;                        
    private String level;
    private String credit;
    private String startingDate;
    private String completionDate;
    private int numberOfAssessments;
    private boolean isRegistered;
    //attributes used,instance variables
    
    public AcademicCourse(String courseID,String courseName,int duration,String level,String credit,int numberOfAssessments) 
    //parameterized constructor,formal arguments or parameter
    {
        super(courseID,courseName,duration);
        //calling super class constructor
        
        this.level=level;
        this.credit=credit;
        this.numberOfAssessments=numberOfAssessments;
        
        this.lecturerName=lecturerName;                      
        lecturerName=""; 
        
        this.startingDate=startingDate;                       
        startingDate=""; 
        
        this.completionDate=completionDate;           
        completionDate="";  
        
        this.isRegistered=isRegistered;  
        //(this.variable) refers to the instance variables
        //""= empty string
        
        isRegistered= false; 
        //isRegistered status is initialized to false
    }
    
    public String getlevel()                               
    {
        return level;
    }
    //accessor method
    
    public String getcredit()                              
    {
        return credit;
    }
    //accessor method
    
    public String getstartingDate()                        
    {
        return startingDate;
    }
    //accessor method
    
    public String getcompletionDate()                         
    {
        return completionDate;
    }
     //accessor method
     
    public int getnumberOfAssessments()
    {
        return numberOfAssessments;
    }
    //accessor method
    
    public String getlecturerName()
    {
        return lecturerName;
    }
    //accessor method
    
    public boolean getisRegistered()
    {
        return isRegistered;
    }
    //accessor method
    
    public void setlecturerName(String newlecturerName)   
    {
        this.lecturerName= newlecturerName;
    }
    //setter method
    
        public void setnumberOfAssessments(int newnumberOfAssessments)    
    {
        this.numberOfAssessments= newnumberOfAssessments;
    }
    //setter method
    
    public void register(String courseLeader,String lecturerName,String startingDate,String completionDate)   
    { //method for register,method accepts four parameters
        
        if(isRegistered==true){    
            System.out.println("The instructor is " + lecturerName);
            System.out.println("The starting date is " + startingDate);
            System.out.println("The completition date is " + completionDate); 
            System.out.println("\n");
        } 
        //condition checking
        
        else{
            super.setcourseLeader(courseLeader);                            
            this.lecturerName=lecturerName;
            this.startingDate=startingDate;
            this.completionDate=completionDate;
            this.isRegistered=isRegistered;
            isRegistered = true;                                    //the registered status of the course is changed to true
        }
        //else statement
    }
        
    public void display()                 //method overriding
    {
        
        super.display();  
        // calling method from super class to display the courseID, course name, duration, and course leader using super keyword
        
        if(isRegistered==true){
        System.out.println("The lecturer name is " + lecturerName);
        System.out.println("The level for the course is " + level);
        System.out.println("The credit for the course is " + credit);
        System.out.println("The starting date is " + startingDate);
        System.out.println("The completion date is " + completionDate);
        System.out.println("The number of assessements are " + numberOfAssessments);
        System.out.println("\n");
        }
        //condition checking
        
    }
    
} 
