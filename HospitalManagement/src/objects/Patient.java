package objects;

import operations.MainConsole;

public class Patient extends Person
{
	protected int age, mobileno;
	public Patient(final String firstname, final String lastName, final String gender, int age,int mobileno)
	{
		super(firstname, lastName, gender);
		this.age = age;
		this.mobileno = mobileno;
	}
	
	public void setLayoutForPersonData()
	{
		//Patient p = new Patient(final String firstname, final String lastName,String gender, int age,int mobileno);
		
	}
	
	public String getPersonDetails()
	{
		MainConsole.displayText("******* /t/t Patient Details are mentioned as below /t/t *******");
		String str = "";
		return str;
	}

}
