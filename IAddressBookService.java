package com.day0.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public interface IAddressBookService {
	static ArrayList<Contacts> arraylist = new ArrayList<>();
	static Scanner input = new Scanner(System.in);

	public void sortbypersonName();

	public void sortbyzip();

	public void sortbycity();

	public void sortbystate();

	public  void add();

	public  void edit();

	public  void delete();

	public  void displayInfo();

	public  void Searchbycity();
}