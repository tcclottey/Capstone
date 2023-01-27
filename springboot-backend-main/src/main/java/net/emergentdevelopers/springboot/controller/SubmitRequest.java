package net.emergentdevelopers.springboot.controller;

public class SubmitRequest {

	private Long id;
    private String lastName;
    private String middleInitial;
    private String firstName;
    private String otherLastName;
    private String address;
    private String aptNumber;
    private String city;
    private String state;
    private String zipCode;
    private String dob;
    private String ssn;
    private String emailAddress;
    private String telephoneNumber;
    private boolean citizen;
    private boolean noncitizen;
    private boolean permanentResident;
    private String uscisNumber;
    private boolean authorizedAlien;
    private String authorizedExpirationDate;
    private String alienRegistrationNumber;
    private String formi94admissionNumber;
    private String foreignPassportNumber;
    private String countryOfIssuance;
    private String signatureOfEmployee;
    private String todaysdate;
    private boolean preparerTranslator;
    private String preparerTranslatorSignature;
    private String preparerTranslatorDate;
    private String preparerTranslatorLastName;
    private String preparerTranslatorFirstName;
    private String preparerTranslatorAddress;
    private String preparerTranslatorCity;
    private String preparerTranslatorState;
    private String preparerTranslatorZipCode;
    boolean completed;

    public SubmitRequest() {}

