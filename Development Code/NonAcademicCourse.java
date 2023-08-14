//This program contains class NonAcademicCourse
public class NonAcademicCourse extends Course
{
    private String instructorName;
    private String startDate;
    private String completionDate;
    private String examDate;
    private String prerequisite;
    private boolean isRegistered;
    private boolean isRemoved;
    //attributes used,instance variables
    
    public NonAcademicCourse(String courseID,String courseName,int duration,String prerequisite)
    //parameterized constructor,formal arguments or parameter
    
    {
        super(courseID,courseName,duration);
        //calling super class constructor
        
        this.instructorName=instructorName;
        
        this.prerequisite=prerequisite;
        
        
        this.startDate=startDate;
        startDate="";
        
        this.completionDate=completionDate;
        completionDate="";
        
        this.examDate=examDate;
        examDate="";
        //(this.variable) refers to the instance variables
        //""= empty string
        
        isRegistered=false;
        //isRegistered status is initialized to false
        
        isRemoved=false;
        //isRemoved status is initialized to false
    }
    
    public String getinstructorName()
    {
        return instructorName;
    }
    //accessor method
    
    public String getstartDate()
    {
        return startDate;
    }
    //accessor method
    
    public String getcompletionDate()
    {
        return completionDate;
    }
    //accessor method
    
    public String getexamDate()
    {
        return examDate;
    }
    //accessor method
    
    public String getprerequisite()
    {
        return prerequisite;
    }
    //accessor method
    
    public boolean getisRegistered()
    {
        return isRegistered;
    }
    //accessor method
    
    public boolean getisRemoved()
    {
        return isRemoved;
    }
    //accessor method
    
    public void setinstructorName(String newinstructorName)
    //setter method
    {
        this.instructorName=newinstructorName;
        //(this.variable) refers to the instance variables
        
        if(isRegistered==false){  
            this.instructorName=newinstructorName;
            instructorName=newinstructorName;   //new value assigned to the instructor name attribute
        }
        //condition checking
        
        else{
            System.out.println("It is therefore not possible to change the instructor name as non-academic course is registered .\n");
        }
        //else statement
    }
    
    public void register(String courseLeader,String instructorName,String startDate,String completionDate,String examDate) 
    //register method
    {
        if(isRegistered==false){
            setinstructorName(instructorName); //the method to set the instructor name is called
            setcourseLeader(courseLeader);         //setter method for course leader is called 
            this.startDate=startDate;
            this.completionDate=completionDate;
            this.examDate=examDate;
            
            isRegistered=true;                  //isRegistered status is set to true
        }
        //condition checking
        
        else{
            System.out.println("Course is already registered.\n");
        }
        //else statement
    }
    
    public void remove()
    //remove method
    {
        if(isRemoved==true){
            System.out.println("The non-academic course is already removed.\n");   
        }
        
        else{
            super.setcourseLeader("");      
            //method to set course leader name in parent class
            
            instructorName="";
            startDate="";
            completionDate="";
            examDate="";
            //the instructor name, the startingDate, completionDate and examDate are set to ""
            
            isRegistered=false;   //isRegistered status is set to false
            isRemoved=true;         //isRemoved status is set to true
        }
    }
    
    public void display()
    //display method,method overriding
    {
        super.display();
        // calling method from super class using super keyword
        
        if(isRegistered==true){
            System.out.println("The instructor name is " + instructorName);
            System.out.println("The starting date is " + startDate);
            System.out.println("The completion date is " + completionDate);
            System.out.println("The exam date is " + examDate);
            System.out.println("\n");
        }
        //condition checking
        
    }
    
}
