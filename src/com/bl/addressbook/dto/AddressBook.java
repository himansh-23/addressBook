package com.bl.addressbook.dto;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	
	private String name;
	
	private List<PersonContact> pesonContacts;
	
	public AddressBook(String name) {
		this.name = name;
		pesonContacts= new ArrayList<PersonContact>();
	}
	
	public void  addPersonContact(PersonContact personContact) {
		pesonContacts.add(personContact);
	}
	
	public PersonContact isPersonContain(String firstName) {
		for(int i=0 ; i<pesonContacts.size();i++) {
			 if(pesonContacts.get(i).getFirstName().equalsIgnoreCase(firstName)) {
				 return pesonContacts.get(i);
				 
			 }
		}
		return null;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void  deletePerson(String firstName) {
		for(int i=0 ; i<pesonContacts.size();i++) {
			 if(pesonContacts.get(i).getFirstName().equalsIgnoreCase(firstName)) {
				 	pesonContacts.remove(i);
				 	return;
			 }
		}
	}

}
