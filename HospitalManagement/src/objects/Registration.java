package objects;

import java.util.ArrayList;

public class Registration 
{
	static int count = 0;
	ArrayList<Patient> allPatients;
	public Registration()
	{
		
	}
	
	public void RegisterPatientDetails(String fname, String lname, String gender, int age,int mobileno)
	{
		allPatients.add(new Patient(fname,lname,gender,age,mobileno));
		//allPatients.
	}

}
