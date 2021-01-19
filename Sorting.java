package com.day0.addressbook;

import java.util.Collections;
import java.util.Comparator;


public abstract class Sorting implements IAddressBookService {
	
	public void sortbypersonName() {
		  Comparator<Contacts> cm2=Comparator.comparing(Contacts::getFirstName);  
		   Collections.sort(arraylist,cm2);  
		      System.out.println("Sorting by personName>>>>>");  
		      for(Contacts st: arraylist){  
		        System.out.println(st);  
		        System.out.println("*************************");
		        }    
		      
	}

	public void sortbyzip() {
		 Comparator<Contacts> cm2=Comparator.comparing(Contacts::getZip);  
		   Collections.sort(arraylist,cm2);  
		      System.out.println("Sorting by zip>>>>>>>>>>");  
		      for(Contacts st: arraylist){  
		        System.out.println(st);  
		        System.out.println("********************");
	}
}
	public void sortbycity() {
		 Comparator<Contacts> cm2=Comparator.comparing(Contacts::getCity);  
		   Collections.sort(arraylist,cm2);  
		      System.out.println("Sorting by city>>>>>>>>>");  
		      for(Contacts st: arraylist){  
		        System.out.println(st); 
		        System.out.println("**********************");
	}
}
	public void sortbystate() {
		 Comparator<Contacts> cm2=Comparator.comparing(Contacts::getState);  
		   Collections.sort(arraylist,cm2);  
		      System.out.println("Sorting by state>>>>>>>>>>");  
		      for(Contacts st: arraylist){  
		        System.out.println(st);  
		        System.out.println("********************");
	}
}

}
