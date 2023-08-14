import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

/*
INGCollege class 
Implements ActionListener
*/
public class INGCollege implements ActionListener
{
    //Main GUI instance variables
    private JFrame frame_main;
    private JPanel panel_main;
    private JPanel panel_titleMain;
    private JLabel titleMain;
    private JLabel label_info;
    private JButton button_mainAcademic;
    private JButton button_mainNonAcademic;
    
    
    //Academic course instance variables
    private JFrame frame_academic;
    private JPanel panel_titleAcademic;
    private JPanel panel_academic;
    private JLabel title_academic;
    private JLabel label_courseID;
    private JTextField field_courseID;
    private JLabel label_courseName;
    private JTextField field_courseName;
    private JLabel label_duration;
    private JTextField field_duration;
    private JLabel label_level;
    private JTextField field_level;
    private JLabel label_credit;
    private JTextField field_credit;
    private JLabel label_numberOfAssessments;
    private JLabel label_numberOfAssessments1;
    private JTextField field_numberOfAssessments;
    private JButton button_add;
    private JButton button_changeCourse1;
    private JLabel label_courseLeader;
    private JTextField field_courseLeader;
    private JLabel label_lecturerName;
    private JTextField field_lecturerName;
    private JLabel label_startingDate;
    private JComboBox combobox_years;
    private JComboBox combobox_months;
    private JComboBox combobox_days;
    private JLabel label_completionDate;
    private JComboBox combobox_years1;
    private JComboBox combobox_months1;
    private JComboBox combobox_days1;
    private JButton button_register;
    private JButton button_display;
    private JButton button_clear;
    
    
    //Non Acdemic Course instance variables
    private JFrame frame_non;
    private JPanel panel_titleNon;
    private JPanel panel_non;
    private JLabel title_non;
    private JLabel label_courseIDNon;
    private JTextField field_courseIDNon;
    private JLabel label_courseNameNon;
    private JTextField field_courseNameNon;
    private JLabel label_durationNon;
    private JTextField field_durationNon;
    private JLabel label_prerequisiteNon;
    private JTextField field_prerequisiteNon;
    private JButton button_addNon;
    private JButton button_changeCourse2;
    private JLabel label_courseLeaderNon;
    private JTextField field_courseLeaderNon;
    private JLabel label_instructorNameNon;
    private JTextField field_instructorNameNon;
    private JLabel label_startingDateNon;
    private JComboBox combobox_yearsNon;
    private JComboBox combobox_monthsNon;
    private JComboBox combobox_daysNon;
    private JLabel label_completionDateNon;
    private JComboBox combobox_yearsNon1;
    private JComboBox combobox_monthsNon1;
    private JComboBox combobox_daysNon1;
    private JLabel label_examDateNon;
    private JComboBox combobox_yearsNon2;
    private JComboBox combobox_monthsNon2;
    private JComboBox combobox_daysNon2;
    private JButton button_displayNon;
    private JButton button_clearNon;
    private JButton button_registerNon;
    private JButton button_removeNon;
    
    
    //object of INGCollege
    public static INGCollege obj_ing = new INGCollege();
    
    //Academic Course reference variable
    public static AcademicCourse obj_Academic;
    
    //Declaring Array List
    public ArrayList<Course> aList = new ArrayList<Course>();
    
    //add button variables(Academic Course)
    private String add_academicID;
    private String add_academicName;
    private String add_academicDuration;
    private String add_academicLevel;
    private String add_academicCredit;
    private String add_numberOfAssessments; 
    
    //register button variables (Academic Course) 
    private String register_academicID; 
    private String register_courseLeader;
    private String register_lecturerName;
    private String register_startingDate;
    private String register_completionDate;
    
    private boolean academicExist;
    
    //reference variable of academic course 
    private AcademicCourse ref_academic;
    
    //Message dialogue box
    private JOptionPane message_academic;
    
    private AcademicCourse ref_academicDisplay;
    
    
    
    //Non-Academic Course reference variable
    public static NonAcademicCourse obj_NonAcademic;
    
    //add button variables(Non-Academic Course)
    private String add_nonAcademicCourseID;
    private String add_nonAcademicCourseName;
    private String add_nonAcademicDuration;
    private String add_nonAcademicPrerequisite;
    
    //Message dilogue box
    private JOptionPane message_nonAcademic;
    
    
    //register Non Academic Course
    private String register_nonAcademicID;
    private String register_nonCourseLeader;
    private String register_nonInstructorName;
    private String register_nonStartingDate; 
    private String register_nonCompletionDate;
    private String register_nonExamDate;
    
    //reference variable of Non academic course
    private NonAcademicCourse ref_nonAcademic;
    
    private boolean nonAcademicExist;
    
    //remove button variable(Non-Academic Course)
    private String remove_nonAcademicID;
    
    private NonAcademicCourse ref_nonAcademicRemove;
    
    private NonAcademicCourse ref_nonAcademicDisplay;

    
    
    
    
