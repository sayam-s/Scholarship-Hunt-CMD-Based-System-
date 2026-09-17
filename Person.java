abstract class Person{
    
    // Fields

    private String firstName;
    private String lastName;
    private String email;
    private String cnic;
    private String phoneNumber;
    private char gender;

    // Constructors

    public Person() { }

    public Person(String firstName, String lastName, String email, String cnic, String phoneNumber, char gender){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
        this.setCnic(cnic);
        this.setPhoneNumber(phoneNumber);
        this.setGender(gender);
    }

    // Copy Contructor

    public Person(Person p){
        this.setFirstName(p.getFirstName());
        this.setLastName(p.getLastName());
        this.setEmail(p.getEmail());
        this.setCnic(p.getCnic());
        this.setPhoneNumber(p.getPhoneNumber());
        this.setGender(p.getGender());
    }

    // Another constructor 

    public Person(String firstName, String lastName, String cnic){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setCnic(cnic);
    }

    // Setters

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setCnic(String cnic){
        this.cnic = cnic;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setGender(char gender){
        this.gender = gender;
    }

    // Getters

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return email;
    }
    public String getCnic(){
        return cnic;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public char getGender(){
        return gender;
    }

    // Printing Method

    public String toString(){
        return "First Name: " + this.getFirstName() + ", Last Name: " + this.getLastName() + ", Email: " + this.getEmail() + ", CNIC: " + this.getCnic() + ", Phone Number: " + this.getPhoneNumber() + ", Gender: " + this.getGender();
    }

    public void print(){
        System.out.println("First Name: " + this.getFirstName());
        System.out.println("Last Name:" + this.getLastName());
        System.out.println("Email: " + this.getEmail());
        System.out.println("CNIC: " + this.getCnic());
        System.out.println("Phone Number: " + this.getPhoneNumber());
        System.out.println("Gender: " + this.getGender());
    }
	
	public String PRINT(){
		return (this.getFirstName() + "\n" + this.getLastName() + "\n" + this.getEmail() + "\n" + this.getCnic() + "\n" + this.getPhoneNumber() + "\n" +
		this.getGender());
	}//method

}