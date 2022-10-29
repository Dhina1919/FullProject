package org.datatable;

import java.util.ArrayList;
import java.util.List;

public class WithoutHeader2D {
	
public static void main(String[] args) {
		
		List<ArrayList<String>> emp = new ArrayList<ArrayList<String>>();
		
		//inner list
		
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Subi");
		a1.add("Subi@gmail.com");
	    a1.add("Java");
	    
	    ArrayList<String> a2 = new ArrayList<String>();
		a2.add("Pras");
		a2.add("Pras@gmail.com");
	    a2.add("Java");
	    
	    ArrayList<String> a3 = new ArrayList<String>();
		a3.add("Rio");
		a3.add("Rio@gmail.com");
	    a3.add("Java");
	    
	    ArrayList<String> a4 = new ArrayList<String>();
		a4.add("Muku");
		a4.add("muku@gmail.com");
	    a4.add("Java");
		
	    //outer list
	    
	    emp.add(a1);
	    emp.add(a2);
	    emp.add(a3);
	    emp.add(a4);
	    
	    
	    ArrayList<String> email = emp.get(3);
		
	    String email1 = email.get(1);
		System.out.println(email1);
		
	
		
		
		
		
	}
}