    //Main GUI
    public void mainGUI()
    {
        //JFrame
        frame_main = new JFrame(); 
        frame_main.setTitle("Course Registration"); //Title of the frame
        frame_main.setVisible(true);
        frame_main.setResizable(true);
        frame_main.setBounds(520,130,517,445); //(x,y,width,height)
        
        
        
        //JPanel
        panel_main = new JPanel();
        panel_main.setLayout(null);
        panel_main.setBackground(Color.white);
        panel_main.setBounds(0,0,503,430);
        
        
        
        //JPanel for Title
        panel_titleMain = new JPanel();
        panel_titleMain.setLayout(null);
        panel_titleMain.setBounds(0,0,503,70);
        //Color for Panel
        Color color_titleMain = new Color(253,223,91);
        panel_titleMain.setBackground(color_titleMain);
        
        
        
        //Title
        titleMain = new JLabel();
        titleMain.setText("Course Registration");
        titleMain.setBounds(150,20,250,30);
        titleMain.setForeground(Color.black);
        //Font
        Font fontMain = new Font("Arial",Font.PLAIN,25);
        titleMain.setFont(fontMain);
       
        
        //adding title to the panel_title
        panel_titleMain.add(titleMain);
        
        
        
        //JLabel "Select on the button to register the course"
        label_info = new JLabel();
        label_info.setText("Select on the button to register the course");
        label_info.setBounds(60,100,450,25);
        //Font
        Font font_info = new Font("Arial",Font.PLAIN,20);
        label_info.setFont(font_info);
        
        //adding label_courseID to panel
        panel_main.add(label_info);
        
    
        
        
        
        //Button for Academic Course
        button_mainAcademic = new JButton();
        button_mainAcademic.setText("Academic Course");
        button_mainAcademic.setBounds(30,175,200,30);
        //Font
        Font font_mainAcademic = new Font("Arial",Font.BOLD,15);
        button_mainAcademic.setFont(font_mainAcademic);
        //Color for Display button 
        Color color_mainAcademic = new Color(42,136,173);
        button_mainAcademic.setBackground(color_mainAcademic);
        button_mainAcademic.setForeground(Color.white);
        
        //Action Listener
        button_mainAcademic.addActionListener(this);
        
        //adding button_display to panel
        panel_main.add(button_mainAcademic);
        
        
        
        
        //Button for Non-Academic Course
        button_mainNonAcademic = new JButton();
        button_mainNonAcademic.setText("Non Academic Course");
        button_mainNonAcademic.setBounds(270,175,200,30);
        //Font
        Font font_mainNonAcademic = new Font("Arial",Font.BOLD,15);
        button_mainNonAcademic.setFont(font_mainNonAcademic);
        //Color for Display button 
        Color color_mainNonAcademic = new Color(42,136,173);
        button_mainNonAcademic.setBackground(color_mainNonAcademic);
        button_mainNonAcademic.setForeground(Color.white);
        
        //Action Listener
        button_mainNonAcademic.addActionListener(this);
        
        //adding button_display to panel
        panel_main.add(button_mainNonAcademic);
        
        
        
        
        //adding panel in frame
        frame_main.add(panel_titleMain);
        frame_main.add(panel_main);
        
    }
    
    
    
