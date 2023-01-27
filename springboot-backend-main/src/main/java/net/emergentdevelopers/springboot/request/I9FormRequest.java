package net.emergentdevelopers.springboot.request;

import javax.validation.constraints.NotBlank;

public class I9FormRequest {
	@NotBlank
	private long id;

	@NotBlank
	private String lastName;

	@NotBlank 
	private String middleInitial;
	
	@NotBlank 
	private String firstName;
	
	@NotBlank 
	private String otherLastName;
	
	@NotBlank 
	private String address;
	
	@NotBlank 
	private String aptNumber;
	
	@NotBlank 
	private String city;
	
	@NotBlank 
	private String state;
	
	@NotBlank 
	private String zipCode;
	
	@NotBlank 
	private String dob;
	
	@NotBlank 
	private String ssn;
	
	@NotBlank 
	private String emailAddress;
	
	@NotBlank 
	private String telephoneNumber;
	
	@NotBlank 
	private boolean citizen;
	
	@NotBlank 
	private boolean noncitizen;
	
	@NotBlank 
	private boolean permanentResident;
	
	@NotBlank 
	private String uscisNumber;
	
	@NotBlank 
	private boolean authorizedAlien;
	
	@NotBlank 
	private String authorizedExpirationDate;
	
	@NotBlank 
	private String alienRegistrationNumber;
	
	@NotBlank 
	private String formi94admissionNumber;
	
	@NotBlank 
	private String foreignPassportNumber;
	
	@NotBlank 
	private String countryOfIssuance;
	
	@NotBlank 
	private String signatureOfEmployee;
	
	@NotBlank 
	private String todaysdate;
	
	@NotBlank 
	private boolean preparerTranslator;
	
	@NotBlank 
	private String preparerTranslatorSignature;
	
	@NotBlank 
	private String preparerTranslatorDate;
	
	@NotBlank 
	private String preparerTranslatorLastName;
	
	@NotBlank 
	private String preparerTranslatorFirstName;
	
	@NotBlank 
	private String preparerTranslatorAddress;
	
	@NotBlank 
	private String preparerTranslatorCity;
	
	@NotBlank 
	private String preparerTranslatorState;
	
	@NotBlank 
	private String preparerTranslatorZipCode;
	
	@NotBlank 
	private boolean completed;

	
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public @NotBlank boolean getisCompleted() {
		return completed;
	}
	public void setisCompleted(boolean iscompleted) {
		this.completed = completed;
	}
}
