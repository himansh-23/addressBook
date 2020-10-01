package com.bl.addressbook.service.impl;

import java.util.Objects;
import java.util.Scanner;

import com.bl.addressbook.dto.AddressBook;
import com.bl.addressbook.dto.PersonContact;
import com.bl.addressbook.service.AddressBookService;
import com.bl.addressbook.service.PersionService;

public class AddressBookServiceImpl implements AddressBookService {
	
	private AddressBook addressBook;
	private PersionService persionService;
	private Scanner sc;
	
	public AddressBookServiceImpl(Scanner sc) {
		this.sc = sc;
	}
	
	
	public void showOptions(AddressBook addressBook) {
		this.addressBook = addressBook;
		persionService = new PersionServiceImpl(this.sc);
		
	while(true) {
		System.out.println("Option For Address Book");

		System.out.println("1.) Find A Person");
		System.out.println("2.) Update A Persion");
		System.out.println("3.) Display A Persion");
		System.out.println("4.) Create A Persion");
		System.out.println("5.) Exit");
	
		int option = sc.nextInt();
		switch(option) {	
		
		case 1:
			findAPerson();
			break;
		case 2:
			updateAPerson();
			break;
		case 3:
			deleteAPerson();
			break;
		case 4:
			createAPerson();
			break;
		case 5:
			return;
		default:
			System.out.println("Invalid Entry");
			break;
		
		
		}
	}
	}

	@Override
	public void findAPerson() {
		System.out.println("Enter Person Name");
		String name = sc.next(); 
		persionService.displayPerson(addressBook.isPersonContain(name));
	}

	@Override
	public void updateAPerson() {
		System.out.println("Enter Person Name");
		String name = sc.next();
		PersonContact person = addressBook.isPersonContain(name);
		if(Objects.nonNull(person)) {
			persionService.updatePerson(person);
			return;
		}
		System.out.println("Person Not Found");
	}

	@Override
	public void deleteAPerson() {
		System.out.println("Enter Person Name");
		String name = sc.next(); 
		if(Objects.nonNull(addressBook.isPersonContain(name))){
			addressBook.deletePerson(name);
			return;
		}
		System.out.println("Person Not Found");
		
	}
	
	public void createAPerson() {
		addressBook.addPersonContact(persionService.createPerson());
	}


	@Override
	public AddressBook createAddressBook(String name) {
		AddressBook addressBook= new AddressBook(name);
		return addressBook;
	}

}
