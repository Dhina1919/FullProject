package org.tcs;
import org.hcl.EmployeeDetails;
import org.hcl.Comp;
public class Client {
	
	private void ClientName() {

System.out.println("ClientName:dhina");

	}

	public static void main(String[] args) {
		
		Client c = new Client();
		c.ClientName();
		 
		EmployeeDetails e = new EmployeeDetails();
		
		e.employeeId();
		e.employeeName();
		
		Comp co = new Comp();
		co.comp();
		co.compid();
		
		
		
	}
	
	
}
