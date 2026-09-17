import java.time.LocalDate;

class Application{
    private static int applicationNoCounter = 0;
    private int myAppNo = 0;
    private LocalDate submissionDate;
    private String status;
    private final Student student;
    private final Scholarship scholarship;

            //Application Number Generator
    public static int applicationNumberGenerator(){
        return ++applicationNoCounter;
    }

            //SETTERS
    public void setSubmissionDate(){
        this.submissionDate = LocalDate.now();
    }
    public void setStatus(String status){
        this.status = status;
    }

            //GETTERS
    public int getApplicationNo(){
        return myAppNo;
    }
    public LocalDate getSubmissionDate(){
        return submissionDate;
    }
    public String getStatus(){
        return status;
    }
    public Student getStudent(){
        return student;
    }
    public Scholarship getScholarship(){
        return scholarship;
    }

            //DEFAULT CONSTRUCTOR
//     public Application(){
//         student = new Student() ;
//         scholarship = new Scholarship();
//    }

            //OVERLOADED CONSTRUCTOR
    public Application(Student s, Scholarship scholar_ship){
        this.myAppNo = applicationNumberGenerator();
        setSubmissionDate();
        setStatus("Processinng");
        this.student = new Student(s);
        this.scholarship = scholar_ship;
    }

            //COPY CONSTRUCTOR
    public Application(Application a){
        this.myAppNo = applicationNumberGenerator();
        setSubmissionDate();
        setStatus(a.getStatus());
        this.student = new Student(a.student);
        this.scholarship = a.getScholarship();
    }

            //Print Method
    public void print(){
        System.out.println("Application No: "+getApplicationNo()+", Submission Date: "+getSubmissionDate()+", Status: "+getStatus());
    }

            //toString Method
    public String toString(){
        return "Application No: "+getApplicationNo()+", Submission Date: "+getSubmissionDate()+", Status: "+getStatus();
    }
}