package be.abis.ExA6.test;

import be.abis.ExA6.model.Address;
import be.abis.ExA6.model.Company;
import be.abis.ExA6.model.Person;
import java.time.LocalDate;

public class ExA6 {

	public static void main(String[] args) {
		
		Address adr1 = new Address("Abisstraat","5","2000","Antwerpen","Belgie","BE");
		Company comp1 = new Company ("Abis");
		
		Person pers1 = new Person(1,"Ann","Smits",LocalDate.of(2000, 01, 01));
		pers1.setCompany(comp1);
		pers1.setAddress(adr1);
		
		Person pers2 = new Person(2,"John","Doe",LocalDate.of(1980,01,01));
		
		System.out.println(pers1);
		System.out.println(pers2);
		
				
		
	}

}
