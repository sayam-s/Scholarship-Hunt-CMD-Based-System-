public class AcademicRecord{

    private String middleSchoolName;
    private String highSchoolName;
    private String collegeInstituteName;
    private String universityName;
    private int middleSchoolEndYear;
    private int highSchoolEndYear;
    private int collegeEndYear;
    private int universityEndYear;
    private double totalMarksInHighSchool;
    private double totalMarksInCollege;
    private double marksObtainedInHighSchool;
    private double marksObtainedInCollege;
    private double recentCGPA;
    private int noOfDegrees;
    private String[] degrees;

    // Default constructor

    public AcademicRecord(){ }

    // Overloaded Constructor
    public AcademicRecord(String middleSchoolName, String highSchoolName, String collegeInstituteName, String universityName, int middleSchoolEndYear, int highSchoolEndYear, int collegeEndYear, int universityEndYear,  double totalMarksInHighSchool, double totalMarksInCollege, double marksObtainedInHighSchool, double marksObtainedInCollege, double recentCGPA, int noOfDegrees, String[] degrees){

        this.setMiddleSchoolName(middleSchoolName);
        this.setHighSchoolName(highSchoolName);
        this.setCollegeInstituteName(collegeInstituteName);
        this.setUniversityName(universityName);
        this.setMiddleSchoolEndYear(middleSchoolEndYear);
        this.setHighSchoolEndYear(highSchoolEndYear);
        this.setCollegeEndYear(collegeEndYear);
        this.setUniversityEndYear(universityEndYear);
        this.setTotalMarksInHighSchool(totalMarksInHighSchool);
        this.setTotalMarksInCollege(totalMarksInCollege);
        this.setMarksObtainedInHighSchool(marksObtainedInHighSchool);
        this.setMarksObtainedInCollege(marksObtainedInCollege);
        this.setRecentCGPA(recentCGPA);
        this.setNoOfDegrees(noOfDegrees);
        this.setDegrees(degrees);

    }

    // Copy Constructor
    public AcademicRecord(AcademicRecord ar){

        this.setMiddleSchoolName(ar.getMiddleSchoolName());
        this.setHighSchoolName(ar.getHighSchoolName());
        this.setCollegeInstituteName(ar.getCollegeInstituteName());
        this.setUniversityName(ar.getUniversityName());
        this.setMiddleSchoolEndYear(ar.getMiddleSchoolEndYear());
        this.setHighSchoolEndYear(ar.getHighSchoolEndYear());
        this.setCollegeEndYear(ar.getCollegeEndYear());
        this.setUniversityEndYear(ar.getUniversityEndYear());
        this.setTotalMarksInHighSchool(ar.getTotalMarksInHighSchool());
        this.setTotalMarksInCollege(ar.getTotalMarksInCollege());
        this.setMarksObtainedInHighSchool(ar.getMarksObtainedInHighSchool());
        this.setMarksObtainedInCollege(ar.getMarksObtainedInCollege());
        this.setRecentCGPA(ar.getRecentCGPA());
        this.setNoOfDegrees(ar.getNoOfDegrees());
        this.setDegrees(ar.getDegrees());

    }

    // Getters

    public String getMiddleSchoolName(){
        return middleSchoolName;
    }
    public String getHighSchoolName(){
        return highSchoolName;
    }
    public String getCollegeInstituteName(){
        return collegeInstituteName;
    }
    public String getUniversityName(){
        return universityName;
    }
    public int getMiddleSchoolEndYear(){
        return middleSchoolEndYear;
    }
    public int getHighSchoolEndYear(){
        return highSchoolEndYear;
    }
    public int getCollegeEndYear(){
        return collegeEndYear;
    }
    public int getUniversityEndYear(){
        return universityEndYear;
    }
    public double getTotalMarksInHighSchool(){
        return totalMarksInHighSchool;
    }
    public double getTotalMarksInCollege(){
        return totalMarksInCollege;
    }
    public double getMarksObtainedInHighSchool(){
        return marksObtainedInHighSchool;
    }
    public double getMarksObtainedInCollege(){
        return marksObtainedInCollege;
    }
    public double getRecentCGPA(){
        return recentCGPA;
    }
    public int getNoOfDegrees(){
        return noOfDegrees;
    }
    public String[] getDegrees(){
        return degrees;
    }

    // setters

    public void setMiddleSchoolName(String middleSchoolName){
        this.middleSchoolName = middleSchoolName;
    }
    public void setHighSchoolName(String highSchoolName){
        this.highSchoolName = highSchoolName;
    }
    public void setCollegeInstituteName(String collegeInstituteName){
        this.collegeInstituteName = collegeInstituteName;
    }
    public void setUniversityName(String universityName){
        this.universityName = universityName;
    }
    public void setMiddleSchoolEndYear(int middleSchoolEndYear){
        this.middleSchoolEndYear = middleSchoolEndYear;
    }
    public void setHighSchoolEndYear(int highSchoolEndYear){
        this.highSchoolEndYear = highSchoolEndYear;
    }
    public void setCollegeEndYear(int collegeEndYear){
        this.collegeEndYear = collegeEndYear;
    }
    public void setUniversityEndYear(int universityEndYear){
        this.universityEndYear = universityEndYear;
    }
    public void setTotalMarksInHighSchool(double totalMarksInHighSchool){
        this.totalMarksInHighSchool = totalMarksInHighSchool;
    }
    public void setTotalMarksInCollege(double totalMarksInCollege){
        this.totalMarksInCollege = totalMarksInCollege;
    }
    public void setMarksObtainedInHighSchool(double marksObtainedInHighSchool){
        this.marksObtainedInHighSchool = marksObtainedInHighSchool;
    }
    public void setMarksObtainedInCollege(double marksObtainedInCollege) {
        this.marksObtainedInCollege = marksObtainedInCollege;
    }
    public void setRecentCGPA(double recentCGPA){
        this.recentCGPA = recentCGPA;
    }
    public void setNoOfDegrees(int noOfDegrees){
        this.noOfDegrees = noOfDegrees;
    }
    public void setDegrees(String[] degrees){
        this.degrees = degrees;
    }

    // Print Methods
    public String toString(){

        String deg = "Degrees: ";
        
        for(int i = 0; i < degrees.length; i++){
            deg += degrees[i];
                if(i != degrees.length - 1){
                    deg += ", ";
                }
        }

        return "Middle School Name: " + this.getMiddleSchoolName() + ", High School Name: " + this.getHighSchoolName()
        + ", College Institute Name: " + this.getCollegeInstituteName() + ", University Name: " + this.getUniversityName()
        + ", Middle School End Year: " + this.getMiddleSchoolEndYear() + ", High School End Year: " + this.getHighSchoolEndYear()
        + ", College End Year: " + this.getCollegeEndYear() + ", University End Year: " + this.getUniversityEndYear()
        + ", Total Marks in High School: " + this.getTotalMarksInHighSchool() + ", Total Marks in College: " + this.getTotalMarksInCollege()
        + ", Marks Obtained in High School: " + this.getMarksObtainedInHighSchool() + ", Marks Obtained in College: " + this.getMarksObtainedInCollege()
        + ", No of Degrees: " + this.getNoOfDegrees() + ", " + deg;
    }

    public void print(){

        System.out.println("----Academic Record---\n");
        System.out.println("Middle School Name: " + this.getMiddleSchoolName());
        System.out.println("High School Name: " + this.getHighSchoolName());
        System.out.println("College Institute Name: " + this.getCollegeInstituteName());
        System.out.println("University Name: " + this.getUniversityName());
        System.out.println("Middle School End Year: " + this.getMiddleSchoolEndYear());
        System.out.println("High School End Year: " + this.getHighSchoolEndYear());
        System.out.println("College End Year: " + this.getCollegeEndYear());
        System.out.println("University End Year: " + this.getUniversityEndYear());
        System.out.println("Total Marks in High School: " + this.getTotalMarksInHighSchool());
        System.out.println("Total Marks in College: " + this.getTotalMarksInCollege());
        System.out.println("Marks Obtained in High School: " + this.getMarksObtainedInHighSchool());
        System.out.println("Marks Obtained in College: " + this.getMarksObtainedInCollege());
        System.out.println("Recent CGPA: " + this.getRecentCGPA());
        System.out.println("No of Degrees: " + this.getNoOfDegrees());

        System.out.println("Degrees: ");
            for(int i = 0; i < degrees.length; i++){
                System.out.print(degrees[i]);
                    if(i != degrees.length - 1){
                        System.out.print(", ");
                    }
            }
            System.out.println();

        }

    public String PRINT(){

        String deg = "";
        
        for(int i = 0; i < degrees.length; i++){
            deg += degrees[i];
                if(i != degrees.length - 1){
                    deg += "\n";
                }
        }

        return (this.getMiddleSchoolName() + "\n" + this.getHighSchoolName() 
        + "\n" + this.getCollegeInstituteName() + "\n" + this.getUniversityName()
        + "\n" + this.getMiddleSchoolEndYear() + "\n" + this.getHighSchoolEndYear()
        + "\n" + this.getCollegeEndYear() + "\n" + this.getUniversityEndYear()
        + "\n" + this.getTotalMarksInHighSchool() + "\n" + this.getTotalMarksInCollege()
        + "\n" + this.getMarksObtainedInHighSchool() + "\n" + this.getMarksObtainedInCollege()
	+ "\n" + this.getRecentCGPA()
        + "\n" + this.getNoOfDegrees() + "\n" + deg);
    }

}