    //For Academic Course
    /*
     * GUI
     * for the Academic Course
    */
    public void academicCourseGUI()
    {
        //---------ACADEMIC COURSE----------
        //JFrame
        frame_academic = new JFrame(); 
        frame_academic.setTitle("Academic Course Registration"); //Title of the frame
        frame_academic.setVisible(true);
        frame_academic.setResizable(true);
        frame_academic.setBounds(405,165,720,445); //(x,y,width,height)
        
        
        
        
        //JPanel
        panel_academic = new JPanel();
        panel_academic.setLayout(null);
        panel_academic.setBackground(Color.white);
        panel_academic.setBounds(0,0,710,430);
        
        
        
        //JPanel for Title
        panel_titleAcademic = new JPanel();
        panel_titleAcademic.setLayout(null);
        panel_titleAcademic.setBounds(0,0,710,60);
        //Color for Panel
        Color color_titleAcademic = new Color(253,223,91);
        panel_titleAcademic.setBackground(color_titleAcademic);
        
        
        
        
        //Title
        title_academic = new JLabel();
        title_academic.setText("Academic Course");
        title_academic.setBounds(275,15,250,30);
        title_academic.setForeground(Color.black);
        //Font
        Font font_academic = new Font("Arial",Font.PLAIN,20);
        title_academic.setFont(font_academic);
       
        
        //adding title to the panel_title
        panel_titleAcademic.add(title_academic);
        
        
        
        //CourseID
        label_courseID = new JLabel();
        label_courseID.setText("CourseID");
        label_courseID.setBounds(30,85,150,25);
        //Font
        Font font_one = new Font("Arial",Font.PLAIN,15);
        label_courseID.setFont(font_one);
        
        //adding label_courseID to panel
        panel_academic.add(label_courseID);
        
        //JText field for CourseID
        field_courseID = new JTextField();
        field_courseID.setBounds(150,85,120,25);
        field_courseID.setFont(font_one);
        
        //adding field_courseID to the panel
        panel_academic.add(field_courseID);
        
        
        
        //Course name
        label_courseName = new JLabel();
        label_courseName.setText("Course name");
        label_courseName.setBounds(30,125,120,25);
        //Font
        Font font_two = new Font("Arial",Font.PLAIN,15);
        label_courseName.setFont(font_two);
        
        //adding label_courseName to panel
        panel_academic.add(label_courseName);
        
        //JText field for Course name
        field_courseName = new JTextField();
        field_courseName.setBounds(150,125,120,25);
        field_courseName.setFont(font_two);
        
        //adding field_courseName to the panel
        panel_academic.add(field_courseName);
        
        
        
        //Duration
        label_duration = new JLabel();
        label_duration.setText("Duration");
        label_duration.setBounds(30,165,120,25);
        //Font
        Font font_three = new Font("Arial",Font.PLAIN,15);
        label_duration.setFont(font_three);
        
        //adding label_duration to panel
        panel_academic.add(label_duration);
        
        //JText field for Duration
        field_duration = new JTextField();
        field_duration.setBounds(150,165,120,25);
        field_duration.setFont(font_three);
        
        //adding field_duration to the panel
        panel_academic.add(field_duration);
        
        
        
        //Level
        label_level = new JLabel();
        label_level.setText("Level");
        label_level.setBounds(30,205,120,25);
        //Font
        Font font_four = new Font("Arial",Font.PLAIN,15);
        label_level.setFont(font_four);
        
        //adding label_level to panel
        panel_academic.add(label_level);
        
        //JText field for Level
        field_level = new JTextField();
        field_level.setBounds(150,205,120,25);
        field_level.setFont(font_four);
        
        //adding field_level to the panel
        panel_academic.add(field_level);
        
        
        
        //Credit
        label_credit = new JLabel();
        label_credit.setText("Credit");
        label_credit.setBounds(30,245,120,25);
        //Font
        Font font_five = new Font("Arial",Font.PLAIN,15);
        label_credit.setFont(font_five);
        
        //adding label_credit to panel
        panel_academic.add(label_credit);
        
        //JText field for Credit
        field_credit = new JTextField();
        field_credit.setBounds(150,245,120,25);
        field_credit.setFont(font_five);
        
        //adding field_credit to the panel
        panel_academic.add(field_credit);
        
        
        
        //Number of assessments
        label_numberOfAssessments = new JLabel();
        label_numberOfAssessments.setText("Number of");
        label_numberOfAssessments.setBounds(30,285,190,25);
        //Font
        Font font_six = new Font("Arial",Font.PLAIN,15);
        label_numberOfAssessments.setFont(font_six);
        
        //adding label_numberOfAssessments to panel
        panel_academic.add(label_numberOfAssessments);
        
        //Number of assessments
        label_numberOfAssessments1= new JLabel();
        label_numberOfAssessments1.setText("assessments");
        label_numberOfAssessments1.setBounds(30,300,190,25);
        //Font
        label_numberOfAssessments1.setFont(font_six);
        
        //adding label_numberOfAssessments to panel
        panel_academic.add(label_numberOfAssessments1);
        
        //JText field for Number of assessments
        field_numberOfAssessments = new JTextField();
        field_numberOfAssessments.setBounds(150,290,120,25);
        field_numberOfAssessments.setFont(font_six);
        
        //adding field_numberOfAssessments to the panel
        panel_academic.add(field_numberOfAssessments);
        
        
        
        //Add button to add ACADEMIC COURSE
        button_add = new JButton();
        button_add.setText("Add");
        button_add.setBounds(105,350,100,30);
        //Font
        Font font_seven = new Font("Arial",Font.BOLD,15);
        button_add.setFont(font_seven);
        //Color for Add button 
        Color color_add = new Color(42,136,173);
        button_add.setBackground(color_add);
        button_add.setForeground(Color.white);
        
        //Action Listener
        button_add.addActionListener(this);
        
        //adding button_add to panel
        panel_academic.add(button_add);
        
        
        
        //Change Course button 
        button_changeCourse1 = new JButton();
        button_changeCourse1.setText("Change Course");
        button_changeCourse1.setBounds(350,80,200,30);
        //Font
        Font font_eight = new Font("Arial",Font.BOLD,15);
        button_changeCourse1.setFont(font_eight);
        //Color for Display button 
        Color color_changeCourse1 = new Color(42,136,173);
        button_changeCourse1.setBackground(color_changeCourse1);
        button_changeCourse1.setForeground(Color.white);
        
        //Action Listener
        button_changeCourse1.addActionListener(this);
        
        //adding button_display to panel
        panel_academic.add(button_changeCourse1);
        
        
        
        //Course Leader
        label_courseLeader = new JLabel();
        label_courseLeader.setText("Course Leader");
        label_courseLeader.setBounds(350,125,150,25);
        //Font
        Font font_nine = new Font("Arial",Font.PLAIN,15);
        label_courseLeader.setFont(font_nine);
        
        //adding label_courseLeader to panel
        panel_academic.add(label_courseLeader);
        
        //JText field for Course Leader
        field_courseLeader = new JTextField();
        field_courseLeader.setBounds(475,125,120,25);
        field_courseLeader.setFont(font_nine);
        
        //adding field_courseLeader to the panel
        panel_academic.add(field_courseLeader);
        
        
        
        //Lecturer name
        label_lecturerName = new JLabel();
        label_lecturerName.setText("Lecturer Name");
        label_lecturerName.setBounds(350,165,150,25);
        //Font
        Font font_ten = new Font("Arial",Font.PLAIN,15);
        label_lecturerName.setFont(font_ten);
        
        //adding label_lecturerName to panel
        panel_academic.add(label_lecturerName);
        
        //JText field for Lecturer name
        field_lecturerName = new JTextField();
        field_lecturerName.setBounds(475,165,120,25);
        field_lecturerName.setFont(font_ten);
        
        //adding field_lecturerName to the panel
        panel_academic.add(field_lecturerName);
        
        
        
        //Starting Date
        label_startingDate = new JLabel();
        label_startingDate.setText("Starting Date");
        label_startingDate.setBounds(350,205,150,25);
        //Font
        Font font_eleven = new Font("Arial",Font.PLAIN,15);
        label_startingDate.setFont(font_eleven);
        
        //adding label_startingDate to panel
        panel_academic.add(label_startingDate);
    
        
        //ComboBox for Starting Date
        //for year
        String years[] = {"2020","2021","2022","2023"};
        combobox_years = new JComboBox(years);
        combobox_years.setBounds(475,205,60,25);
        
        panel_academic.add(combobox_years);
        
        
        //for months
        String months[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        combobox_months = new JComboBox(months);
        combobox_months.setBounds(540,205,90,25);
        
        panel_academic.add(combobox_months);
        
        
        //for days
        String days[] = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        combobox_days = new JComboBox(days);
        combobox_days.setBounds(635,205,40,25);
        
        panel_academic.add(combobox_days);
        
        
        
        //Completion Date
        label_completionDate = new JLabel();
        label_completionDate.setText("Completion Date");
        label_completionDate.setBounds(350,245,150,25);
        //Font
        Font font_twelve = new Font("Arial",Font.PLAIN,15);
        label_completionDate.setFont(font_twelve);
        
        //adding label_completionDate to panel
        panel_academic.add(label_completionDate);
    
        
        //ComboBox for Completion Date
        //for year
        String years1[] = {"2023","2024","2025","2026","2027","2028","2029","2030"};
        combobox_years1 = new JComboBox(years1);
        combobox_years1.setBounds(475,245,60,25);
        
        panel_academic.add(combobox_years1);
        
        
        //for months
        String months1[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        combobox_months1 = new JComboBox(months1);
        combobox_months1.setBounds(540,245,90,25);
        
        panel_academic.add(combobox_months1);
        
        
        //for days
        String days1[] = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        combobox_days1 = new JComboBox(days1);
        combobox_days1.setBounds(635,245,40,25);
        
        panel_academic.add(combobox_days1);
        
        
        
        //Register button to regsiter ACADEMIC COURSE
        button_register = new JButton();
        button_register.setText("Register");
        button_register.setBounds(430,300,175,30);
        //Font
        Font font_thirteen = new Font("Arial",Font.BOLD,15);
        button_register.setFont(font_thirteen);
        //Color for Register button 
        Color color_register1 = new Color(42,136,173);
        button_register.setBackground(color_register1);
        button_register.setForeground(Color.white);
        
        //Action Listener
        button_register.addActionListener(this);
        
        //adding button_register to panel
        panel_academic.add(button_register);
        
        
        
        //Display button to display ACADEMIC COURSE
        button_display = new JButton();
        button_display.setText("Display");
        button_display.setBounds(350,350,140,30);
        //Font
        Font font_fourteen = new Font("Arial",Font.BOLD,15);
        button_display.setFont(font_fourteen);
        //Color for Display button 
        Color color_display1 = new Color(42,136,173);
        button_display.setBackground(color_display1);
        button_display.setForeground(Color.white);
        
        //Action Listener
        button_display.addActionListener(this);
        
        //adding button_display to panel
        panel_academic.add(button_display);
        
        
        
        //Clear button to clear textfield of ACADEMIC COURSE
        button_clear = new JButton();
        button_clear.setText("Clear");
        button_clear.setBounds(545,350,130,30);
        //Font
        Font font_fifteen = new Font("Arial",Font.BOLD,15);
        button_clear.setFont(font_fifteen);
        //Color for Display button 
        Color color_clear1 = new Color(255,102,102);
        button_clear.setBackground(color_clear1);
        button_clear.setForeground(Color.white);
        
        //Action Listener
        button_clear.addActionListener(this);
        
        //adding button_display to panel
        panel_academic.add(button_clear);
        
        
        
        //adding panel in frame
        frame_academic.add(panel_titleAcademic);
        frame_academic.add(panel_academic);
        
        
    }
    
    
    
    //For Non Academic Course
    /*
     * GUI
     * For the Non-Academic Course
    */
        public void nonAcademicCourseGUI()
    {
        //---------NON-ACADEMIC COURSE----------
        //JFrame
        frame_non = new JFrame(); 
        frame_non.setTitle("Non Academic Course Registration"); //Title of the frame
        frame_non.setVisible(true);
        frame_non.setResizable(true);
        frame_non.setBounds(450,200,720,485); //(x,y,width,height)
        
        
        
        //JPanel
        panel_non = new JPanel();
        panel_non.setLayout(null);
        panel_non.setBackground(Color.white);
        panel_non.setBounds(0,0,710,400);
        
        
        
        //JPanel for Title
        panel_titleNon = new JPanel();
        panel_titleNon.setLayout(null);
        panel_titleNon.setBounds(0,0,710,60);
        //Color for Title
        Color color_titleNon = new Color(253,223,91);
        panel_titleNon.setBackground(color_titleNon);
        
        
        
        
        //Title
        title_non = new JLabel();
        title_non.setText("Non Academic Course");
        title_non.setBounds(250,15,250,30);
        title_non.setForeground(Color.black);
        //Font
        Font font_1 = new Font("Arial",Font.PLAIN,20);
        title_non.setFont(font_1);
        
        
        //adding title to the panel_title
        panel_titleNon.add(title_non);
        
        
        
        
        //CourseID
        label_courseIDNon = new JLabel();
        label_courseIDNon.setText("CourseID");
        label_courseIDNon.setBounds(30,85,150,25);
        //Font
        Font font_2 = new Font("Arial",Font.PLAIN,15);
        label_courseIDNon.setFont(font_2);
        
        //adding label_courseIDNon to panel
        panel_non.add(label_courseIDNon);
        
        //JText field for CourseID
        field_courseIDNon = new JTextField();
        field_courseIDNon.setBounds(150,85,120,25);
        field_courseIDNon.setFont(font_2);
        
        //adding field_courseIDNon to the panel
        panel_non.add(field_courseIDNon);
        
        
        
        //Course name
        label_courseNameNon = new JLabel();
        label_courseNameNon.setText("Course name");
        label_courseNameNon.setBounds(30,125,120,25);
        //Font
        Font font_3 = new Font("Arial",Font.PLAIN,15);
        label_courseNameNon.setFont(font_3);
        
        //adding label_courseNameNon to panel
        panel_non.add(label_courseNameNon);
        
        //JText field for Course name
        field_courseNameNon = new JTextField();
        field_courseNameNon.setBounds(150,125,120,25);
        field_courseNameNon.setFont(font_3);
        
        //adding field_courseNameNon to the panel
        panel_non.add(field_courseNameNon);
        
        
        
        //Duration
        label_durationNon = new JLabel();
        label_durationNon.setText("Duration");
        label_durationNon.setBounds(30,165,120,25);
        //Font
        Font font_4 = new Font("Arial",Font.PLAIN,15);
        label_durationNon.setFont(font_4);
        
        //adding label_durationNon to panel
        panel_non.add(label_durationNon);
        
        //JText field for Duration
        field_durationNon = new JTextField();
        field_durationNon.setBounds(150,165,120,25);
        field_durationNon.setFont(font_4);
        
        //adding field_durationNon to the panel
        panel_non.add(field_durationNon);
        
        
        
        //Prerequisite
        label_prerequisiteNon = new JLabel();
        label_prerequisiteNon.setText("Prerequisite");
        label_prerequisiteNon.setBounds(30,205,120,25);
        //Font
        Font font_5 = new Font("Arial",Font.PLAIN,15);
        label_prerequisiteNon.setFont(font_5);
        
        //adding label_prerequisiteNon to panel
        panel_non.add(label_prerequisiteNon);
        
        //JText field for Prerequisite
        field_prerequisiteNon = new JTextField();
        field_prerequisiteNon.setBounds(150,205,120,25);
        field_prerequisiteNon.setFont(font_5);
        
        //adding field_prerequisiteNon to the panel
        panel_non.add(field_prerequisiteNon);
        
        
        
        
        //Add button to add NON ACADEMIC COURSE
        button_addNon = new JButton();
        button_addNon.setText("Add");
        button_addNon.setBounds(105,265,100,30);
        //Font
        Font font_6 = new Font("Arial",Font.BOLD,15);
        button_addNon.setFont(font_6);
        //Color for Add button 
        Color color_addNon = new Color(42,136,173);
        button_addNon.setBackground(color_addNon);
        button_addNon.setForeground(Color.white);
        
        //Action Listener
        button_addNon.addActionListener(this);
        
        //adding button_addNon to panel
        panel_non.add(button_addNon);
        
        
        
        //Change Course button 
        button_changeCourse2 = new JButton();
        button_changeCourse2.setText("Change Course");
        button_changeCourse2.setBounds(350,80,200,30);
        //Font
        Font font_7 = new Font("Arial",Font.BOLD,15);
        button_changeCourse2.setFont(font_7);
        //Color for Display button 
        Color color_changeCourse2 = new Color(42,136,173);
        button_changeCourse2.setBackground(color_changeCourse2);
        button_changeCourse2.setForeground(Color.white);
        
        //Action Listener
        button_changeCourse2.addActionListener(this);
        
        //adding button_changeCourse2 to panel
        panel_non.add(button_changeCourse2);
        
        
        
        //Course Leader
        label_courseLeaderNon = new JLabel();
        label_courseLeaderNon.setText("Course Leader");
        label_courseLeaderNon.setBounds(350,125,150,25);
        //Font
        Font font_8 = new Font("Arial",Font.PLAIN,15);
        label_courseLeaderNon.setFont(font_8);
        
        //adding label_courseLeaderNon to panel
        panel_non.add(label_courseLeaderNon);
        
        //JText field for Course Leader
        field_courseLeaderNon = new JTextField();
        field_courseLeaderNon.setBounds(475,125,120,25);
        field_courseLeaderNon.setFont(font_8);
        
        //adding field_courseLeaderNon to the panel
        panel_non.add(field_courseLeaderNon);
        
        
        
        //Instructor name
        label_instructorNameNon = new JLabel();
        label_instructorNameNon.setText("Instructor Name");
        label_instructorNameNon.setBounds(350,165,150,25);
        //Font
        Font font_9 = new Font("Arial",Font.PLAIN,15);
        label_instructorNameNon.setFont(font_9);
        
        //adding label_instructorNameNon to panel
        panel_non.add(label_instructorNameNon);
        
        //JText field for Instructor name
        field_instructorNameNon = new JTextField();
        field_instructorNameNon.setBounds(475,165,120,25);
        field_instructorNameNon.setFont(font_9);
        
        //adding field_instructorNameNon to the panel
        panel_non.add(field_instructorNameNon);
        
        
        
        //Starting Date
        label_startingDateNon = new JLabel();
        label_startingDateNon.setText("Starting Date");
        label_startingDateNon.setBounds(350,205,150,25);
        //Font
        Font font_10 = new Font("Arial",Font.PLAIN,15);
        label_startingDateNon.setFont(font_10);
        
        //adding label_startingDateNon to panel
        panel_non.add(label_startingDateNon);
    
        
        //ComboBox for Starting Date
        //for year
        String yearsNon[] = {"2020","2021","2022","2023"};
        combobox_yearsNon = new JComboBox(yearsNon);
        combobox_yearsNon.setBounds(475,205,60,25);
        
        panel_non.add(combobox_yearsNon);
        
        
        //for months
        String monthsNon[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        combobox_monthsNon = new JComboBox(monthsNon);
        combobox_monthsNon.setBounds(540,205,90,25);
        
        panel_non.add(combobox_monthsNon);
        
        
        //for days
        String daysNon[] = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        combobox_daysNon = new JComboBox(daysNon);
        combobox_daysNon.setBounds(635,205,40,25);
        
        panel_non.add(combobox_daysNon);
        
        
        
        //Completion Date
        label_completionDateNon = new JLabel();
        label_completionDateNon.setText("Completion Date");
        label_completionDateNon.setBounds(350,245,150,25);
        //Font
        Font font_11 = new Font("Arial",Font.PLAIN,15);
        label_completionDateNon.setFont(font_11);
        
        //adding label_completionDateNon to panel
        panel_non.add(label_completionDateNon);
    
        
        //ComboBox for Completion Date
        //for year
        String yearsNon1[] = {"2023","2024","2025","2026","2027","2028","2029","2030"};
        combobox_yearsNon1 = new JComboBox(yearsNon1);
        combobox_yearsNon1.setBounds(475,245,60,25);
        
        panel_non.add(combobox_yearsNon1);        
        
        
        //for months
        String monthsNon1[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        combobox_monthsNon1 = new JComboBox(monthsNon1);
        combobox_monthsNon1.setBounds(540,245,90,25);
        
        panel_non.add(combobox_monthsNon1);
        
        
        //for days
        String daysNon1[] = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        combobox_daysNon1 = new JComboBox(daysNon1);
        combobox_daysNon1.setBounds(635,245,40,25);
        
        panel_non.add(combobox_daysNon1);
        
        
        
        //Exam Date
        label_examDateNon = new JLabel();
        label_examDateNon.setText("Exam Date");
        label_examDateNon.setBounds(350,285,150,25);
        //Font
        Font font_12 = new Font("Arial",Font.PLAIN,15);
        label_examDateNon.setFont(font_12);
        
        //adding label_examDateNon to panel
        panel_non.add(label_examDateNon);
        
        
        
        //ComboBox for Exam Date
        //for year
        String yearsNon2[] = {"2023","2024","2025","2026","2027","2028","2029","2030"};
        combobox_yearsNon2 = new JComboBox(yearsNon2);
        combobox_yearsNon2.setBounds(475,285,60,25);
        
        panel_non.add(combobox_yearsNon2);
        
        
        //for months
        String monthsNon2[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        combobox_monthsNon2 = new JComboBox(monthsNon2);
        combobox_monthsNon2.setBounds(540,285,90,25);
        
        panel_non.add(combobox_monthsNon2);
        
        
        //for days
        String daysNon2[] = {"01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        combobox_daysNon2 = new JComboBox(daysNon2);
        combobox_daysNon2.setBounds(635,285,40,25);
        
        panel_non.add(combobox_daysNon2);
        
        
        
        //Register button to register Non-ACADEMIC COURSE
        button_registerNon = new JButton();
        button_registerNon.setText("Register");
        button_registerNon.setBounds(350,340,140,30);
        //Font
        Font font_13 = new Font("Arial",Font.BOLD,15);
        button_registerNon.setFont(font_13);
        //Color for register button 
        Color color_register2 = new Color(42,136,173);
        button_registerNon.setBackground(color_register2);
        button_registerNon.setForeground(Color.white);
        
        //ActionListener
        button_registerNon.addActionListener(this);
        
        //adding button_registerNon to panel
        panel_non.add(button_registerNon);
        
        
        
        //Remove button to remove Non-ACADEMIC COURSE
        button_removeNon = new JButton();
        button_removeNon.setText("Remove");
        button_removeNon.setBounds(545,340,130,30);
        //Font
        Font font_14 = new Font("Arial",Font.BOLD,15);
        button_removeNon.setFont(font_14);
        //Color for remove button 
        Color color_remove2 = new Color(255,102,102);
        button_removeNon.setBackground(color_remove2);
        button_removeNon.setForeground(Color.white);
        
        //ActionListener
        button_removeNon.addActionListener(this);
        
        //adding button_removeNon to panel
        panel_non.add(button_removeNon);
        
       
        
        
        //Display button to display Non-ACADEMIC COURSE
        button_displayNon = new JButton();
        button_displayNon.setText("Display");
        button_displayNon.setBounds(350,390,140,30);
        //Font
        Font font_15 = new Font("Arial",Font.BOLD,15);
        button_displayNon.setFont(font_15);
        //Color for Display button 
        Color color_display2 = new Color(42,136,173);
        button_displayNon.setBackground(color_display2);
        button_displayNon.setForeground(Color.white);
        
        //ActionListener
        button_displayNon.addActionListener(this);
        
        //adding button_displayNon to panel
        panel_non.add(button_displayNon);
        
        
        
        //Clear button to clear textfield of Non-ACADEMIC COURSE
        button_clearNon = new JButton();
        button_clearNon.setText("Clear");
        button_clearNon.setBounds(545,390,130,30);
        //Font
        Font font_16 = new Font("Arial",Font.BOLD,15);
        button_clearNon.setFont(font_16);
        //Color for clear button 
        Color color_clear2 = new Color(255,102,102);
        button_clearNon.setBackground(color_clear2);
        button_clearNon.setForeground(Color.white);
        
        //ActionListener
        button_clearNon.addActionListener(this);
        
        //adding button_clearNon to panel
        panel_non.add(button_clearNon);
        
        
        
        //adding panel in frame
        frame_non.add(panel_titleNon);
        frame_non.add(panel_non);
        
        
    }
    
    public static void main(String[]args)
    {
        obj_ing.mainGUI();
    }
    
    /* 
     * actionperformed method
     * for the functionality of the buttons 
    */
   
    public void actionPerformed(ActionEvent e) // ActionEvent e as a parameter
    {
        //Button function for Main GUI
        if(e.getSource() == button_mainAcademic){
            academicCourseGUI(); //Academic Course GUI
        }
        
        else if(e.getSource() == button_mainNonAcademic){
            nonAcademicCourseGUI(); //Non-Academic Course GUI
        }
         
        
        //Button function for other GUI (changing course)
        if(e.getSource() == button_changeCourse1){
            nonAcademicCourseGUI();
            
            //Disposing the frame_academic
            frame_academic.dispose(); 
        }
        
        else if(e.getSource() == button_changeCourse2){
            academicCourseGUI();
            
            //Disposing the frame_non
            frame_non.dispose();
        }
        
        /*
         * Academic Course
        */
        //Add button for Academic Course
        if(e.getSource() == button_add){
            //Try block
            try{
                //Auto boxing and auto unboxing
                add_academicID = field_courseID.getText();
            
                add_academicName = field_courseName.getText();
            
                add_academicDuration = field_duration.getText();
                int duration_A = Integer.parseInt(add_academicDuration);
                
                add_academicLevel = field_level.getText();
            
                add_academicCredit = field_credit.getText();
            
                add_numberOfAssessments = field_numberOfAssessments.getText();
                int numberOfAssessments_A = Integer.parseInt(add_numberOfAssessments);
                
                academicExist = false; // academicExist initialized to false
                
                for(Course var_add : aList){
                    if(var_add.getcourseID().equals(add_academicID)){
                        academicExist = true;
                        break;
                    }
                }
                
                if(academicExist == false){
                
                    //Calling the constructor of Academic Course class
                    obj_Academic = new AcademicCourse(add_academicID, add_academicName, duration_A,add_academicLevel, add_academicCredit, numberOfAssessments_A);
                
                    //adding to Array List
                    aList.add(obj_Academic);
                    
                    //Message Dialog Box
                    message_academic = new JOptionPane();
                    String final_msgAcademic = "Course ID: " + add_academicID + "\n Course Name: " + add_academicName + "\n Duration: " + add_academicDuration + "\n Level: " + add_academicLevel + "\n Credit: " + add_academicCredit + "\n Number of assessments: " + add_numberOfAssessments + "\n \n has been successfully added \n to Academic Course";
                    message_academic.showMessageDialog(frame_academic, final_msgAcademic);
                }
                
                else if(academicExist == true){
                    JOptionPane.showMessageDialog(frame_academic, "Course ID " + add_academicID + " is already added.");
                }
            }
            
            //catch block
            catch(NumberFormatException numberFormat_one){
                //Try block
                try{
                
                    if(add_academicID.equals("") && add_academicName.equals("") && add_academicDuration.equals("") && add_academicLevel.equals("") && add_academicCredit.equals("") && add_numberOfAssessments.equals("") ){
                        JOptionPane.showMessageDialog(frame_academic,"Please don not leave the text field empty or fill the text field properly.", "ERROR", JOptionPane.ERROR_MESSAGE);
                        
                    }
                    
                }
                //catch block
                catch(NullPointerException nullPointer_one){
                        JOptionPane.showMessageDialog(frame_academic,"Please don not leave the text field empty or fill the text field properly.", "ERROR", JOptionPane.ERROR_MESSAGE);
            
                }

            }
            
        }
        
        
       
        //Registration of Academic Course
        if(e.getSource() == button_register){
            register_academicID = field_courseID.getText();
            
            register_courseLeader = field_courseLeader.getText();
            
            register_lecturerName = field_lecturerName.getText();
            
            //For Starting Date
            String years = (combobox_years.getSelectedItem()).toString();
            String months = (combobox_months.getSelectedItem()).toString();
            String days = (combobox_days.getSelectedItem()).toString();
            
            register_startingDate = years + months + days;
            
            
            //For Completion Date
            String years1 = (combobox_years1.getSelectedItem()).toString();
            String months1 = (combobox_months1.getSelectedItem()).toString();
            String days1 = (combobox_days1.getSelectedItem()).toString();
            
            register_completionDate = years1 + months1 + days1;
            
            
            //Comparison of CourseID
            for(Course var : aList){
                if(var.getcourseID().equals(register_academicID)){
                    
                    //instance
                    if(var instanceof AcademicCourse){ 
                         ref_academic = (AcademicCourse)var;
                        
                         //If the AcademicCourse is already regsitered
                         if(ref_academic.getisRegistered() == true){
                             JOptionPane.showMessageDialog(frame_academic,"Sorry, the course is already registered.");
                             break;
                            }
                            
                         else if(ref_academic.getisRegistered() == false){
                             ref_academic.register(register_courseLeader, register_lecturerName, register_startingDate, register_completionDate);
                             JOptionPane.showMessageDialog(frame_academic,"The course is registered successfully.");
                             break;
                            }   
                        
                    }
                    
                }
                
                else{
                    JOptionPane.showMessageDialog(frame_academic,"The Course ID entered to add the course does not matches \n with the Course ID entered to register the course.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;
                }

            }
            
        }
        
        
        
        //Display button for Academic Course
        for(Course var1 : aList){
            if(e.getSource() == button_display){
                
                //Casting
                if(var1 instanceof AcademicCourse){
                    ref_academicDisplay = (AcademicCourse)var1;
                    ref_academicDisplay.display(); 
                }
                
            }
            
        }
        
        
        
        //Clear button for Academic Course
        if(e.getSource() == button_clear){
            //textfield set to empty string
            field_courseID.setText("");
            field_courseName.setText("");
            field_duration.setText("");
            field_level.setText("");
            field_credit.setText("");
            field_numberOfAssessments.setText("");
            field_courseID.setText("");
            field_courseLeader.setText("");
            field_lecturerName.setText("");
            //combobox selected index set to 0
            combobox_years.setSelectedIndex(0);
            combobox_months.setSelectedIndex(0);
            combobox_days.setSelectedIndex(0);
            combobox_years1.setSelectedIndex(0);
            combobox_months1.setSelectedIndex(0);
            combobox_days1.setSelectedIndex(0);
        }
        
        
        
        /* Non Academic
         * 
        */
        //Add button for Non Academic Course
        if(e.getSource() == button_addNon){
            //Try block
            try{
                add_nonAcademicCourseID = field_courseIDNon.getText();
                
                add_nonAcademicCourseName = field_courseNameNon.getText();
                
                add_nonAcademicDuration = field_durationNon.getText();
                int duration_NA = Integer.parseInt(add_nonAcademicDuration);
                
                add_nonAcademicPrerequisite = field_prerequisiteNon.getText();
                
                nonAcademicExist = false; //nonAcademicExist initialized to false
                
                for(Course var_addNon : aList){
                    if(var_addNon.getcourseID().equals(add_nonAcademicCourseID)){
                    nonAcademicExist = true;
                    break;
                    
                    }
                }
                
                if(nonAcademicExist == false){
                    //Calling the constructor of Non-Academic Course class
                    obj_NonAcademic = new NonAcademicCourse(add_nonAcademicCourseID , add_nonAcademicCourseName, duration_NA, add_nonAcademicPrerequisite);
                    
                    //adding to Array List
                    aList.add(obj_NonAcademic);
                    
                    //Message Dialog Box
                    message_nonAcademic = new JOptionPane();
                    String final_messageNon = "Course ID: " + add_nonAcademicCourseID + "\nCourse Name: " + add_nonAcademicCourseName + "\nDuration: " + add_nonAcademicDuration + "\nPrerequisite: " + add_nonAcademicPrerequisite + "\n \n has been successfully added \n to Non Academic Course";
                    message_nonAcademic.showMessageDialog(frame_non, final_messageNon);
                        
                }
                
                else if(nonAcademicExist == true){
                    JOptionPane.showMessageDialog(frame_non, "Course ID " + add_nonAcademicCourseID+ " is already added.");
                }
            }
            
            //catch block
            catch(NumberFormatException numberFormat_two){
               
                try{
                    if(add_nonAcademicCourseID.equals("") && add_nonAcademicCourseName.equals("") && add_nonAcademicDuration.equals("") && add_nonAcademicPrerequisite.equals("") ){
                        JOptionPane.showMessageDialog(frame_academic,"Please don not leave the text field empty or fill the text field properly.", "ERROR", JOptionPane.ERROR_MESSAGE);
                        
                    }
                }
                    
                //catch block
                catch(NullPointerException nullPointer_two){
                    JOptionPane.showMessageDialog(frame_academic,"Please don not leave the text field empty or fill the text field properly.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                    
            }
            
        }
        
        
        //Registration of Non Academic Course
        if(e.getSource() == button_registerNon){
            register_nonAcademicID = field_courseIDNon.getText();
            
            register_nonCourseLeader = field_courseLeaderNon.getText();
            
            register_nonInstructorName = field_instructorNameNon.getText();
            
            //For String Date
            String years = (combobox_yearsNon.getSelectedItem()).toString();
            String months = (combobox_monthsNon.getSelectedItem()).toString();
            String days = (combobox_daysNon.getSelectedItem()).toString();
            
            register_nonStartingDate = years + months + days;
            
            
            //For Comletion Date
            String years1 = (combobox_yearsNon1.getSelectedItem()).toString();
            String months1 = (combobox_monthsNon1.getSelectedItem()).toString();
            String days1 = (combobox_daysNon1.getSelectedItem()).toString();
            
            register_nonCompletionDate = years1 + months1 + days1;
            
            
            //For Exam Date
            String years2 = (combobox_yearsNon2.getSelectedItem()).toString();
            String months2 = (combobox_monthsNon2.getSelectedItem()).toString();
            String days2 = (combobox_daysNon2.getSelectedItem()).toString();
            
            register_nonExamDate = years2 + months2 + days2;
            
            
            //Comparison of CourseID
            for(Course var_non : aList){
                if(var_non.getcourseID().equals(register_nonAcademicID)){
                    
                    //instance of
                    if(var_non instanceof NonAcademicCourse){
                         ref_nonAcademic = (NonAcademicCourse)var_non;
                        
                         //If the AcademicCourse is already regsitered
                         if(ref_nonAcademic.getisRegistered() == true){
                             JOptionPane.showMessageDialog(frame_non,"Sorry, the course is already registered.");
                             break;
                         }
                            
                         else if(ref_nonAcademic.getisRegistered() == false){
                             ref_nonAcademic.register(register_nonCourseLeader, register_nonInstructorName, register_nonStartingDate, register_nonCompletionDate, register_nonExamDate);
                             JOptionPane.showMessageDialog(frame_non,"The course is registered successfully.");
                             break;
                         }   
                        
                    }
                    
                }
                else{
                    JOptionPane.showMessageDialog(frame_non,"The Course ID entered to add the course does not matches \n with the Course ID entered to register the course.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;
                }
                
            }
         
        }
        
        
        //Remove button for Non Academic Course
        if(e.getSource() == button_removeNon){
            remove_nonAcademicID = field_courseIDNon.getText();
            //Comparison of CourseID
            for(Course var_non1 : aList){
                if(var_non1.getcourseID().equals(remove_nonAcademicID)){
                    
                    //instance of
                    if(var_non1 instanceof NonAcademicCourse){
                        ref_nonAcademicRemove = (NonAcademicCourse)var_non1;
                        
                        if(ref_nonAcademicRemove.getisRemoved() == false){
                            ref_nonAcademicRemove.remove();
                            JOptionPane.showMessageDialog(frame_non,"The course is removed successfully.");
                            break;
                        }
                        
                        else if(ref_nonAcademicRemove.getisRemoved() == true){
                            JOptionPane.showMessageDialog(frame_non,"Sorry, the course is already removed.");
                            break;
                        }
                        
                    }
                    
                }
                
                else{
                    JOptionPane.showMessageDialog(frame_non,"The Course ID entered to add the course does not matches \n with the Course ID entered to remove the course.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    break;
                }
                
            }
            
        }
        
        
        //Display button for Non Academic Course
        for(Course var_non2 : aList){
            if(e.getSource() == button_displayNon){
                
                //Casting
                if(var_non2 instanceof NonAcademicCourse){
                    ref_nonAcademicDisplay = (NonAcademicCourse)var_non2;
                    ref_nonAcademicDisplay.display();
                }
                
            }
            
        }
        
        
        
        //Clear button for Non Academic Course
        if(e.getSource() == button_clearNon){
            //text field set to empty string
            field_courseIDNon.setText("");
            field_courseNameNon.setText("");
            field_durationNon.setText("");
            field_prerequisiteNon.setText("");
            
            field_courseIDNon.setText("");
            field_courseLeaderNon.setText("");
            field_instructorNameNon.setText("");
            //combobox selected index set to 0
            combobox_yearsNon.setSelectedIndex(0);
            combobox_monthsNon.setSelectedIndex(0);
            combobox_daysNon.setSelectedIndex(0);
            combobox_yearsNon1.setSelectedIndex(0);
            combobox_monthsNon1.setSelectedIndex(0);
            combobox_daysNon1.setSelectedIndex(0);
            combobox_yearsNon2.setSelectedIndex(0);
            combobox_monthsNon2.setSelectedIndex(0);
            combobox_daysNon2.setSelectedIndex(0);
        }
        
    }
    
}
