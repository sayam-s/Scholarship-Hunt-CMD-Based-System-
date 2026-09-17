import java.time.LocalDate;

abstract class Scholarship{
	
	private String name;
	private double amount;
	private LocalDate deadline;
	private Student[] appliedBy;
	private Student[] awardedTo;
	
	//---------------------------------------------------------------CONSTRUCTORS---------------------------------------------------------------
	
	public Scholarship(){
		appliedBy = new Student[0];
		awardedTo = new Student[3];
	}//default-constructor
	public Scholarship(String Name, double amt, LocalDate date){
		this();
		this.setName(Name);
		this.setAmount(amt);
		this.setDeadline(date);
	}//overloaded-constructor
	public Scholarship(String Name, double amt, String d){
		this();
		this.setName(Name);
		this.setAmount(amt);
		LocalDate date = LocalDate.parse(d);
		this.setDeadline(date);
	}//overloaded-constructor
	public Scholarship(Scholarship s){
		this.setName(s.getName());
		this.setAmount(s.getAmount());
		this.setDeadline(s.getDeadline());
		appliedBy = new Student[s.getAppliedBy().length];
		awardedTo = new Student[s.getAwardedTo().length];
		for(int i = 0; i < s.getAppliedBy().length; i++){
			appliedBy[i] = s.getAppliedBy()[i];
		}//for
		for(int i = 0; i < s.getAwardedTo().length; i++){
			awardedTo[i] = s.getAwardedTo()[i];
		}//for
	}//copy-constructor
	
	//------------------------------------------------------------------SETTERS-----------------------------------------------------------------
	
	public void setName(String Name){
		this.name = Name;
	}//method
	public void setAmount(double amt){
		this.amount = amt;
	}//method
	public void setDeadline(LocalDate date){
		this.deadline = date;
	}//method
	public void setDeadline(String date){
		this.deadline = LocalDate.parse(date);
	}//method
	public void setAppliedBy(Student[] std){
		appliedBy = std;
	}//method
	
	//-------------------------------------------------------------------GETTERS-------------------------------------------------------------------
	
	public String getName(){
		return name;
	}//method
	public double getAmount(){
		return amount;
	}//method
	public LocalDate getDeadline(){
		return deadline;
	}//method
	public Student[] getAppliedBy(){
		return appliedBy;
	}//method
	public Student[] getAwardedTo(){
		return awardedTo;
	}//method

	//-------------------------------------------------------------------METHODS-------------------------------------------------------------------

	public void addStudent(Student[] arr, Student std){
		Student[] s = new Student[arr.length + 1];
		for(int i = 0; i < arr.length; i++){
			s[i] = arr[i];
		}//for
		s[arr.length] = std;
		this.setAppliedBy(s);
	}//method

	public abstract void sort(Student[] appliedBy); //method to be inherited

	public void print(){
		System.out.println("\nName: " + this.getName() + "Amount: " + this.getAmount() + "Deadline: " + this.getDeadline());
	}//method

	public String toString(){
		return ("\nName: " + this.getName() + "Amount: " + this.getAmount() + "Deadline: " + this.getDeadline());
	}//method

	public String PRINT(){
		return (this.getName() + "\n" + this.getAmount() + "\n" + this.getDeadline());
	}//method

			//change done in parameters
	public abstract boolean isEligible(Student s); //method to be inherited
	
}//class











