class Address{
    private String state;
    private String province;
    private String district;
    private String city;
    private int houseNo;
    private String streetAddress;
    private String postalCode;

                //SETTERS
    public void setState(String state){
        this.state = state;
    }
    public void setProvince(String province){
        this.province = province;
    }
    public void setDistrict(String district){
        this.district = district;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setHouseNo(int houseNo){
                //self added validation
        if(houseNo < 0){
            this.houseNo = 00;
        }
        else{
            this.houseNo = houseNo;
        }
    }
    public void setStreetAddress(String streetAddress){
        this.streetAddress = streetAddress;
    }
    public void setPostalCode(String postalCode){
                //self added validation
        if(postalCode == null || postalCode.length() == 0 || postalCode.charAt(0) == '-'){
            this.postalCode = "00";
        }
        else{
            this.postalCode = postalCode;
        }
    }

            //GETTERS
    public String getState(){
        return state;
    }
    public String getProvince(){
        return province;
    }
    public String getDistrict(){
        return district;
    }
    public String getCity(){
        return city;
    }
    public int getHouseNo(){
        return houseNo;
    }
    public String getStreetAddress(){
        return streetAddress;
    }
    public String getPostalCode(){
        return postalCode;
    }

            //Default Constructor
    public Address(){}

            //7 args Constructor
    public Address(String state, String province, String district, String city, String streetAddress, int houseNo, String postalCode){
        setState(state);
        setProvince(province);
        setDistrict(district);
        setCity(city);
        setStreetAddress(streetAddress);
        setHouseNo(houseNo);
        setPostalCode(postalCode);
    }

            //Copy Constructor
    public Address(Address a){
        setState(a.getState());
        setProvince(a.getProvince());
        setDistrict(a.getDistrict());
        setCity(a.getCity());
        setStreetAddress(a.getStreetAddress());
        setHouseNo(a.getHouseNo());
        setPostalCode(a.getPostalCode());
    }

            //toString Method
    public String toString(){
        return "Postal Code: "+getPostalCode()+", House No: "+getHouseNo()+", Street: "+getStreetAddress()+", City: "+getCity()+", District: "+getDistrict()+", Province: "+getProvince()+", State: "+getState();
    }

            //Print Method
    public void print(){
        System.out.println("Postal Code: "+getPostalCode()+", House No: "+getHouseNo()+", Street: "+getStreetAddress()+", City: "+getCity()+", District: "+getDistrict()+", Province: "+getProvince()+", State: "+getState());
    }

        //Static print method, Self Added
    public static void print(Address[] a){
        for(int i = 0; i < a.length; i++){
            a[i].print();
        }
    }
	
    public String PRINT(){
        return (getState() + "\n" + getProvince() + "\n" + getDistrict() + "\n" + getCity() + "\n" + getStreetAddress() + "\n" + getHouseNo() + "\n" + getPostalCode());
    }

}