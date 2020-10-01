package com.bl.addressbook.service;

import java.util.Scanner;

import com.bl.addressbook.dto.PersonContact;

public interface PersionService {

	public PersonContact createPerson();
	
	public void updatePerson(PersonContact personContact);
	
	public void displayPerson(PersonContact personContact);


}
