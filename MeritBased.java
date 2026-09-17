import java.time.LocalDate;
public class MeritBased extends Scholarship{

    private double gpaRequirement = 3.0;

    // default Constructor
    public MeritBased(){
        super();
    }

    // Overloaded Constructor

    public MeritBased(String name, double amount, String d, double gpaRequirement){
        super(name, amount, LocalDate.parse(d));
        this.setGpaRequirement(gpaRequirement);
    }

    public MeritBased(String name, double amount, LocalDate date, double gpaRequirement){
        super(name, amount, date);
        this.setGpaRequirement(gpaRequirement);
    }

    // Copy Constructor

    public MeritBased(MeritBased m){
        super(m);
        this.setGpaRequirement(m.getGpaRequirement());
    }

    // setter

    public void setGpaRequirement(double gpaRequirement){
        this.gpaRequirement = gpaRequirement;
    }

    // getter

    public double getGpaRequirement(){
        return gpaRequirement;
    }

    public double calculateMeritScore(){
        return gpaRequirement * 0.40; // modify (value)
    }

    // Print Method (Override)

    @Override

    public void print(){
        super.print();
        System.out.println("GPA Requirement: " + this.getGpaRequirement());
    }

    @Override

    public String toString(){
        return super.toString() + ", GPA Requirement: " + this.getGpaRequirement();
    }

    public String PRINT(){
        return super.PRINT() + "\n" + this.getGpaRequirement();
    }

    // Override method

    public boolean isEligible(Student s){
        return s.getRecentCGPA() >= getGpaRequirement(); // modify (value), change here
    }

    @Override

    public void sort(Student[] appliedBy) {

    int n = appliedBy.length;

        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                if(isEligible(appliedBy[i]) && isEligible(appliedBy[j])){ //change here
                    if(appliedBy[i].getAcademicRecord().getRecentCGPA() < appliedBy[j].getAcademicRecord().getRecentCGPA()){
                        Student temp = appliedBy[i];
                        appliedBy[i] = appliedBy[j];
                        appliedBy[j] = temp;
                    }
                }
            }
        }
    }

}