package com.bl.addressbook.service.impl;

import java.util.Scanner;

import com.bl.addressbook.dto.PersonContact;
import com.bl.addressbook.service.PersionService;

public class PersionServiceImpl implements PersionService {
		
	private Scanner sc;
	
	
	public PersionServiceImpl(Scanner sc ) {
		this.sc= sc;
	}
	
	public PersonContact createPerson() {
			PersonContact personContact = new PersonContact();
		System.out.print("Enter First Name");
		personContact.setFirstName(sc.next());
		System.out.print("Enter Last Name");
		personContact.setLastName(sc.next());
		System.out.print("Enter Address ");
		personContact.setAddress(sc.next());
		System.out.print("Enter City ");
		personContact.setCity(sc.next());
		System.out.print("Enter State");
		personContact.setState(sc.next());
		System.out.print("Enter Zip");
		personContact.setZip(sc.next());
		System.out.print("Enter Phone");
		personContact.setPhone(sc.nextLong());
		System.out.print("Enter Email");
		personContact.setEmail(sc.next());
		return personContact;
	}
	
	public void updatePerson(PersonContact personContact) {
		
		while(true) {
			System.out.println("1.) FirstName Update");
			System.out.println("2.) LastName Update");
			System.out.println("3.) Address Update");
			System.out.println("4.) City Update");
			System.out.println("5.) State Update");
			System.out.println("6.) Zip Update");
			System.out.println("7.) Phone Update");
			System.out.println("8.) Email Update");
			System.out.println("9.) Exit");
			int options = sc.nextInt();

			switch (options) {
			case 1:
				System.out.println("Enter New FirstName");
				String newName = sc.next();
					personContact.setFirstName(newName);
				break;
			case 2:
				System.out.println("Enter New LastName");
				String newLastName= sc.next();
				personContact.setLastName(newLastName);

				break;
			case 3:
				System.out.println("Enter New Address");
				String newAddre = sc.next();
				personContact.setAddress(newAddre);

				break;
			case 4:
				System.out.println("Enter New City");
				String newCity = sc.next();
				personContact.setCity(newCity);
				
				break;
			case 5:
				System.out.println("Enter State");
				String newState = sc.next();
				personContact.setState(newState);

				break;
			case 6:
				System.out.println("Enter New Zip");
				String newZip= sc.next();
				personContact.setZip(newZip);

				break;
			case 7:
				System.out.println("Enter New Phone");
				Long newPhone = sc.nextLong();
				personContact.setPhone(newPhone);

				break;	
			case 8:
				System.out.println("Enter New Email");
				String newEmail = sc.next();
				personContact.setFirstName(newEmail);

				break;
			case 9:
				System.out.println("Exit");
				return;
			default:
				System.out.println("INVALID ENTRY");
				break;
			}
		}
		
	}
	
	public void displayPerson(PersonContact personContact) {
		
		if(personContact == null) {
			System.out.println("Persion Not Found");
			return;
		}
		
		System.out.println(String.format("Persion FirstName,%s LastName,%s"
				+ "Address,%s City,%s "
				+ "State,%s Zip,%s "
				+ "Phone %d Email %s",personContact.getFirstName(),personContact.getLastName(),
				personContact.getAddress(),personContact.getCity(),personContact.getState(),
				personContact.getZip(),personContact.getPhone(),personContact.getEmail()));
	}

}
