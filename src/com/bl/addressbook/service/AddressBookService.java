package com.bl.addressbook.service;

import java.util.Scanner;

import com.bl.addressbook.dto.AddressBook;

public interface AddressBookService {
	
		public void findAPerson();
		
		public void updateAPerson();
		
		public void deleteAPerson();
		
		public void showOptions(AddressBook addressBook);
		
		public AddressBook createAddressBook(String name);

}
