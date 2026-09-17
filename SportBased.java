import java.time.LocalDate;
class SportBased extends Scholarship{

    //FEILDS
    private String SportType ;
    private String eligibilityLevel ;
    private double minGPA = 2.5;

    //METHODS

    //Constructors

    public SportBased(){ //DEFAULT CONSTRUCTOR

        super() ;
        this.setSportType(null) ;
        this.setEligibilityLevel(null) ;
        this.setMinGPA(0.0) ;

    }

    public SportBased(String name , double amt , LocalDate date , String sport , String level , double gpa){
        
        super(name , amt , date ) ;
        this.setSportType(sport) ;
        this.setEligibilityLevel(level) ;
        this.setMinGPA(gpa) ;

    }

    public SportBased(String name , double amt , String date , String sport , String level , double gpa){
        
        super(name , amt , LocalDate.parse(date) ) ;
        this.setSportType(sport) ;
        this.setEligibilityLevel(level) ;
        this.setMinGPA(gpa) ;

    }

    public SportBased(SportBased obj){

        super(obj) ;
        this.setSportType(obj.getSportType()) ;
        this.setEligibilityLevel(obj.getEligibilityLevel()) ;
        this.setMinGPA(obj.getMinGPA()) ;
        
    }

    //Setters & Getters 

    public void setSportType(String sportType){
        this.SportType = sportType ;
    }
    public String getSportType(){
        return SportType ;
    }

    public void setEligibilityLevel(String EligibilityLevel){
        this.eligibilityLevel = EligibilityLevel ;
    }
    public String getEligibilityLevel(){
        return eligibilityLevel ;
    }

    public void setMinGPA(double MinGPA){
        this.minGPA = MinGPA ;
    }
    public double getMinGPA(){
        return minGPA ;
    }

    //toString()
    @Override
    public String toString(){
        return (super.toString()+" SportType : "+this.getSportType()+" , Eligibility Level : "+this.getEligibilityLevel()+" , Min GPA : "+this.getMinGPA()) ;
    }

    //print()
    @Override
    public void print(){

        super.print() ;
        System.out.println("SportType  : "+this.getSportType()) ;
        System.out.println("Eligibility Level : "+this.getEligibilityLevel()) ;
        System.out.println("Min GPA: "+this.getMinGPA()) ;
        
    }

    public String PRINT(){
        return (super.PRINT()+"\n"+this.getSportType()+"\n"+this.getEligibilityLevel()+"\n"+this.getMinGPA()) ;
    }

    //isEligible()
    public boolean isEligible(Student s){

        if(this.getEligibilityLevel().equalsIgnoreCase("International" ) || this.getEligibilityLevel().equalsIgnoreCase("National" ) ||this.getEligibilityLevel().equalsIgnoreCase("District" ) ||this.getEligibilityLevel().equalsIgnoreCase("College") ){

            if(s.getRecentCGPA() >= getMinGPA()){
                return true ;
            }
            else{
                System.out.println("\n***Minimum GPA for eligibilty is 2.5***") ;
                return false ;
            }

        }
        else{
            System.out.println("\n***Eligibility level should be at International , national , district or at college level***") ;
            return false ;
        }
    }


    //sort()
    public void sort(Student[] appliedBy){

        int count = 0 ;
        Student[] arrStd = new Student[appliedBy.length] ;         //An array for arranging eligible and non-eligible students
        
        
        for(int i = 0 ; i < appliedBy.length ; i++){ //Traverse through whole array of applied by Students

            if(isEligible(appliedBy[i])){         //Filtering eligible students from all applied students
                arrStd[count++] = appliedBy[i] ;    //Storing eligible students
            }
        }

        for(int j = 0; j < count - 1; j++){ //change the length with count cause of null pointer exception as the rest of array could be empty
            int maxStateStudent = j ;
            for(int k = j+1 ; k < arrStd.length ; k++){ 
                if(arrStd[k].getRecentCGPA() > arrStd[maxStateStudent].getRecentCGPA()){ //change here cause u were calling that check level with refrence to student eventhough u made it in sports
                    maxStateStudent = k ;
                }
            }   
            Student temp = arrStd[j] ;
            arrStd[j] = arrStd[maxStateStudent] ;
            arrStd[maxStateStudent] = temp ;
        }

        for(int i = 0 ; i < appliedBy.length ; i++){ //Traverse through whole array of applied by Students

            if(!isEligible(appliedBy[i])){         //Filtering non-eligible students from all applied students
                arrStd[count++] = appliedBy[i] ;       //Storing non-eligible students
            }
        }
        //Now array is something like {Eligible , Eligible , Non-eligible}
        for (int i = 0; i < appliedBy.length; i++) {
            appliedBy[i] = arrStd[i];
        } //updating original array according to sorting
    }
    
    
    public int checkLevel(){ //Self Added Method

        if(this.getEligibilityLevel().equalsIgnoreCase("International" ) ){
            return 3 ;
        }
        else if(this.getEligibilityLevel().equalsIgnoreCase("National" ) ){
            return 2 ;
        }
        else if(this.getEligibilityLevel().equalsIgnoreCase("District" ) ){
            return 1 ;
        }
        else if(this.getEligibilityLevel().equalsIgnoreCase("College" ) ){
            return 0 ;
        }
        else{
            return -1 ;
        }
    }

}