    public SubmitRequest(Long id, String lastName,
    		  String middleInitial, String firstName, String otherLastName, String address, 
    		  String aptNumber,
    		    String city, String state, String zipCode, String dob, String ssn, String 
    		  emailAddress,
    		    String telephoneNumber, boolean citizen, boolean noncitizen, boolean 
    		  permanentResident,
    		    String uscisNumber, boolean authorizedAlien, String authorizedExpirationDate, 
    		    String alienRegistrationNumber, String formi94admissionNumber, String 
    		  foreignPassportNumber, 
    		    String countryOfIssuance, String signatureOfEmployee, String todaysdate, boolean 
    		  preparerTranslator,
    		    String preparerTranslatorSignature, String preparerTranslatorDate, String 
    		  preparerTranslatorLastName,
    		    String preparerTranslatorFirstName, String preparerTranslatorAddress, String 
    		  preparerTranslatorCity,
    		    String preparerTranslatorState, String preparerTranslatorZipCode,
    		    boolean completed) 
    {
    	this.id = id;
    	this.lastName = lastName;
    	this.middleInitial = middleInitial;
    	this.firstName = firstName;
    	this.otherLastName = otherLastName;
    	this.address = address;
    	this.aptNumber = aptNumber;
    	this.city = city;
    	this.state = state;
    	this.zipCode = zipCode;
    	this.dob = dob;
    	this.ssn = ssn;
    	this.emailAddress = emailAddress;
    	this.telephoneNumber = telephoneNumber;
    	this.citizen = citizen;
    	this.noncitizen = noncitizen;
    	this.permanentResident = permanentResident;
    	this.uscisNumber = uscisNumber;
    	this.authorizedAlien = authorizedAlien;
    	this.authorizedExpirationDate = authorizedExpirationDate;
    	this.alienRegistrationNumber = alienRegistrationNumber;
    	this.formi94admissionNumber = formi94admissionNumber;
    	this.foreignPassportNumber = foreignPassportNumber;
    	this.countryOfIssuance = countryOfIssuance;
    	this.signatureOfEmployee = signatureOfEmployee;
    	this.todaysdate = todaysdate;
    	this.preparerTranslator = preparerTranslator;
    	this.preparerTranslatorSignature = preparerTranslatorSignature;
    	this.preparerTranslatorDate = preparerTranslatorDate;
    	this.preparerTranslatorLastName = preparerTranslatorLastName;
    	this.preparerTranslatorFirstName = preparerTranslatorFirstName;
    	this.preparerTranslatorAddress = preparerTranslatorAddress;
    	this.preparerTranslatorCity = preparerTranslatorCity;
    	this.preparerTranslatorState = preparerTranslatorState;
    	this.preparerTranslatorZipCode = preparerTranslatorZipCode;
    	this.completed = completed;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleInitial() {
		return middleInitial;
	}
	public void setMiddleInitial(String middleInitial) {
		this.middleInitial = middleInitial;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getOtherLastName() {
		return otherLastName;
	}
	public void setOtherLastName(String otherLastName) {
		this.otherLastName = otherLastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAptNumber() {
		return aptNumber;
	}
	public void setAptNumber(String aptNumber) {
		this.aptNumber = aptNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public boolean isCitizen() {
		return citizen;
	}
	public void setCitizen(boolean citizen) {
		this.citizen = citizen;
	}
	public boolean isNoncitizen() {
		return noncitizen;
	}
	public void setNoncitizen(boolean noncitizen) {
		this.noncitizen = noncitizen;
	}
	public boolean isPermanentResident() {
		return permanentResident;
	}
	public void setPermanentResident(boolean permanentResident) {
		this.permanentResident = permanentResident;
	}
	public String getUscisNumber() {
		return uscisNumber;
	}
	public void setUscisNumber(String uscisNumber) {
		this.uscisNumber = uscisNumber;
	}
	public boolean isAuthorizedAlien() {
		return authorizedAlien;
	}
	public void setAuthorizedAlien(boolean authorizedAlien) {
		this.authorizedAlien = authorizedAlien;
	}
	public String getAuthorizedExpirationDate() {
		return authorizedExpirationDate;
	}
	public void setAuthorizedExpirationDate(String authorizedExpirationDate) {
		this.authorizedExpirationDate = authorizedExpirationDate;
	}
	public String getAlienRegistrationNumber() {
		return alienRegistrationNumber;
	}
	public void setAlienRegistrationNumber(String alienRegistrationNumber) {
		this.alienRegistrationNumber = alienRegistrationNumber;
	}
	public String getFormi94admissionNumber() {
		return formi94admissionNumber;
	}
	public void setFormi94admissionNumber(String formi94admissionNumber) {
		this.formi94admissionNumber = formi94admissionNumber;
	}
	public String getForeignPassportNumber() {
		return foreignPassportNumber;
	}
	public void setForeignPassportNumber(String foreignPassportNumber) {
		this.foreignPassportNumber = foreignPassportNumber;
	}
	public String getCountryOfIssuance() {
		return countryOfIssuance;
	}
	public void setCountryOfIssuance(String countryOfIssuance) {
		this.countryOfIssuance = countryOfIssuance;
	}
	public String getSignatureOfEmployee() {
		return signatureOfEmployee;
	}
	public void setSignatureOfEmployee(String signatureOfEmployee) {
		this.signatureOfEmployee = signatureOfEmployee;
	}
	public String getTodaysdate() {
		return todaysdate;
	}
	public void setTodaysdate(String todaysdate) {
		this.todaysdate = todaysdate;
	}
	public boolean isPreparerTranslator() {
		return preparerTranslator;
	}
	public void setPreparerTranslator(boolean preparerTranslator) {
		this.preparerTranslator = preparerTranslator;
	}
	public String getPreparerTranslatorSignature() {
		return preparerTranslatorSignature;
	}
	public void setPreparerTranslatorSignature(String preparerTranslatorSignature) {
		this.preparerTranslatorSignature = preparerTranslatorSignature;
	}
	public String getPreparerTranslatorDate() {
		return preparerTranslatorDate;
	}
	public void setPreparerTranslatorDate(String preparerTranslatorDate) {
		this.preparerTranslatorDate = preparerTranslatorDate;
	}
	public String getPreparerTranslatorLastName() {
		return preparerTranslatorLastName;
	}
	public void setPreparerTranslatorLastName(String preparerTranslatorLastName) {
		this.preparerTranslatorLastName = preparerTranslatorLastName;
	}
	public String getPreparerTranslatorFirstName() {
		return preparerTranslatorFirstName;
	}
	public void setPreparerTranslatorFirstName(String preparerTranslatorFirstName) {
		this.preparerTranslatorFirstName = preparerTranslatorFirstName;
	}
	public String getPreparerTranslatorAddress() {
		return preparerTranslatorAddress;
	}
	public void setPreparerTranslatorAddress(String preparerTranslatorAddress) {
		this.preparerTranslatorAddress = preparerTranslatorAddress;
	}
	public String getPreparerTranslatorCity() {
		return preparerTranslatorCity;
	}
	public void setPreparerTranslatorCity(String preparerTranslatorCity) {
		this.preparerTranslatorCity = preparerTranslatorCity;
	}
	public String getPreparerTranslatorState() {
		return preparerTranslatorState;
	}
	public void setPreparerTranslatorState(String preparerTranslatorState) {
		this.preparerTranslatorState = preparerTranslatorState;
	}
	public String getPreparerTranslatorZipCode() {
		return preparerTranslatorZipCode;
	}
	public void setPreparerTranslatorZipCode(String preparerTranslatorZipCode) {
		this.preparerTranslatorZipCode = preparerTranslatorZipCode;
	
	}
	public boolean getCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}
	
	public String id() {
		// TODO Auto-generated method stub
		return null;
	}

	public CharSequence getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
}

