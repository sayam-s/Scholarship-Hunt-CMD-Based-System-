
class Guardian extends Person{


    //FIELDS
    private String relation ;
    private String occupation ;
    private double monthlyIncome ;
    private double annualIncome ;

    //METHODS

    //Constructors
    public Guardian(){//Default Constructor

        super();
        this.setRelation(null) ;
        this.setOccupation(null);
        this.setMonthlyIncome(0.0);
        this.setAnnualIncome(0.0);

    }
    public Guardian(String first_name,String last_name ,String email ,String cnic,String phone_no , char gender , String relation , String Occupation , double monthlyIncome , double AnnualIncome){ //Parametrized Constructor

        super(first_name,last_name,email,cnic,phone_no,gender) ;
        this.setRelation(relation) ;
        this.setOccupation(Occupation);
        this.setMonthlyIncome(monthlyIncome);
        this.setAnnualIncome(AnnualIncome);

    }
    public Guardian(Guardian obj){ //Copy Constructor
        
        super(obj);
        this.setRelation(obj.getRelation()) ;
        this.setOccupation(obj.getOccupation()) ;
        this.setMonthlyIncome(obj.getMonthlyIncome()) ;
        this.setAnnualIncome(obj.getAnnualIncome()) ;

    }

    //Setters & Getters

    public void setRelation(String relation){
        this.relation = relation ;
    }
    public String getRelation(){
        return relation ;
    }

    public void setOccupation(String occupation){
        this.occupation = occupation ;
    }
    public String getOccupation(){
        return occupation ;
    }

    public void setMonthlyIncome(double monthlyIncome){
        this.monthlyIncome = monthlyIncome ;
    }
    public double getMonthlyIncome(){
        return monthlyIncome ;
    }

    public void setAnnualIncome(double annualIncome){
        this.annualIncome = annualIncome ;
    }
    public double getAnnualIncome(){
        return annualIncome ;
    }

    //toString()
    @Override
    public String toString(){
        return (super.toString()+"Relation : "+this.getRelation()+" , Occupation : "+this.getOccupation()+" , Monthly Income : "+this.getMonthlyIncome()+" , Annual Income : "+this.getAnnualIncome()) ;
    }

    //print()
    @Override
    public void print(){

        super.print() ;
        System.out.println("Relation : "+this.getRelation()) ;
        System.out.println("Occupation : "+this.getOccupation()) ;
        System.out.println("MonthlyIncome : "+this.getMonthlyIncome()) ;
        System.out.println("AnnualIncome : "+this.getAnnualIncome()) ;
        
    }

	public String PRINT(){
		return (super.PRINT() + "\n" + this.getRelation() + "\n" + this.getOccupation() + "\n" + this.getMonthlyIncome() + "\n" + this.getAnnualIncome());
	}//method

}