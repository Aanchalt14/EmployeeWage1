package com.day0.addressbook;



public class AddressBookOperations extends Sorting{
	

    
	public void add() {
		System.out.println("enter firstname");
		String firstName = input.next();
		for (Contacts au : arraylist) {
			if (au.firstName.equalsIgnoreCase(firstName)) {
				System.out.println("Duplicate entry");
				return;
			}
		}

		System.out.println("enter lastname");
		String lastName = input.next();
		System.out.println("enter address");
		String address = input.next();
		System.out.println("enter city");
		String city = input.next();
		System.out.println("enter state");
		String state = input.next();
		System.out.println("enter zip");
		long zip = input.nextLong();
		System.out.println("enter phone number");
		long phoneNumber = input.nextLong();
		arraylist.add(new Contacts(firstName, lastName, address, city, state, zip, phoneNumber));
		System.out.println("*****ADDED SUCCESSFULLY*******");
	}

	public void edit() {
		boolean flag = false;
		System.out.println("ENTER THE FIRSTNAME WHICH YOU WANT TO EDIT");
		System.out.println("enter firstname");
		String firstName = input.next();
		for (Contacts au : arraylist) {
			if (au.firstName.equalsIgnoreCase(firstName)) {
				flag = true;
				arraylist.remove(au);
				break;
			}
		}
		if (flag == true) {
			System.out.println("enter lastname");
			String lastName = input.next();
			System.out.println("enter address");
			String address = input.next();
			System.out.println("enter city");
			String city = input.next();
			System.out.println("enter state");
			String state = input.next();
			System.out.println("enter zip");
			long zip = input.nextLong();
			System.out.println("enter phone number");
			long phoneNumber = input.nextLong();
			arraylist.add(new Contacts(firstName, lastName, address, city, state, zip, phoneNumber));
			System.out.println("******EDITED SUCCESSFULLY*******");
		} else {
			System.out.println("no records found");
		}

	}

	public void delete() {
		System.out.println("enter the firstname to delete");
		boolean flag = false;
		String firstName = input.next();
		for (Contacts au : arraylist) {
			if (au.firstName.equalsIgnoreCase(firstName)) {
				arraylist.remove(au);
				System.out.println("DELETED SUCCESSFULLY");
				flag = true;
				return;
			}

		}
		if (flag == false)
			System.out.println("NO RECORDS FOUND TO DELETE");

	}

	public void displayInfo() {
		for (Contacts au : arraylist) {
			System.out.println(au);
		}
	}

	public void Searchbycity() {
		System.out.println(">>>>>>>>>>>ENTER CITY NAME TO SEARCH>>>>>>>>>");
		String city = input.next();
		boolean flag = false;
		for (Contacts au : arraylist) {
			if (au.city.equalsIgnoreCase(city)) {
				System.out.println(au);
				flag = true;
			}
		}
		if (flag == false)
			System.out.println("NO RECORDS IN THIS CITY");

	}
}