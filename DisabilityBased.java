import java.util.ArrayList;
import java.time.LocalDate;

class DisabilityBased extends Scholarship{

    //FIELDS
    private String disabilityType ;
    private double minGPA ;
    private double dPercent = 40.0;

    //METHODS

    public DisabilityBased(){

        super() ;
        this.setDisabilityType(null) ;
        this.setMinGPA(0.0) ;
        this.setdPercent(40.0);

    }

    public DisabilityBased(String name , double amt , String date , String type , double gpa){

        super(name,amt,LocalDate.parse(date)) ;
        this.setDisabilityType(type) ;
        this.setMinGPA(gpa) ;

    }

    public DisabilityBased(String name , double amt , LocalDate date , String type , double gpa){

        super(name,amt,date) ;
        this.setDisabilityType(type) ;
        this.setMinGPA(gpa) ;

    }

    public DisabilityBased(DisabilityBased obj){

        super(obj) ;
        this.setDisabilityType(obj.getDisabilityType()) ;
        this.setMinGPA(obj.getMinGPA()) ;

    }

    //Setters and getters

    public void setDisabilityType(String disability){
        disabilityType = disability ;
    }
    public String getDisabilityType(){
        return disabilityType ;
    }
    
    //change done here
    public void setdPercent(double percent){
        dPercent = percent;
    }
    public double getdPercent(){
        return dPercent;
    }

    public void setMinGPA(double gpa){
        minGPA = gpa ;
    }
    public double getMinGPA(){
        return minGPA ;
    }

    //toString()
    @Override
    public String toString(){
        return (super.toString()+"Disability Type : "+ this.getDisabilityType() + ", Minimum Disability Percentage : "+this.getdPercent() + ", Min GPA: "+this.getMinGPA()) ;
    }

    //print()
    @Override
    public void print(){

        super.print() ;
        System.out.println("Disability Type : "+this.getDisabilityType()) ;
        System.out.println("Minimum Disability Percentage : "+this.getdPercent()) ;
        System.out.println(" Min GPA: "+this.getMinGPA()) ;
        
    }

    public String PRINT(){
        return (super.PRINT()+"\n"+this.getDisabilityType()+ "\n"+this.getdPercent() +"\n"+this.getMinGPA()) ;
    }

    //isEligible()
    @Override
    public boolean isEligible(Student s) {
        return s.getIfDisabled() && s.getDisabilityPercent() >= getdPercent() && s.getRecentCGPA() >= getMinGPA();
    }

    //sort()
    // public void sort(Student[] appliedBy){

    //     int count = 0 ;
    //     Student[] arrStd = new Student[appliedBy.length] ;         //An array for arranging eligible and non-eligible students
        
        
    //     for(int i = 0 ; i < appliedBy.length ; i++){ //Traverse through whole array of applied by Students

    //         if(appliedBy[i].isEligible(Student s)){         //Filtering eligible students from all applied students
    //             arrStd[count++] = appliedBy[i] ;    //Storing eligible students
    //         }
    //     }

    //     for(int j = 0 ; j < arrStd.length-1 ; j++){
    //         int maxStateStudent = j ;
    //         for(int k = j+1 ; k < arrStd.length ; k++){
    //             if(arrStd[j].getDisabilityPercen() >= arrStd[maxStateStudent].getDisabilityPer() &&  arrStd[j].getMinGPA() >= arrStd[maxStateStudent].getMinGPA()){
    //                 maxStateStudent = k ;
    //             }
    //         }   
    //         Student temp = arrStd[j] ;
    //         arrStd[j] = arrStd[maxStateStudent] ;
    //         arrStd[maxStateStudent] = temp ;
    //     }

    //     for(int i = 0 ; i < appliedBy.length ; i++){ //Traverse through whole array of applied by Students

    //         if(!appliedBy[i].isEligible()){         //Filtering non-eligible students from all applied students
    //             arrStd[count++] = appliedBy[i] ;       //Storing non-eligible students
    //         }
    //     }
    //     //Now array is something like {Eligible , Eligible , Non-eligible}
    // }
    // u cant use that cause percent is not in student class
@Override
public void sort(Student[] appliedBy) {
    ArrayList<Student> eligible = new ArrayList<>();
    ArrayList<Student> ineligible = new ArrayList<>();

    for (Student s : appliedBy) {
        if (isEligible(s)) {
            eligible.add(s);
        } else {
            ineligible.add(s);
        }
    }

    for (int i = 0; i < eligible.size(); i++) {
        for (int j = i + 1; j < eligible.size(); j++) {
            if (eligible.get(i).getRecentCGPA() < eligible.get(j).getRecentCGPA()) {
                Student temp = eligible.get(i);
                eligible.set(i, eligible.get(j));
                eligible.set(j, temp);
            }
        }
    }

    int index = 0;
    for (Student s : eligible) {
        appliedBy[index++] = s;
    }
    for (Student s : ineligible) {
        appliedBy[index++] = s;
    }
}
    

}