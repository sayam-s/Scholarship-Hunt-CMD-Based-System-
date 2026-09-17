import java.time.LocalDate;

class NeedBased extends Scholarship{
    private double minGpa;
    private double familyIncomeLimit;

            //setters
    public void setGPA(double gpa){
        minGpa = gpa;
    }
    public void setIncome(double income){
        familyIncomeLimit = income;
    }

            //Getters
    public double getGPA(){
        return minGpa;
    }
    public double getIncome(){
        return familyIncomeLimit;
    }

            //Constructors
    public NeedBased(){}

    public NeedBased(String name, double amt, LocalDate date, double gpa, double limit){
        super(name, amt, date);
        minGpa = gpa;
        familyIncomeLimit = limit;
    }

    public NeedBased(String name, double amt, String date, double gpa, double limit){
        super(name, amt, LocalDate.parse(date));
        minGpa = gpa;
        familyIncomeLimit = limit;
    }

    public NeedBased(NeedBased n){
        super(n.getName(), n.getAmount(), n.getDeadline());
        setGPA(n.getGPA());
        setIncome(n.getIncome());
    }

            //print Method
    public void print(){
        super.print();
        System.out.println("The minimum gpa is "+getGPA()+"\nThe family Income is "+getIncome());
    }

            //toString method
    public String toString(){
        return super.toString()+", GPA: "+getGPA()+", Family Income: "+getIncome();
    }
	
    public String PRINT(){
        return super.PRINT()+"\n"+getGPA()+"\n"+getIncome();
    }

            //isEligible Method
    public boolean isEligible(Student s) {
        return s.getRecentCGPA() >= getGPA() && s.getMonthlyIncome() <= getIncome();
    }

            //SORTING
public void sort(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (isEligible(arr[i]) && isEligible(arr[j])) {
                    if (arr[i].getMonthlyIncome() > arr[j].getMonthlyIncome()) {
                        Student temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }
}