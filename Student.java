class Student extends Person{
	
	private String dateOfBirth;
	private String religion;
	private String nationality;
	private boolean isMarried;
	private boolean isDisabled;
	private String currentDegree;
	private String department;
	private String major;
	private int currentSemester;
	private String currentInstitute;
	private final Address temporaryAddress;
	private final Address permanentAddress;
	private final Guardian guardian1;
	private final Guardian guardian2;
	private final AcademicRecord academicRecord;
	private double disabilityPercent;

	//---------------------------------------------------------------CONSTRUCTORS---------------------------------------------------------------
	
	public Student(){
		super();
		this.temporaryAddress = new Address(); //initializing the finalized fields
		this.permanentAddress = new Address(); 
		this.guardian1 = new Guardian();
		this.guardian2 = new Guardian();
		this.academicRecord = new AcademicRecord();
	}//default-constructor
	public Student(String fname, String lname, String email, String cnic, String phone_no, char gender, String date, String Religion, String Nationality, 
		boolean married, boolean disabled, String degree, String dept, String maj, int semester, String institute, Address temporary, Address permanent, 
		Guardian g1, Guardian g2, AcademicRecord record){
		super(fname, lname, email, cnic, phone_no, gender);
		this.setDateOfBirth(date);
		this.setReligion(Religion);
		this.setNationality(Nationality);
		this.setIfMarried(married);
		this.setIfDisabled(disabled);
		this.setCurrentDegree(degree);
		this.setDepartment(dept);
		this.setMajor(maj);
		this.setCurrentSemester(semester);
		this.setCurrentInstitute(institute);
		permanentAddress = new Address(permanent);
		temporaryAddress = new Address(temporary);
		guardian1 = new Guardian(g1);
		guardian2 = new Guardian(g2);
		academicRecord = new AcademicRecord(record);
	}//overloaded-constructor
	public Student(Student s){
		super(s.getFirstName(), s.getLastName(), s.getEmail(), s.getCnic(), s.getPhoneNumber(), s.getGender());
		 //retrieving parent class field values and sending through constructor
		this.setDateOfBirth(s.getDateOfBirth());
		this.setReligion(s.getReligion());
		this.setNationality(s.getNationality());
		this.setIfMarried(s.getIfMarried());
		this.setIfDisabled(s.getIfDisabled());
		this.setCurrentDegree(s.getCurrentDegree());
		this.setDepartment(s.getDepartment());
		this.setMajor(s.getMajor());
		this.setCurrentSemester(s.getCurrentSemester());
		this.setCurrentInstitute(s.getCurrentInstitute());
		permanentAddress = new Address(s.getPermanentAddress()); 
		temporaryAddress = new Address(s.getTemporaryAddress());
		guardian1 = new Guardian(s.getGuardian1());
		guardian2 = new Guardian(s.getGuardian2());
		academicRecord = new AcademicRecord(s.getAcademicRecord());
	}//copy-constructor

	//------------------------------------------------------------------SETTERS-----------------------------------------------------------------

	public void setDateOfBirth(String d){
		dateOfBirth = d;
	}//method
	public void setReligion(String r){
		religion = r;
	}//method
	public void setNationality(String n){
		nationality = n;
	}//method
	public void setIfMarried(boolean m){
		isMarried = m;
	}//method
	public void setIfDisabled(boolean d){
		isDisabled = d;
	}//method
	public void setCurrentDegree(String c){
		currentDegree = c;
	}//method
	public void setMajor(String maj){
		major = maj;
	}//method
	public void setDepartment(String dept){
		department = dept;
	}//method
	public void setCurrentSemester(int c){
		currentSemester = c;
	}//method
	public void setCurrentInstitute(String c){
		currentInstitute = c;
	}//method
	public void setDisabilityPercent(double percent){
		disabilityPercent = percent;
	}//method
	
	//-------------------------------------------------------------------GETTERS-------------------------------------------------------------------

	public String getDateOfBirth(){
		return dateOfBirth;
	}//method
	public String getReligion(){
		return religion;
	}//method
	public String getNationality(){
		return nationality;
	}//method
	public boolean getIfMarried(){
		return isMarried;
	}//method
	public boolean getIfDisabled(){
		return isDisabled;
	}//method
	public String getCurrentDegree(){
		return currentDegree;
	}//method
	public String getMajor(){
		return major;
	}//method
	public String getDepartment(){
		return department;
	}//method
	public int getCurrentSemester(){
		return currentSemester;
	}//method
	public String getCurrentInstitute(){
		return currentInstitute;
	}//method
	public Address getTemporaryAddress(){
		return temporaryAddress;
	}//method
	public Address getPermanentAddress(){
		return permanentAddress;
	}//method
	public Guardian getGuardian1(){
		return guardian1;
	}//method
	public Guardian getGuardian2(){
		return guardian2;
	}//method
	public AcademicRecord getAcademicRecord(){
		return academicRecord;
	}//method
	public double getMonthlyIncome() {
		return guardian1.getMonthlyIncome();
	}//method
	public double getRecentCGPA() {
		return academicRecord.getRecentCGPA();
	}//method
	public double getDisabilityPercent(){
		return disabilityPercent;
	}//method

	//-------------------------------------------------------------------METHODS-------------------------------------------------------------------

	public String toString(){
		return super.toString() + ", Date Of Birth: " + this.getDateOfBirth() + ", Religion: " + this.getReligion() + ", Nationality: " + this.getNationality() + ", Married: " + this.getIfMarried() + ", Disabled: " + this.getIfDisabled() + ", Current Degree: " + this.getCurrentDegree() + ", Current Semester: " + this.getCurrentSemester() + ", Current Institute: " + this.getCurrentInstitute() + ", Temporary Address: " + this.getTemporaryAddress().toString() + ", Permanent Address: " + this.getPermanentAddress().toString() + ", Guardian 01: " + this.getGuardian1().toString() + ", Guardian 02: " + this.getGuardian2().toString() + ", Academic Record: " + this.getAcademicRecord().toString();
	}//method
	
	public void print(){
		super.print();
		System.out.println("\nDate Of Birth: " + this.getDateOfBirth() + "\nReligion: " + this.getReligion() + "\nNationality: " + this.getNationality() + "\nMarried: " + this.getIfMarried() + "\nDisabled: " + this.getIfDisabled() + "\nCurrent Degree: " + this.getCurrentDegree() + "\nCurrent Semester: " + this.getCurrentSemester() + "\nCurrent Institute: " + this.getCurrentInstitute() + "\nTemporary Address: " + this.getTemporaryAddress().toString() + "\nPermanent Address: " + this.getPermanentAddress().toString() + "\nGuardian 01: " + this.getGuardian1().toString() + "\nGuardian 02: " + this.getGuardian2().toString() + "\nAcademic Record: " + this.getAcademicRecord().toString());
	}//method
	
	public static void print(Student[] s){
		int i = 0;
		while(i < s.length){
			System.out.println();
			s[i].print();
			i++;
		}//while
	}//method
	
	public String PRINT(){
		return super.PRINT() + "\n" + this.getDateOfBirth() + "\n" + this.getReligion() + "\n" + this.getNationality() + "\n" + this.getIfMarried() + "\n" + this.getIfDisabled() + "\n" + this.getCurrentDegree() + "\n" + this.getCurrentDegree() + "\n" + this.getMajor() + "\n" + this.getCurrentSemester() + "\n" + this.getCurrentInstitute() + "\n" + this.getTemporaryAddress().PRINT() + "\n" + this.getPermanentAddress().PRINT() + "\n" + this.getGuardian1().PRINT() + "\n" + this.getGuardian2().PRINT() + "\n" + this.getAcademicRecord().PRINT();
	}//method
	
}//class



