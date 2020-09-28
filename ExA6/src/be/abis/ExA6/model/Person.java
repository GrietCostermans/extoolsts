package be.abis.ExA6.model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {
	private int personNumber;
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private Company company;
	private Address address;
	
	public Person(int personNumber, String firstName, String lastName, LocalDate birthDate) {
		super();
		this.personNumber = personNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}
	public int getPersonNumber() {
		return personNumber;
	}
	public void setPersonNumber(int personNumber) {
		this.personNumber = personNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	

	
	
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public String toString() {
		try {
		    return "Person "+personNumber+": "+firstName+" "+lastName+" ("+calculateAge()+" years old) works for "+getCompany().getName()+ " in "+getAddress().getTown();
		} catch (NullPointerException e) {
			return "Person "+personNumber+": "+firstName+" "+lastName+" ("+calculateAge()+" years old) is not employed for the moment";
		}
		
	}
	
	public long calculateAge() {
		LocalDate currentDate = LocalDate.now();
		long years = ChronoUnit.YEARS.between(birthDate, currentDate);
		return years;
	}

}
